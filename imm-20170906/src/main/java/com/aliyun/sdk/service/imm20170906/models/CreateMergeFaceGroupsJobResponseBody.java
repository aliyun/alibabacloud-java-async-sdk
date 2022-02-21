// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMergeFaceGroupsJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMergeFaceGroupsJobResponseBody</p>
 */
public class CreateMergeFaceGroupsJobResponseBody extends TeaModel {
    @NameInMap("GroupIdFrom")
    private String groupIdFrom;

    @NameInMap("GroupIdTo")
    private String groupIdTo;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobType")
    private String jobType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    private CreateMergeFaceGroupsJobResponseBody(Builder builder) {
        this.groupIdFrom = builder.groupIdFrom;
        this.groupIdTo = builder.groupIdTo;
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMergeFaceGroupsJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupIdFrom
     */
    public String getGroupIdFrom() {
        return this.groupIdFrom;
    }

    /**
     * @return groupIdTo
     */
    public String getGroupIdTo() {
        return this.groupIdTo;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder {
        private String groupIdFrom; 
        private String groupIdTo; 
        private String jobId; 
        private String jobType; 
        private String requestId; 
        private String setId; 

        /**
         * GroupIdFrom.
         */
        public Builder groupIdFrom(String groupIdFrom) {
            this.groupIdFrom = groupIdFrom;
            return this;
        }

        /**
         * GroupIdTo.
         */
        public Builder groupIdTo(String groupIdTo) {
            this.groupIdTo = groupIdTo;
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
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        public CreateMergeFaceGroupsJobResponseBody build() {
            return new CreateMergeFaceGroupsJobResponseBody(this);
        } 

    } 

}
