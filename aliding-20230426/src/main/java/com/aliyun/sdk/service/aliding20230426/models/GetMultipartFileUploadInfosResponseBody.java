// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetMultipartFileUploadInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultipartFileUploadInfosResponseBody</p>
 */
public class GetMultipartFileUploadInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("multipartHeaderSignatureInfos")
    private java.util.List<MultipartHeaderSignatureInfos> multipartHeaderSignatureInfos;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetMultipartFileUploadInfosResponseBody(Builder builder) {
        this.multipartHeaderSignatureInfos = builder.multipartHeaderSignatureInfos;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultipartFileUploadInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multipartHeaderSignatureInfos
     */
    public java.util.List<MultipartHeaderSignatureInfos> getMultipartHeaderSignatureInfos() {
        return this.multipartHeaderSignatureInfos;
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
        private java.util.List<MultipartHeaderSignatureInfos> multipartHeaderSignatureInfos; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetMultipartFileUploadInfosResponseBody model) {
            this.multipartHeaderSignatureInfos = model.multipartHeaderSignatureInfos;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * multipartHeaderSignatureInfos.
         */
        public Builder multipartHeaderSignatureInfos(java.util.List<MultipartHeaderSignatureInfos> multipartHeaderSignatureInfos) {
            this.multipartHeaderSignatureInfos = multipartHeaderSignatureInfos;
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

        public GetMultipartFileUploadInfosResponseBody build() {
            return new GetMultipartFileUploadInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultipartFileUploadInfosResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultipartFileUploadInfosResponseBody</p>
     */
    public static class HeaderSignatureInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpirationSeconds")
        private Integer expirationSeconds;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.Map<String, String> headers;

        @com.aliyun.core.annotation.NameInMap("InternalResourceUrls")
        private java.util.List<String> internalResourceUrls;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceUrls")
        private java.util.List<String> resourceUrls;

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
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        /**
         * @return internalResourceUrls
         */
        public java.util.List<String> getInternalResourceUrls() {
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
        public java.util.List<String> getResourceUrls() {
            return this.resourceUrls;
        }

        public static final class Builder {
            private Integer expirationSeconds; 
            private java.util.Map<String, String> headers; 
            private java.util.List<String> internalResourceUrls; 
            private String region; 
            private java.util.List<String> resourceUrls; 

            private Builder() {
            } 

            private Builder(HeaderSignatureInfo model) {
                this.expirationSeconds = model.expirationSeconds;
                this.headers = model.headers;
                this.internalResourceUrls = model.internalResourceUrls;
                this.region = model.region;
                this.resourceUrls = model.resourceUrls;
            } 

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
            public Builder headers(java.util.Map<String, String> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * InternalResourceUrls.
             */
            public Builder internalResourceUrls(java.util.List<String> internalResourceUrls) {
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
            public Builder resourceUrls(java.util.List<String> resourceUrls) {
                this.resourceUrls = resourceUrls;
                return this;
            }

            public HeaderSignatureInfo build() {
                return new HeaderSignatureInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMultipartFileUploadInfosResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultipartFileUploadInfosResponseBody</p>
     */
    public static class MultipartHeaderSignatureInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderSignatureInfo")
        private HeaderSignatureInfo headerSignatureInfo;

        @com.aliyun.core.annotation.NameInMap("PartNumber")
        private Integer partNumber;

        private MultipartHeaderSignatureInfos(Builder builder) {
            this.headerSignatureInfo = builder.headerSignatureInfo;
            this.partNumber = builder.partNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultipartHeaderSignatureInfos create() {
            return builder().build();
        }

        /**
         * @return headerSignatureInfo
         */
        public HeaderSignatureInfo getHeaderSignatureInfo() {
            return this.headerSignatureInfo;
        }

        /**
         * @return partNumber
         */
        public Integer getPartNumber() {
            return this.partNumber;
        }

        public static final class Builder {
            private HeaderSignatureInfo headerSignatureInfo; 
            private Integer partNumber; 

            private Builder() {
            } 

            private Builder(MultipartHeaderSignatureInfos model) {
                this.headerSignatureInfo = model.headerSignatureInfo;
                this.partNumber = model.partNumber;
            } 

            /**
             * HeaderSignatureInfo.
             */
            public Builder headerSignatureInfo(HeaderSignatureInfo headerSignatureInfo) {
                this.headerSignatureInfo = headerSignatureInfo;
                return this;
            }

            /**
             * PartNumber.
             */
            public Builder partNumber(Integer partNumber) {
                this.partNumber = partNumber;
                return this;
            }

            public MultipartHeaderSignatureInfos build() {
                return new MultipartHeaderSignatureInfos(this);
            } 

        } 

    }
}
