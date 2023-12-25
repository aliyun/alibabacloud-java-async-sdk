// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOSSStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOSSStorageResponseBody</p>
 */
public class DescribeOSSStorageResponseBody extends TeaModel {
    @NameInMap("ColdStorage")
    private Boolean coldStorage;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private String state;

    @NameInMap("StorageUsage")
    private String storageUsage;

    private DescribeOSSStorageResponseBody(Builder builder) {
        this.coldStorage = builder.coldStorage;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.storageUsage = builder.storageUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOSSStorageResponseBody create() {
        return builder().build();
    }

    /**
     * @return coldStorage
     */
    public Boolean getColdStorage() {
        return this.coldStorage;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return storageUsage
     */
    public String getStorageUsage() {
        return this.storageUsage;
    }

    public static final class Builder {
        private Boolean coldStorage; 
        private String policy; 
        private String requestId; 
        private String state; 
        private String storageUsage; 

        /**
         * Indicates whether tiered storage of hot data and cold data is supported. Valid values:
         * <p>
         * 
         * *   **true**: Tiered storage of hot data and cold data is supported.
         * *   **false**: Tiered storage of hot data and cold data is not supported.
         */
        public Builder coldStorage(Boolean coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * The parameters for tiered storage of hot data and cold data.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The state of tiered storage of hot data and cold data. Valid values:
         * <p>
         * 
         * *   **CREATING**: Tiered storage of hot data and cold data is being enabled.
         * *   **DISABLE**: Tiered storage of hot data and cold data is not enabled.
         * *   **ENABLE**: Tiered storage of hot data and cold data is enabled.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The space used for tiered storage of hot data and cold data. Unit: GB.
         */
        public Builder storageUsage(String storageUsage) {
            this.storageUsage = storageUsage;
            return this;
        }

        public DescribeOSSStorageResponseBody build() {
            return new DescribeOSSStorageResponseBody(this);
        } 

    } 

}
