// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttestorsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttestorsResponseBody</p>
 */
public class DescribeAttestorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attestors")
    private java.util.List < Attestors> attestors;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAttestorsResponseBody(Builder builder) {
        this.attestors = builder.attestors;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttestorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return attestors
     */
    public java.util.List < Attestors> getAttestors() {
        return this.attestors;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Attestors> attestors; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The witnesses.
         */
        public Builder attestors(java.util.List < Attestors> attestors) {
            this.attestors = attestors;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAttestorsResponseBody build() {
            return new DescribeAttestorsResponseBody(this);
        } 

    } 

    public static class Attestors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyId")
        private String keyId;

        @com.aliyun.core.annotation.NameInMap("KeyRegionId")
        private String keyRegionId;

        @com.aliyun.core.annotation.NameInMap("KeyVersionId")
        private String keyVersionId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Attestors(Builder builder) {
            this.keyId = builder.keyId;
            this.keyRegionId = builder.keyRegionId;
            this.keyVersionId = builder.keyVersionId;
            this.name = builder.name;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attestors create() {
            return builder().build();
        }

        /**
         * @return keyId
         */
        public String getKeyId() {
            return this.keyId;
        }

        /**
         * @return keyRegionId
         */
        public String getKeyRegionId() {
            return this.keyRegionId;
        }

        /**
         * @return keyVersionId
         */
        public String getKeyVersionId() {
            return this.keyVersionId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String keyId; 
            private String keyRegionId; 
            private String keyVersionId; 
            private String name; 
            private String remark; 

            /**
             * The ID of the KMS key.
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * The region ID of the KMS key.
             */
            public Builder keyRegionId(String keyRegionId) {
                this.keyRegionId = keyRegionId;
                return this;
            }

            /**
             * The version ID of the Key Management Service (KMS) key.
             */
            public Builder keyVersionId(String keyVersionId) {
                this.keyVersionId = keyVersionId;
                return this;
            }

            /**
             * The name of the witness.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The description.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Attestors build() {
                return new Attestors(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
