// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApiSignaturesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiSignaturesResponseBody</p>
 */
public class DescribeApiSignaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiSignatures")
    private ApiSignatures apiSignatures;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The returned signature key information. It is an array consisting of ApiSignatureItem data.</p>
         */
        public Builder apiSignatures(ApiSignatures apiSignatures) {
            this.apiSignatures = apiSignatures;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApiSignaturesResponseBody build() {
            return new DescribeApiSignaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApiSignaturesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiSignaturesResponseBody</p>
     */
    public static class ApiSignatureItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("BoundTime")
        private String boundTime;

        @com.aliyun.core.annotation.NameInMap("SignatureId")
        private String signatureId;

        @com.aliyun.core.annotation.NameInMap("SignatureName")
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
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>46fbb52840d146f186e38e8e70fc8c90</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>testapi</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The time when the backend signature key was bound.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-23T08:28:48Z</p>
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * <p>The ID of the backend signature key.</p>
             * 
             * <strong>example:</strong>
             * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
             */
            public Builder signatureId(String signatureId) {
                this.signatureId = signatureId;
                return this;
            }

            /**
             * <p>The name of the backend signature key.</p>
             * 
             * <strong>example:</strong>
             * <p>backendsignature</p>
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
    /**
     * 
     * {@link DescribeApiSignaturesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApiSignaturesResponseBody</p>
     */
    public static class ApiSignatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiSignatureItem")
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
