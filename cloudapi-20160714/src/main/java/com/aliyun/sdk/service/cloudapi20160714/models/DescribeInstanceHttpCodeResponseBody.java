// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceHttpCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceHttpCodeResponseBody</p>
 */
public class DescribeInstanceHttpCodeResponseBody extends TeaModel {
    @NameInMap("InstanceHttpCode")
    private InstanceHttpCode instanceHttpCode;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceHttpCodeResponseBody(Builder builder) {
        this.instanceHttpCode = builder.instanceHttpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceHttpCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceHttpCode
     */
    public InstanceHttpCode getInstanceHttpCode() {
        return this.instanceHttpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceHttpCode instanceHttpCode; 
        private String requestId; 

        /**
         * The HTTP status codes.
         */
        public Builder instanceHttpCode(InstanceHttpCode instanceHttpCode) {
            this.instanceHttpCode = instanceHttpCode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceHttpCodeResponseBody build() {
            return new DescribeInstanceHttpCodeResponseBody(this);
        } 

    } 

    public static class MonitorItem extends TeaModel {
        @NameInMap("ItemTime")
        private String itemTime;

        @NameInMap("ItemValue")
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
             * The HTTP status code returned.
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * The corresponding value.
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
    public static class InstanceHttpCode extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private InstanceHttpCode(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceHttpCode create() {
            return builder().build();
        }

        /**
         * @return monitorItem
         */
        public java.util.List < MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List < MonitorItem> monitorItem; 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List < MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public InstanceHttpCode build() {
                return new InstanceHttpCode(this);
            } 

        } 

    }
}
