// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiSignaturesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiSignaturesResponseBody</p>
 */
public class DescribeApiSignaturesResponseBody extends TeaModel {
    @NameInMap("ApiSignatures")
    private ApiSignatures apiSignatures;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeApiSignaturesResponseBody(Builder builder) {
        this.apiSignatures = builder.apiSignatures;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiSignaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiSignatures
     */
    public ApiSignatures getApiSignatures() {
        return this.apiSignatures;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ApiSignatures apiSignatures; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ApiSignatures.
         */
        public Builder apiSignatures(ApiSignatures apiSignatures) {
            this.apiSignatures = apiSignatures;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiSignaturesResponseBody build() {
            return new DescribeApiSignaturesResponseBody(this);
        } 

    } 

    public static class ApiSignatureItem extends TeaModel {
        @NameInMap("ApiId")
        private String apiId;

        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("BoundTime")
        private String boundTime;

        @NameInMap("SignatureId")
        private String signatureId;

        @NameInMap("SignatureName")
        private String signatureName;

        private ApiSignatureItem(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.boundTime = builder.boundTime;
            this.signatureId = builder.signatureId;
            this.signatureName = builder.signatureName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiSignatureItem create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return boundTime
         */
        public String getBoundTime() {
            return this.boundTime;
        }

        /**
         * @return signatureId
         */
        public String getSignatureId() {
            return this.signatureId;
        }

        /**
         * @return signatureName
         */
        public String getSignatureName() {
            return this.signatureName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 
            private String boundTime; 
            private String signatureId; 
            private String signatureName; 

            /**
             * ApiId.
             */
            public Builder apiId(String apiId) {
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
             * BoundTime.
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * SignatureId.
             */
            public Builder signatureId(String signatureId) {
                this.signatureId = signatureId;
                return this;
            }

            /**
             * SignatureName.
             */
            public Builder signatureName(String signatureName) {
                this.signatureName = signatureName;
                return this;
            }

            public ApiSignatureItem build() {
                return new ApiSignatureItem(this);
            } 

        } 

    }
    public static class ApiSignatures extends TeaModel {
        @NameInMap("ApiSignatureItem")
        private java.util.List < ApiSignatureItem> apiSignatureItem;

        private ApiSignatures(Builder builder) {
            this.apiSignatureItem = builder.apiSignatureItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiSignatures create() {
            return builder().build();
        }

        /**
         * @return apiSignatureItem
         */
        public java.util.List < ApiSignatureItem> getApiSignatureItem() {
            return this.apiSignatureItem;
        }

        public static final class Builder {
            private java.util.List < ApiSignatureItem> apiSignatureItem; 

            /**
             * ApiSignatureItem.
             */
            public Builder apiSignatureItem(java.util.List < ApiSignatureItem> apiSignatureItem) {
                this.apiSignatureItem = apiSignatureItem;
                return this;
            }

            public ApiSignatures build() {
                return new ApiSignatures(this);
            } 

        } 

    }
}
