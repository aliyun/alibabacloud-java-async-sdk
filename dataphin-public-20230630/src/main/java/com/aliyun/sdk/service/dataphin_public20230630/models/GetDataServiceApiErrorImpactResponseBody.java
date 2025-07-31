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
 * {@link GetDataServiceApiErrorImpactResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataServiceApiErrorImpactResponseBody</p>
 */
public class GetDataServiceApiErrorImpactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataServiceApiErrorImpactResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceApiErrorImpactResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataServiceApiErrorImpactResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public GetDataServiceApiErrorImpactResponseBody build() {
            return new GetDataServiceApiErrorImpactResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataServiceApiErrorImpactResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiErrorImpactResponseBody</p>
     */
    public static class ErrorApiList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        private ErrorApiList(Builder builder) {
            this.apiName = builder.apiName;
            this.appId = builder.appId;
            this.errorCount = builder.errorCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorApiList create() {
            return builder().build();
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
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        public static final class Builder {
            private String apiName; 
            private Long appId; 
            private Long errorCount; 

            private Builder() {
            } 

            private Builder(ErrorApiList model) {
                this.apiName = model.apiName;
                this.appId = model.appId;
                this.errorCount = model.errorCount;
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
             * ErrorCount.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            public ErrorApiList build() {
                return new ErrorApiList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiErrorImpactResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiErrorImpactResponseBody</p>
     */
    public static class ErrorAppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        private ErrorAppList(Builder builder) {
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.errorCount = builder.errorCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorAppList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        public static final class Builder {
            private Integer appId; 
            private Long appKey; 
            private String appName; 
            private Long errorCount; 

            private Builder() {
            } 

            private Builder(ErrorAppList model) {
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.appName = model.appName;
                this.errorCount = model.errorCount;
            } 

            /**
             * <p>appId</p>
             * 
             * <strong>example:</strong>
             * <p>1021</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>appKey</p>
             * 
             * <strong>example:</strong>
             * <p>100211</p>
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * ErrorCount.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            public ErrorAppList build() {
                return new ErrorAppList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataServiceApiErrorImpactResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataServiceApiErrorImpactResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorApiList")
        private java.util.List<ErrorApiList> errorApiList;

        @com.aliyun.core.annotation.NameInMap("ErrorAppList")
        private java.util.List<ErrorAppList> errorAppList;

        private Data(Builder builder) {
            this.errorApiList = builder.errorApiList;
            this.errorAppList = builder.errorAppList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorApiList
         */
        public java.util.List<ErrorApiList> getErrorApiList() {
            return this.errorApiList;
        }

        /**
         * @return errorAppList
         */
        public java.util.List<ErrorAppList> getErrorAppList() {
            return this.errorAppList;
        }

        public static final class Builder {
            private java.util.List<ErrorApiList> errorApiList; 
            private java.util.List<ErrorAppList> errorAppList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorApiList = model.errorApiList;
                this.errorAppList = model.errorAppList;
            } 

            /**
             * ErrorApiList.
             */
            public Builder errorApiList(java.util.List<ErrorApiList> errorApiList) {
                this.errorApiList = errorApiList;
                return this;
            }

            /**
             * ErrorAppList.
             */
            public Builder errorAppList(java.util.List<ErrorAppList> errorAppList) {
                this.errorAppList = errorAppList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
