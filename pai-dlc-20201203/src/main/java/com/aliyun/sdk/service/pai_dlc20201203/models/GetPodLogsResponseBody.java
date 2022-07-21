// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPodLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPodLogsResponseBody</p>
 */
public class GetPodLogsResponseBody extends TeaModel {
    @NameInMap("JobId")
    private String jobId;

    @NameInMap("Logs")
    private java.util.List < String > logs;

    @NameInMap("PodId")
    private String podId;

    @NameInMap("PodUid")
    private String podUid;

    @NameInMap("RequestId")
    private String requestId;

    private GetPodLogsResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.logs = builder.logs;
        this.podId = builder.podId;
        this.podUid = builder.podUid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPodLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return logs
     */
    public java.util.List < String > getLogs() {
        return this.logs;
    }

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    /**
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobId; 
        private java.util.List < String > logs; 
        private String podId; 
        private String podUid; 
        private String requestId; 

        /**
         * 作业ID
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * 日志列表
         */
        public Builder logs(java.util.List < String > logs) {
            this.logs = logs;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        /**
         * 实例UID
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPodLogsResponseBody build() {
            return new GetPodLogsResponseBody(this);
        } 

    } 

}
