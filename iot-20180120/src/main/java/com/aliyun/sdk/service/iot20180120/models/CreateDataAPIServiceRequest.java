// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataAPIServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAPIServiceRequest</p>
 */
public class CreateDataAPIServiceRequest extends Request {
    @Body
    @NameInMap("ApiPath")
    @Validation(required = true)
    private String apiPath;

    @Body
    @NameInMap("Desc")
    private String desc;

    @Body
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("OriginSql")
    @Validation(required = true)
    private String originSql;

    @Body
    @NameInMap("RequestParam")
    private java.util.List < RequestParam> requestParam;

    @Body
    @NameInMap("ResponseParam")
    private java.util.List < ResponseParam> responseParam;

    @Body
    @NameInMap("TemplateSql")
    @Validation(required = true)
    private String templateSql;

    private CreateDataAPIServiceRequest(Builder builder) {
        super(builder);
        this.apiPath = builder.apiPath;
        this.desc = builder.desc;
        this.displayName = builder.displayName;
        this.iotInstanceId = builder.iotInstanceId;
        this.originSql = builder.originSql;
        this.requestParam = builder.requestParam;
        this.responseParam = builder.responseParam;
        this.templateSql = builder.templateSql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAPIServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiPath
     */
    public String getApiPath() {
        return this.apiPath;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return originSql
     */
    public String getOriginSql() {
        return this.originSql;
    }

    /**
     * @return requestParam
     */
    public java.util.List < RequestParam> getRequestParam() {
        return this.requestParam;
    }

    /**
     * @return responseParam
     */
    public java.util.List < ResponseParam> getResponseParam() {
        return this.responseParam;
    }

    /**
     * @return templateSql
     */
    public String getTemplateSql() {
        return this.templateSql;
    }

    public static final class Builder extends Request.Builder<CreateDataAPIServiceRequest, Builder> {
        private String apiPath; 
        private String desc; 
        private String displayName; 
        private String iotInstanceId; 
        private String originSql; 
        private java.util.List < RequestParam> requestParam; 
        private java.util.List < ResponseParam> responseParam; 
        private String templateSql; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAPIServiceRequest response) {
            super(response);
            this.apiPath = response.apiPath;
            this.desc = response.desc;
            this.displayName = response.displayName;
            this.iotInstanceId = response.iotInstanceId;
            this.originSql = response.originSql;
            this.requestParam = response.requestParam;
            this.responseParam = response.responseParam;
            this.templateSql = response.templateSql;
        } 

        /**
         * ApiPath.
         */
        public Builder apiPath(String apiPath) {
            this.putBodyParameter("ApiPath", apiPath);
            this.apiPath = apiPath;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * OriginSql.
         */
        public Builder originSql(String originSql) {
            this.putBodyParameter("OriginSql", originSql);
            this.originSql = originSql;
            return this;
        }

        /**
         * RequestParam.
         */
        public Builder requestParam(java.util.List < RequestParam> requestParam) {
            this.putBodyParameter("RequestParam", requestParam);
            this.requestParam = requestParam;
            return this;
        }

        /**
         * ResponseParam.
         */
        public Builder responseParam(java.util.List < ResponseParam> responseParam) {
            this.putBodyParameter("ResponseParam", responseParam);
            this.responseParam = responseParam;
            return this;
        }

        /**
         * TemplateSql.
         */
        public Builder templateSql(String templateSql) {
            this.putBodyParameter("TemplateSql", templateSql);
            this.templateSql = templateSql;
            return this;
        }

        @Override
        public CreateDataAPIServiceRequest build() {
            return new CreateDataAPIServiceRequest(this);
        } 

    } 

    public static class RequestParam extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Example")
        private String example;

        @NameInMap("Name")
        private String name;

        @NameInMap("Required")
        private Boolean required;

        @NameInMap("Type")
        private String type;

        private RequestParam(Builder builder) {
            this.desc = builder.desc;
            this.example = builder.example;
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParam create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return example
         */
        public String getExample() {
            return this.example;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String desc; 
            private String example; 
            private String name; 
            private Boolean required; 
            private String type; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Example.
             */
            public Builder example(String example) {
                this.example = example;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RequestParam build() {
                return new RequestParam(this);
            } 

        } 

    }
    public static class ResponseParam extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Example")
        private String example;

        @NameInMap("Name")
        private String name;

        @NameInMap("Required")
        private Boolean required;

        @NameInMap("Type")
        private String type;

        private ResponseParam(Builder builder) {
            this.desc = builder.desc;
            this.example = builder.example;
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseParam create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return example
         */
        public String getExample() {
            return this.example;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String desc; 
            private String example; 
            private String name; 
            private Boolean required; 
            private String type; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Example.
             */
            public Builder example(String example) {
                this.example = example;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResponseParam build() {
                return new ResponseParam(this);
            } 

        } 

    }
}
