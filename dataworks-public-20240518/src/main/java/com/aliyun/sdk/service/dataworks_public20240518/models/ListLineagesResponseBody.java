// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListLineagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLineagesResponseBody</p>
 */
public class ListLineagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListLineagesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLineagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListLineagesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListLineagesResponseBody build() {
            return new ListLineagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLineagesResponseBody</p>
     */
    public static class Lineages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstEntity")
        private LineageEntity dstEntity;

        @com.aliyun.core.annotation.NameInMap("Relationships")
        private java.util.List<LineageRelationship> relationships;

        @com.aliyun.core.annotation.NameInMap("SrcEntity")
        private LineageEntity srcEntity;

        private Lineages(Builder builder) {
            this.dstEntity = builder.dstEntity;
            this.relationships = builder.relationships;
            this.srcEntity = builder.srcEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lineages create() {
            return builder().build();
        }

        /**
         * @return dstEntity
         */
        public LineageEntity getDstEntity() {
            return this.dstEntity;
        }

        /**
         * @return relationships
         */
        public java.util.List<LineageRelationship> getRelationships() {
            return this.relationships;
        }

        /**
         * @return srcEntity
         */
        public LineageEntity getSrcEntity() {
            return this.srcEntity;
        }

        public static final class Builder {
            private LineageEntity dstEntity; 
            private java.util.List<LineageRelationship> relationships; 
            private LineageEntity srcEntity; 

            private Builder() {
            } 

            private Builder(Lineages model) {
                this.dstEntity = model.dstEntity;
                this.relationships = model.relationships;
                this.srcEntity = model.srcEntity;
            } 

            /**
             * DstEntity.
             */
            public Builder dstEntity(LineageEntity dstEntity) {
                this.dstEntity = dstEntity;
                return this;
            }

            /**
             * Relationships.
             */
            public Builder relationships(java.util.List<LineageRelationship> relationships) {
                this.relationships = relationships;
                return this;
            }

            /**
             * SrcEntity.
             */
            public Builder srcEntity(LineageEntity srcEntity) {
                this.srcEntity = srcEntity;
                return this;
            }

            public Lineages build() {
                return new Lineages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLineagesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lineages")
        private java.util.List<Lineages> lineages;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PagingInfo(Builder builder) {
            this.lineages = builder.lineages;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return lineages
         */
        public java.util.List<Lineages> getLineages() {
            return this.lineages;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Lineages> lineages; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.lineages = model.lineages;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * Lineages.
             */
            public Builder lineages(java.util.List<Lineages> lineages) {
                this.lineages = lineages;
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
