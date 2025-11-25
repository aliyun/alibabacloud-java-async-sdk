// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeVpcFirewallZoneResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallZoneResponseBody</p>
 */
public class DescribeVpcFirewallZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneList")
    private java.util.List<java.util.List<ZoneList>> zoneList;

    private DescribeVpcFirewallZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneList = builder.zoneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallZoneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneList
     */
    public java.util.List<java.util.List<ZoneList>> getZoneList() {
        return this.zoneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<java.util.List<ZoneList>> zoneList; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallZoneResponseBody model) {
            this.requestId = model.requestId;
            this.zoneList = model.zoneList;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ZoneList.
         */
        public Builder zoneList(java.util.List<java.util.List<ZoneList>> zoneList) {
            this.zoneList = zoneList;
            return this;
        }

        public DescribeVpcFirewallZoneResponseBody build() {
            return new DescribeVpcFirewallZoneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcFirewallZoneResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcFirewallZoneResponseBody</p>
     */
    public static class ZoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("LocalName")
        private String localName;

        private ZoneList(Builder builder) {
            this.zoneId = builder.zoneId;
            this.localName = builder.localName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneList create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        public static final class Builder {
            private String zoneId; 
            private String localName; 

            private Builder() {
            } 

            private Builder(ZoneList model) {
                this.zoneId = model.zoneId;
                this.localName = model.localName;
            } 

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            public ZoneList build() {
                return new ZoneList(this);
            } 

        } 

    }
}
