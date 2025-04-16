// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListAuthorizedDataServiceApiDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedDataServiceApiDetailsResponseBody</p>
 */
public class ListAuthorizedDataServiceApiDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAuthorizedDataServiceApiDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedDataServiceApiDetailsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAuthorizedDataServiceApiDetailsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAuthorizedDataServiceApiDetailsResponseBody build() {
            return new ListAuthorizedDataServiceApiDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedDataServiceApiDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedDataServiceApiDetailsResponseBody</p>
     */
    public static class AuthorizedDevReturnParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("IsAuthorized")
        private Integer isAuthorized;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        private AuthorizedDevReturnParameters(Builder builder) {
            this.exampleValue = builder.exampleValue;
            this.isAuthorized = builder.isAuthorized;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedDevReturnParameters create() {
            return builder().build();
        }

        /**
         * @return exampleValue
         */
        public String getExampleValue() {
            return this.exampleValue;
        }

        /**
         * @return isAuthorized
         */
        public Integer getIsAuthorized() {
            return this.isAuthorized;
        }

        /**
         * @return parameterDataType
         */
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        /**
         * @return parameterDescription
         */
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String exampleValue; 
            private Integer isAuthorized; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 

            private Builder() {
            } 

            private Builder(AuthorizedDevReturnParameters model) {
                this.exampleValue = model.exampleValue;
                this.isAuthorized = model.isAuthorized;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
            } 

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * IsAuthorized.
             */
            public Builder isAuthorized(Integer isAuthorized) {
                this.isAuthorized = isAuthorized;
                return this;
            }

            /**
             * ParameterDataType.
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * ParameterDescription.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public AuthorizedDevReturnParameters build() {
                return new AuthorizedDevReturnParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthorizedDataServiceApiDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedDataServiceApiDetailsResponseBody</p>
     */
    public static class AuthorizedProdReturnParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExampleValue")
        private String exampleValue;

        @com.aliyun.core.annotation.NameInMap("IsAuthorized")
        private Integer isAuthorized;

        @com.aliyun.core.annotation.NameInMap("ParameterDataType")
        private Integer parameterDataType;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        private AuthorizedProdReturnParameters(Builder builder) {
            this.exampleValue = builder.exampleValue;
            this.isAuthorized = builder.isAuthorized;
            this.parameterDataType = builder.parameterDataType;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedProdReturnParameters create() {
            return builder().build();
        }

        /**
         * @return exampleValue
         */
        public String getExampleValue() {
            return this.exampleValue;
        }

        /**
         * @return isAuthorized
         */
        public Integer getIsAuthorized() {
            return this.isAuthorized;
        }

        /**
         * @return parameterDataType
         */
        public Integer getParameterDataType() {
            return this.parameterDataType;
        }

        /**
         * @return parameterDescription
         */
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String exampleValue; 
            private Integer isAuthorized; 
            private Integer parameterDataType; 
            private String parameterDescription; 
            private String parameterName; 

            private Builder() {
            } 

            private Builder(AuthorizedProdReturnParameters model) {
                this.exampleValue = model.exampleValue;
                this.isAuthorized = model.isAuthorized;
                this.parameterDataType = model.parameterDataType;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
            } 

            /**
             * ExampleValue.
             */
            public Builder exampleValue(String exampleValue) {
                this.exampleValue = exampleValue;
                return this;
            }

            /**
             * IsAuthorized.
             */
            public Builder isAuthorized(Integer isAuthorized) {
                this.isAuthorized = isAuthorized;
                return this;
            }

            /**
             * ParameterDataType.
             */
            public Builder parameterDataType(Integer parameterDataType) {
                this.parameterDataType = parameterDataType;
                return this;
            }

            /**
             * ParameterDescription.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public AuthorizedProdReturnParameters build() {
                return new AuthorizedProdReturnParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthorizedDataServiceApiDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedDataServiceApiDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("AuthorizedDevReturnParameters")
        private java.util.List<AuthorizedDevReturnParameters> authorizedDevReturnParameters;

        @com.aliyun.core.annotation.NameInMap("AuthorizedProdReturnParameters")
        private java.util.List<AuthorizedProdReturnParameters> authorizedProdReturnParameters;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DevAuthPeriod")
        private String devAuthPeriod;

        @com.aliyun.core.annotation.NameInMap("ProdAuthPeriod")
        private String prodAuthPeriod;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.appId = builder.appId;
            this.authType = builder.authType;
            this.authorizedDevReturnParameters = builder.authorizedDevReturnParameters;
            this.authorizedProdReturnParameters = builder.authorizedProdReturnParameters;
            this.description = builder.description;
            this.devAuthPeriod = builder.devAuthPeriod;
            this.prodAuthPeriod = builder.prodAuthPeriod;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return authorizedDevReturnParameters
         */
        public java.util.List<AuthorizedDevReturnParameters> getAuthorizedDevReturnParameters() {
            return this.authorizedDevReturnParameters;
        }

        /**
         * @return authorizedProdReturnParameters
         */
        public java.util.List<AuthorizedProdReturnParameters> getAuthorizedProdReturnParameters() {
            return this.authorizedProdReturnParameters;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return devAuthPeriod
         */
        public String getDevAuthPeriod() {
            return this.devAuthPeriod;
        }

        /**
         * @return prodAuthPeriod
         */
        public String getProdAuthPeriod() {
            return this.prodAuthPeriod;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Long apiId; 
            private String apiName; 
            private Long appId; 
            private String authType; 
            private java.util.List<AuthorizedDevReturnParameters> authorizedDevReturnParameters; 
            private java.util.List<AuthorizedProdReturnParameters> authorizedProdReturnParameters; 
            private String description; 
            private String devAuthPeriod; 
            private String prodAuthPeriod; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.appId = model.appId;
                this.authType = model.authType;
                this.authorizedDevReturnParameters = model.authorizedDevReturnParameters;
                this.authorizedProdReturnParameters = model.authorizedProdReturnParameters;
                this.description = model.description;
                this.devAuthPeriod = model.devAuthPeriod;
                this.prodAuthPeriod = model.prodAuthPeriod;
                this.projectId = model.projectId;
            } 

            /**
             * <p>API_ID</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * AuthorizedDevReturnParameters.
             */
            public Builder authorizedDevReturnParameters(java.util.List<AuthorizedDevReturnParameters> authorizedDevReturnParameters) {
                this.authorizedDevReturnParameters = authorizedDevReturnParameters;
                return this;
            }

            /**
             * AuthorizedProdReturnParameters.
             */
            public Builder authorizedProdReturnParameters(java.util.List<AuthorizedProdReturnParameters> authorizedProdReturnParameters) {
                this.authorizedProdReturnParameters = authorizedProdReturnParameters;
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
             * DevAuthPeriod.
             */
            public Builder devAuthPeriod(String devAuthPeriod) {
                this.devAuthPeriod = devAuthPeriod;
                return this;
            }

            /**
             * ProdAuthPeriod.
             */
            public Builder prodAuthPeriod(String prodAuthPeriod) {
                this.prodAuthPeriod = prodAuthPeriod;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAuthorizedDataServiceApiDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedDataServiceApiDetailsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Result(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
