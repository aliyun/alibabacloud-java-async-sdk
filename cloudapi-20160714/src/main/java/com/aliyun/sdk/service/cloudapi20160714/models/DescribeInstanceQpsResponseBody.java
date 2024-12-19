// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeInstanceQpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceQpsResponseBody</p>
 */
public class DescribeInstanceQpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceQps")
    private InstanceQps instanceQps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceQpsResponseBody(Builder builder) {
        this.instanceQps = builder.instanceQps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceQpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceQps
     */
    public InstanceQps getInstanceQps() {
        return this.instanceQps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceQps instanceQps; 
        private String requestId; 

        /**
         * <p>The list of requests sent to the APIs in the instance.</p>
         */
        public Builder instanceQps(InstanceQps instanceQps) {
            this.instanceQps = instanceQps;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ004</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceQpsResponseBody build() {
            return new DescribeInstanceQpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceQpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceQpsResponseBody</p>
     */
    public static class MonitorItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemTime")
        private String itemTime;

        @com.aliyun.core.annotation.NameInMap("ItemValue")
        private String itemValue;

        private MonitorItem(Builder builder) {
            this.itemTime = builder.itemTime;
            this.itemValue = builder.itemValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorItem create() {
            return builder().build();
        }

        /**
         * @return itemTime
         */
        public String getItemTime() {
            return this.itemTime;
        }

        /**
         * @return itemValue
         */
        public String getItemValue() {
            return this.itemValue;
        }

        public static final class Builder {
            private String itemTime; 
            private String itemValue; 

            /**
             * <p>The monitoring time. The time follows the ISO 8601 standard. Format: YYYY-MM-DDThh:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-29T06:25:00Z</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The number of requests sent to the APIs in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder itemValue(String itemValue) {
                this.itemValue = itemValue;
                return this;
            }

            public MonitorItem build() {
                return new MonitorItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceQpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceQpsResponseBody</p>
     */
    public static class InstanceQps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<MonitorItem> monitorItem;

        private InstanceQps(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceQps create() {
            return builder().build();
        }

        /**
         * @return monitorItem
         */
        public java.util.List<MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List<MonitorItem> monitorItem; 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public InstanceQps build() {
                return new InstanceQps(this);
            } 

        } 

    }
}
