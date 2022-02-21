// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataAPIServiceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataAPIServiceDetailResponseBody</p>
 */
public class GetDataAPIServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDataAPIServiceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAPIServiceDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetDataAPIServiceDetailResponseBody build() {
            return new GetDataAPIServiceDetailResponseBody(this);
        } 

    } 

    public static class RequestParams extends TeaModel {
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

        private RequestParams(Builder builder) {
            this.desc = builder.desc;
            this.example = builder.example;
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestParams create() {
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

            public RequestParams build() {
                return new RequestParams(this);
            } 

        } 

    }
    public static class SqlTemplateDTORequestParams extends TeaModel {
        @NameInMap("RequestParams")
        private java.util.List < RequestParams> requestParams;

        private SqlTemplateDTORequestParams(Builder builder) {
            this.requestParams = builder.requestParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlTemplateDTORequestParams create() {
            return builder().build();
        }

        /**
         * @return requestParams
         */
        public java.util.List < RequestParams> getRequestParams() {
            return this.requestParams;
        }

        public static final class Builder {
            private java.util.List < RequestParams> requestParams; 

            /**
             * RequestParams.
             */
            public Builder requestParams(java.util.List < RequestParams> requestParams) {
                this.requestParams = requestParams;
                return this;
            }

            public SqlTemplateDTORequestParams build() {
                return new SqlTemplateDTORequestParams(this);
            } 

        } 

    }
    public static class ResponseParams extends TeaModel {
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

        private ResponseParams(Builder builder) {
            this.desc = builder.desc;
            this.example = builder.example;
            this.name = builder.name;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseParams create() {
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

            public ResponseParams build() {
                return new ResponseParams(this);
            } 

        } 

    }
    public static class SqlTemplateDTOResponseParams extends TeaModel {
        @NameInMap("ResponseParams")
        private java.util.List < ResponseParams> responseParams;

        private SqlTemplateDTOResponseParams(Builder builder) {
            this.responseParams = builder.responseParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlTemplateDTOResponseParams create() {
            return builder().build();
        }

        /**
         * @return responseParams
         */
        public java.util.List < ResponseParams> getResponseParams() {
            return this.responseParams;
        }

        public static final class Builder {
            private java.util.List < ResponseParams> responseParams; 

            /**
             * ResponseParams.
             */
            public Builder responseParams(java.util.List < ResponseParams> responseParams) {
                this.responseParams = responseParams;
                return this;
            }

            public SqlTemplateDTOResponseParams build() {
                return new SqlTemplateDTOResponseParams(this);
            } 

        } 

    }
    public static class SqlTemplateDTO extends TeaModel {
        @NameInMap("OriginSql")
        private String originSql;

        @NameInMap("RequestParams")
        private SqlTemplateDTORequestParams requestParams;

        @NameInMap("ResponseParams")
        private SqlTemplateDTOResponseParams responseParams;

        @NameInMap("TemplateSql")
        private String templateSql;

        private SqlTemplateDTO(Builder builder) {
            this.originSql = builder.originSql;
            this.requestParams = builder.requestParams;
            this.responseParams = builder.responseParams;
            this.templateSql = builder.templateSql;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlTemplateDTO create() {
            return builder().build();
        }

        /**
         * @return originSql
         */
        public String getOriginSql() {
            return this.originSql;
        }

        /**
         * @return requestParams
         */
        public SqlTemplateDTORequestParams getRequestParams() {
            return this.requestParams;
        }

        /**
         * @return responseParams
         */
        public SqlTemplateDTOResponseParams getResponseParams() {
            return this.responseParams;
        }

        /**
         * @return templateSql
         */
        public String getTemplateSql() {
            return this.templateSql;
        }

        public static final class Builder {
            private String originSql; 
            private SqlTemplateDTORequestParams requestParams; 
            private SqlTemplateDTOResponseParams responseParams; 
            private String templateSql; 

            /**
             * OriginSql.
             */
            public Builder originSql(String originSql) {
                this.originSql = originSql;
                return this;
            }

            /**
             * RequestParams.
             */
            public Builder requestParams(SqlTemplateDTORequestParams requestParams) {
                this.requestParams = requestParams;
                return this;
            }

            /**
             * ResponseParams.
             */
            public Builder responseParams(SqlTemplateDTOResponseParams responseParams) {
                this.responseParams = responseParams;
                return this;
            }

            /**
             * TemplateSql.
             */
            public Builder templateSql(String templateSql) {
                this.templateSql = templateSql;
                return this;
            }

            public SqlTemplateDTO build() {
                return new SqlTemplateDTO(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApiPath")
        private String apiPath;

        @NameInMap("ApiSrn")
        private String apiSrn;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DateFormat")
        private String dateFormat;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("LastUpdateTime")
        private Long lastUpdateTime;

        @NameInMap("RequestMethod")
        private String requestMethod;

        @NameInMap("RequestProtocol")
        private String requestProtocol;

        @NameInMap("SqlTemplateDTO")
        private SqlTemplateDTO sqlTemplateDTO;

        @NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.apiPath = builder.apiPath;
            this.apiSrn = builder.apiSrn;
            this.createTime = builder.createTime;
            this.dateFormat = builder.dateFormat;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.requestMethod = builder.requestMethod;
            this.requestProtocol = builder.requestProtocol;
            this.sqlTemplateDTO = builder.sqlTemplateDTO;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiPath
         */
        public String getApiPath() {
            return this.apiPath;
        }

        /**
         * @return apiSrn
         */
        public String getApiSrn() {
            return this.apiSrn;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dateFormat
         */
        public String getDateFormat() {
            return this.dateFormat;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return lastUpdateTime
         */
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return requestMethod
         */
        public String getRequestMethod() {
            return this.requestMethod;
        }

        /**
         * @return requestProtocol
         */
        public String getRequestProtocol() {
            return this.requestProtocol;
        }

        /**
         * @return sqlTemplateDTO
         */
        public SqlTemplateDTO getSqlTemplateDTO() {
            return this.sqlTemplateDTO;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String apiPath; 
            private String apiSrn; 
            private Long createTime; 
            private String dateFormat; 
            private String description; 
            private String displayName; 
            private Long lastUpdateTime; 
            private String requestMethod; 
            private String requestProtocol; 
            private SqlTemplateDTO sqlTemplateDTO; 
            private Integer status; 

            /**
             * ApiPath.
             */
            public Builder apiPath(String apiPath) {
                this.apiPath = apiPath;
                return this;
            }

            /**
             * ApiSrn.
             */
            public Builder apiSrn(String apiSrn) {
                this.apiSrn = apiSrn;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DateFormat.
             */
            public Builder dateFormat(String dateFormat) {
                this.dateFormat = dateFormat;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(Long lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * RequestMethod.
             */
            public Builder requestMethod(String requestMethod) {
                this.requestMethod = requestMethod;
                return this;
            }

            /**
             * RequestProtocol.
             */
            public Builder requestProtocol(String requestProtocol) {
                this.requestProtocol = requestProtocol;
                return this;
            }

            /**
             * SqlTemplateDTO.
             */
            public Builder sqlTemplateDTO(SqlTemplateDTO sqlTemplateDTO) {
                this.sqlTemplateDTO = sqlTemplateDTO;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
