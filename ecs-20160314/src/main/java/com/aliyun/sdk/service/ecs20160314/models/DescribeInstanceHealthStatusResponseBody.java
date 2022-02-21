// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceHealthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceHealthStatusResponseBody</p>
 */
public class DescribeInstanceHealthStatusResponseBody extends TeaModel {
    @NameInMap("HealthStatusModel")
    private java.util.List < HealthStatusModel> healthStatusModel;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceHealthStatusResponseBody(Builder builder) {
        this.healthStatusModel = builder.healthStatusModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceHealthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return healthStatusModel
     */
    public java.util.List < HealthStatusModel> getHealthStatusModel() {
        return this.healthStatusModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < HealthStatusModel> healthStatusModel; 
        private String requestId; 

        /**
         * HealthStatusModel.
         */
        public Builder healthStatusModel(java.util.List < HealthStatusModel> healthStatusModel) {
            this.healthStatusModel = healthStatusModel;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceHealthStatusResponseBody build() {
            return new DescribeInstanceHealthStatusResponseBody(this);
        } 

    } 

    public static class HealthStatus extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        private HealthStatus(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String name; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public HealthStatus build() {
                return new HealthStatus(this);
            } 

        } 

    }
    public static class HealthStatusModel extends TeaModel {
        @NameInMap("HealthStatus")
        private HealthStatus healthStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        private HealthStatusModel(Builder builder) {
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthStatusModel create() {
            return builder().build();
        }

        /**
         * @return healthStatus
         */
        public HealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private HealthStatus healthStatus; 
            private String instanceId; 

            /**
             * HealthStatus.
             */
            public Builder healthStatus(HealthStatus healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public HealthStatusModel build() {
                return new HealthStatusModel(this);
            } 

        } 

    }
}
