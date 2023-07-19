// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPodEventsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPodEventsResponseBody</p>
 */
public class GetPodEventsResponseBody extends TeaModel {
    @NameInMap("Events")
    private java.util.List < String > events;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("PodId")
    @Validation(required = true)
    private String podId;

    @NameInMap("PodUid")
    private String podUid;

    @NameInMap("RequestId")
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

    /**
     * @return events
     */
    public java.util.List < String > getEvents() {
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
        private java.util.List < String > events; 
        private String jobId; 
        private String podId; 
        private String podUid; 
        private String requestId; 

        /**
         * Events.
         */
        public Builder events(java.util.List < String > events) {
            this.events = events;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.podId = podId;
            return this;
        }

        /**
         * PodUid.
         */
        public Builder podUid(String podUid) {
            this.podUid = podUid;
            return this;
        }

        /**
         * RequestId.
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
