// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshDBClusterStorageUsageResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshDBClusterStorageUsageResponseBody</p>
 */
public class RefreshDBClusterStorageUsageResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsedStorage")
    private String usedStorage;

    @NameInMap("UsedStorageModified")
    private String usedStorageModified;

    private RefreshDBClusterStorageUsageResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.usedStorage = builder.usedStorage;
        this.usedStorageModified = builder.usedStorageModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshDBClusterStorageUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usedStorage
     */
    public String getUsedStorage() {
        return this.usedStorage;
    }

    /**
     * @return usedStorageModified
     */
    public String getUsedStorageModified() {
        return this.usedStorageModified;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String requestId; 
        private String usedStorage; 
        private String usedStorageModified; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsedStorage.
         */
        public Builder usedStorage(String usedStorage) {
            this.usedStorage = usedStorage;
            return this;
        }

        /**
         * UsedStorageModified.
         */
        public Builder usedStorageModified(String usedStorageModified) {
            this.usedStorageModified = usedStorageModified;
            return this;
        }

        public RefreshDBClusterStorageUsageResponseBody build() {
            return new RefreshDBClusterStorageUsageResponseBody(this);
        } 

    } 

}
