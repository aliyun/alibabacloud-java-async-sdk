// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOSSStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOSSStorageResponseBody</p>
 */
public class DescribeOSSStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColdStorage")
    private Boolean coldStorage;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("StorageUsage")
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
         * <p>Indicates whether tiered storage of hot data and cold data is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Tiered storage of hot data and cold data is supported.</li>
         * <li><strong>false</strong>: Tiered storage of hot data and cold data is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder coldStorage(Boolean coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * <p>The parameters for tiered storage of hot data and cold data.</p>
         * 
         * <strong>example:</strong>
         * <p>[{ &quot;currentValue&quot;:&quot;0.1&quot;, &quot;defaultValue&quot;:&quot;0.1&quot;, &quot;desc&quot;:&quot;Ratio of free disk space. When the ratio exceeds the value of configuration parameter, ClickHouse start to move data to the cold storage&quot;, &quot;name&quot;:&quot;move_factor&quot;, &quot;restart&quot;:true, &quot;valueRange&quot;:&quot;(0, 1]&quot; },{ &quot;currentValue&quot;:&quot;true&quot;, &quot;defaultValue&quot;:&quot;true&quot;, &quot;desc&quot;:&quot;Disables merging of data parts on cold storage&quot;, &quot;name&quot;:&quot;prefer_not_to_merge&quot;, &quot;restart&quot;:true, &quot;valueRange&quot;:&quot;true|false&quot; }]</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aadbb456-ebf7-4ed8-9671-fad9f3846ca4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of tiered storage of hot data and cold data. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: Tiered storage of hot data and cold data is being enabled.</li>
         * <li><strong>DISABLE</strong>: Tiered storage of hot data and cold data is not enabled.</li>
         * <li><strong>ENABLE</strong>: Tiered storage of hot data and cold data is enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The space used for tiered storage of hot data and cold data. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00</p>
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
