// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetStorageListResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageListResponseBody</p>
 */
public class GetStorageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageInfoList")
    private java.util.List<StorageInfoList> storageInfoList;

    private GetStorageListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.storageInfoList = builder.storageInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageInfoList
     */
    public java.util.List<StorageInfoList> getStorageInfoList() {
        return this.storageInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StorageInfoList> storageInfoList; 

        private Builder() {
        } 

        private Builder(GetStorageListResponseBody model) {
            this.requestId = model.requestId;
            this.storageInfoList = model.storageInfoList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>73-8B78-5D86-A50C-49B96C</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The storage configurations.</p>
         */
        public Builder storageInfoList(java.util.List<StorageInfoList> storageInfoList) {
            this.storageInfoList = storageInfoList;
            return this;
        }

        public GetStorageListResponseBody build() {
            return new GetStorageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageListResponseBody</p>
     */
    public static class StorageInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DefaultStorage")
        private Boolean defaultStorage;

        @com.aliyun.core.annotation.NameInMap("EditingTempFileStorage")
        private Boolean editingTempFileStorage;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private StorageInfoList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.defaultStorage = builder.defaultStorage;
            this.editingTempFileStorage = builder.editingTempFileStorage;
            this.modifiedTime = builder.modifiedTime;
            this.path = builder.path;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return defaultStorage
         */
        public Boolean getDefaultStorage() {
            return this.defaultStorage;
        }

        /**
         * @return editingTempFileStorage
         */
        public Boolean getEditingTempFileStorage() {
            return this.editingTempFileStorage;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageLocation
         */
        public String getStorageLocation() {
            return this.storageLocation;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private Boolean defaultStorage; 
            private Boolean editingTempFileStorage; 
            private String modifiedTime; 
            private String path; 
            private String status; 
            private String storageLocation; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(StorageInfoList model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.defaultStorage = model.defaultStorage;
                this.editingTempFileStorage = model.editingTempFileStorage;
                this.modifiedTime = model.modifiedTime;
                this.path = model.path;
                this.status = model.status;
                this.storageLocation = model.storageLocation;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-06T01:55:07Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether it is the default storage location.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultStorage(Boolean defaultStorage) {
                this.defaultStorage = defaultStorage;
                return this;
            }

            /**
             * <p>Indicates whether temporary files created during editing processes are stored in this location.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder editingTempFileStorage(Boolean editingTempFileStorage) {
                this.editingTempFileStorage = editingTempFileStorage;
                return this;
            }

            /**
             * <p>The time when the configuration was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-06T03:07:07Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>your-path/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The OSS storage status.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>your-bucket</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>vod_oss_bucket</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public StorageInfoList build() {
                return new StorageInfoList(this);
            } 

        } 

    }
}
