// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReAddMigrationTaskInPlanResponseBody} extends {@link TeaModel}
 *
 * <p>ReAddMigrationTaskInPlanResponseBody</p>
 */
public class ReAddMigrationTaskInPlanResponseBody extends TeaModel {
    @NameInMap("FailModels")
    private FailModels failModels;

    @NameInMap("RequestId")
    private String requestId;

    private ReAddMigrationTaskInPlanResponseBody(Builder builder) {
        this.failModels = builder.failModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReAddMigrationTaskInPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return failModels
     */
    public FailModels getFailModels() {
        return this.failModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FailModels failModels; 
        private String requestId; 

        /**
         * FailModels.
         */
        public Builder failModels(FailModels failModels) {
            this.failModels = failModels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReAddMigrationTaskInPlanResponseBody build() {
            return new ReAddMigrationTaskInPlanResponseBody(this);
        } 

    } 

    public static class FailModelsFailModels extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        private FailModelsFailModels(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailModelsFailModels create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            public FailModelsFailModels build() {
                return new FailModelsFailModels(this);
            } 

        } 

    }
    public static class FailModels extends TeaModel {
        @NameInMap("FailModels")
        private java.util.List < FailModelsFailModels> failModels;

        private FailModels(Builder builder) {
            this.failModels = builder.failModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailModels create() {
            return builder().build();
        }

        /**
         * @return failModels
         */
        public java.util.List < FailModelsFailModels> getFailModels() {
            return this.failModels;
        }

        public static final class Builder {
            private java.util.List < FailModelsFailModels> failModels; 

            /**
             * FailModels.
             */
            public Builder failModels(java.util.List < FailModelsFailModels> failModels) {
                this.failModels = failModels;
                return this;
            }

            public FailModels build() {
                return new FailModels(this);
            } 

        } 

    }
}
