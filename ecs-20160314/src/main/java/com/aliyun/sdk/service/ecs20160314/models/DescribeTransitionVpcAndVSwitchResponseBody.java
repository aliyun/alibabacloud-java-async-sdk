// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitionVpcAndVSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitionVpcAndVSwitchResponseBody</p>
 */
public class DescribeTransitionVpcAndVSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VmTransitionModels")
    private VmTransitionModels vmTransitionModels;

    private DescribeTransitionVpcAndVSwitchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vmTransitionModels = builder.vmTransitionModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitionVpcAndVSwitchResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vmTransitionModels
     */
    public VmTransitionModels getVmTransitionModels() {
        return this.vmTransitionModels;
    }

    public static final class Builder {
        private String requestId; 
        private VmTransitionModels vmTransitionModels; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VmTransitionModels.
         */
        public Builder vmTransitionModels(VmTransitionModels vmTransitionModels) {
            this.vmTransitionModels = vmTransitionModels;
            return this;
        }

        public DescribeTransitionVpcAndVSwitchResponseBody build() {
            return new DescribeTransitionVpcAndVSwitchResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Model(Builder builder) {
            this.code = builder.code;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String code; 
            private String instanceId; 
            private String message; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    public static class VmTransitionModels extends TeaModel {
        @NameInMap("Model")
        private java.util.List < Model> model;

        private VmTransitionModels(Builder builder) {
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VmTransitionModels create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public java.util.List < Model> getModel() {
            return this.model;
        }

        public static final class Builder {
            private java.util.List < Model> model; 

            /**
             * Model.
             */
            public Builder model(java.util.List < Model> model) {
                this.model = model;
                return this;
            }

            public VmTransitionModels build() {
                return new VmTransitionModels(this);
            } 

        } 

    }
}
