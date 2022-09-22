// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrationPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMigrationPlanResponseBody</p>
 */
public class CreateMigrationPlanResponseBody extends TeaModel {
    @NameInMap("InstancesFailModels")
    private InstancesFailModels instancesFailModels;

    @NameInMap("MigrationPlanId")
    private String migrationPlanId;

    @NameInMap("PlanFailModels")
    private PlanFailModels planFailModels;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SgFailModels")
    private SgFailModels sgFailModels;

    private CreateMigrationPlanResponseBody(Builder builder) {
        this.instancesFailModels = builder.instancesFailModels;
        this.migrationPlanId = builder.migrationPlanId;
        this.planFailModels = builder.planFailModels;
        this.requestId = builder.requestId;
        this.sgFailModels = builder.sgFailModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMigrationPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancesFailModels
     */
    public InstancesFailModels getInstancesFailModels() {
        return this.instancesFailModels;
    }

    /**
     * @return migrationPlanId
     */
    public String getMigrationPlanId() {
        return this.migrationPlanId;
    }

    /**
     * @return planFailModels
     */
    public PlanFailModels getPlanFailModels() {
        return this.planFailModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sgFailModels
     */
    public SgFailModels getSgFailModels() {
        return this.sgFailModels;
    }

    public static final class Builder {
        private InstancesFailModels instancesFailModels; 
        private String migrationPlanId; 
        private PlanFailModels planFailModels; 
        private String requestId; 
        private SgFailModels sgFailModels; 

        /**
         * InstancesFailModels.
         */
        public Builder instancesFailModels(InstancesFailModels instancesFailModels) {
            this.instancesFailModels = instancesFailModels;
            return this;
        }

        /**
         * MigrationPlanId.
         */
        public Builder migrationPlanId(String migrationPlanId) {
            this.migrationPlanId = migrationPlanId;
            return this;
        }

        /**
         * PlanFailModels.
         */
        public Builder planFailModels(PlanFailModels planFailModels) {
            this.planFailModels = planFailModels;
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
         * SgFailModels.
         */
        public Builder sgFailModels(SgFailModels sgFailModels) {
            this.sgFailModels = sgFailModels;
            return this;
        }

        public CreateMigrationPlanResponseBody build() {
            return new CreateMigrationPlanResponseBody(this);
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
    public static class PlanFailModel extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        private PlanFailModel(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanFailModel create() {
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

            public PlanFailModel build() {
                return new PlanFailModel(this);
            } 

        } 

    }
    public static class PlanFailModels extends TeaModel {
        @NameInMap("PlanFailModel")
        private java.util.List < PlanFailModel> planFailModel;

        private PlanFailModels(Builder builder) {
            this.planFailModel = builder.planFailModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlanFailModels create() {
            return builder().build();
        }

        /**
         * @return planFailModel
         */
        public java.util.List < PlanFailModel> getPlanFailModel() {
            return this.planFailModel;
        }

        public static final class Builder {
            private java.util.List < PlanFailModel> planFailModel; 

            /**
             * PlanFailModel.
             */
            public Builder planFailModel(java.util.List < PlanFailModel> planFailModel) {
                this.planFailModel = planFailModel;
                return this;
            }

            public PlanFailModels build() {
                return new PlanFailModels(this);
            } 

        } 

    }
    public static class FailModelsFailModel extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        private FailModelsFailModel(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailModelsFailModel create() {
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

            public FailModelsFailModel build() {
                return new FailModelsFailModel(this);
            } 

        } 

    }
    public static class SgFailModelFailModels extends TeaModel {
        @NameInMap("FailModel")
        private java.util.List < FailModelsFailModel> failModel;

        private SgFailModelFailModels(Builder builder) {
            this.failModel = builder.failModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SgFailModelFailModels create() {
            return builder().build();
        }

        /**
         * @return failModel
         */
        public java.util.List < FailModelsFailModel> getFailModel() {
            return this.failModel;
        }

        public static final class Builder {
            private java.util.List < FailModelsFailModel> failModel; 

            /**
             * FailModel.
             */
            public Builder failModel(java.util.List < FailModelsFailModel> failModel) {
                this.failModel = failModel;
                return this;
            }

            public SgFailModelFailModels build() {
                return new SgFailModelFailModels(this);
            } 

        } 

    }
    public static class SgFailModel extends TeaModel {
        @NameInMap("FailModels")
        private SgFailModelFailModels failModels;

        @NameInMap("GroupNo")
        private String groupNo;

        private SgFailModel(Builder builder) {
            this.failModels = builder.failModels;
            this.groupNo = builder.groupNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SgFailModel create() {
            return builder().build();
        }

        /**
         * @return failModels
         */
        public SgFailModelFailModels getFailModels() {
            return this.failModels;
        }

        /**
         * @return groupNo
         */
        public String getGroupNo() {
            return this.groupNo;
        }

        public static final class Builder {
            private SgFailModelFailModels failModels; 
            private String groupNo; 

            /**
             * FailModels.
             */
            public Builder failModels(SgFailModelFailModels failModels) {
                this.failModels = failModels;
                return this;
            }

            /**
             * GroupNo.
             */
            public Builder groupNo(String groupNo) {
                this.groupNo = groupNo;
                return this;
            }

            public SgFailModel build() {
                return new SgFailModel(this);
            } 

        } 

    }
    public static class SgFailModels extends TeaModel {
        @NameInMap("SgFailModel")
        private java.util.List < SgFailModel> sgFailModel;

        private SgFailModels(Builder builder) {
            this.sgFailModel = builder.sgFailModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SgFailModels create() {
            return builder().build();
        }

        /**
         * @return sgFailModel
         */
        public java.util.List < SgFailModel> getSgFailModel() {
            return this.sgFailModel;
        }

        public static final class Builder {
            private java.util.List < SgFailModel> sgFailModel; 

            /**
             * SgFailModel.
             */
            public Builder sgFailModel(java.util.List < SgFailModel> sgFailModel) {
                this.sgFailModel = sgFailModel;
                return this;
            }

            public SgFailModels build() {
                return new SgFailModels(this);
            } 

        } 

    }
}
