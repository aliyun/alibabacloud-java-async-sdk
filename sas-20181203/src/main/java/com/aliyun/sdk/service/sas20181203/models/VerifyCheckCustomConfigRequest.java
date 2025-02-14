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
 * {@link VerifyCheckCustomConfigRequest} extends {@link RequestModel}
 *
 * <p>VerifyCheckCustomConfigRequest</p>
 */
public class VerifyCheckCustomConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomConfigs")
    private java.util.List<CustomConfigs> customConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RepairConfigs")
    private java.util.List<RepairConfigs> repairConfigs;

    private VerifyCheckCustomConfigRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.customConfigs = builder.customConfigs;
        this.repairConfigs = builder.repairConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCheckCustomConfigRequest create() {
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
     * @return repairConfigs
     */
    public java.util.List<RepairConfigs> getRepairConfigs() {
        return this.repairConfigs;
    }

    public static final class Builder extends Request.Builder<VerifyCheckCustomConfigRequest, Builder> {
        private Long checkId; 
        private java.util.List<CustomConfigs> customConfigs; 
        private java.util.List<RepairConfigs> repairConfigs; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCheckCustomConfigRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.customConfigs = request.customConfigs;
            this.repairConfigs = request.repairConfigs;
        } 

        /**
         * <p>Check item ID.</p>
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
         * <p>List of custom configuration items for the check item.</p>
         */
        public Builder customConfigs(java.util.List<CustomConfigs> customConfigs) {
            this.putQueryParameter("CustomConfigs", customConfigs);
            this.customConfigs = customConfigs;
            return this;
        }

        /**
         * <p>Repair parameters supported by the check item&quot;s repair function.</p>
         */
        public Builder repairConfigs(java.util.List<RepairConfigs> repairConfigs) {
            this.putQueryParameter("RepairConfigs", repairConfigs);
            this.repairConfigs = repairConfigs;
            return this;
        }

        @Override
        public VerifyCheckCustomConfigRequest build() {
            return new VerifyCheckCustomConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link VerifyCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigRequest</p>
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

            /**
             * <p>Name of the custom configuration item for the check item, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IPList</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Operation type for the custom configuration item of the check item. Only pass DELETE when deleting; no need to pass for creation or update.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>User-configured value string for the custom configuration item of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>10.12.4.XX</p>
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
     * {@link VerifyCheckCustomConfigRequest} extends {@link TeaModel}
     *
     * <p>VerifyCheckCustomConfigRequest</p>
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

            /**
             * <p>ID of the repair process during the repair.</p>
             * 
             * <strong>example:</strong>
             * <p>7fec0a3395b345c18f108ffc9fc0****</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>Name of the repair parameter for the check item, unique within the same check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IPLists</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Operation type for the custom configuration item of the check item. Only pass DELETE when deleting; no need to pass for creation or update.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>User-configured value string for the repair parameter of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>172.26.49.XX</p>
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
