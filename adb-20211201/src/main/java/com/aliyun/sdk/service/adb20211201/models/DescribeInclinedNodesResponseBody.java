// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeInclinedNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInclinedNodesResponseBody</p>
 */
public class DescribeInclinedNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInclinedNodesResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInclinedNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInclinedNodesResponseBody build() {
            return new DescribeInclinedNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInclinedNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInclinedNodesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiskUsageRatio")
        private String diskUsageRatio;

        @com.aliyun.core.annotation.NameInMap("Node")
        private String node;

        private Items(Builder builder) {
            this.diskUsageRatio = builder.diskUsageRatio;
            this.node = builder.node;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return diskUsageRatio
         */
        public String getDiskUsageRatio() {
            return this.diskUsageRatio;
        }

        /**
         * @return node
         */
        public String getNode() {
            return this.node;
        }

        public static final class Builder {
            private String diskUsageRatio; 
            private String node; 

            /**
             * DiskUsageRatio.
             */
            public Builder diskUsageRatio(String diskUsageRatio) {
                this.diskUsageRatio = diskUsageRatio;
                return this;
            }

            /**
             * Node.
             */
            public Builder node(String node) {
                this.node = node;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
