// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitionVSwitchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitionVSwitchesResponseBody</p>
 */
public class DescribeTransitionVSwitchesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VSwitchModels")
    private VSwitchModels vSwitchModels;

    private DescribeTransitionVSwitchesResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vSwitchModels = builder.vSwitchModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitionVSwitchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return vSwitchModels
     */
    public VSwitchModels getVSwitchModels() {
        return this.vSwitchModels;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private Boolean success; 
        private VSwitchModels vSwitchModels; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * VSwitchModels.
         */
        public Builder vSwitchModels(VSwitchModels vSwitchModels) {
            this.vSwitchModels = vSwitchModels;
            return this;
        }

        public DescribeTransitionVSwitchesResponseBody build() {
            return new DescribeTransitionVSwitchesResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("CIDR")
        private String CIDR;

        @NameInMap("Description")
        private String description;

        @NameInMap("IzNo")
        private String izNo;

        @NameInMap("Name")
        private String name;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Model(Builder builder) {
            this.CIDR = builder.CIDR;
            this.description = builder.description;
            this.izNo = builder.izNo;
            this.name = builder.name;
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
         * @return CIDR
         */
        public String getCIDR() {
            return this.CIDR;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return izNo
         */
        public String getIzNo() {
            return this.izNo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String CIDR; 
            private String description; 
            private String izNo; 
            private String name; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * CIDR.
             */
            public Builder CIDR(String CIDR) {
                this.CIDR = CIDR;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IzNo.
             */
            public Builder izNo(String izNo) {
                this.izNo = izNo;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
    public static class VSwitchModels extends TeaModel {
        @NameInMap("Model")
        private java.util.List < Model> model;

        private VSwitchModels(Builder builder) {
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchModels create() {
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

            public VSwitchModels build() {
                return new VSwitchModels(this);
            } 

        } 

    }
}
