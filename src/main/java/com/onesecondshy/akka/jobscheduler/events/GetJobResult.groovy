package com.onesecondshy.akka.jobscheduler.events

/**
 * @author Adam Jordens (adam@jordens.org)
 */
class GetJobResult extends Event {
    private static final long serialVersionUID = -1354942905395394545L;

    String jobId
    List<String> commandLines

    public GetJobResult(String jobId, List<String> commandLines) {
        this.jobId
        this.commandLines = commandLines
    }

    @Override
    public String toString() {
        return "GetJobResult{" +
                "jobId='" + jobId + '\'' +
                ", commandLines=" + commandLines +
                '}';
    }


}