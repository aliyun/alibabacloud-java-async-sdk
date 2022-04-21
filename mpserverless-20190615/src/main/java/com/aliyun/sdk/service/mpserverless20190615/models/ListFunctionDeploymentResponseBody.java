// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionDeploymentResponseBody</p>
 */
public class ListFunctionDeploymentResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("Paginator")
    private Paginator paginator;

    @NameInMap("RequestId")
    private String requestId;

    private ListFunctionDeploymentResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.paginator = builder.paginator;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionDeploymentResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return paginator
     */
    public Paginator getPaginator() {
        return this.paginator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private Paginator paginator; 
        private String requestId; 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * Paginator.
         */
        public Builder paginator(Paginator paginator) {
            this.paginator = paginator;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionDeploymentResponseBody build() {
            return new ListFunctionDeploymentResponseBody(this);
        } 

    } 

    public static class Status extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Status")
        private String status;

        private Status(Builder builder) {
            this.label = builder.label;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String label; 
            private String status; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("CreatedAt")
        private String createdAt;

        @NameInMap("DeploymentId")
        private String deploymentId;

        @NameInMap("DownloadSignedUrl")
        private String downloadSignedUrl;

        @NameInMap("ModifiedAt")
        private String modifiedAt;

        @NameInMap("Status")
        private Status status;

        @NameInMap("VersionNo")
        private String versionNo;

        private DataList(Builder builder) {
            this.createdAt = builder.createdAt;
            this.deploymentId = builder.deploymentId;
            this.downloadSignedUrl = builder.downloadSignedUrl;
            this.modifiedAt = builder.modifiedAt;
            this.status = builder.status;
            this.versionNo = builder.versionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return deploymentId
         */
        public String getDeploymentId() {
            return this.deploymentId;
        }

        /**
         * @return downloadSignedUrl
         */
        public String getDownloadSignedUrl() {
            return this.downloadSignedUrl;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return versionNo
         */
        public String getVersionNo() {
            return this.versionNo;
        }

        public static final class Builder {
            private String createdAt; 
            private String deploymentId; 
            private String downloadSignedUrl; 
            private String modifiedAt; 
            private Status status; 
            private String versionNo; 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * DeploymentId.
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * DownloadSignedUrl.
             */
            public Builder downloadSignedUrl(String downloadSignedUrl) {
                this.downloadSignedUrl = downloadSignedUrl;
                return this;
            }

            /**
             * ModifiedAt.
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * VersionNo.
             */
            public Builder versionNo(String versionNo) {
                this.versionNo = versionNo;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Paginator extends TeaModel {
        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Paginator(Builder builder) {
            this.pageCount = builder.pageCount;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paginator create() {
            return builder().build();
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageCount; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Paginator build() {
                return new Paginator(this);
            } 

        } 

    }
}
