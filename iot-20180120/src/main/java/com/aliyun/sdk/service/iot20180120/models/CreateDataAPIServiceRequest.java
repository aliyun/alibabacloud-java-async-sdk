// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateDataAPIServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAPIServiceRequest</p>
 */
public class CreateDataAPIServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OriginSql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String originSql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestParam")
    private java.util.List<RequestParam> requestParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseParam")
    private java.util.List<ResponseParam> responseParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateSql")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<RequestParam> getRequestParam() {
        return this.requestParam;
    }

    /**
     * @return responseParam
     */
    public java.util.List<ResponseParam> getResponseParam() {
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
        private java.util.List<RequestParam> requestParam; 
        private java.util.List<ResponseParam> responseParam; 
        private String templateSql; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAPIServiceRequest request) {
            super(request);
            this.apiPath = request.apiPath;
            this.desc = request.desc;
            this.displayName = request.displayName;
            this.iotInstanceId = request.iotInstanceId;
            this.originSql = request.originSql;
            this.requestParam = request.requestParam;
            this.responseParam = request.responseParam;
            this.templateSql = request.templateSql;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device/getDeviceCountByStatus</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT COUNT(iot_id) AS deviceCount FROM ${system.device} WHERE status=1</p>
         */
        public Builder originSql(String originSql) {
            this.putBodyParameter("OriginSql", originSql);
            this.originSql = originSql;
            return this;
        }

        /**
         * RequestParam.
         */
        public Builder requestParam(java.util.List<RequestParam> requestParam) {
            this.putBodyParameter("RequestParam", requestParam);
            this.requestParam = requestParam;
            return this;
        }

        /**
         * ResponseParam.
         */
        public Builder responseParam(java.util.List<ResponseParam> responseParam) {
            this.putBodyParameter("ResponseParam", responseParam);
            this.responseParam = responseParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT COUNT(iot_id) AS deviceCount FROM ${system.device} WHERE status=${status}</p>
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

    /**
     * 
     * {@link CreateDataAPIServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataAPIServiceRequest</p>
     */
    public static class RequestParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Example")
        private String example;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(RequestParam model) {
                this.desc = model.desc;
                this.example = model.example;
                this.name = model.name;
                this.required = model.required;
                this.type = model.type;
            } 

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
    /**
     * 
     * {@link CreateDataAPIServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataAPIServiceRequest</p>
     */
    public static class ResponseParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Example")
        private String example;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(ResponseParam model) {
                this.desc = model.desc;
                this.example = model.example;
                this.name = model.name;
                this.required = model.required;
                this.type = model.type;
            } 

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
