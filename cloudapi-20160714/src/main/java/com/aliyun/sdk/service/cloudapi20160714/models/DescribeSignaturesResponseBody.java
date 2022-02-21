// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSignaturesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSignaturesResponseBody</p>
 */
public class DescribeSignaturesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignatureInfos")
    private SignatureInfos signatureInfos;

    @NameInMap("TotalCount")
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
         * SignatureInfos.
         */
        public Builder signatureInfos(SignatureInfos signatureInfos) {
            this.signatureInfos = signatureInfos;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSignaturesResponseBody build() {
            return new DescribeSignaturesResponseBody(this);
        } 

    } 

    public static class SignatureInfo extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SignatureId")
        private String signatureId;

        @NameInMap("SignatureKey")
        private String signatureKey;

        @NameInMap("SignatureName")
        private String signatureName;

        @NameInMap("SignatureSecret")
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
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * SignatureKey.
             */
            public Builder signatureKey(String signatureKey) {
                this.signatureKey = signatureKey;
                return this;
            }

            /**
             * SignatureName.
             */
            public Builder signatureName(String signatureName) {
                this.signatureName = signatureName;
                return this;
            }

            /**
             * SignatureSecret.
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
    public static class SignatureInfos extends TeaModel {
        @NameInMap("SignatureInfo")
        private java.util.List < SignatureInfo> signatureInfo;

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
        public java.util.List < SignatureInfo> getSignatureInfo() {
            return this.signatureInfo;
        }

        public static final class Builder {
            private java.util.List < SignatureInfo> signatureInfo; 

            /**
             * SignatureInfo.
             */
            public Builder signatureInfo(java.util.List < SignatureInfo> signatureInfo) {
                this.signatureInfo = signatureInfo;
                return this;
            }

            public SignatureInfos build() {
                return new SignatureInfos(this);
            } 

        } 

    }
}
