// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeDBInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceConfigResponseBody</p>
 */
public class DescribeDBInstanceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceConfigResponseBody build() {
            return new DescribeDBInstanceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigName")
        private String configName;

        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        private Data(Builder builder) {
            this.configName = builder.configName;
            this.configValue = builder.configValue;
            this.dbInstanceName = builder.dbInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configName
         */
        public String getConfigName() {
            return this.configName;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public static final class Builder {
            private String configName; 
            private String configValue; 
            private String dbInstanceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.configName = model.configName;
                this.configValue = model.configValue;
                this.dbInstanceName = model.dbInstanceName;
            } 

            /**
             * <p>The configuration key.</p>
             * 
             * <strong>example:</strong>
             * <p>htap</p>
             */
            public Builder configName(String configName) {
                this.configName = configName;
                return this;
            }

            /**
             * <p>The configuration item. Description:</p>
             * <ul>
             * <li>attendHtapList: the list of instances with HTAP enabled.</li>
             * <li>autoAttendHtap: specifies whether to automatically add newly created read-only instances to the HTAP list.</li>
             * <li>delayExecutionStrategy: when the read-only instance lag reaches the value specified by storageDelayThreshold, read-only traffic is switched back to the primary instance. Default value: 1. Valid values: 0 and 1.</li>
             * <li>enableConsistentReplicaRead: specifies whether to enable consistent reads.</li>
             * <li>storageDelayThreshold: the latency threshold for read-only instances. Default value: 3s. Valid values: 0 to 3600*24.</li>
             * <li>enableHtap: specifies whether to enable HTAP.</li>
             * <li>masterReadWeight: the read weight of the primary node. A value of 100 indicates that 100% of traffic is routed to the primary node. Valid values: 0 to 100.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;attendHtapList\&quot;:[\&quot;pxc-hzruyzes08****\&quot;],\&quot;autoAttendHtap\&quot;:\&quot;true\&quot;,\&quot;delayExecutionStrategy\&quot;:1,\&quot;enableConsistentReplicaRead\&quot;:true,\&quot;enableHtap\&quot;:\&quot;true\&quot;,\&quot;masterReadWeight\&quot;:100,\&quot;storageDelayThreshold\&quot;:3}</p>
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-sprcym7g7w****</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
