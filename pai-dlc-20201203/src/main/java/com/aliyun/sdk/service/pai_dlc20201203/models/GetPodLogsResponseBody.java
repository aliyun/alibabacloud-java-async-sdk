// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPodLogsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPodLogsResponseBody</p>
 */
public class GetPodLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContainerInfo")
    private ContainerInfo containerInfo;

    @com.aliyun.core.annotation.NameInMap("Containers")
    private String containers;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List<String> logs;

    @com.aliyun.core.annotation.NameInMap("PodId")
    private String podId;

    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPodLogsResponseBody(Builder builder) {
        this.containerInfo = builder.containerInfo;
        this.containers = builder.containers;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerInfo
     */
    public ContainerInfo getContainerInfo() {
        return this.containerInfo;
    }

    /**
     * @return containers
     */
    public String getContainers() {
        return this.containers;
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
    public java.util.List<String> getLogs() {
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
        private ContainerInfo containerInfo; 
        private String containers; 
        private String jobId; 
        private java.util.List<String> logs; 
        private String podId; 
        private String podUid; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPodLogsResponseBody model) {
            this.containerInfo = model.containerInfo;
            this.containers = model.containers;
            this.jobId = model.jobId;
            this.logs = model.logs;
            this.podId = model.podId;
            this.podUid = model.podUid;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The container information that may be associated with the node.</p>
         */
        public Builder containerInfo(ContainerInfo containerInfo) {
            this.containerInfo = containerInfo;
            return this;
        }

        /**
         * <p>The containers used to filter logs. Separate multiple container names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>pytorch,aimaster-worker</p>
         */
        public Builder containers(String containers) {
            this.containers = containers;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-******</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The log list.</p>
         */
        public Builder logs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-****-chief-0</p>
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        /**
         * <p>The instance UID.</p>
         * 
         * <strong>example:</strong>
         * <p>94a7cc7c-0033-48b5-85bd-71c63592c268</p>
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
            return this;
        }

        /**
         * <p>The request ID for this call, used for diagnostics and troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
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
