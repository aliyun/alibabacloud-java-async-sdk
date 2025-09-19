// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAttestorsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttestorsResponseBody</p>
 */
public class DescribeAttestorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attestors")
    private java.util.List<Attestors> attestors;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attestors
     */
    public java.util.List<Attestors> getAttestors() {
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
        private java.util.List<Attestors> attestors; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAttestorsResponseBody model) {
            this.attestors = model.attestors;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The witnesses.</p>
         */
        public Builder attestors(java.util.List<Attestors> attestors) {
            this.attestors = attestors;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAttestorsResponseBody build() {
            return new DescribeAttestorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAttestorsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAttestorsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Attestors model) {
                this.keyId = model.keyId;
                this.keyRegionId = model.keyRegionId;
                this.keyVersionId = model.keyVersionId;
                this.name = model.name;
                this.remark = model.remark;
            } 

            /**
             * <p>The ID of the KMS key.</p>
             * 
             * <strong>example:</strong>
             * <p>2e81355b-f8e7-4090-8082-a8f8124a****</p>
             */
            public Builder keyId(String keyId) {
                this.keyId = keyId;
                return this;
            }

            /**
             * <p>The region ID of the KMS key.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder keyRegionId(String keyRegionId) {
                this.keyRegionId = keyRegionId;
                return this;
            }

            /**
             * <p>The version ID of the Key Management Service (KMS) key.</p>
             * 
             * <strong>example:</strong>
             * <p>8d7c9c91-57ce-4cf4-a959-1e700e13****</p>
             */
            public Builder keyVersionId(String keyVersionId) {
                this.keyVersionId = keyVersionId;
                return this;
            }

            /**
             * <p>The name of the witness.</p>
             * 
             * <strong>example:</strong>
             * <p>attestor-123</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>attestor</p>
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
    /**
     * 
     * {@link DescribeAttestorsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAttestorsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
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
