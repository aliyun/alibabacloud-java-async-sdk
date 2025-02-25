// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeSignaturesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSignaturesResponseBody</p>
 */
public class DescribeSignaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignatureInfos")
    private SignatureInfos signatureInfos;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSignaturesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.signatureInfos = builder.signatureInfos;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSignaturesResponseBody create() {
        return builder().build();
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
     * @return signatureInfos
     */
    public SignatureInfos getSignatureInfos() {
        return this.signatureInfos;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SignatureInfos signatureInfos; 
        private Integer totalCount; 

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
         * <p>The returned signature information. It is an array consisting of SignatureInfo data.</p>
         */
        public Builder signatureInfos(SignatureInfos signatureInfos) {
            this.signatureInfos = signatureInfos;
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

        public DescribeSignaturesResponseBody build() {
            return new DescribeSignaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSignaturesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSignaturesResponseBody</p>
     */
    public static class SignatureInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SignatureId")
        private String signatureId;

        @com.aliyun.core.annotation.NameInMap("SignatureKey")
        private String signatureKey;

        @com.aliyun.core.annotation.NameInMap("SignatureName")
        private String signatureName;

        @com.aliyun.core.annotation.NameInMap("SignatureSecret")
        private String signatureSecret;

        private SignatureInfo(Builder builder) {
            this.createdTime = builder.createdTime;
            this.modifiedTime = builder.modifiedTime;
            this.regionId = builder.regionId;
            this.signatureId = builder.signatureId;
            this.signatureKey = builder.signatureKey;
            this.signatureName = builder.signatureName;
            this.signatureSecret = builder.signatureSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignatureInfo create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return signatureId
         */
        public String getSignatureId() {
            return this.signatureId;
        }

        /**
         * @return signatureKey
         */
        public String getSignatureKey() {
            return this.signatureKey;
        }

        /**
         * @return signatureName
         */
        public String getSignatureName() {
            return this.signatureName;
        }

        /**
         * @return signatureSecret
         */
        public String getSignatureSecret() {
            return this.signatureSecret;
        }

        public static final class Builder {
            private String createdTime; 
            private String modifiedTime; 
            private String regionId; 
            private String signatureId; 
            private String signatureKey; 
            private String signatureName; 
            private String signatureSecret; 

            /**
             * <p>The creation time of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-23T08:28:48Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The last modification time of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-07-24T08:28:48Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The region where the key is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * <p>The Key value of the backend signature key.</p>
             * 
             * <strong>example:</strong>
             * <p>qwertyuiop</p>
             */
            public Builder signatureKey(String signatureKey) {
                this.signatureKey = signatureKey;
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

            /**
             * <p>The Secret value of the backend signature key.</p>
             * 
             * <strong>example:</strong>
             * <p>asdfghjkl</p>
             */
            public Builder signatureSecret(String signatureSecret) {
                this.signatureSecret = signatureSecret;
                return this;
            }

            public SignatureInfo build() {
                return new SignatureInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSignaturesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSignaturesResponseBody</p>
     */
    public static class SignatureInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SignatureInfo")
        private java.util.List<SignatureInfo> signatureInfo;

        private SignatureInfos(Builder builder) {
            this.signatureInfo = builder.signatureInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignatureInfos create() {
            return builder().build();
        }

        /**
         * @return signatureInfo
         */
        public java.util.List<SignatureInfo> getSignatureInfo() {
            return this.signatureInfo;
        }

        public static final class Builder {
            private java.util.List<SignatureInfo> signatureInfo; 

            /**
             * SignatureInfo.
             */
            public Builder signatureInfo(java.util.List<SignatureInfo> signatureInfo) {
                this.signatureInfo = signatureInfo;
                return this;
            }

            public SignatureInfos build() {
                return new SignatureInfos(this);
            } 

        } 

    }
}
