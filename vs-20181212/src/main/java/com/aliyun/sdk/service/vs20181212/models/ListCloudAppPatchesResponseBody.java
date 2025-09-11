// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link ListCloudAppPatchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAppPatchesResponseBody</p>
 */
public class ListCloudAppPatchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("Patches")
    private java.util.List<Patches> patches;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCloudAppPatchesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.patches = builder.patches;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAppPatchesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return patches
     */
    public java.util.List<Patches> getPatches() {
        return this.patches;
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
        private java.util.List<Patches> patches; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCloudAppPatchesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.patches = model.patches;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

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
         * Patches.
         */
        public Builder patches(java.util.List<Patches> patches) {
            this.patches = patches;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
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

        public ListCloudAppPatchesResponseBody build() {
            return new ListCloudAppPatchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCloudAppPatchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCloudAppPatchesResponseBody</p>
     */
    public static class Patches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PatchId")
        private String patchId;

        @com.aliyun.core.annotation.NameInMap("PatchName")
        private String patchName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        private Patches(Builder builder) {
            this.patchId = builder.patchId;
            this.patchName = builder.patchName;
            this.status = builder.status;
            this.statusDescription = builder.statusDescription;
            this.updateTime = builder.updateTime;
            this.uploadTime = builder.uploadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Patches create() {
            return builder().build();
        }

        /**
         * @return patchId
         */
        public String getPatchId() {
            return this.patchId;
        }

        /**
         * @return patchName
         */
        public String getPatchName() {
            return this.patchName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        public static final class Builder {
            private String patchId; 
            private String patchName; 
            private String status; 
            private String statusDescription; 
            private String updateTime; 
            private String uploadTime; 

            private Builder() {
            } 

            private Builder(Patches model) {
                this.patchId = model.patchId;
                this.patchName = model.patchName;
                this.status = model.status;
                this.statusDescription = model.statusDescription;
                this.updateTime = model.updateTime;
                this.uploadTime = model.uploadTime;
            } 

            /**
             * PatchId.
             */
            public Builder patchId(String patchId) {
                this.patchId = patchId;
                return this;
            }

            /**
             * PatchName.
             */
            public Builder patchName(String patchName) {
                this.patchName = patchName;
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
             * StatusDescription.
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            public Patches build() {
                return new Patches(this);
            } 

        } 

    }
}
