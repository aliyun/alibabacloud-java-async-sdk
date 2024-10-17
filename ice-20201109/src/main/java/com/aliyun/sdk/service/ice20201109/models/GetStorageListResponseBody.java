// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    private java.util.List < StorageInfoList> storageInfoList;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storageInfoList
     */
    public java.util.List < StorageInfoList> getStorageInfoList() {
        return this.storageInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StorageInfoList> storageInfoList; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>73-8B78-5D86-A50C-49B96C</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StorageInfoList.
         */
        public Builder storageInfoList(java.util.List < StorageInfoList> storageInfoList) {
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

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DefaultStorage.
             */
            public Builder defaultStorage(Boolean defaultStorage) {
                this.defaultStorage = defaultStorage;
                return this;
            }

            /**
             * EditingTempFileStorage.
             */
            public Builder editingTempFileStorage(Boolean editingTempFileStorage) {
                this.editingTempFileStorage = editingTempFileStorage;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
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
             * StorageLocation.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * StorageType.
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
