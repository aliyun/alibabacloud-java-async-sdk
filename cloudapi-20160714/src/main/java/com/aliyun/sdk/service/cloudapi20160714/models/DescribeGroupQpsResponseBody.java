// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupQpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupQpsResponseBody</p>
 */
public class DescribeGroupQpsResponseBody extends TeaModel {
    @NameInMap("GroupQps")
    private GroupQps groupQps;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGroupQpsResponseBody(Builder builder) {
        this.groupQps = builder.groupQps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupQpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupQps
     */
    public GroupQps getGroupQps() {
        return this.groupQps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupQps groupQps; 
        private String requestId; 

        /**
         * The number of requests directed to the API group.
         */
        public Builder groupQps(GroupQps groupQps) {
            this.groupQps = groupQps;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupQpsResponseBody build() {
            return new DescribeGroupQpsResponseBody(this);
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
             * The point in time.
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * The number of requests at the specified point in time.
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
    public static class GroupQps extends TeaModel {
        @NameInMap("MonitorItem")
        private java.util.List < MonitorItem> monitorItem;

        private GroupQps(Builder builder) {
            this.monitorItem = builder.monitorItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupQps create() {
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

            public GroupQps build() {
                return new GroupQps(this);
            } 

        } 

    }
}
