// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterWhiteListResponseBody</p>
 */
public class DescribeClusterWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupItems")
    private GroupItems groupItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClusterWhiteListResponseBody(Builder builder) {
        this.groupItems = builder.groupItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterWhiteListResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupItems
     */
    public GroupItems getGroupItems() {
        return this.groupItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupItems groupItems; 
        private String requestId; 

        /**
         * GroupItems.
         */
        public Builder groupItems(GroupItems groupItems) {
            this.groupItems = groupItems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterWhiteListResponseBody build() {
            return new DescribeClusterWhiteListResponseBody(this);
        } 

    } 

    public static class GroupItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WhiteIp")
        private java.util.List < String > whiteIp;

        private GroupItems(Builder builder) {
            this.whiteIp = builder.whiteIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupItems create() {
            return builder().build();
        }

        /**
         * @return whiteIp
         */
        public java.util.List < String > getWhiteIp() {
            return this.whiteIp;
        }

        public static final class Builder {
            private java.util.List < String > whiteIp; 

            /**
             * WhiteIp.
             */
            public Builder whiteIp(java.util.List < String > whiteIp) {
                this.whiteIp = whiteIp;
                return this;
            }

            public GroupItems build() {
                return new GroupItems(this);
            } 

        } 

    }
}
