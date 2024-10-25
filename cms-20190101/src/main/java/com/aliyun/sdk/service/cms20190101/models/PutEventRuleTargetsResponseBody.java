// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>PutEventRuleTargetsResponseBody</p>
 */
public class PutEventRuleTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FailedContactParameters")
    private FailedContactParameters failedContactParameters;

    @com.aliyun.core.annotation.NameInMap("FailedFcParameters")
    private FailedFcParameters failedFcParameters;

    @com.aliyun.core.annotation.NameInMap("FailedMnsParameters")
    private FailedMnsParameters failedMnsParameters;

    @com.aliyun.core.annotation.NameInMap("FailedParameterCount")
    private String failedParameterCount;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>This parameter is returned if the specified alert contact groups in the request failed to be created or modified.</p>
         */
        public Builder failedContactParameters(FailedContactParameters failedContactParameters) {
            this.failedContactParameters = failedContactParameters;
            return this;
        }

        /**
         * <p>This parameter is returned if the specified functions in the request failed to be created or modified in Function Compute.</p>
         */
        public Builder failedFcParameters(FailedFcParameters failedFcParameters) {
            this.failedFcParameters = failedFcParameters;
            return this;
        }

        /**
         * <p>This parameter is returned if the specified queues in the request failed to be created or modified in MNS.</p>
         */
        public Builder failedMnsParameters(FailedMnsParameters failedMnsParameters) {
            this.failedMnsParameters = failedMnsParameters;
            return this;
        }

        /**
         * <p>The number of resources that failed to be created or modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder failedParameterCount(String failedParameterCount) {
            this.failedParameterCount = failedParameterCount;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>409C64DA-CF14-45DF-B463-471C790DD15A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutEventRuleTargetsResponseBody build() {
            return new PutEventRuleTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsResponseBody</p>
     */
    public static class ContactParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Level")
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
             * <p>The name of the alert contact group.</p>
             */
            public Builder contactGroupName(String contactGroupName) {
                this.contactGroupName = contactGroupName;
                return this;
            }

            /**
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The alert level and the corresponding notification methods. Valid values:</p>
             * <p>4: Alert notifications are sent by using DingTalk chatbots and emails.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsResponseBody</p>
     */
    public static class FailedContactParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactParameter")
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
    /**
     * 
     * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsResponseBody</p>
     */
    public static class FcParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
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
             * <p>The name of the function.</p>
             * 
             * <strong>example:</strong>
             * <p>functionTest1</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the Function Compute service.</p>
             * 
             * <strong>example:</strong>
             * <p>serviceTest1</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsResponseBody</p>
     */
    public static class FailedFcParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcParameter")
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
    /**
     * 
     * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsResponseBody</p>
     */
    public static class MnsParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("Region")
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
             * <p>The ID of the recipient.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the MNS queue.</p>
             * 
             * <strong>example:</strong>
             * <p>testQueue</p>
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link PutEventRuleTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventRuleTargetsResponseBody</p>
     */
    public static class FailedMnsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MnsParameter")
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
