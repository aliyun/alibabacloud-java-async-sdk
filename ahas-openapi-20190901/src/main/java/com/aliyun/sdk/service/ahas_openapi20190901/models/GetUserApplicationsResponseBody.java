// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserApplicationsResponseBody</p>
 */
public class GetUserApplicationsResponseBody extends TeaModel {
    @NameInMap("AppNameAndIdPairs")
    private java.util.List < AppNameAndIdPairs> appNameAndIdPairs;

    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetUserApplicationsResponseBody(Builder builder) {
        this.appNameAndIdPairs = builder.appNameAndIdPairs;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return appNameAndIdPairs
     */
    public java.util.List < AppNameAndIdPairs> getAppNameAndIdPairs() {
        return this.appNameAndIdPairs;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < AppNameAndIdPairs> appNameAndIdPairs; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AppNameAndIdPairs.
         */
        public Builder appNameAndIdPairs(java.util.List < AppNameAndIdPairs> appNameAndIdPairs) {
            this.appNameAndIdPairs = appNameAndIdPairs;
            return this;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUserApplicationsResponseBody build() {
            return new GetUserApplicationsResponseBody(this);
        } 

    } 

    public static class AppNameAndIdPairs extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppType")
        private Integer appType;

        @NameInMap("ScopeType")
        private Integer scopeType;

        private AppNameAndIdPairs(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.scopeType = builder.scopeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppNameAndIdPairs create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public Integer getAppType() {
            return this.appType;
        }

        /**
         * @return scopeType
         */
        public Integer getScopeType() {
            return this.scopeType;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Integer appType; 
            private Integer scopeType; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * AppType.
             */
            public Builder appType(Integer appType) {
                this.appType = appType;
                return this;
            }

            /**
             * ScopeType.
             */
            public Builder scopeType(Integer scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            public AppNameAndIdPairs build() {
                return new AppNameAndIdPairs(this);
            } 

        } 

    }
}
