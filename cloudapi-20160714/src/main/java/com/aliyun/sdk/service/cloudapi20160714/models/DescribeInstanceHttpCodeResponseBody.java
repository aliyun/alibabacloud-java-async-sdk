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
 * {@link DescribeInstanceHttpCodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceHttpCodeResponseBody</p>
 */
public class DescribeInstanceHttpCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceHttpCode")
    private InstanceHttpCode instanceHttpCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceHttpCodeResponseBody model) {
            this.instanceHttpCode = model.instanceHttpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status codes.</p>
         */
        public Builder instanceHttpCode(InstanceHttpCode instanceHttpCode) {
            this.instanceHttpCode = instanceHttpCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AD00F8C0-311B-54A9-ADE2-2436771012DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceHttpCodeResponseBody build() {
            return new DescribeInstanceHttpCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceHttpCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceHttpCodeResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MonitorItem model) {
                this.itemTime = model.itemTime;
                this.itemValue = model.itemValue;
            } 

            /**
             * <p>The HTTP status code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder itemTime(String itemTime) {
                this.itemTime = itemTime;
                return this;
            }

            /**
             * <p>The corresponding value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
     * {@link DescribeInstanceHttpCodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceHttpCodeResponseBody</p>
     */
    public static class InstanceHttpCode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItem")
        private java.util.List<MonitorItem> monitorItem;

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
        public java.util.List<MonitorItem> getMonitorItem() {
            return this.monitorItem;
        }

        public static final class Builder {
            private java.util.List<MonitorItem> monitorItem; 

            private Builder() {
            } 

            private Builder(InstanceHttpCode model) {
                this.monitorItem = model.monitorItem;
            } 

            /**
             * MonitorItem.
             */
            public Builder monitorItem(java.util.List<MonitorItem> monitorItem) {
                this.monitorItem = monitorItem;
                return this;
            }

            public InstanceHttpCode build() {
                return new InstanceHttpCode(this);
            } 

        } 

    }
}
