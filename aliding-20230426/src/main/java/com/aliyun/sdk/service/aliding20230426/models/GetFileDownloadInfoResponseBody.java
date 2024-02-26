// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDownloadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDownloadInfoResponseBody</p>
 */
public class GetFileDownloadInfoResponseBody extends TeaModel {
    @NameInMap("headerSignatureInfo")
    private HeaderSignatureInfo headerSignatureInfo;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private GetFileDownloadInfoResponseBody(Builder builder) {
        this.headerSignatureInfo = builder.headerSignatureInfo;
        this.protocol = builder.protocol;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDownloadInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return headerSignatureInfo
     */
    public HeaderSignatureInfo getHeaderSignatureInfo() {
        return this.headerSignatureInfo;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private HeaderSignatureInfo headerSignatureInfo; 
        private String protocol; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * headerSignatureInfo.
         */
        public Builder headerSignatureInfo(HeaderSignatureInfo headerSignatureInfo) {
            this.headerSignatureInfo = headerSignatureInfo;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
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
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetFileDownloadInfoResponseBody build() {
            return new GetFileDownloadInfoResponseBody(this);
        } 

    } 

    public static class HeaderSignatureInfo extends TeaModel {
        @NameInMap("ExpirationSeconds")
        private Integer expirationSeconds;

        @NameInMap("Headers")
        private java.util.Map < String, String > headers;

        @NameInMap("InternalResourceUrls")
        private java.util.List < String > internalResourceUrls;

        @NameInMap("Region")
        private String region;

        @NameInMap("ResourceUrls")
        private java.util.List < String > resourceUrls;

        private HeaderSignatureInfo(Builder builder) {
            this.expirationSeconds = builder.expirationSeconds;
            this.headers = builder.headers;
            this.internalResourceUrls = builder.internalResourceUrls;
            this.region = builder.region;
            this.resourceUrls = builder.resourceUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderSignatureInfo create() {
            return builder().build();
        }

        /**
         * @return expirationSeconds
         */
        public Integer getExpirationSeconds() {
            return this.expirationSeconds;
        }

        /**
         * @return headers
         */
        public java.util.Map < String, String > getHeaders() {
            return this.headers;
        }

        /**
         * @return internalResourceUrls
         */
        public java.util.List < String > getInternalResourceUrls() {
            return this.internalResourceUrls;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceUrls
         */
        public java.util.List < String > getResourceUrls() {
            return this.resourceUrls;
        }

        public static final class Builder {
            private Integer expirationSeconds; 
            private java.util.Map < String, String > headers; 
            private java.util.List < String > internalResourceUrls; 
            private String region; 
            private java.util.List < String > resourceUrls; 

            /**
             * ExpirationSeconds.
             */
            public Builder expirationSeconds(Integer expirationSeconds) {
                this.expirationSeconds = expirationSeconds;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(java.util.Map < String, String > headers) {
                this.headers = headers;
                return this;
            }

            /**
             * InternalResourceUrls.
             */
            public Builder internalResourceUrls(java.util.List < String > internalResourceUrls) {
                this.internalResourceUrls = internalResourceUrls;
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
             * ResourceUrls.
             */
            public Builder resourceUrls(java.util.List < String > resourceUrls) {
                this.resourceUrls = resourceUrls;
                return this;
            }

            public HeaderSignatureInfo build() {
                return new HeaderSignatureInfo(this);
            } 

        } 

    }
}
