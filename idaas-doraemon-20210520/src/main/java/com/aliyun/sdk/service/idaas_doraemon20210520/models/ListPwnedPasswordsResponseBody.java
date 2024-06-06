// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPwnedPasswordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPwnedPasswordsResponseBody</p>
 */
public class ListPwnedPasswordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("PwnedPasswordInfos")
    private java.util.List < PwnedPasswordInfos> pwnedPasswordInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListPwnedPasswordsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pwnedPasswordInfos = builder.pwnedPasswordInfos;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPwnedPasswordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pwnedPasswordInfos
     */
    public java.util.List < PwnedPasswordInfos> getPwnedPasswordInfos() {
        return this.pwnedPasswordInfos;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List < PwnedPasswordInfos> pwnedPasswordInfos; 
        private String requestId; 
        private Long totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PwnedPasswordInfos.
         */
        public Builder pwnedPasswordInfos(java.util.List < PwnedPasswordInfos> pwnedPasswordInfos) {
            this.pwnedPasswordInfos = pwnedPasswordInfos;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPwnedPasswordsResponseBody build() {
            return new ListPwnedPasswordsResponseBody(this);
        } 

    } 

    public static class PwnedPasswordInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HexPasswordSha1Hash")
        private String hexPasswordSha1Hash;

        @com.aliyun.core.annotation.NameInMap("PwnedCount")
        private Long pwnedCount;

        private PwnedPasswordInfos(Builder builder) {
            this.hexPasswordSha1Hash = builder.hexPasswordSha1Hash;
            this.pwnedCount = builder.pwnedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PwnedPasswordInfos create() {
            return builder().build();
        }

        /**
         * @return hexPasswordSha1Hash
         */
        public String getHexPasswordSha1Hash() {
            return this.hexPasswordSha1Hash;
        }

        /**
         * @return pwnedCount
         */
        public Long getPwnedCount() {
            return this.pwnedCount;
        }

        public static final class Builder {
            private String hexPasswordSha1Hash; 
            private Long pwnedCount; 

            /**
             * HexPasswordSha1Hash.
             */
            public Builder hexPasswordSha1Hash(String hexPasswordSha1Hash) {
                this.hexPasswordSha1Hash = hexPasswordSha1Hash;
                return this;
            }

            /**
             * PwnedCount.
             */
            public Builder pwnedCount(Long pwnedCount) {
                this.pwnedCount = pwnedCount;
                return this;
            }

            public PwnedPasswordInfos build() {
                return new PwnedPasswordInfos(this);
            } 

        } 

    }
}
