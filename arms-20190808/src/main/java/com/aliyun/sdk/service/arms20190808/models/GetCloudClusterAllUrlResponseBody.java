// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudClusterAllUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudClusterAllUrlResponseBody</p>
 */
public class GetCloudClusterAllUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetCloudClusterAllUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudClusterAllUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 状态码。200为成功，其他状态码为异常。
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * An array object.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 详细信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 操作是否成功：true：操作成功                                 false：操作失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCloudClusterAllUrlResponseBody build() {
            return new GetCloudClusterAllUrlResponseBody(this);
        } 

    } 

    public static class RemoteUrl extends TeaModel {
        @NameInMap("AuthToken")
        private Boolean authToken;

        @NameInMap("GrafanaUrl")
        private String grafanaUrl;

        @NameInMap("InternetGrafanaUrl")
        private String internetGrafanaUrl;

        @NameInMap("InternetPushGatewayUrl")
        private String internetPushGatewayUrl;

        @NameInMap("InternetRemoteReadUrl")
        private String internetRemoteReadUrl;

        @NameInMap("InternetRemoteWriteUrl")
        private String internetRemoteWriteUrl;

        @NameInMap("PushGatewayUrl")
        private String pushGatewayUrl;

        @NameInMap("RemoteReadUrl")
        private String remoteReadUrl;

        @NameInMap("RemoteWriteUrl")
        private String remoteWriteUrl;

        @NameInMap("Token")
        private String token;

        private RemoteUrl(Builder builder) {
            this.authToken = builder.authToken;
            this.grafanaUrl = builder.grafanaUrl;
            this.internetGrafanaUrl = builder.internetGrafanaUrl;
            this.internetPushGatewayUrl = builder.internetPushGatewayUrl;
            this.internetRemoteReadUrl = builder.internetRemoteReadUrl;
            this.internetRemoteWriteUrl = builder.internetRemoteWriteUrl;
            this.pushGatewayUrl = builder.pushGatewayUrl;
            this.remoteReadUrl = builder.remoteReadUrl;
            this.remoteWriteUrl = builder.remoteWriteUrl;
            this.token = builder.token;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoteUrl create() {
            return builder().build();
        }

        /**
         * @return authToken
         */
        public Boolean getAuthToken() {
            return this.authToken;
        }

        /**
         * @return grafanaUrl
         */
        public String getGrafanaUrl() {
            return this.grafanaUrl;
        }

        /**
         * @return internetGrafanaUrl
         */
        public String getInternetGrafanaUrl() {
            return this.internetGrafanaUrl;
        }

        /**
         * @return internetPushGatewayUrl
         */
        public String getInternetPushGatewayUrl() {
            return this.internetPushGatewayUrl;
        }

        /**
         * @return internetRemoteReadUrl
         */
        public String getInternetRemoteReadUrl() {
            return this.internetRemoteReadUrl;
        }

        /**
         * @return internetRemoteWriteUrl
         */
        public String getInternetRemoteWriteUrl() {
            return this.internetRemoteWriteUrl;
        }

        /**
         * @return pushGatewayUrl
         */
        public String getPushGatewayUrl() {
            return this.pushGatewayUrl;
        }

        /**
         * @return remoteReadUrl
         */
        public String getRemoteReadUrl() {
            return this.remoteReadUrl;
        }

        /**
         * @return remoteWriteUrl
         */
        public String getRemoteWriteUrl() {
            return this.remoteWriteUrl;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        public static final class Builder {
            private Boolean authToken; 
            private String grafanaUrl; 
            private String internetGrafanaUrl; 
            private String internetPushGatewayUrl; 
            private String internetRemoteReadUrl; 
            private String internetRemoteWriteUrl; 
            private String pushGatewayUrl; 
            private String remoteReadUrl; 
            private String remoteWriteUrl; 
            private String token; 

            /**
             * Indicates whether authentication is enabled.
             */
            public Builder authToken(Boolean authToken) {
                this.authToken = authToken;
                return this;
            }

            /**
             * The internal URL for Grafana.
             */
            public Builder grafanaUrl(String grafanaUrl) {
                this.grafanaUrl = grafanaUrl;
                return this;
            }

            /**
             * The public URL for Grafana.
             */
            public Builder internetGrafanaUrl(String internetGrafanaUrl) {
                this.internetGrafanaUrl = internetGrafanaUrl;
                return this;
            }

            /**
             * The public URL for Pushgateway.
             */
            public Builder internetPushGatewayUrl(String internetPushGatewayUrl) {
                this.internetPushGatewayUrl = internetPushGatewayUrl;
                return this;
            }

            /**
             * The public URL for remote read.
             */
            public Builder internetRemoteReadUrl(String internetRemoteReadUrl) {
                this.internetRemoteReadUrl = internetRemoteReadUrl;
                return this;
            }

            /**
             * The public URL for remote write.
             */
            public Builder internetRemoteWriteUrl(String internetRemoteWriteUrl) {
                this.internetRemoteWriteUrl = internetRemoteWriteUrl;
                return this;
            }

            /**
             * The internal URL for Pushgateway.
             */
            public Builder pushGatewayUrl(String pushGatewayUrl) {
                this.pushGatewayUrl = pushGatewayUrl;
                return this;
            }

            /**
             * The internal URL for remote read.
             */
            public Builder remoteReadUrl(String remoteReadUrl) {
                this.remoteReadUrl = remoteReadUrl;
                return this;
            }

            /**
             * The internal URL for remote write.
             */
            public Builder remoteWriteUrl(String remoteWriteUrl) {
                this.remoteWriteUrl = remoteWriteUrl;
                return this;
            }

            /**
             * The token value used for authentication.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            public RemoteUrl build() {
                return new RemoteUrl(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("Region")
        private String region;

        @NameInMap("RemoteUrl")
        private RemoteUrl remoteUrl;

        private Data(Builder builder) {
            this.productCode = builder.productCode;
            this.region = builder.region;
            this.remoteUrl = builder.remoteUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return remoteUrl
         */
        public RemoteUrl getRemoteUrl() {
            return this.remoteUrl;
        }

        public static final class Builder {
            private String productCode; 
            private String region; 
            private RemoteUrl remoteUrl; 

            /**
             * The identifier of the cloud service.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The URLs for remote read and write. The value is a JSON string.
             */
            public Builder remoteUrl(RemoteUrl remoteUrl) {
                this.remoteUrl = remoteUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
