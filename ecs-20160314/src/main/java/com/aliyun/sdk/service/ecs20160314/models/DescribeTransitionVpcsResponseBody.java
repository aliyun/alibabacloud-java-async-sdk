// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransitionVpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitionVpcsResponseBody</p>
 */
public class DescribeTransitionVpcsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VpcModels")
    private VpcModels vpcModels;

    private DescribeTransitionVpcsResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vpcModels = builder.vpcModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitionVpcsResponseBody create() {
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
     * @return vpcModels
     */
    public VpcModels getVpcModels() {
        return this.vpcModels;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 
        private Boolean success; 
        private VpcModels vpcModels; 

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
         * VpcModels.
         */
        public Builder vpcModels(VpcModels vpcModels) {
            this.vpcModels = vpcModels;
            return this;
        }

        public DescribeTransitionVpcsResponseBody build() {
            return new DescribeTransitionVpcsResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private Model(Builder builder) {
            this.config = builder.config;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
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
            private String config; 
            private String regionId; 
            private Integer status; 
            private Integer type; 
            private String vpcId; 
            private String vpcName; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
    public static class VpcModels extends TeaModel {
        @NameInMap("Model")
        private java.util.List < Model> model;

        private VpcModels(Builder builder) {
            this.model = builder.model;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcModels create() {
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

            public VpcModels build() {
                return new VpcModels(this);
            } 

        } 

    }
}
