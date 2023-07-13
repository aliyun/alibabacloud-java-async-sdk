// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>PutEventRuleTargetsResponseBody</p>
 */
public class PutEventRuleTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FailedContactParameters")
    private FailedContactParameters failedContactParameters;

    @NameInMap("FailedFcParameters")
    private FailedFcParameters failedFcParameters;

    @NameInMap("FailedMnsParameters")
    private FailedMnsParameters failedMnsParameters;

    @NameInMap("FailedParameterCount")
    private String failedParameterCount;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PutEventRuleTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.failedContactParameters = builder.failedContactParameters;
        this.failedFcParameters = builder.failedFcParameters;
        this.failedMnsParameters = builder.failedMnsParameters;
        this.failedParameterCount = builder.failedParameterCount;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventRuleTargetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failedContactParameters
     */
    public FailedContactParameters getFailedContactParameters() {
        return this.failedContactParameters;
    }

    /**
     * @return failedFcParameters
     */
    public FailedFcParameters getFailedFcParameters() {
        return this.failedFcParameters;
    }

    /**
     * @return failedMnsParameters
     */
    public FailedMnsParameters getFailedMnsParameters() {
        return this.failedMnsParameters;
    }

    /**
     * @return failedParameterCount
     */
    public String getFailedParameterCount() {
        return this.failedParameterCount;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private FailedContactParameters failedContactParameters; 
        private FailedFcParameters failedFcParameters; 
        private FailedMnsParameters failedMnsParameters; 
        private String failedParameterCount; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The name of the API operation.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The name of the queue. Valid values of N: 1 to 5.
         */
        public Builder failedContactParameters(FailedContactParameters failedContactParameters) {
            this.failedContactParameters = failedContactParameters;
            return this;
        }

        /**
         * FailedFcParameters.
         */
        public Builder failedFcParameters(FailedFcParameters failedFcParameters) {
            this.failedFcParameters = failedFcParameters;
            return this;
        }

        /**
         * FailedMnsParameters.
         */
        public Builder failedMnsParameters(FailedMnsParameters failedMnsParameters) {
            this.failedMnsParameters = failedMnsParameters;
            return this;
        }

        /**
         * The name of the Function Compute service. Valid values of N: 1 to 5.
         */
        public Builder failedParameterCount(String failedParameterCount) {
            this.failedParameterCount = failedParameterCount;
            return this;
        }

        /**
         * The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The alert notification methods. Valid values:
         * <p>
         * 
         * 4: Alert notifications are sent by using DingTalk chatbots and emails.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the role.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutEventRuleTargetsResponseBody build() {
            return new PutEventRuleTargetsResponseBody(this);
        } 

    } 

    public static class ContactParameter extends TeaModel {
        @NameInMap("ContactGroupName")
        private String contactGroupName;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Level")
        private String level;

        private ContactParameter(Builder builder) {
            this.contactGroupName = builder.contactGroupName;
            this.id = builder.id;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactParameter create() {
            return builder().build();
        }

        /**
         * @return contactGroupName
         */
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String contactGroupName; 
            private Integer id; 
            private String level; 

            /**
             * The ID of the request.
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public ContactParameter build() {
                return new ContactParameter(this);
            } 

        } 

    }
    public static class FailedContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        private java.util.List < ContactParameter> contactParameter;

        private FailedContactParameters(Builder builder) {
            this.contactParameter = builder.contactParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedContactParameters create() {
            return builder().build();
        }

        /**
         * @return contactParameter
         */
        public java.util.List < ContactParameter> getContactParameter() {
            return this.contactParameter;
        }

        public static final class Builder {
            private java.util.List < ContactParameter> contactParameter; 

            /**
             * ContactParameter.
             */
            public Builder contactParameter(java.util.List < ContactParameter> contactParameter) {
                this.contactParameter = contactParameter;
                return this;
            }

            public FailedContactParameters build() {
                return new FailedContactParameters(this);
            } 

        } 

    }
    public static class FcParameter extends TeaModel {
        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Region")
        private String region;

        @NameInMap("ServiceName")
        private String serviceName;

        private FcParameter(Builder builder) {
            this.functionName = builder.functionName;
            this.id = builder.id;
            this.region = builder.region;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcParameter create() {
            return builder().build();
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String functionName; 
            private Integer id; 
            private String region; 
            private String serviceName; 

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public FcParameter build() {
                return new FcParameter(this);
            } 

        } 

    }
    public static class FailedFcParameters extends TeaModel {
        @NameInMap("FcParameter")
        private java.util.List < FcParameter> fcParameter;

        private FailedFcParameters(Builder builder) {
            this.fcParameter = builder.fcParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedFcParameters create() {
            return builder().build();
        }

        /**
         * @return fcParameter
         */
        public java.util.List < FcParameter> getFcParameter() {
            return this.fcParameter;
        }

        public static final class Builder {
            private java.util.List < FcParameter> fcParameter; 

            /**
             * FcParameter.
             */
            public Builder fcParameter(java.util.List < FcParameter> fcParameter) {
                this.fcParameter = fcParameter;
                return this;
            }

            public FailedFcParameters build() {
                return new FailedFcParameters(this);
            } 

        } 

    }
    public static class MnsParameter extends TeaModel {
        @NameInMap("Id")
        private Integer id;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("Region")
        private String region;

        private MnsParameter(Builder builder) {
            this.id = builder.id;
            this.queue = builder.queue;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParameter create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer id; 
            private String queue; 
            private String region; 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public MnsParameter build() {
                return new MnsParameter(this);
            } 

        } 

    }
    public static class FailedMnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        private java.util.List < MnsParameter> mnsParameter;

        private FailedMnsParameters(Builder builder) {
            this.mnsParameter = builder.mnsParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedMnsParameters create() {
            return builder().build();
        }

        /**
         * @return mnsParameter
         */
        public java.util.List < MnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

        public static final class Builder {
            private java.util.List < MnsParameter> mnsParameter; 

            /**
             * MnsParameter.
             */
            public Builder mnsParameter(java.util.List < MnsParameter> mnsParameter) {
                this.mnsParameter = mnsParameter;
                return this;
            }

            public FailedMnsParameters build() {
                return new FailedMnsParameters(this);
            } 

        } 

    }
}
