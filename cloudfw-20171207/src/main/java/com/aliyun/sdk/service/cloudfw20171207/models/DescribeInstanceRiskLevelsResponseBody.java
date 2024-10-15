// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceRiskLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRiskLevelsResponseBody</p>
 */
public class DescribeInstanceRiskLevelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRisks")
    private java.util.List < InstanceRisks> instanceRisks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceRiskLevelsResponseBody(Builder builder) {
        this.instanceRisks = builder.instanceRisks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRiskLevelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceRisks
     */
    public java.util.List < InstanceRisks> getInstanceRisks() {
        return this.instanceRisks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceRisks> instanceRisks; 
        private String requestId; 

        /**
         * <p>The information about the instances.</p>
         */
        public Builder instanceRisks(java.util.List < InstanceRisks> instanceRisks) {
            this.instanceRisks = instanceRisks;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9AABB1B7-C81F-5158-9EF9-B2DD5D3DA014</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceRiskLevelsResponseBody build() {
            return new DescribeInstanceRiskLevelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRiskLevelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRiskLevelsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Details(Builder builder) {
            this.ip = builder.ip;
            this.level = builder.level;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ip; 
            private String level; 
            private String type; 

            /**
             * <p>The IP addresses of servers.</p>
             * 
             * <strong>example:</strong>
             * <p>203.107.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The risk levels. Valid values:</p>
             * <ul>
             * <li><strong>medium</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceNotProtected</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceRiskLevelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRiskLevelsResponseBody</p>
     */
    public static class InstanceRisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List < Details> details;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private InstanceRisks(Builder builder) {
            this.details = builder.details;
            this.instanceId = builder.instanceId;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceRisks create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private java.util.List < Details> details; 
            private String instanceId; 
            private String level; 

            /**
             * <p>The risk levels of the Elastic Compute Service (ECS) instance.</p>
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The instance ID of your Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vipcloudfw-cn-7mz2fj8nm0u</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The risk levels. Valid values:</p>
             * <ul>
             * <li><strong>medium</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public InstanceRisks build() {
                return new InstanceRisks(this);
            } 

        } 

    }
}
