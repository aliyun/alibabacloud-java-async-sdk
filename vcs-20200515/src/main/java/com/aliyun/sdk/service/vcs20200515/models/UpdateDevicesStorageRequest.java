// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevicesStorageRequest} extends {@link RequestModel}
 *
 * <p>UpdateDevicesStorageRequest</p>
 */
public class UpdateDevicesStorageRequest extends Request {
    @Body
    @NameInMap("UpdateStorageRequests")
    @Validation(required = true)
    private java.util.List < UpdateStorageRequests> updateStorageRequests;

    private UpdateDevicesStorageRequest(Builder builder) {
        super(builder);
        this.updateStorageRequests = builder.updateStorageRequests;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDevicesStorageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return updateStorageRequests
     */
    public java.util.List < UpdateStorageRequests> getUpdateStorageRequests() {
        return this.updateStorageRequests;
    }

    public static final class Builder extends Request.Builder<UpdateDevicesStorageRequest, Builder> {
        private java.util.List < UpdateStorageRequests> updateStorageRequests; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDevicesStorageRequest response) {
            super(response);
            this.updateStorageRequests = response.updateStorageRequests;
        } 

        /**
         * UpdateStorageRequests.
         */
        public Builder updateStorageRequests(java.util.List < UpdateStorageRequests> updateStorageRequests) {
            this.putBodyParameter("UpdateStorageRequests", updateStorageRequests);
            this.updateStorageRequests = updateStorageRequests;
            return this;
        }

        @Override
        public UpdateDevicesStorageRequest build() {
            return new UpdateDevicesStorageRequest(this);
        } 

    } 

    public static class StorageDays extends TeaModel {
        @NameInMap("StorageDays")
        @Validation(required = true)
        private Long storageDays;

        @NameInMap("StorageType")
        @Validation(required = true)
        private String storageType;

        private StorageDays(Builder builder) {
            this.storageDays = builder.storageDays;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageDays create() {
            return builder().build();
        }

        /**
         * @return storageDays
         */
        public Long getStorageDays() {
            return this.storageDays;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private Long storageDays; 
            private String storageType; 

            /**
             * StorageDays.
             */
            public Builder storageDays(Long storageDays) {
                this.storageDays = storageDays;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public StorageDays build() {
                return new StorageDays(this);
            } 

        } 

    }
    public static class UpdateStorageRequests extends TeaModel {
        @NameInMap("DeviceIds")
        @Validation(required = true)
        private String deviceIds;

        @NameInMap("StorageDays")
        @Validation(required = true)
        private java.util.List < StorageDays> storageDays;

        private UpdateStorageRequests(Builder builder) {
            this.deviceIds = builder.deviceIds;
            this.storageDays = builder.storageDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateStorageRequests create() {
            return builder().build();
        }

        /**
         * @return deviceIds
         */
        public String getDeviceIds() {
            return this.deviceIds;
        }

        /**
         * @return storageDays
         */
        public java.util.List < StorageDays> getStorageDays() {
            return this.storageDays;
        }

        public static final class Builder {
            private String deviceIds; 
            private java.util.List < StorageDays> storageDays; 

            /**
             * DeviceIds.
             */
            public Builder deviceIds(String deviceIds) {
                this.deviceIds = deviceIds;
                return this;
            }

            /**
             * StorageDays.
             */
            public Builder storageDays(java.util.List < StorageDays> storageDays) {
                this.storageDays = storageDays;
                return this;
            }

            public UpdateStorageRequests build() {
                return new UpdateStorageRequests(this);
            } 

        } 

    }
}
