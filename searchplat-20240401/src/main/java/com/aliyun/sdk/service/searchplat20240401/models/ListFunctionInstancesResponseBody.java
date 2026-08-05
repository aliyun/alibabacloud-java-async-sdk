// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListFunctionInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionInstancesResponseBody</p>
 */
public class ListFunctionInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("latency")
    private Long latency;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListFunctionInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.latency = builder.latency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionInstancesResponseBody create() {
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
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return latency
     */
    public Long getLatency() {
        return this.latency;
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Long httpCode; 
        private Long latency; 
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private String status; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListFunctionInstancesResponseBody model) {
            this.code = model.code;
            this.httpCode = model.httpCode;
            this.latency = model.latency;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
            this.totalCount = model.totalCount;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * latency.
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFunctionInstancesResponseBody build() {
            return new ListFunctionInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFunctionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionInstancesResponseBody</p>
     */
    public static class Belongs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        private Belongs(Builder builder) {
            this.category = builder.category;
            this.domain = builder.domain;
            this.language = builder.language;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Belongs create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        public static final class Builder {
            private String category; 
            private String domain; 
            private String language; 

            private Builder() {
            } 

            private Builder(Belongs model) {
                this.category = model.category;
                this.domain = model.domain;
                this.language = model.language;
            } 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            public Belongs build() {
                return new Belongs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionInstancesResponseBody</p>
     */
    public static class CreateParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private CreateParameters(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateParameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(CreateParameters model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CreateParameters build() {
                return new CreateParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFunctionInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFunctionInstancesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("belongs")
        private Belongs belongs;

        @com.aliyun.core.annotation.NameInMap("createParameters")
        private java.util.List<CreateParameters> createParameters;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("extendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("functionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("functionType")
        private String functionType;

        @com.aliyun.core.annotation.NameInMap("instanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("modelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("usageParameters")
        private java.util.List<java.util.Map<String, ?>> usageParameters;

        @com.aliyun.core.annotation.NameInMap("versionId")
        private Long versionId;

        private Result(Builder builder) {
            this.belongs = builder.belongs;
            this.createParameters = builder.createParameters;
            this.createTime = builder.createTime;
            this.cron = builder.cron;
            this.description = builder.description;
            this.extendInfo = builder.extendInfo;
            this.functionName = builder.functionName;
            this.functionType = builder.functionType;
            this.instanceName = builder.instanceName;
            this.modelType = builder.modelType;
            this.source = builder.source;
            this.status = builder.status;
            this.usageParameters = builder.usageParameters;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return belongs
         */
        public Belongs getBelongs() {
            return this.belongs;
        }

        /**
         * @return createParameters
         */
        public java.util.List<CreateParameters> getCreateParameters() {
            return this.createParameters;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return functionType
         */
        public String getFunctionType() {
            return this.functionType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return usageParameters
         */
        public java.util.List<java.util.Map<String, ?>> getUsageParameters() {
            return this.usageParameters;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private Belongs belongs; 
            private java.util.List<CreateParameters> createParameters; 
            private Long createTime; 
            private String cron; 
            private String description; 
            private String extendInfo; 
            private String functionName; 
            private String functionType; 
            private String instanceName; 
            private String modelType; 
            private String source; 
            private String status; 
            private java.util.List<java.util.Map<String, ?>> usageParameters; 
            private Long versionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.belongs = model.belongs;
                this.createParameters = model.createParameters;
                this.createTime = model.createTime;
                this.cron = model.cron;
                this.description = model.description;
                this.extendInfo = model.extendInfo;
                this.functionName = model.functionName;
                this.functionType = model.functionType;
                this.instanceName = model.instanceName;
                this.modelType = model.modelType;
                this.source = model.source;
                this.status = model.status;
                this.usageParameters = model.usageParameters;
                this.versionId = model.versionId;
            } 

            /**
             * belongs.
             */
            public Builder belongs(Belongs belongs) {
                this.belongs = belongs;
                return this;
            }

            /**
             * createParameters.
             */
            public Builder createParameters(java.util.List<CreateParameters> createParameters) {
                this.createParameters = createParameters;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * cron.
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * extendInfo.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * functionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * functionType.
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * instanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * modelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>usageParameters</p>
             */
            public Builder usageParameters(java.util.List<java.util.Map<String, ?>> usageParameters) {
                this.usageParameters = usageParameters;
                return this;
            }

            /**
             * versionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
