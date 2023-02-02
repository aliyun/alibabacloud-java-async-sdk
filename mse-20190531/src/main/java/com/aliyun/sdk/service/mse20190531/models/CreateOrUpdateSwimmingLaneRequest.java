// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSwimmingLaneRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSwimmingLaneRequest</p>
 */
public class CreateOrUpdateSwimmingLaneRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("EnableRules")
    private Boolean enableRules;

    @Query
    @NameInMap("EntryRule")
    private String entryRule;

    @Query
    @NameInMap("EntryRules")
    private java.util.List < EntryRules> entryRules;

    @Query
    @NameInMap("GatewaySwimmingLaneRouteJson")
    private GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson;

    @Query
    @NameInMap("GmtCreate")
    private String gmtCreate;

    @Query
    @NameInMap("GmtModified")
    private String gmtModified;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("LicenseKey")
    private String licenseKey;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Status")
    private Integer status;

    @Query
    @NameInMap("Tag")
    private String tag;

    @Query
    @NameInMap("UserId")
    private String userId;

    private CreateOrUpdateSwimmingLaneRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.enable = builder.enable;
        this.enableRules = builder.enableRules;
        this.entryRule = builder.entryRule;
        this.entryRules = builder.entryRules;
        this.gatewaySwimmingLaneRouteJson = builder.gatewaySwimmingLaneRouteJson;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.licenseKey = builder.licenseKey;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.source = builder.source;
        this.status = builder.status;
        this.tag = builder.tag;
        this.userId = builder.userId;
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
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
     * @return licenseKey
     */
    public String getLicenseKey() {
        return this.licenseKey;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSwimmingLaneRequest, Builder> {
        private String acceptLanguage; 
        private Boolean enable; 
        private Boolean enableRules; 
        private String entryRule; 
        private java.util.List < EntryRules> entryRules; 
        private GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long groupId; 
        private Long id; 
        private String licenseKey; 
        private String name; 
        private String regionId; 
        private String source; 
        private Integer status; 
        private String tag; 
        private String userId; 

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
            this.gmtCreate = request.gmtCreate;
            this.gmtModified = request.gmtModified;
            this.groupId = request.groupId;
            this.id = request.id;
            this.licenseKey = request.licenseKey;
            this.name = request.name;
            this.regionId = request.regionId;
            this.source = request.source;
            this.status = request.status;
            this.tag = request.tag;
            this.userId = request.userId;
        } 

        /**
         * The language of the response. Valid values:****
         * <p>
         * 
         * *   **zh-CN**: Chinese
         * *   **en-US**: English.
         * 
         * > Default value: **zh-CN**.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Specifies whether to enable a lane.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Specifies whether to set a routing rule for the lane. If an Ingress gateway is used, this parameter is not required.
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
         * The lane.
         */
        public Builder entryRules(java.util.List < EntryRules> entryRules) {
            this.putQueryParameter("EntryRules", entryRules);
            this.entryRules = entryRules;
            return this;
        }

        /**
         * GatewaySwimmingLaneRouteJson.
         */
        public Builder gatewaySwimmingLaneRouteJson(GatewaySwimmingLaneRouteJson gatewaySwimmingLaneRouteJson) {
            String gatewaySwimmingLaneRouteJsonShrink = shrink(gatewaySwimmingLaneRouteJson, "GatewaySwimmingLaneRouteJson", "json");
            this.putQueryParameter("GatewaySwimmingLaneRouteJson", gatewaySwimmingLaneRouteJsonShrink);
            this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
            return this;
        }

        /**
         * The creation time.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.putQueryParameter("GmtCreate", gmtCreate);
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * The update time.
         */
        public Builder gmtModified(String gmtModified) {
            this.putQueryParameter("GmtModified", gmtModified);
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * The group to which the lane belongs.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the primary key. A value -1 specifies a request that is used to create a lane. A value greater than 0 specifies a request that is used to modify a lane.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The license key in use.
         */
        public Builder licenseKey(String licenseKey) {
            this.putQueryParameter("LicenseKey", licenseKey);
            this.licenseKey = licenseKey;
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The service source. Valid value: edasmsc.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The value 0 indicates that the lane is disabled.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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

        /**
         * The Alibaba Cloud account. The format is a number, such as 136246975637\*\*\*\*. You can leave this parameter empty.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneRequest build() {
            return new CreateOrUpdateSwimmingLaneRequest(this);
        } 

    } 

    public static class RestItems extends TeaModel {
        @NameInMap("Cond")
        private String cond;

        @NameInMap("Datum")
        private String datum;

        @NameInMap("Divisor")
        private Integer divisor;

        @NameInMap("Name")
        private String name;

        @NameInMap("NameList")
        private java.util.List < String > nameList;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Rate")
        private Integer rate;

        @NameInMap("Remainder")
        private Integer remainder;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
             * The expression. =, >, <, >=, <=
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * The base value used for the rawvalue operator.
             */
            public Builder datum(String datum) {
                this.datum = datum;
                return this;
            }

            /**
             * The divisor used for the mod operator.
             */
            public Builder divisor(Integer divisor) {
                this.divisor = divisor;
                return this;
            }

            /**
             * The name of the rule. This parameter corresponds to the key of the Type parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The list of names.
             */
            public Builder nameList(java.util.List < String > nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * The operator type. Valid values: mod, list, rawvalue, and rate.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * The remainder used for the mod operator.
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
                return this;
            }

            /**
             * The type of the rule. Valid values: cookie, param, and header.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content of the rule.
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
        @NameInMap("Condition")
        private String condition;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("Path")
        private String path;

        @NameInMap("Paths")
        private java.util.List < String > paths;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RestItems")
        private java.util.List < RestItems> restItems;

        private EntryRules(Builder builder) {
            this.condition = builder.condition;
            this.enable = builder.enable;
            this.path = builder.path;
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
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
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
            private Boolean enable; 
            private String path; 
            private java.util.List < String > paths; 
            private Integer priority; 
            private java.util.List < RestItems> restItems; 

            /**
             * The common parameters in the JSON format.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Specifies whether to enable the rule. Valid values:
             * <p>
             * 
             * *   `true`: enables the rule.
             * *   `false`: disables the rule.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The list of paths.
             */
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * The priority. A smaller value of this parameter indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The information about the rule for the REST method.
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
        @NameInMap("Cond")
        private String cond;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
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
             * The expression. =, >, <, >=, <=
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * The name of the rule. This parameter corresponds to the key of the Type parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the rule. Valid values: cookie, param, and header.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content of the rule.
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
    public static class GatewaySwimmingLaneRouteJson extends TeaModel {
        @NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("RouteIdList")
        private java.util.List < Long > routeIdList;

        private GatewaySwimmingLaneRouteJson(Builder builder) {
            this.conditions = builder.conditions;
            this.gatewayId = builder.gatewayId;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.routeIdList = builder.routeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewaySwimmingLaneRouteJson create() {
            return builder().build();
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
         * @return routeIdList
         */
        public java.util.List < Long > getRouteIdList() {
            return this.routeIdList;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private java.util.List < Long > routeIdList; 

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * RouteIdList.
             */
            public Builder routeIdList(java.util.List < Long > routeIdList) {
                this.routeIdList = routeIdList;
                return this;
            }

            public GatewaySwimmingLaneRouteJson build() {
                return new GatewaySwimmingLaneRouteJson(this);
            } 

        } 

    }
}
