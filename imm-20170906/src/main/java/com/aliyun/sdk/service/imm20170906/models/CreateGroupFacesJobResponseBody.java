// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupFacesJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupFacesJobResponseBody</p>
 */
public class CreateGroupFacesJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobType")
    private String jobType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    private CreateGroupFacesJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.requestId = builder.requestId;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupFacesJobResponseBody create() {
        return builder().build();
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
        private String jobId; 
        private String jobType; 
        private String requestId; 
        private String setId; 

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

        public CreateGroupFacesJobResponseBody build() {
            return new CreateGroupFacesJobResponseBody(this);
        } 

    } 

}
