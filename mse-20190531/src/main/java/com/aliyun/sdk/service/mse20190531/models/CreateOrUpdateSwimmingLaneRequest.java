// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSwimmingLaneRequest</p>
 */
public class CreateOrUpdateSwimmingLaneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRules")
    private Boolean enableRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryRule")
    @Deprecated
    private String entryRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntryRules")
    private java.util.List < EntryRules> entryRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewaySwimmingLaneRouteJson")
    private GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathIndependentPercentageEnable")
    private Boolean pathIndependentPercentageEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String tag;

    private CreateOrUpdateSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.enable = builder.enable;
        this.enableRules = builder.enableRules;
        this.entryRule = builder.entryRule;
        this.entryRules = builder.entryRules;
        this.gatewaySwimmingLaneRouteJson = builder.gatewaySwimmingLaneRouteJson;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.pathIndependentPercentageEnable = builder.pathIndependentPercentageEnable;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSwimmingLaneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return enableRules
     */
    public Boolean getEnableRules() {
        return this.enableRules;
    }

    /**
     * @return entryRule
     */
    public String getEntryRule() {
        return this.entryRule;
    }

    /**
     * @return entryRules
     */
    public java.util.List < EntryRules> getEntryRules() {
        return this.entryRules;
    }

    /**
     * @return gatewaySwimmingLaneRouteJson
     */
    public GatewaySwimmingLaneRouteJson getGatewaySwimmingLaneRouteJson() {
        return this.gatewaySwimmingLaneRouteJson;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return pathIndependentPercentageEnable
     */
    public Boolean getPathIndependentPercentageEnable() {
        return this.pathIndependentPercentageEnable;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSwimmingLaneRequest, Builder> {
        private String acceptLanguage; 
        private Boolean enable; 
        private Boolean enableRules; 
        private String entryRule; 
        private java.util.List < EntryRules> entryRules; 
        private GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson; 
        private Long groupId; 
        private Long id; 
        private String name; 
        private String namespace; 
        private Boolean pathIndependentPercentageEnable; 
        private String regionId; 
        private String tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateSwimmingLaneRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.enable = request.enable;
            this.enableRules = request.enableRules;
            this.entryRule = request.entryRule;
            this.entryRules = request.entryRules;
            this.gatewaySwimmingLaneRouteJson = request.gatewaySwimmingLaneRouteJson;
            this.groupId = request.groupId;
            this.id = request.id;
            this.name = request.name;
            this.namespace = request.namespace;
            this.pathIndependentPercentageEnable = request.pathIndependentPercentageEnable;
            this.regionId = request.regionId;
            this.tag = request.tag;
        } 

        /**
         * The language of the response. Valid values: zh and en. Default value: zh. The value zh indicates Chinese, and the value en indicates English.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to enable the lane.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Specifies whether to configure a routing rule for the lane. If an Ingress gateway is used, this parameter is not required.
         */
        public Builder enableRules(Boolean enableRules) {
            this.putQueryParameter("EnableRules", enableRules);
            this.enableRules = enableRules;
            return this;
        }

        /**
         * The JSON string.
         */
        public Builder entryRule(String entryRule) {
            this.putQueryParameter("EntryRule", entryRule);
            this.entryRule = entryRule;
            return this;
        }

        /**
         * EntryRules.
         */
        public Builder entryRules(java.util.List < EntryRules> entryRules) {
            this.putBodyParameter("EntryRules", entryRules);
            this.entryRules = entryRules;
            return this;
        }

        /**
         * The information about the routing rule for the gateway. This parameter is required when a cloud-native gateway is used as the ingress.
         */
        public Builder gatewaySwimmingLaneRouteJson(GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson) {
            String gatewaySwimmingLaneRouteJsonShrink = shrink(gatewaySwimmingLaneRouteJson, "GatewaySwimmingLaneRouteJson", "json");
            this.putQueryParameter("GatewaySwimmingLaneRouteJson", gatewaySwimmingLaneRouteJsonShrink);
            this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
            return this;
        }

        /**
         * The language of the response. Valid values:****
         * <p>
         * 
         * *   **zh-CN**: Chinese
         * *   **en-US**: English
         * 
         * > Default value: **zh-CN**.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the primary key. The value -1 indicates a request that is used to create a lane. A value greater than 0 indicates a request that is used to modify a lane.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the lane.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * PathIndependentPercentageEnable.
         */
        public Builder pathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
            this.putQueryParameter("PathIndependentPercentageEnable", pathIndependentPercentageEnable);
            this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The tag.
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneRequest build() {
            return new CreateOrUpdateSwimmingLaneRequest(this);
        } 

    } 

    public static class RestItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("Datum")
        private String datum;

        @com.aliyun.core.annotation.NameInMap("Divisor")
        private Integer divisor;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private java.util.List < String > nameList;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("Remainder")
        private Integer remainder;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RestItems(Builder builder) {
            this.cond = builder.cond;
            this.datum = builder.datum;
            this.divisor = builder.divisor;
            this.name = builder.name;
            this.nameList = builder.nameList;
            this.operator = builder.operator;
            this.rate = builder.rate;
            this.remainder = builder.remainder;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestItems create() {
            return builder().build();
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return datum
         */
        public String getDatum() {
            return this.datum;
        }

        /**
         * @return divisor
         */
        public Integer getDivisor() {
            return this.divisor;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameList
         */
        public java.util.List < String > getNameList() {
            return this.nameList;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return remainder
         */
        public Integer getRemainder() {
            return this.remainder;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String cond; 
            private String datum; 
            private Integer divisor; 
            private String name; 
            private java.util.List < String > nameList; 
            private String operator; 
            private Integer rate; 
            private Integer remainder; 
            private String type; 
            private String value; 

            /**
             * Cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * Datum.
             */
            public Builder datum(String datum) {
                this.datum = datum;
                return this;
            }

            /**
             * Divisor.
             */
            public Builder divisor(Integer divisor) {
                this.divisor = divisor;
                return this;
            }

            /**
             * The name of the lane.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NameList.
             */
            public Builder nameList(java.util.List < String > nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Remainder.
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RestItems build() {
                return new RestItems(this);
            } 

        } 

    }
    public static class EntryRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private java.util.List < String > paths;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RestItems")
        private java.util.List < RestItems> restItems;

        private EntryRules(Builder builder) {
            this.condition = builder.condition;
            this.paths = builder.paths;
            this.priority = builder.priority;
            this.restItems = builder.restItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryRules create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return paths
         */
        public java.util.List < String > getPaths() {
            return this.paths;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return restItems
         */
        public java.util.List < RestItems> getRestItems() {
            return this.restItems;
        }

        public static final class Builder {
            private String condition; 
            private java.util.List < String > paths; 
            private Integer priority; 
            private java.util.List < RestItems> restItems; 

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RestItems.
             */
            public Builder restItems(java.util.List < RestItems> restItems) {
                this.restItems = restItems;
                return this;
            }

            public EntryRules build() {
                return new EntryRules(this);
            } 

        } 

    }
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.cond = builder.cond;
            this.name = builder.name;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String cond; 
            private String name; 
            private String type; 
            private String value; 

            /**
             * The matching condition. Valid values:
             * <p>
             * 
             * *   PRE: prefix matching
             * *   EQUAL: exact matching
             * *   ERGULAR: regular expression matching
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the parameter. Valid values:
             * <p>
             * 
             * *   header
             * *   param
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class RouteIndependentPercentageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private Long routeId;

        private RouteIndependentPercentageList(Builder builder) {
            this.percentage = builder.percentage;
            this.routeId = builder.routeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteIndependentPercentageList create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return routeId
         */
        public Long getRouteId() {
            return this.routeId;
        }

        public static final class Builder {
            private Integer percentage; 
            private Long routeId; 

            /**
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * RouteId.
             */
            public Builder routeId(Long routeId) {
                this.routeId = routeId;
                return this;
            }

            public RouteIndependentPercentageList build() {
                return new RouteIndependentPercentageList(this);
            } 

        } 

    }
    public static class GatewaySwimmingLaneRouteJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanaryModel")
        private Integer canaryModel;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("RouteIdList")
        private java.util.List < Long > routeIdList;

        @com.aliyun.core.annotation.NameInMap("RouteIndependentPercentageEnable")
        private Boolean routeIndependentPercentageEnable;

        @com.aliyun.core.annotation.NameInMap("RouteIndependentPercentageList")
        private java.util.List < RouteIndependentPercentageList> routeIndependentPercentageList;

        private GatewaySwimmingLaneRouteJson(Builder builder) {
            this.canaryModel = builder.canaryModel;
            this.conditions = builder.conditions;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.percentage = builder.percentage;
            this.routeIdList = builder.routeIdList;
            this.routeIndependentPercentageEnable = builder.routeIndependentPercentageEnable;
            this.routeIndependentPercentageList = builder.routeIndependentPercentageList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewaySwimmingLaneRouteJson create() {
            return builder().build();
        }

        /**
         * @return canaryModel
         */
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return percentage
         */
        public Integer getPercentage() {
            return this.percentage;
        }

        /**
         * @return routeIdList
         */
        public java.util.List < Long > getRouteIdList() {
            return this.routeIdList;
        }

        /**
         * @return routeIndependentPercentageEnable
         */
        public Boolean getRouteIndependentPercentageEnable() {
            return this.routeIndependentPercentageEnable;
        }

        /**
         * @return routeIndependentPercentageList
         */
        public java.util.List < RouteIndependentPercentageList> getRouteIndependentPercentageList() {
            return this.routeIndependentPercentageList;
        }

        public static final class Builder {
            private Integer canaryModel; 
            private java.util.List < Conditions> conditions; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private Integer percentage; 
            private java.util.List < Long > routeIdList; 
            private Boolean routeIndependentPercentageEnable; 
            private java.util.List < RouteIndependentPercentageList> routeIndependentPercentageList; 

            /**
             * CanaryModel.
             */
            public Builder canaryModel(Integer canaryModel) {
                this.canaryModel = canaryModel;
                return this;
            }

            /**
             * The matching conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The ID of the gateway.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * The route IDs.
             */
            public Builder routeIdList(java.util.List < Long > routeIdList) {
                this.routeIdList = routeIdList;
                return this;
            }

            /**
             * RouteIndependentPercentageEnable.
             */
            public Builder routeIndependentPercentageEnable(Boolean routeIndependentPercentageEnable) {
                this.routeIndependentPercentageEnable = routeIndependentPercentageEnable;
                return this;
            }

            /**
             * RouteIndependentPercentageList.
             */
            public Builder routeIndependentPercentageList(java.util.List < RouteIndependentPercentageList> routeIndependentPercentageList) {
                this.routeIndependentPercentageList = routeIndependentPercentageList;
                return this;
            }

            public GatewaySwimmingLaneRouteJson build() {
                return new GatewaySwimmingLaneRouteJson(this);
            } 

        } 

    }
}
