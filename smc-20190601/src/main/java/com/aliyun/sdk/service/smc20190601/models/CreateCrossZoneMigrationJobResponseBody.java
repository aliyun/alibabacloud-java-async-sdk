// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCrossZoneMigrationJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCrossZoneMigrationJobResponseBody</p>
 */
public class CreateCrossZoneMigrationJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCrossZoneMigrationJobResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCrossZoneMigrationJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 

        /**
         * <p>The ID of the migration job.</p>
         * 
         * <strong>example:</strong>
         * <p>j-bp17bclvg344jlyt****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A9DBD2F8-DE5A-5844-BA6F-957A996CBD78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCrossZoneMigrationJobResponseBody build() {
            return new CreateCrossZoneMigrationJobResponseBody(this);
        } 

    } 

}
