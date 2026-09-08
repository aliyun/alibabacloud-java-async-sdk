// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeSnapshotLinksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotLinksResponseBody</p>
 */
public class DescribeSnapshotLinksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotLinks")
    private SnapshotLinks snapshotLinks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSnapshotLinksResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshotLinks = builder.snapshotLinks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotLinksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return snapshotLinks
     */
    public SnapshotLinks getSnapshotLinks() {
        return this.snapshotLinks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SnapshotLinks snapshotLinks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSnapshotLinksResponseBody model) {
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.snapshotLinks = model.snapshotLinks;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The pagination token returned in this call.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the snapshot chain list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page that you specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotLinks.
         */
        public Builder snapshotLinks(SnapshotLinks snapshotLinks) {
            this.snapshotLinks = snapshotLinks;
            return this;
        }

        /**
         * <p>The total number of snapshot chains.</p>
         * <blockquote>
         * <p>When you use the MaxResults and NextToken parameters for paged query, the returned TotalCount value is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSnapshotLinksResponseBody build() {
            return new DescribeSnapshotLinksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSnapshotLinksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotLinksResponseBody</p>
     */
    public static class SnapshotLink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstantAccess")
        private Boolean instantAccess;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SnapshotLinkId")
        private String snapshotLinkId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskId")
        private String sourceDiskId;

        @com.aliyun.core.annotation.NameInMap("SourceDiskName")
        private String sourceDiskName;

        @com.aliyun.core.annotation.NameInMap("SourceDiskSize")
        private Integer sourceDiskSize;

        @com.aliyun.core.annotation.NameInMap("SourceDiskType")
        private String sourceDiskType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private SnapshotLink(Builder builder) {
            this.category = builder.category;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instantAccess = builder.instantAccess;
            this.regionId = builder.regionId;
            this.snapshotLinkId = builder.snapshotLinkId;
            this.sourceDiskId = builder.sourceDiskId;
            this.sourceDiskName = builder.sourceDiskName;
            this.sourceDiskSize = builder.sourceDiskSize;
            this.sourceDiskType = builder.sourceDiskType;
            this.totalCount = builder.totalCount;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotLink create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instantAccess
         */
        public Boolean getInstantAccess() {
            return this.instantAccess;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return snapshotLinkId
         */
        public String getSnapshotLinkId() {
            return this.snapshotLinkId;
        }

        /**
         * @return sourceDiskId
         */
        public String getSourceDiskId() {
            return this.sourceDiskId;
        }

        /**
         * @return sourceDiskName
         */
        public String getSourceDiskName() {
            return this.sourceDiskName;
        }

        /**
         * @return sourceDiskSize
         */
        public Integer getSourceDiskSize() {
            return this.sourceDiskSize;
        }

        /**
         * @return sourceDiskType
         */
        public String getSourceDiskType() {
            return this.sourceDiskType;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String category; 
            private String instanceId; 
            private String instanceName; 
            private Boolean instantAccess; 
            private String regionId; 
            private String snapshotLinkId; 
            private String sourceDiskId; 
            private String sourceDiskName; 
            private Integer sourceDiskSize; 
            private String sourceDiskType; 
            private Integer totalCount; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(SnapshotLink model) {
                this.category = model.category;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instantAccess = model.instantAccess;
                this.regionId = model.regionId;
                this.snapshotLinkId = model.snapshotLinkId;
                this.sourceDiskId = model.sourceDiskId;
                this.sourceDiskName = model.sourceDiskName;
                this.sourceDiskSize = model.sourceDiskSize;
                this.sourceDiskType = model.sourceDiskType;
                this.totalCount = model.totalCount;
                this.totalSize = model.totalSize;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstantAccess.
             */
            public Builder instantAccess(Boolean instantAccess) {
                this.instantAccess = instantAccess;
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
             * SnapshotLinkId.
             */
            public Builder snapshotLinkId(String snapshotLinkId) {
                this.snapshotLinkId = snapshotLinkId;
                return this;
            }

            /**
             * SourceDiskId.
             */
            public Builder sourceDiskId(String sourceDiskId) {
                this.sourceDiskId = sourceDiskId;
                return this;
            }

            /**
             * SourceDiskName.
             */
            public Builder sourceDiskName(String sourceDiskName) {
                this.sourceDiskName = sourceDiskName;
                return this;
            }

            /**
             * SourceDiskSize.
             */
            public Builder sourceDiskSize(Integer sourceDiskSize) {
                this.sourceDiskSize = sourceDiskSize;
                return this;
            }

            /**
             * SourceDiskType.
             */
            public Builder sourceDiskType(String sourceDiskType) {
                this.sourceDiskType = sourceDiskType;
                return this;
            }

            /**
             * <p>The total number of snapshot chains.</p>
             * <blockquote>
             * <p>When you use the MaxResults and NextToken parameters for paged query, the returned TotalCount value is invalid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public SnapshotLink build() {
                return new SnapshotLink(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSnapshotLinksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSnapshotLinksResponseBody</p>
     */
    public static class SnapshotLinks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotLink")
        private java.util.List<SnapshotLink> snapshotLink;

        private SnapshotLinks(Builder builder) {
            this.snapshotLink = builder.snapshotLink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotLinks create() {
            return builder().build();
        }

        /**
         * @return snapshotLink
         */
        public java.util.List<SnapshotLink> getSnapshotLink() {
            return this.snapshotLink;
        }

        public static final class Builder {
            private java.util.List<SnapshotLink> snapshotLink; 

            private Builder() {
            } 

            private Builder(SnapshotLinks model) {
                this.snapshotLink = model.snapshotLink;
            } 

            /**
             * SnapshotLink.
             */
            public Builder snapshotLink(java.util.List<SnapshotLink> snapshotLink) {
                this.snapshotLink = snapshotLink;
                return this;
            }

            public SnapshotLinks build() {
                return new SnapshotLinks(this);
            } 

        } 

    }
}
