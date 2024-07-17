// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnarchiveDetail} extends {@link TeaModel}
 *
 * <p>UnarchiveDetail</p>
 */
public class UnarchiveDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiCallTimes")
    private Long apiCallTimes;

    @com.aliyun.core.annotation.NameInMap("Cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("UnarchiveTaskStatus")
    private String unarchiveTaskStatus;

    private UnarchiveDetail(Builder builder) {
        this.apiCallTimes = builder.apiCallTimes;
        this.cost = builder.cost;
        this.storageSize = builder.storageSize;
        this.storageType = builder.storageType;
        this.unarchiveTaskStatus = builder.unarchiveTaskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnarchiveDetail create() {
        return builder().build();
    }

    /**
     * @return apiCallTimes
     */
    public Long getApiCallTimes() {
        return this.apiCallTimes;
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return unarchiveTaskStatus
     */
    public String getUnarchiveTaskStatus() {
        return this.unarchiveTaskStatus;
    }

    public static final class Builder {
        private Long apiCallTimes; 
        private Long cost; 
        private Long storageSize; 
        private String storageType; 
        private String unarchiveTaskStatus; 

        /**
         * ApiCallTimes.
         */
        public Builder apiCallTimes(Long apiCallTimes) {
            this.apiCallTimes = apiCallTimes;
            return this;
        }

        /**
         * Cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * StorageSize.
         */
        public Builder storageSize(Long storageSize) {
            this.storageSize = storageSize;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * UnarchiveTaskStatus.
         */
        public Builder unarchiveTaskStatus(String unarchiveTaskStatus) {
            this.unarchiveTaskStatus = unarchiveTaskStatus;
            return this;
        }

        public UnarchiveDetail build() {
            return new UnarchiveDetail(this);
        } 

    } 

}
