// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAllSwimmingLaneResponseBody</p>
 */
public class QueryAllSwimmingLaneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAllSwimmingLaneResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllSwimmingLaneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAllSwimmingLaneResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>[{id:100,name:&quot;test&quot;}]</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DC34E4A3-5F1C-4E40-86EA-02EDF967****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAllSwimmingLaneResponseBody build() {
            return new QueryAllSwimmingLaneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllSwimmingLaneResponseBody</p>
     */
    public static class RestItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("datum")
        private String datum;

        @com.aliyun.core.annotation.NameInMap("divisor")
        private Integer divisor;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("remainder")
        private Integer remainder;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
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
        public java.util.List<String> getNameList() {
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
            private java.util.List<String> nameList; 
            private String operator; 
            private Integer rate; 
            private Integer remainder; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(RestItems model) {
                this.cond = model.cond;
                this.datum = model.datum;
                this.divisor = model.divisor;
                this.name = model.name;
                this.nameList = model.nameList;
                this.operator = model.operator;
                this.rate = model.rate;
                this.remainder = model.remainder;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * datum.
             */
            public Builder datum(String datum) {
                this.datum = datum;
                return this;
            }

            /**
             * divisor.
             */
            public Builder divisor(Integer divisor) {
                this.divisor = divisor;
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
             * nameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * rate.
             */
            public Builder rate(Integer rate) {
                this.rate = rate;
                return this;
            }

            /**
             * remainder.
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
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
    /**
     * 
     * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllSwimmingLaneResponseBody</p>
     */
    public static class EntryRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("restItems")
        private java.util.List<RestItems> restItems;

        private EntryRules(Builder builder) {
            this.condition = builder.condition;
            this.path = builder.path;
            this.paths = builder.paths;
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
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return restItems
         */
        public java.util.List<RestItems> getRestItems() {
            return this.restItems;
        }

        public static final class Builder {
            private String condition; 
            private String path; 
            private java.util.List<String> paths; 
            private java.util.List<RestItems> restItems; 

            private Builder() {
            } 

            private Builder(EntryRules model) {
                this.condition = model.condition;
                this.path = model.path;
                this.paths = model.paths;
                this.restItems = model.restItems;
            } 

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * paths.
             */
            public Builder paths(java.util.List<String> paths) {
                this.paths = paths;
                return this;
            }

            /**
             * restItems.
             */
            public Builder restItems(java.util.List<RestItems> restItems) {
                this.restItems = restItems;
                return this;
            }

            public EntryRules build() {
                return new EntryRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllSwimmingLaneResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.cond = builder.cond;
            this.name = builder.name;
            this.nameList = builder.nameList;
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
         * @return nameList
         */
        public java.util.List<String> getNameList() {
            return this.nameList;
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
            private java.util.List<String> nameList; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.cond = model.cond;
                this.name = model.name;
                this.nameList = model.nameList;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
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
             * NameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
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

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllSwimmingLaneResponseBody</p>
     */
    public static class RouteIndependentPercentageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Percentage")
        private String percentage;

        @com.aliyun.core.annotation.NameInMap("RouteId")
        private String routeId;

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
        public String getPercentage() {
            return this.percentage;
        }

        /**
         * @return routeId
         */
        public String getRouteId() {
            return this.routeId;
        }

        public static final class Builder {
            private String percentage; 
            private String routeId; 

            private Builder() {
            } 

            private Builder(RouteIndependentPercentageList model) {
                this.percentage = model.percentage;
                this.routeId = model.routeId;
            } 

            /**
             * Percentage.
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * RouteId.
             */
            public Builder routeId(String routeId) {
                this.routeId = routeId;
                return this;
            }

            public RouteIndependentPercentageList build() {
                return new RouteIndependentPercentageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllSwimmingLaneResponseBody</p>
     */
    public static class GatewaySwimmingLaneRoute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanaryModel")
        private Integer canaryModel;

        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private Integer percentage;

        @com.aliyun.core.annotation.NameInMap("RouteIdList")
        private java.util.List<Long> routeIdList;

        @com.aliyun.core.annotation.NameInMap("RouteIndependentPercentageEnable")
        private String routeIndependentPercentageEnable;

        @com.aliyun.core.annotation.NameInMap("RouteIndependentPercentageList")
        private java.util.List<RouteIndependentPercentageList> routeIndependentPercentageList;

        private GatewaySwimmingLaneRoute(Builder builder) {
            this.canaryModel = builder.canaryModel;
            this.condition = builder.condition;
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

        public static GatewaySwimmingLaneRoute create() {
            return builder().build();
        }

        /**
         * @return canaryModel
         */
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
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
        public java.util.List<Long> getRouteIdList() {
            return this.routeIdList;
        }

        /**
         * @return routeIndependentPercentageEnable
         */
        public String getRouteIndependentPercentageEnable() {
            return this.routeIndependentPercentageEnable;
        }

        /**
         * @return routeIndependentPercentageList
         */
        public java.util.List<RouteIndependentPercentageList> getRouteIndependentPercentageList() {
            return this.routeIndependentPercentageList;
        }

        public static final class Builder {
            private Integer canaryModel; 
            private String condition; 
            private java.util.List<Conditions> conditions; 
            private Long gatewayId; 
            private String gatewayUniqueId; 
            private Integer percentage; 
            private java.util.List<Long> routeIdList; 
            private String routeIndependentPercentageEnable; 
            private java.util.List<RouteIndependentPercentageList> routeIndependentPercentageList; 

            private Builder() {
            } 

            private Builder(GatewaySwimmingLaneRoute model) {
                this.canaryModel = model.canaryModel;
                this.condition = model.condition;
                this.conditions = model.conditions;
                this.gatewayId = model.gatewayId;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.percentage = model.percentage;
                this.routeIdList = model.routeIdList;
                this.routeIndependentPercentageEnable = model.routeIndependentPercentageEnable;
                this.routeIndependentPercentageList = model.routeIndependentPercentageList;
            } 

            /**
             * CanaryModel.
             */
            public Builder canaryModel(Integer canaryModel) {
                this.canaryModel = canaryModel;
                return this;
            }

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
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
             * Percentage.
             */
            public Builder percentage(Integer percentage) {
                this.percentage = percentage;
                return this;
            }

            /**
             * RouteIdList.
             */
            public Builder routeIdList(java.util.List<Long> routeIdList) {
                this.routeIdList = routeIdList;
                return this;
            }

            /**
             * RouteIndependentPercentageEnable.
             */
            public Builder routeIndependentPercentageEnable(String routeIndependentPercentageEnable) {
                this.routeIndependentPercentageEnable = routeIndependentPercentageEnable;
                return this;
            }

            /**
             * RouteIndependentPercentageList.
             */
            public Builder routeIndependentPercentageList(java.util.List<RouteIndependentPercentageList> routeIndependentPercentageList) {
                this.routeIndependentPercentageList = routeIndependentPercentageList;
                return this;
            }

            public GatewaySwimmingLaneRoute build() {
                return new GatewaySwimmingLaneRoute(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAllSwimmingLaneResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("EntryRules")
        private java.util.List<EntryRules> entryRules;

        @com.aliyun.core.annotation.NameInMap("GatewaySwimmingLaneRoute")
        private GatewaySwimmingLaneRoute gatewaySwimmingLaneRoute;

        @com.aliyun.core.annotation.NameInMap("GatewaySwimmingLaneRouteJson")
        private String gatewaySwimmingLaneRouteJson;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MessageQueueFilterSide")
        private String messageQueueFilterSide;

        @com.aliyun.core.annotation.NameInMap("MessageQueueGrayEnable")
        private Boolean messageQueueGrayEnable;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PathIndependentPercentageEnable")
        private Boolean pathIndependentPercentageEnable;

        @com.aliyun.core.annotation.NameInMap("RecordCanaryDetail")
        private Boolean recordCanaryDetail;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("enableRules")
        private Boolean enableRules;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        private Data(Builder builder) {
            this.enable = builder.enable;
            this.entryRules = builder.entryRules;
            this.gatewaySwimmingLaneRoute = builder.gatewaySwimmingLaneRoute;
            this.gatewaySwimmingLaneRouteJson = builder.gatewaySwimmingLaneRouteJson;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.messageQueueFilterSide = builder.messageQueueFilterSide;
            this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.pathIndependentPercentageEnable = builder.pathIndependentPercentageEnable;
            this.recordCanaryDetail = builder.recordCanaryDetail;
            this.regionId = builder.regionId;
            this.tag = builder.tag;
            this.userId = builder.userId;
            this.enableRules = builder.enableRules;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return entryRules
         */
        public java.util.List<EntryRules> getEntryRules() {
            return this.entryRules;
        }

        /**
         * @return gatewaySwimmingLaneRoute
         */
        public GatewaySwimmingLaneRoute getGatewaySwimmingLaneRoute() {
            return this.gatewaySwimmingLaneRoute;
        }

        /**
         * @return gatewaySwimmingLaneRouteJson
         */
        public String getGatewaySwimmingLaneRouteJson() {
            return this.gatewaySwimmingLaneRouteJson;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return messageQueueFilterSide
         */
        public String getMessageQueueFilterSide() {
            return this.messageQueueFilterSide;
        }

        /**
         * @return messageQueueGrayEnable
         */
        public Boolean getMessageQueueGrayEnable() {
            return this.messageQueueGrayEnable;
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
         * @return recordCanaryDetail
         */
        public Boolean getRecordCanaryDetail() {
            return this.recordCanaryDetail;
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return enableRules
         */
        public Boolean getEnableRules() {
            return this.enableRules;
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

        public static final class Builder {
            private String enable; 
            private java.util.List<EntryRules> entryRules; 
            private GatewaySwimmingLaneRoute gatewaySwimmingLaneRoute; 
            private String gatewaySwimmingLaneRouteJson; 
            private String groupId; 
            private Long id; 
            private String messageQueueFilterSide; 
            private Boolean messageQueueGrayEnable; 
            private String name; 
            private String namespace; 
            private Boolean pathIndependentPercentageEnable; 
            private Boolean recordCanaryDetail; 
            private String regionId; 
            private String tag; 
            private String userId; 
            private Boolean enableRules; 
            private String gmtCreate; 
            private String gmtModified; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enable = model.enable;
                this.entryRules = model.entryRules;
                this.gatewaySwimmingLaneRoute = model.gatewaySwimmingLaneRoute;
                this.gatewaySwimmingLaneRouteJson = model.gatewaySwimmingLaneRouteJson;
                this.groupId = model.groupId;
                this.id = model.id;
                this.messageQueueFilterSide = model.messageQueueFilterSide;
                this.messageQueueGrayEnable = model.messageQueueGrayEnable;
                this.name = model.name;
                this.namespace = model.namespace;
                this.pathIndependentPercentageEnable = model.pathIndependentPercentageEnable;
                this.recordCanaryDetail = model.recordCanaryDetail;
                this.regionId = model.regionId;
                this.tag = model.tag;
                this.userId = model.userId;
                this.enableRules = model.enableRules;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
            } 

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EntryRules.
             */
            public Builder entryRules(java.util.List<EntryRules> entryRules) {
                this.entryRules = entryRules;
                return this;
            }

            /**
             * GatewaySwimmingLaneRoute.
             */
            public Builder gatewaySwimmingLaneRoute(GatewaySwimmingLaneRoute gatewaySwimmingLaneRoute) {
                this.gatewaySwimmingLaneRoute = gatewaySwimmingLaneRoute;
                return this;
            }

            /**
             * GatewaySwimmingLaneRouteJson.
             */
            public Builder gatewaySwimmingLaneRouteJson(String gatewaySwimmingLaneRouteJson) {
                this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * MessageQueueFilterSide.
             */
            public Builder messageQueueFilterSide(String messageQueueFilterSide) {
                this.messageQueueFilterSide = messageQueueFilterSide;
                return this;
            }

            /**
             * MessageQueueGrayEnable.
             */
            public Builder messageQueueGrayEnable(Boolean messageQueueGrayEnable) {
                this.messageQueueGrayEnable = messageQueueGrayEnable;
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * PathIndependentPercentageEnable.
             */
            public Builder pathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
                this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
                return this;
            }

            /**
             * RecordCanaryDetail.
             */
            public Builder recordCanaryDetail(Boolean recordCanaryDetail) {
                this.recordCanaryDetail = recordCanaryDetail;
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
             * Tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * enableRules.
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
