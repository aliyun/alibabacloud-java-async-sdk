// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeHoneyPotSuspStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHoneyPotSuspStatisticsResponseBody</p>
 */
public class DescribeHoneyPotSuspStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuspHoneyPotStatisticsResponse")
    private java.util.List<SuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse;

    private DescribeHoneyPotSuspStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.suspHoneyPotStatisticsResponse = builder.suspHoneyPotStatisticsResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotSuspStatisticsResponseBody create() {
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
     * @return suspHoneyPotStatisticsResponse
     */
    public java.util.List<SuspHoneyPotStatisticsResponse> getSuspHoneyPotStatisticsResponse() {
        return this.suspHoneyPotStatisticsResponse;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse; 

        private Builder() {
        } 

        private Builder(DescribeHoneyPotSuspStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.suspHoneyPotStatisticsResponse = model.suspHoneyPotStatisticsResponse;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>9E3969FA-5ACC-4256-9FDE-BB6918CD0410</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the top 5 VPCs or assets for which alerts are most frequently generated.</p>
         */
        public Builder suspHoneyPotStatisticsResponse(java.util.List<SuspHoneyPotStatisticsResponse> suspHoneyPotStatisticsResponse) {
            this.suspHoneyPotStatisticsResponse = suspHoneyPotStatisticsResponse;
            return this;
        }

        public DescribeHoneyPotSuspStatisticsResponseBody build() {
            return new DescribeHoneyPotSuspStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHoneyPotSuspStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHoneyPotSuspStatisticsResponseBody</p>
     */
    public static class SuspHoneyPotStatisticsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        private SuspHoneyPotStatisticsResponse(Builder builder) {
            this.count = builder.count;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspHoneyPotStatisticsResponse create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private Integer count; 
            private String instanceId; 
            private String instanceName; 
            private String type; 
            private String vpcId; 
            private String vpcName; 

            private Builder() {
            } 

            private Builder(SuspHoneyPotStatisticsResponse model) {
                this.count = model.count;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>The total number of alerts that are generated for the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>8793</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>uuid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-p0whhoba24wd28p8****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>uuid</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>abc-launch-advisor</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>vpcInstanceId</strong>: VPC</li>
             * <li><strong>uuid</strong>: server</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpcInstanceId</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>vpcInstanceId</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-p0wwdsuutdyu1ygkt****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The name of the VPC.</p>
             * <blockquote>
             * <p>This parameter is returned only when <strong>StatisticsKeyType</strong> is set to <strong>vpcInstanceId</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>abc01</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public SuspHoneyPotStatisticsResponse build() {
                return new SuspHoneyPotStatisticsResponse(this);
            } 

        } 

    }
}
