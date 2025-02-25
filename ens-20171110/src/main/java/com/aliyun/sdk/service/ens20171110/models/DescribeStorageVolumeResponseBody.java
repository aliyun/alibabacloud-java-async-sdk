// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeStorageVolumeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageVolumeResponseBody</p>
 */
public class DescribeStorageVolumeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageVolumes")
    private java.util.List<StorageVolumes> storageVolumes;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeStorageVolumeResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.storageVolumes = builder.storageVolumes;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageVolumeResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageVolumes
     */
    public java.util.List<StorageVolumes> getStorageVolumes() {
        return this.storageVolumes;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private java.util.List<StorageVolumes> storageVolumes; 
        private String totalCount; 

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of returned results.</p>
         */
        public Builder storageVolumes(java.util.List<StorageVolumes> storageVolumes) {
            this.storageVolumes = storageVolumes;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStorageVolumeResponseBody build() {
            return new DescribeStorageVolumeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStorageVolumeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStorageVolumeResponseBody</p>
     */
    public static class StorageVolumes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthProtocol")
        private String authProtocol;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("IsAuth")
        private Integer isAuth;

        @com.aliyun.core.annotation.NameInMap("IsEnable")
        private Integer isEnable;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageGatewayId")
        private String storageGatewayId;

        @com.aliyun.core.annotation.NameInMap("StorageId")
        private String storageId;

        @com.aliyun.core.annotation.NameInMap("StorageVolumeId")
        private String storageVolumeId;

        @com.aliyun.core.annotation.NameInMap("StorageVolumeName")
        private String storageVolumeName;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        private StorageVolumes(Builder builder) {
            this.authProtocol = builder.authProtocol;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.isAuth = builder.isAuth;
            this.isEnable = builder.isEnable;
            this.status = builder.status;
            this.storageGatewayId = builder.storageGatewayId;
            this.storageId = builder.storageId;
            this.storageVolumeId = builder.storageVolumeId;
            this.storageVolumeName = builder.storageVolumeName;
            this.targetName = builder.targetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageVolumes create() {
            return builder().build();
        }

        /**
         * @return authProtocol
         */
        public String getAuthProtocol() {
            return this.authProtocol;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return isAuth
         */
        public Integer getIsAuth() {
            return this.isAuth;
        }

        /**
         * @return isEnable
         */
        public Integer getIsEnable() {
            return this.isEnable;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageGatewayId
         */
        public String getStorageGatewayId() {
            return this.storageGatewayId;
        }

        /**
         * @return storageId
         */
        public String getStorageId() {
            return this.storageId;
        }

        /**
         * @return storageVolumeId
         */
        public String getStorageVolumeId() {
            return this.storageVolumeId;
        }

        /**
         * @return storageVolumeName
         */
        public String getStorageVolumeName() {
            return this.storageVolumeName;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        public static final class Builder {
            private String authProtocol; 
            private String creationTime; 
            private String description; 
            private String ensRegionId; 
            private Integer isAuth; 
            private Integer isEnable; 
            private String status; 
            private String storageGatewayId; 
            private String storageId; 
            private String storageVolumeId; 
            private String storageVolumeName; 
            private String targetName; 

            /**
             * <p>The authentication protocol. The value is set to <strong>CHAP</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>CHAP</p>
             */
            public Builder authProtocol(String authProtocol) {
                this.authProtocol = authProtocol;
                return this;
            }

            /**
             * <p>The time when the volume was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-14T09:35:32Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen-3</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>Indicates whether authentication is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Authentication is enabled.</li>
             * <li><strong>0</strong> (default): Authentication is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isAuth(Integer isAuth) {
                this.isAuth = isAuth;
                return this;
            }

            /**
             * <p>Indicates whether the volume is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong> (default): The volume is enabled.</li>
             * <li><strong>0</strong>: The volume is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isEnable(Integer isEnable) {
                this.isEnable = isEnable;
                return this;
            }

            /**
             * <p>The status of the volume. Valid values:</p>
             * <ul>
             * <li>creating</li>
             * <li>available</li>
             * <li>deleting</li>
             * <li>deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the storage gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>sgw-***</p>
             */
            public Builder storageGatewayId(String storageGatewayId) {
                this.storageGatewayId = storageGatewayId;
                return this;
            }

            /**
             * <p>The ID of the storage medium.</p>
             * 
             * <strong>example:</strong>
             * <p>d-***</p>
             */
            public Builder storageId(String storageId) {
                this.storageId = storageId;
                return this;
            }

            /**
             * <p>The ID of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>sv-***</p>
             */
            public Builder storageVolumeId(String storageVolumeId) {
                this.storageVolumeId = storageVolumeId;
                return this;
            }

            /**
             * <p>The name of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>testVolumeName</p>
             */
            public Builder storageVolumeName(String storageVolumeName) {
                this.storageVolumeName = storageVolumeName;
                return this;
            }

            /**
             * <p>The destination of the volume.</p>
             * 
             * <strong>example:</strong>
             * <p>iqn.<em>.</em>.<em>:</em></p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            public StorageVolumes build() {
                return new StorageVolumes(this);
            } 

        } 

    }
}
