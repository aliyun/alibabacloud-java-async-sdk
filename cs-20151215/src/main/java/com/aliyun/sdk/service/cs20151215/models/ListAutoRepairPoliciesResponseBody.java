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
 * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoRepairPoliciesResponseBody</p>
 */
public class ListAutoRepairPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    private ListAutoRepairPoliciesResponseBody(Builder builder) {
        this.items = builder.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoRepairPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    public static final class Builder {
        private java.util.List<Items> items; 

        private Builder() {
        } 

        private Builder(ListAutoRepairPoliciesResponseBody model) {
            this.items = model.items;
        } 

        /**
         * items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        public ListAutoRepairPoliciesResponseBody build() {
            return new ListAutoRepairPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Conditions(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String reason; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.reason = model.reason;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Events(Builder builder) {
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String reason; 
            private String type; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.reason = model.reason;
                this.type = model.type;
            } 

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
     */
    public static class Incidents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("events")
        private java.util.List<Events> events;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Incidents(Builder builder) {
            this.conditions = builder.conditions;
            this.events = builder.events;
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
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return events
         */
        public java.util.List<Events> getEvents() {
            return this.events;
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
            private java.util.List<Conditions> conditions; 
            private java.util.List<Events> events; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Incidents model) {
                this.conditions = model.conditions;
                this.events = model.events;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * events.
             */
            public Builder events(java.util.List<Events> events) {
                this.events = events;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
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
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
     */
    public static class Intervention extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("approved_label")
        private ApprovedLabel approvedLabel;

        @com.aliyun.core.annotation.NameInMap("enable")
        private String enable;

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
        public String getEnable() {
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
            private String enable; 
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
             * approved_label.
             */
            public Builder approvedLabel(ApprovedLabel approvedLabel) {
                this.approvedLabel = approvedLabel;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * inquiring_label.
             */
            public Builder inquiringLabel(InquiringLabel inquiringLabel) {
                this.inquiringLabel = inquiringLabel;
                return this;
            }

            /**
             * type.
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
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
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
             * config.
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * intervention.
             */
            public Builder intervention(Intervention intervention) {
                this.intervention = intervention;
                return this;
            }

            /**
             * name.
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
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
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
             * incidents.
             */
            public Builder incidents(java.util.List<Incidents> incidents) {
                this.incidents = incidents;
                return this;
            }

            /**
             * repair_procedure.
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
    /**
     * 
     * {@link ListAutoRepairPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAutoRepairPoliciesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resource_ids")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("resource_sub_type")
        private String resourceSubType;

        @com.aliyun.core.annotation.NameInMap("resource_type")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("rules")
        private java.util.List<Rules> rules;

        private Items(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.resourceIds = builder.resourceIds;
            this.resourceSubType = builder.resourceSubType;
            this.resourceType = builder.resourceType;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceIds
         */
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceSubType
         */
        public String getResourceSubType() {
            return this.resourceSubType;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private java.util.List<String> resourceIds; 
            private String resourceSubType; 
            private String resourceType; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.id = model.id;
                this.name = model.name;
                this.resourceIds = model.resourceIds;
                this.resourceSubType = model.resourceSubType;
                this.resourceType = model.resourceType;
                this.rules = model.rules;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * resource_ids.
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * resource_sub_type.
             */
            public Builder resourceSubType(String resourceSubType) {
                this.resourceSubType = resourceSubType;
                return this;
            }

            /**
             * resource_type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
