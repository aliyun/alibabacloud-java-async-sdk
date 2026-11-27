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
 * {@link GetRLTrajectoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRLTrajectoryResponseBody</p>
 */
public class GetRLTrajectoryResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Turns")
    private java.util.List<java.util.Map<String, ?>> turns;

    private GetRLTrajectoryResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.promptUid = builder.promptUid;
        this.requestId = builder.requestId;
        this.sampleIndex = builder.sampleIndex;
        this.totalCount = builder.totalCount;
        this.turns = builder.turns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRLTrajectoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return turns
     */
    public java.util.List<java.util.Map<String, ?>> getTurns() {
        return this.turns;
    }

    public static final class Builder {
        private String jobId; 
        private String promptUid; 
        private String requestId; 
        private String sampleIndex; 
        private Integer totalCount; 
        private java.util.List<java.util.Map<String, ?>> turns; 

        private Builder() {
        } 

        private Builder(GetRLTrajectoryResponseBody model) {
            this.jobId = model.jobId;
            this.promptUid = model.promptUid;
            this.requestId = model.requestId;
            this.sampleIndex = model.sampleIndex;
            this.totalCount = model.totalCount;
            this.turns = model.turns;
        } 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210114104214-vf9lowjt3pso</p>
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
         * <p>The number of turn rows. The maximum number of turns per trajectory is 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The raw rows of sgl-metric for each turn. The schema is dynamic and retains the Logstore column names. JSON strings are parsed back into objects, and system fields with the __ prefix are excluded.</p>
         */
        public Builder turns(java.util.List<java.util.Map<String, ?>> turns) {
            this.turns = turns;
            return this;
        }

        public GetRLTrajectoryResponseBody build() {
            return new GetRLTrajectoryResponseBody(this);
        } 

    } 

}
