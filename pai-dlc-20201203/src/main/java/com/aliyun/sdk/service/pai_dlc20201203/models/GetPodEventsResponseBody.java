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
 * {@link GetPodEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPodEventsResponseBody</p>
 */
public class GetPodEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<String> events;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PodId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String podId;

    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPodEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.jobId = builder.jobId;
        this.podId = builder.podId;
        this.podUid = builder.podUid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPodEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<String> getEvents() {
        return this.events;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
        private java.util.List<String> events; 
        private String jobId; 
        private String podId; 
        private String podUid; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPodEventsResponseBody model) {
            this.events = model.events;
            this.jobId = model.jobId;
            this.podId = model.podId;
            this.podUid = model.podUid;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The events returned.</p>
         */
        public Builder events(java.util.List<String> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-*****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-*****-chief-0</p>
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        /**
         * <p>The node UID.</p>
         * 
         * <strong>example:</strong>
         * <p>94a7cc7c-0033-48b5-85bd-71c63592c268</p>
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
            return this;
        }

        /**
         * <p>The request ID, which can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPodEventsResponseBody build() {
            return new GetPodEventsResponseBody(this);
        } 

    } 

}
