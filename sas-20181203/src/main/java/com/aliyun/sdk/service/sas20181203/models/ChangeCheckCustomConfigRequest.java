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
 * {@link ChangeCheckCustomConfigRequest} extends {@link RequestModel}
 *
 * <p>ChangeCheckCustomConfigRequest</p>
 */
public class ChangeCheckCustomConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomConfigs")
    private java.util.List<CustomConfigs> customConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepairConfigs")
    private java.util.List<RepairConfigs> repairConfigs;

    private ChangeCheckCustomConfigRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.customConfigs = builder.customConfigs;
        this.regionId = builder.regionId;
        this.repairConfigs = builder.repairConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCheckCustomConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return customConfigs
     */
    public java.util.List<CustomConfigs> getCustomConfigs() {
        return this.customConfigs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repairConfigs
     */
    public java.util.List<RepairConfigs> getRepairConfigs() {
        return this.repairConfigs;
    }

    public static final class Builder extends Request.Builder<ChangeCheckCustomConfigRequest, Builder> {
        private Long checkId; 
        private java.util.List<CustomConfigs> customConfigs; 
        private String regionId; 
        private java.util.List<RepairConfigs> repairConfigs; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCheckCustomConfigRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.customConfigs = request.customConfigs;
            this.regionId = request.regionId;
            this.repairConfigs = request.repairConfigs;
        } 

        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of check items.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The custom configuration items of the check item.</p>
         */
        public Builder customConfigs(java.util.List<CustomConfigs> customConfigs) {
            this.putQueryParameter("CustomConfigs", customConfigs);
            this.customConfigs = customConfigs;
            return this;
        }

        /**
         * <p>The region where the Security Center instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: International</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The parameters required for fixing risk items.</p>
         */
        public Builder repairConfigs(java.util.List<RepairConfigs> repairConfigs) {
            this.putQueryParameter("RepairConfigs", repairConfigs);
            this.repairConfigs = repairConfigs;
            return this;
        }

        @Override
        public ChangeCheckCustomConfigRequest build() {
            return new ChangeCheckCustomConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChangeCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>ChangeCheckCustomConfigRequest</p>
     */
    public static class CustomConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CustomConfigs(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String operation; 
            private String value; 

            private Builder() {
            } 

            private Builder(CustomConfigs model) {
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

            /**
             * <p>The name of the custom configuration item. The name of a custom configuration item is unique in a check item.</p>
             * 
             * <strong>example:</strong>
             * <p>SessionTimeMax</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operation that you want to perform on the custom configuration item. This parameter is required only if you want to delete the custom configuration item. To delete the custom configuration item, set the value to DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The value of the custom configuration item. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomConfigs build() {
                return new CustomConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ChangeCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>ChangeCheckCustomConfigRequest</p>
     */
    public static class RepairConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RepairConfigs(Builder builder) {
            this.flowId = builder.flowId;
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairConfigs create() {
            return builder().build();
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String flowId; 
            private String name; 
            private String operation; 
            private String value; 

            private Builder() {
            } 

            private Builder(RepairConfigs model) {
                this.flowId = model.flowId;
                this.name = model.name;
                this.operation = model.operation;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the fixing process.</p>
             * 
             * <strong>example:</strong>
             * <p>ascgrmscyjgs*********</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The name of the parameter required for fixing a risk item, which is unique in a check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Port</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The operation that you want to perform on the custom configuration item. This parameter is required only if you want to delete the custom configuration item. To delete the custom configuration item, set the value to DELETE.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The value of the parameter required for fixing a risk item. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RepairConfigs build() {
                return new RepairConfigs(this);
            } 

        } 

    }
}
