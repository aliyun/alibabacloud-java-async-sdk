// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKMSKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKMSKeysResponseBody</p>
 */
public class DescribeKMSKeysResponseBody extends TeaModel {
    @NameInMap("KMSKeyIds")
    private KMSKeyIds KMSKeyIds;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeKMSKeysResponseBody(Builder builder) {
        this.KMSKeyIds = builder.KMSKeyIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKMSKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return KMSKeyIds
     */
    public KMSKeyIds getKMSKeyIds() {
        return this.KMSKeyIds;
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
        private KMSKeyIds KMSKeyIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * KMSKeyIds.
         */
        public Builder KMSKeyIds(KMSKeyIds KMSKeyIds) {
            this.KMSKeyIds = KMSKeyIds;
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

        public DescribeKMSKeysResponseBody build() {
            return new DescribeKMSKeysResponseBody(this);
        } 

    } 

    public static class KMSKeyIds extends TeaModel {
        @NameInMap("kmsKeyId")
        private java.util.List < String > kmsKeyId;

        private KMSKeyIds(Builder builder) {
            this.kmsKeyId = builder.kmsKeyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KMSKeyIds create() {
            return builder().build();
        }

        /**
         * @return kmsKeyId
         */
        public java.util.List < String > getKmsKeyId() {
            return this.kmsKeyId;
        }

        public static final class Builder {
            private java.util.List < String > kmsKeyId; 

            /**
             * kmsKeyId.
             */
            public Builder kmsKeyId(java.util.List < String > kmsKeyId) {
                this.kmsKeyId = kmsKeyId;
                return this;
            }

            public KMSKeyIds build() {
                return new KMSKeyIds(this);
            } 

        } 

    }
}
