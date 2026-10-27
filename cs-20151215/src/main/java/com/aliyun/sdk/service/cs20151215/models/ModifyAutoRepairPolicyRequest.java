// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ModifyAutoRepairPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyAutoRepairPolicyRequest</p>
 */
public class ModifyAutoRepairPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("policy_id")
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rules")
    private java.util.List<Rules> rules;

    private ModifyAutoRepairPolicyRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.policyId = builder.policyId;
        this.name = builder.name;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoRepairPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ModifyAutoRepairPolicyRequest, Builder> {
        private String clusterId; 
        private String policyId; 
        private String name; 
        private java.util.List<Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAutoRepairPolicyRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.policyId = request.policyId;
            this.name = request.name;
            this.rules = request.rules;
        } 

        /**
         * <p>The ID of the target cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c68deb844dc6d480eb775be611fdf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the self-healing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxxxx</p>
         */
        public Builder policyId(String policyId) {
            this.putPathParameter("policy_id", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The name of the self-healing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of self-healing sub-rules.</p>
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.putBodyParameter("rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public ModifyAutoRepairPolicyRequest build() {
            return new ModifyAutoRepairPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAutoRepairPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoRepairPolicyRequest</p>
     */
    public static class Incidents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Incidents(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Incidents create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Incidents model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the incident.</p>
             * 
             * <strong>example:</strong>
             * <p>Node.FaultNeedReboot.HOST</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of manual approval.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Incidents build() {
                return new Incidents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAutoRepairPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoRepairPolicyRequest</p>
     */
    public static class ApprovedLabel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ApprovedLabel(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApprovedLabel create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ApprovedLabel model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s.aliyun.com/incident</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>approved</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ApprovedLabel build() {
                return new ApprovedLabel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAutoRepairPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoRepairPolicyRequest</p>
     */
    public static class InquiringLabel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private InquiringLabel(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InquiringLabel create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(InquiringLabel model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s.aliyun.com/incident</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the label.</p>
             * 
             * <strong>example:</strong>
             * <p>inquiring</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InquiringLabel build() {
                return new InquiringLabel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAutoRepairPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoRepairPolicyRequest</p>
     */
    public static class Intervention extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("approved_label")
        private ApprovedLabel approvedLabel;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("inquiring_label")
        private InquiringLabel inquiringLabel;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Intervention(Builder builder) {
            this.approvedLabel = builder.approvedLabel;
            this.enable = builder.enable;
            this.inquiringLabel = builder.inquiringLabel;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intervention create() {
            return builder().build();
        }

        /**
         * @return approvedLabel
         */
        public ApprovedLabel getApprovedLabel() {
            return this.approvedLabel;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return inquiringLabel
         */
        public InquiringLabel getInquiringLabel() {
            return this.inquiringLabel;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ApprovedLabel approvedLabel; 
            private Boolean enable; 
            private InquiringLabel inquiringLabel; 
            private String type; 

            private Builder() {
            } 

            private Builder(Intervention model) {
                this.approvedLabel = model.approvedLabel;
                this.enable = model.enable;
                this.inquiringLabel = model.inquiringLabel;
                this.type = model.type;
            } 

            /**
             * <p>The label configuration for authorization confirmation. When you add the following labels to the node, you authorize ACK to execute the operation for this stage. After completing the operation for this stage, ACK automatically removes the authorization inquiry and confirmation labels corresponding to this stage. If you do not add the following labels in time to grant authorization, ACK will not execute the action for this stage and subsequent actions, and the node may remain in a damaged state.</p>
             */
            public Builder approvedLabel(ApprovedLabel approvedLabel) {
                this.approvedLabel = approvedLabel;
                return this;
            }

            /**
             * <p>Specifies whether to enable manual approval.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The label configuration for authorization inquiry. When this stage is reached, ACK adds the following labels to your node and waits for your authorization to execute the action for this stage.</p>
             */
            public Builder inquiringLabel(InquiringLabel inquiringLabel) {
                this.inquiringLabel = inquiringLabel;
                return this;
            }

            /**
             * <p>The type of approval.</p>
             * 
             * <strong>example:</strong>
             * <p>label</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Intervention build() {
                return new Intervention(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAutoRepairPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoRepairPolicyRequest</p>
     */
    public static class RepairProcedure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map<String, ?> config;

        @com.aliyun.core.annotation.NameInMap("intervention")
        private Intervention intervention;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private RepairProcedure(Builder builder) {
            this.config = builder.config;
            this.intervention = builder.intervention;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RepairProcedure create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        /**
         * @return intervention
         */
        public Intervention getIntervention() {
            return this.intervention;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.Map<String, ?> config; 
            private Intervention intervention; 
            private String name; 

            private Builder() {
            } 

            private Builder(RepairProcedure model) {
                this.config = model.config;
                this.intervention = model.intervention;
                this.name = model.name;
            } 

            /**
             * <p>The parameter settings of the flow.</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The configuration for the manual intervention procedure.</p>
             */
            public Builder intervention(Intervention intervention) {
                this.intervention = intervention;
                return this;
            }

            /**
             * <p>The name of the procedure.</p>
             * 
             * <strong>example:</strong>
             * <p>QuarantineGPU</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RepairProcedure build() {
                return new RepairProcedure(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyAutoRepairPolicyRequest} extends {@link TeaModel}
     *
     * <p>ModifyAutoRepairPolicyRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("incidents")
        private java.util.List<Incidents> incidents;

        @com.aliyun.core.annotation.NameInMap("repair_procedure")
        private java.util.List<RepairProcedure> repairProcedure;

        private Rules(Builder builder) {
            this.incidents = builder.incidents;
            this.repairProcedure = builder.repairProcedure;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return incidents
         */
        public java.util.List<Incidents> getIncidents() {
            return this.incidents;
        }

        /**
         * @return repairProcedure
         */
        public java.util.List<RepairProcedure> getRepairProcedure() {
            return this.repairProcedure;
        }

        public static final class Builder {
            private java.util.List<Incidents> incidents; 
            private java.util.List<RepairProcedure> repairProcedure; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.incidents = model.incidents;
                this.repairProcedure = model.repairProcedure;
            } 

            /**
             * <p>The list of identified incidents.</p>
             */
            public Builder incidents(java.util.List<Incidents> incidents) {
                this.incidents = incidents;
                return this;
            }

            /**
             * <p>The repair procedure.</p>
             */
            public Builder repairProcedure(java.util.List<RepairProcedure> repairProcedure) {
                this.repairProcedure = repairProcedure;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
