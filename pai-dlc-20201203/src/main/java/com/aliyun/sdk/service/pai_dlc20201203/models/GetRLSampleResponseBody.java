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
 * {@link GetRLSampleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRLSampleResponseBody</p>
 */
public class GetRLSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<RLSampleEvent> events;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("PromptUid")
    private String promptUid;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SampleIndex")
    private String sampleIndex;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetRLSampleResponseBody(Builder builder) {
        this.events = builder.events;
        this.jobId = builder.jobId;
        this.promptUid = builder.promptUid;
        this.requestId = builder.requestId;
        this.sampleIndex = builder.sampleIndex;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLSampleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<RLSampleEvent> getEvents() {
        return this.events;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return promptUid
     */
    public String getPromptUid() {
        return this.promptUid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sampleIndex
     */
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<RLSampleEvent> events; 
        private String jobId; 
        private String promptUid; 
        private String requestId; 
        private String sampleIndex; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetRLSampleResponseBody model) {
            this.events = model.events;
            this.jobId = model.jobId;
            this.promptUid = model.promptUid;
            this.requestId = model.requestId;
            this.sampleIndex = model.sampleIndex;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The event stream sorted in ascending order by time.</p>
         */
        public Builder events(java.util.List<RLSampleEvent> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc5yfk7eyg95lac</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The sample UID.</p>
         * 
         * <strong>example:</strong>
         * <p>3afcfbdf-3956-4ab2-b9cb-f9c204b8fc9c</p>
         */
        public Builder promptUid(String promptUid) {
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trajectory index.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder sampleIndex(String sampleIndex) {
            this.sampleIndex = sampleIndex;
            return this;
        }

        /**
         * <p>The total number of returned events.</p>
         * 
         * <strong>example:</strong>
         * <p>116</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetRLSampleResponseBody build() {
            return new GetRLSampleResponseBody(this);
        } 

    } 

}
