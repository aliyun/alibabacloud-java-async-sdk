// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSnapshotLinkResponseBody} extends {@link TeaModel}
 *
 * <p>GetSnapshotLinkResponseBody</p>
 */
public class GetSnapshotLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSnapshotLinkResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotLinkResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSnapshotLinkResponseBody build() {
            return new GetSnapshotLinkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSnapshotLinkResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotLinkResponseBody</p>
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
     * {@link GetSnapshotLinkResponseBody} extends {@link TeaModel}
     *
     * <p>GetSnapshotLinkResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

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

        private Data(Builder builder) {
            this.category = builder.category;
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

        public static Data create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
            private String category; 
            private java.util.List < EcsList> ecsList; 
            private String fsId; 
            private String fsName; 
            private String linkId; 
            private Integer snapshotCount; 
            private Integer sourceSize; 
            private String status; 
            private Long totalSize; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
