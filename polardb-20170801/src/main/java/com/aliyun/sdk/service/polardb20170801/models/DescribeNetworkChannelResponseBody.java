// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeNetworkChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkChannelResponseBody</p>
 */
public class DescribeNetworkChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelInfos")
    private java.util.List<ChannelInfos> channelInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkChannelResponseBody(Builder builder) {
        this.channelInfos = builder.channelInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelInfos
     */
    public java.util.List<ChannelInfos> getChannelInfos() {
        return this.channelInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ChannelInfos> channelInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNetworkChannelResponseBody model) {
            this.channelInfos = model.channelInfos;
            this.requestId = model.requestId;
        } 

        /**
         * ChannelInfos.
         */
        public Builder channelInfos(java.util.List<ChannelInfos> channelInfos) {
            this.channelInfos = channelInfos;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkChannelResponseBody build() {
            return new DescribeNetworkChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNetworkChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNetworkChannelResponseBody</p>
     */
    public static class ChannelInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("Notes")
        private String notes;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TargetDBClusterId")
        private String targetDBClusterId;

        @com.aliyun.core.annotation.NameInMap("TargetIp")
        private String targetIp;

        @com.aliyun.core.annotation.NameInMap("TargetPort")
        private String targetPort;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ChannelInfos(Builder builder) {
            this.channelName = builder.channelName;
            this.DBClusterId = builder.DBClusterId;
            this.notes = builder.notes;
            this.regionId = builder.regionId;
            this.targetDBClusterId = builder.targetDBClusterId;
            this.targetIp = builder.targetIp;
            this.targetPort = builder.targetPort;
            this.targetType = builder.targetType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelInfos create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return notes
         */
        public String getNotes() {
            return this.notes;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return targetDBClusterId
         */
        public String getTargetDBClusterId() {
            return this.targetDBClusterId;
        }

        /**
         * @return targetIp
         */
        public String getTargetIp() {
            return this.targetIp;
        }

        /**
         * @return targetPort
         */
        public String getTargetPort() {
            return this.targetPort;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String channelName; 
            private String DBClusterId; 
            private String notes; 
            private String regionId; 
            private String targetDBClusterId; 
            private String targetIp; 
            private String targetPort; 
            private String targetType; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(ChannelInfos model) {
                this.channelName = model.channelName;
                this.DBClusterId = model.DBClusterId;
                this.notes = model.notes;
                this.regionId = model.regionId;
                this.targetDBClusterId = model.targetDBClusterId;
                this.targetIp = model.targetIp;
                this.targetPort = model.targetPort;
                this.targetType = model.targetType;
                this.vpcId = model.vpcId;
            } 

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * Notes.
             */
            public Builder notes(String notes) {
                this.notes = notes;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TargetDBClusterId.
             */
            public Builder targetDBClusterId(String targetDBClusterId) {
                this.targetDBClusterId = targetDBClusterId;
                return this;
            }

            /**
             * TargetIp.
             */
            public Builder targetIp(String targetIp) {
                this.targetIp = targetIp;
                return this;
            }

            /**
             * TargetPort.
             */
            public Builder targetPort(String targetPort) {
                this.targetPort = targetPort;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ChannelInfos build() {
                return new ChannelInfos(this);
            } 

        } 

    }
}
