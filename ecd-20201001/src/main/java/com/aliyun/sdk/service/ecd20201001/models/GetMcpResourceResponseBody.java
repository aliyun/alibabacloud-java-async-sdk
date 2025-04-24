// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001.models;

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
 * {@link GetMcpResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetMcpResourceResponseBody</p>
 */
public class GetMcpResourceResponseBody extends TeaModel {
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

    private GetMcpResourceResponseBody(Builder builder) {
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

    public static GetMcpResourceResponseBody create() {
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

        private Builder(GetMcpResourceResponseBody model) {
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

        public GetMcpResourceResponseBody build() {
            return new GetMcpResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMcpResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpResourceResponseBody</p>
     */
    public static class DesktopInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AuthCode")
        private String authCode;

        @com.aliyun.core.annotation.NameInMap("ConnectionProperties")
        private String connectionProperties;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private DesktopInfo(Builder builder) {
            this.appId = builder.appId;
            this.authCode = builder.authCode;
            this.connectionProperties = builder.connectionProperties;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return authCode
         */
        public String getAuthCode() {
            return this.authCode;
        }

        /**
         * @return connectionProperties
         */
        public String getConnectionProperties() {
            return this.connectionProperties;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String appId; 
            private String authCode; 
            private String connectionProperties; 
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(DesktopInfo model) {
                this.appId = model.appId;
                this.authCode = model.authCode;
                this.connectionProperties = model.connectionProperties;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AuthCode.
             */
            public Builder authCode(String authCode) {
                this.authCode = authCode;
                return this;
            }

            /**
             * ConnectionProperties.
             */
            public Builder connectionProperties(String connectionProperties) {
                this.connectionProperties = connectionProperties;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public DesktopInfo build() {
                return new DesktopInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMcpResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetMcpResourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopInfo")
        private DesktopInfo desktopInfo;

        @com.aliyun.core.annotation.NameInMap("ResourceUrl")
        private String resourceUrl;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.desktopInfo = builder.desktopInfo;
            this.resourceUrl = builder.resourceUrl;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return desktopInfo
         */
        public DesktopInfo getDesktopInfo() {
            return this.desktopInfo;
        }

        /**
         * @return resourceUrl
         */
        public String getResourceUrl() {
            return this.resourceUrl;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private DesktopInfo desktopInfo; 
            private String resourceUrl; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.desktopInfo = model.desktopInfo;
                this.resourceUrl = model.resourceUrl;
                this.sessionId = model.sessionId;
            } 

            /**
             * DesktopInfo.
             */
            public Builder desktopInfo(DesktopInfo desktopInfo) {
                this.desktopInfo = desktopInfo;
                return this;
            }

            /**
             * ResourceUrl.
             */
            public Builder resourceUrl(String resourceUrl) {
                this.resourceUrl = resourceUrl;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
