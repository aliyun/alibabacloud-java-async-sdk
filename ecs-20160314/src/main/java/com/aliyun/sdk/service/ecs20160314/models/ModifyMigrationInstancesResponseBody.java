// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMigrationInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyMigrationInstancesResponseBody</p>
 */
public class ModifyMigrationInstancesResponseBody extends TeaModel {
    @NameInMap("InstancesFailModels")
    private InstancesFailModels instancesFailModels;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyMigrationInstancesResponseBody(Builder builder) {
        this.instancesFailModels = builder.instancesFailModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMigrationInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancesFailModels
     */
    public InstancesFailModels getInstancesFailModels() {
        return this.instancesFailModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstancesFailModels instancesFailModels; 
        private String requestId; 

        /**
         * InstancesFailModels.
         */
        public Builder instancesFailModels(InstancesFailModels instancesFailModels) {
            this.instancesFailModels = instancesFailModels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyMigrationInstancesResponseBody build() {
            return new ModifyMigrationInstancesResponseBody(this);
        } 

    } 

    public static class FailModel extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        private FailModel(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailModel create() {
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

            public FailModel build() {
                return new FailModel(this);
            } 

        } 

    }
    public static class FailModels extends TeaModel {
        @NameInMap("FailModel")
        private java.util.List < FailModel> failModel;

        private FailModels(Builder builder) {
            this.failModel = builder.failModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailModels create() {
            return builder().build();
        }

        /**
         * @return failModel
         */
        public java.util.List < FailModel> getFailModel() {
            return this.failModel;
        }

        public static final class Builder {
            private java.util.List < FailModel> failModel; 

            /**
             * FailModel.
             */
            public Builder failModel(java.util.List < FailModel> failModel) {
                this.failModel = failModel;
                return this;
            }

            public FailModels build() {
                return new FailModels(this);
            } 

        } 

    }
    public static class InstancesFailModel extends TeaModel {
        @NameInMap("FailModels")
        private FailModels failModels;

        @NameInMap("InstanceId")
        private String instanceId;

        private InstancesFailModel(Builder builder) {
            this.failModels = builder.failModels;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancesFailModel create() {
            return builder().build();
        }

        /**
         * @return failModels
         */
        public FailModels getFailModels() {
            return this.failModels;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private FailModels failModels; 
            private String instanceId; 

            /**
             * FailModels.
             */
            public Builder failModels(FailModels failModels) {
                this.failModels = failModels;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstancesFailModel build() {
                return new InstancesFailModel(this);
            } 

        } 

    }
    public static class InstancesFailModels extends TeaModel {
        @NameInMap("InstancesFailModel")
        private java.util.List < InstancesFailModel> instancesFailModel;

        private InstancesFailModels(Builder builder) {
            this.instancesFailModel = builder.instancesFailModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstancesFailModels create() {
            return builder().build();
        }

        /**
         * @return instancesFailModel
         */
        public java.util.List < InstancesFailModel> getInstancesFailModel() {
            return this.instancesFailModel;
        }

        public static final class Builder {
            private java.util.List < InstancesFailModel> instancesFailModel; 

            /**
             * InstancesFailModel.
             */
            public Builder instancesFailModel(java.util.List < InstancesFailModel> instancesFailModel) {
                this.instancesFailModel = instancesFailModel;
                return this;
            }

            public InstancesFailModels build() {
                return new InstancesFailModels(this);
            } 

        } 

    }
}
