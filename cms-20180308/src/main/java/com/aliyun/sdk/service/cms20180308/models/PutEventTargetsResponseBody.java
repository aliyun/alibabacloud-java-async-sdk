// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
 *
 * <p>PutEventTargetsResponseBody</p>
 */
public class PutEventTargetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ContactParameters")
    private ContactParameters contactParameters;

    @com.aliyun.core.annotation.NameInMap("FailedContactParameters")
    private FailedContactParameters failedContactParameters;

    @com.aliyun.core.annotation.NameInMap("FailedFcParameters")
    private FailedFcParameters failedFcParameters;

    @com.aliyun.core.annotation.NameInMap("FailedMnsParameters")
    private FailedMnsParameters failedMnsParameters;

    @com.aliyun.core.annotation.NameInMap("FailedParameterCount")
    private String failedParameterCount;

    @com.aliyun.core.annotation.NameInMap("FailedSlsParameters")
    private FailedSlsParameters failedSlsParameters;

    @com.aliyun.core.annotation.NameInMap("FcParameters")
    private FcParameters fcParameters;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("MnsParameters")
    private MnsParameters mnsParameters;

    @com.aliyun.core.annotation.NameInMap("ParameterCount")
    private String parameterCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PutEventTargetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.contactParameters = builder.contactParameters;
        this.failedContactParameters = builder.failedContactParameters;
        this.failedFcParameters = builder.failedFcParameters;
        this.failedMnsParameters = builder.failedMnsParameters;
        this.failedParameterCount = builder.failedParameterCount;
        this.failedSlsParameters = builder.failedSlsParameters;
        this.fcParameters = builder.fcParameters;
        this.message = builder.message;
        this.mnsParameters = builder.mnsParameters;
        this.parameterCount = builder.parameterCount;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutEventTargetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return contactParameters
     */
    public ContactParameters getContactParameters() {
        return this.contactParameters;
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
     * @return failedSlsParameters
     */
    public FailedSlsParameters getFailedSlsParameters() {
        return this.failedSlsParameters;
    }

    /**
     * @return fcParameters
     */
    public FcParameters getFcParameters() {
        return this.fcParameters;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return mnsParameters
     */
    public MnsParameters getMnsParameters() {
        return this.mnsParameters;
    }

    /**
     * @return parameterCount
     */
    public String getParameterCount() {
        return this.parameterCount;
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
        private ContactParameters contactParameters; 
        private FailedContactParameters failedContactParameters; 
        private FailedFcParameters failedFcParameters; 
        private FailedMnsParameters failedMnsParameters; 
        private String failedParameterCount; 
        private FailedSlsParameters failedSlsParameters; 
        private FcParameters fcParameters; 
        private String message; 
        private MnsParameters mnsParameters; 
        private String parameterCount; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(PutEventTargetsResponseBody model) {
            this.code = model.code;
            this.contactParameters = model.contactParameters;
            this.failedContactParameters = model.failedContactParameters;
            this.failedFcParameters = model.failedFcParameters;
            this.failedMnsParameters = model.failedMnsParameters;
            this.failedParameterCount = model.failedParameterCount;
            this.failedSlsParameters = model.failedSlsParameters;
            this.fcParameters = model.fcParameters;
            this.message = model.message;
            this.mnsParameters = model.mnsParameters;
            this.parameterCount = model.parameterCount;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContactParameters.
         */
        public Builder contactParameters(ContactParameters contactParameters) {
            this.contactParameters = contactParameters;
            return this;
        }

        /**
         * FailedContactParameters.
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
         * FailedParameterCount.
         */
        public Builder failedParameterCount(String failedParameterCount) {
            this.failedParameterCount = failedParameterCount;
            return this;
        }

        /**
         * FailedSlsParameters.
         */
        public Builder failedSlsParameters(FailedSlsParameters failedSlsParameters) {
            this.failedSlsParameters = failedSlsParameters;
            return this;
        }

        /**
         * FcParameters.
         */
        public Builder fcParameters(FcParameters fcParameters) {
            this.fcParameters = fcParameters;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MnsParameters.
         */
        public Builder mnsParameters(MnsParameters mnsParameters) {
            this.mnsParameters = mnsParameters;
            return this;
        }

        /**
         * ParameterCount.
         */
        public Builder parameterCount(String parameterCount) {
            this.parameterCount = parameterCount;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutEventTargetsResponseBody build() {
            return new PutEventTargetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ContactParameter model) {
                this.contactGroupName = model.contactGroupName;
                this.id = model.id;
                this.level = model.level;
            } 

            /**
             * ContactGroupName.
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
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class ContactParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactParameter")
        private java.util.List<ContactParameter> contactParameter;

        private ContactParameters(Builder builder) {
            this.contactParameter = builder.contactParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactParameters create() {
            return builder().build();
        }

        /**
         * @return contactParameter
         */
        public java.util.List<ContactParameter> getContactParameter() {
            return this.contactParameter;
        }

        public static final class Builder {
            private java.util.List<ContactParameter> contactParameter; 

            private Builder() {
            } 

            private Builder(ContactParameters model) {
                this.contactParameter = model.contactParameter;
            } 

            /**
             * ContactParameter.
             */
            public Builder contactParameter(java.util.List<ContactParameter> contactParameter) {
                this.contactParameter = contactParameter;
                return this;
            }

            public ContactParameters build() {
                return new ContactParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FailedContactParametersContactParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactGroupName")
        private String contactGroupName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private FailedContactParametersContactParameter(Builder builder) {
            this.contactGroupName = builder.contactGroupName;
            this.id = builder.id;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedContactParametersContactParameter create() {
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

            private Builder() {
            } 

            private Builder(FailedContactParametersContactParameter model) {
                this.contactGroupName = model.contactGroupName;
                this.id = model.id;
                this.level = model.level;
            } 

            /**
             * ContactGroupName.
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

            public FailedContactParametersContactParameter build() {
                return new FailedContactParametersContactParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FailedContactParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactParameter")
        private java.util.List<FailedContactParametersContactParameter> contactParameter;

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
        public java.util.List<FailedContactParametersContactParameter> getContactParameter() {
            return this.contactParameter;
        }

        public static final class Builder {
            private java.util.List<FailedContactParametersContactParameter> contactParameter; 

            private Builder() {
            } 

            private Builder(FailedContactParameters model) {
                this.contactParameter = model.contactParameter;
            } 

            /**
             * ContactParameter.
             */
            public Builder contactParameter(java.util.List<FailedContactParametersContactParameter> contactParameter) {
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
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(FcParameter model) {
                this.functionName = model.functionName;
                this.id = model.id;
                this.region = model.region;
                this.serviceName = model.serviceName;
            } 

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
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FailedFcParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcParameter")
        private java.util.List<FcParameter> fcParameter;

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
        public java.util.List<FcParameter> getFcParameter() {
            return this.fcParameter;
        }

        public static final class Builder {
            private java.util.List<FcParameter> fcParameter; 

            private Builder() {
            } 

            private Builder(FailedFcParameters model) {
                this.fcParameter = model.fcParameter;
            } 

            /**
             * FcParameter.
             */
            public Builder fcParameter(java.util.List<FcParameter> fcParameter) {
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
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MnsParameter model) {
                this.id = model.id;
                this.queue = model.queue;
                this.region = model.region;
            } 

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
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FailedMnsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MnsParameter")
        private java.util.List<MnsParameter> mnsParameter;

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
        public java.util.List<MnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

        public static final class Builder {
            private java.util.List<MnsParameter> mnsParameter; 

            private Builder() {
            } 

            private Builder(FailedMnsParameters model) {
                this.mnsParameter = model.mnsParameter;
            } 

            /**
             * MnsParameter.
             */
            public Builder mnsParameter(java.util.List<MnsParameter> mnsParameter) {
                this.mnsParameter = mnsParameter;
                return this;
            }

            public FailedMnsParameters build() {
                return new FailedMnsParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FailedSlsParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private FailedSlsParameter(Builder builder) {
            this.id = builder.id;
            this.logStore = builder.logStore;
            this.project = builder.project;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedSlsParameter create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String id; 
            private String logStore; 
            private String project; 
            private String region; 

            private Builder() {
            } 

            private Builder(FailedSlsParameter model) {
                this.id = model.id;
                this.logStore = model.logStore;
                this.project = model.project;
                this.region = model.region;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LogStore.
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public FailedSlsParameter build() {
                return new FailedSlsParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FailedSlsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedSlsParameter")
        private java.util.List<FailedSlsParameter> failedSlsParameter;

        private FailedSlsParameters(Builder builder) {
            this.failedSlsParameter = builder.failedSlsParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedSlsParameters create() {
            return builder().build();
        }

        /**
         * @return failedSlsParameter
         */
        public java.util.List<FailedSlsParameter> getFailedSlsParameter() {
            return this.failedSlsParameter;
        }

        public static final class Builder {
            private java.util.List<FailedSlsParameter> failedSlsParameter; 

            private Builder() {
            } 

            private Builder(FailedSlsParameters model) {
                this.failedSlsParameter = model.failedSlsParameter;
            } 

            /**
             * FailedSlsParameter.
             */
            public Builder failedSlsParameter(java.util.List<FailedSlsParameter> failedSlsParameter) {
                this.failedSlsParameter = failedSlsParameter;
                return this;
            }

            public FailedSlsParameters build() {
                return new FailedSlsParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FcParametersFcParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private FcParametersFcParameter(Builder builder) {
            this.functionName = builder.functionName;
            this.id = builder.id;
            this.region = builder.region;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcParametersFcParameter create() {
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

            private Builder() {
            } 

            private Builder(FcParametersFcParameter model) {
                this.functionName = model.functionName;
                this.id = model.id;
                this.region = model.region;
                this.serviceName = model.serviceName;
            } 

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

            public FcParametersFcParameter build() {
                return new FcParametersFcParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class FcParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcParameter")
        private java.util.List<FcParametersFcParameter> fcParameter;

        private FcParameters(Builder builder) {
            this.fcParameter = builder.fcParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FcParameters create() {
            return builder().build();
        }

        /**
         * @return fcParameter
         */
        public java.util.List<FcParametersFcParameter> getFcParameter() {
            return this.fcParameter;
        }

        public static final class Builder {
            private java.util.List<FcParametersFcParameter> fcParameter; 

            private Builder() {
            } 

            private Builder(FcParameters model) {
                this.fcParameter = model.fcParameter;
            } 

            /**
             * FcParameter.
             */
            public Builder fcParameter(java.util.List<FcParametersFcParameter> fcParameter) {
                this.fcParameter = fcParameter;
                return this;
            }

            public FcParameters build() {
                return new FcParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class MnsParametersMnsParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Queue")
        private String queue;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private MnsParametersMnsParameter(Builder builder) {
            this.id = builder.id;
            this.queue = builder.queue;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParametersMnsParameter create() {
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

            private Builder() {
            } 

            private Builder(MnsParametersMnsParameter model) {
                this.id = model.id;
                this.queue = model.queue;
                this.region = model.region;
            } 

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

            public MnsParametersMnsParameter build() {
                return new MnsParametersMnsParameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link PutEventTargetsResponseBody} extends {@link TeaModel}
     *
     * <p>PutEventTargetsResponseBody</p>
     */
    public static class MnsParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MnsParameter")
        private java.util.List<MnsParametersMnsParameter> mnsParameter;

        private MnsParameters(Builder builder) {
            this.mnsParameter = builder.mnsParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MnsParameters create() {
            return builder().build();
        }

        /**
         * @return mnsParameter
         */
        public java.util.List<MnsParametersMnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

        public static final class Builder {
            private java.util.List<MnsParametersMnsParameter> mnsParameter; 

            private Builder() {
            } 

            private Builder(MnsParameters model) {
                this.mnsParameter = model.mnsParameter;
            } 

            /**
             * MnsParameter.
             */
            public Builder mnsParameter(java.util.List<MnsParametersMnsParameter> mnsParameter) {
                this.mnsParameter = mnsParameter;
                return this;
            }

            public MnsParameters build() {
                return new MnsParameters(this);
            } 

        } 

    }
}
