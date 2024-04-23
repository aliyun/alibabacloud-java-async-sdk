// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRiskLevelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceRiskLevelsResponseBody</p>
 */
public class DescribeInstanceRiskLevelsResponseBody extends TeaModel {
    @NameInMap("InstanceRisks")
    private java.util.List < InstanceRisks> instanceRisks;

    @NameInMap("RequestId")
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
         * The information about the instances.
         */
        public Builder instanceRisks(java.util.List < InstanceRisks> instanceRisks) {
            this.instanceRisks = instanceRisks;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceRiskLevelsResponseBody build() {
            return new DescribeInstanceRiskLevelsResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("Ip")
        private String ip;

        @NameInMap("Level")
        private String level;

        @NameInMap("Type")
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
             * The IP addresses of servers.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The risk levels. Valid values:
             * <p>
             * 
             * *   **medium**
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The type.
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
    public static class InstanceRisks extends TeaModel {
        @NameInMap("Details")
        private java.util.List < Details> details;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Level")
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
             * The risk levels of the Elastic Compute Service (ECS) instance.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * The instance ID of your Cloud Firewall.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The risk levels. Valid values:
             * <p>
             * 
             * *   **medium**
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
