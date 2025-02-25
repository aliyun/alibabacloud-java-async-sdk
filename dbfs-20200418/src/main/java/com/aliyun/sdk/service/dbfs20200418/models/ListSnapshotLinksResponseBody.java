// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSnapshotLinksResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotLinksResponseBody</p>
 */
public class ListSnapshotLinksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotLinks")
    private java.util.List < SnapshotLinks> snapshotLinks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSnapshotLinksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.snapshotLinks = builder.snapshotLinks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotLinksResponseBody create() {
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
     * @return snapshotLinks
     */
    public java.util.List < SnapshotLinks> getSnapshotLinks() {
        return this.snapshotLinks;
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
        private java.util.List < SnapshotLinks> snapshotLinks; 
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
         * SnapshotLinks.
         */
        public Builder snapshotLinks(java.util.List < SnapshotLinks> snapshotLinks) {
            this.snapshotLinks = snapshotLinks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSnapshotLinksResponseBody build() {
            return new ListSnapshotLinksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSnapshotLinksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotLinksResponseBody</p>
     */
    public static class EcsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsId")
        private String ecsId;

        private EcsList(Builder builder) {
            this.ecsId = builder.ecsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsList create() {
            return builder().build();
        }

        /**
         * @return ecsId
         */
        public String getEcsId() {
            return this.ecsId;
        }

        public static final class Builder {
            private String ecsId; 

            /**
             * EcsId.
             */
            public Builder ecsId(String ecsId) {
                this.ecsId = ecsId;
                return this;
            }

            public EcsList build() {
                return new EcsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSnapshotLinksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotLinksResponseBody</p>
     */
    public static class SnapshotLinks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsList")
        private java.util.List < EcsList> ecsList;

        @com.aliyun.core.annotation.NameInMap("FsId")
        private String fsId;

        @com.aliyun.core.annotation.NameInMap("FsName")
        private String fsName;

        @com.aliyun.core.annotation.NameInMap("LinkId")
        private String linkId;

        @com.aliyun.core.annotation.NameInMap("SnapshotCount")
        private Integer snapshotCount;

        @com.aliyun.core.annotation.NameInMap("SourceSize")
        private Integer sourceSize;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private SnapshotLinks(Builder builder) {
            this.ecsList = builder.ecsList;
            this.fsId = builder.fsId;
            this.fsName = builder.fsName;
            this.linkId = builder.linkId;
            this.snapshotCount = builder.snapshotCount;
            this.sourceSize = builder.sourceSize;
            this.status = builder.status;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotLinks create() {
            return builder().build();
        }

        /**
         * @return ecsList
         */
        public java.util.List < EcsList> getEcsList() {
            return this.ecsList;
        }

        /**
         * @return fsId
         */
        public String getFsId() {
            return this.fsId;
        }

        /**
         * @return fsName
         */
        public String getFsName() {
            return this.fsName;
        }

        /**
         * @return linkId
         */
        public String getLinkId() {
            return this.linkId;
        }

        /**
         * @return snapshotCount
         */
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        /**
         * @return sourceSize
         */
        public Integer getSourceSize() {
            return this.sourceSize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List < EcsList> ecsList; 
            private String fsId; 
            private String fsName; 
            private String linkId; 
            private Integer snapshotCount; 
            private Integer sourceSize; 
            private String status; 
            private Long totalSize; 

            /**
             * EcsList.
             */
            public Builder ecsList(java.util.List < EcsList> ecsList) {
                this.ecsList = ecsList;
                return this;
            }

            /**
             * FsId.
             */
            public Builder fsId(String fsId) {
                this.fsId = fsId;
                return this;
            }

            /**
             * FsName.
             */
            public Builder fsName(String fsName) {
                this.fsName = fsName;
                return this;
            }

            /**
             * LinkId.
             */
            public Builder linkId(String linkId) {
                this.linkId = linkId;
                return this;
            }

            /**
             * SnapshotCount.
             */
            public Builder snapshotCount(Integer snapshotCount) {
                this.snapshotCount = snapshotCount;
                return this;
            }

            /**
             * SourceSize.
             */
            public Builder sourceSize(Integer sourceSize) {
                this.sourceSize = sourceSize;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public SnapshotLinks build() {
                return new SnapshotLinks(this);
            } 

        } 

    }
}
