// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGreyTagRouteResponseBody} extends {@link TeaModel}
 *
 * <p>ListGreyTagRouteResponseBody</p>
 */
public class ListGreyTagRouteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListGreyTagRouteResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGreyTagRouteResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * - **2xx**: The call was successful.
         * - **3xx**: The call was redirected.
         * - **4xx**: The call failed.
         * - **5xx**: A server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the canary release rule.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned error code. Valid values:
         * <p>
         * 
         * - If the call is successful, the **ErrorCode** parameter is not returned.
         * - If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned information. Valid values:
         * <p>
         * 
         * *   success: If the call is successful, **success** is returned.
         * *   An error code: If the call fails, an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the information of the change order was queried. Valid values:
         * <p>
         * 
         * - **true**: The information was queried.
         * - **false**: The information failed to be queried.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The trace ID that is used to query the details of the request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListGreyTagRouteResponseBody build() {
            return new ListGreyTagRouteResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Items(Builder builder) {
            this.cond = builder.cond;
            this.expr = builder.expr;
            this.index = builder.index;
            this.name = builder.name;
            this.operator = builder.operator;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
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
            private String expr; 
            private Integer index; 
            private String name; 
            private String operator; 
            private String type; 
            private String value; 

            /**
             * cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * expr.
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class AlbRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("ingressId")
        private String ingressId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        private AlbRules(Builder builder) {
            this.condition = builder.condition;
            this.ingressId = builder.ingressId;
            this.items = builder.items;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbRules create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return ingressId
         */
        public String getIngressId() {
            return this.ingressId;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String condition; 
            private String ingressId; 
            private java.util.List < Items> items; 
            private String serviceName; 

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * ingressId.
             */
            public Builder ingressId(String ingressId) {
                this.ingressId = ingressId;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public AlbRules build() {
                return new AlbRules(this);
            } 

        } 

    }
    public static class DubboRulesItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private DubboRulesItems(Builder builder) {
            this.cond = builder.cond;
            this.expr = builder.expr;
            this.index = builder.index;
            this.name = builder.name;
            this.operator = builder.operator;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DubboRulesItems create() {
            return builder().build();
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
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
            private String expr; 
            private Integer index; 
            private String name; 
            private String operator; 
            private String type; 
            private String value; 

            /**
             * The comparison operator. Valid values: **>**, **<**, **>=**, **<=**, **==**, and **! =**.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * The expression that is used to obtain the value of the parameter. The syntax of the expression must follow the standard of the SpEL. Valid values:
             * <p>
             * 
             * - **Empty**: obtains the value of the parameter.
             * - **.name**: obtains the name property of the parameter. This expression works the same way as args0.getName().
             * - **.isEnabled()**: obtains the enabled property of the parameter. This expression works the same way as args0.isEnabled().
             * - **[0]**: indicates that the value of the parameter is an array and obtains the first value of the array. This expression works the same way as args0[0]. This expression does not start with a period (.).
             * - **.get(0)**: indicates that the value of the parameter is a list and obtains the first value of the list. This expression works the same way as args0.get(0).
             * - **.get("key")**: indicates that the value of the parameter is a map and obtains the value of the key in the map. This expression works the same way as args0.get("key").  >  For more information about the expressions that are used to obtain parameter values, see  [Spring Expression Language (SpEL)](https://docs.spring.io/spring-integration/docs/current/reference/html/spel.html).
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * The index of the parameter. The value 0 indicates the first parameter.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * This parameter is not returned for Dubbo services.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The operator. Valid values:
             * <p>
             * 
             * - **rawvalue**: direct comparison.
             * - **list**: whitelist.
             * - **mod**: mods 100.
             * - **deterministic_proportional_steaming_division**: percentage.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * This parameter is not returned for Dubbo services.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the parameter. This value is compared with the value that is obtained based on the **expr** and **index** parameters.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DubboRulesItems build() {
                return new DubboRulesItems(this);
            } 

        } 

    }
    public static class DubboRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < DubboRulesItems> items;

        @com.aliyun.core.annotation.NameInMap("methodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private DubboRules(Builder builder) {
            this.condition = builder.condition;
            this.group = builder.group;
            this.items = builder.items;
            this.methodName = builder.methodName;
            this.serviceName = builder.serviceName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DubboRules create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return items
         */
        public java.util.List < DubboRulesItems> getItems() {
            return this.items;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String condition; 
            private String group; 
            private java.util.List < DubboRulesItems> items; 
            private String methodName; 
            private String serviceName; 
            private String version; 

            /**
             * The relationship between the conditions in the canary release rule. Valid values:
             * <p>
             * 
             * - **AND**: The conditions are in the logical AND relation. All conditions must be met at the same time.
             * - **OR**: The conditions are in the logical OR relation. At least one of the conditions must be met.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * The group of the Dubbo service that corresponds to the canary release rule.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The conditions.
             */
            public Builder items(java.util.List < DubboRulesItems> items) {
                this.items = items;
                return this;
            }

            /**
             * The method name of the Dubbo service.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * The name of the Dubbo service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The version of the Dubbo service.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DubboRules build() {
                return new DubboRules(this);
            } 

        } 

    }
    public static class ScRulesItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ScRulesItems(Builder builder) {
            this.cond = builder.cond;
            this.expr = builder.expr;
            this.index = builder.index;
            this.name = builder.name;
            this.operator = builder.operator;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScRulesItems create() {
            return builder().build();
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
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
            private String expr; 
            private Integer index; 
            private String name; 
            private String operator; 
            private String type; 
            private String value; 

            /**
             * The comparison operator. Valid values: **>**, **<**, **>=**, **<=**, **==**, and **! =**.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * This parameter is not returned for Spring Cloud applications.
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * This parameter is not returned for Spring Cloud applications.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * The operator. Valid values:
             * <p>
             * 
             * *   **rawvalue**: direct comparison.
             * *   **list**: whitelist.
             * *   **mod**: mods 100.
             * *   **deterministic_proportional_steaming_division**: percentage.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The type of the comparison. Valid values:
             * <p>
             * 
             * *   **param**: parameter
             * *   **cookie**: cookie
             * *   **header**: header
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the parameter. This value is compared with the value that is obtained based on the **type** and **name** parameters.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ScRulesItems build() {
                return new ScRulesItems(this);
            } 

        } 

    }
    public static class ScRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < ScRulesItems> items;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private ScRules(Builder builder) {
            this.condition = builder.condition;
            this.items = builder.items;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScRules create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return items
         */
        public java.util.List < ScRulesItems> getItems() {
            return this.items;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String condition; 
            private java.util.List < ScRulesItems> items; 
            private String path; 

            /**
             * The relationship between the conditions in the canary release rule. Valid values:
             * <p>
             * 
             * *   **AND**: The conditions are in the logical AND relation. All conditions must be met at the same time.
             * *   **OR**: The conditions are in the logical OR relation. At least one of the conditions must be met.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * The conditions.
             */
            public Builder items(java.util.List < ScRulesItems> items) {
                this.items = items;
                return this;
            }

            /**
             * The path of the canary release rule of the Spring Cloud application.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ScRules build() {
                return new ScRules(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbRules")
        private java.util.List < AlbRules> albRules;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DubboRules")
        private java.util.List < DubboRules> dubboRules;

        @com.aliyun.core.annotation.NameInMap("GreyTagRouteId")
        private Long greyTagRouteId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScRules")
        private java.util.List < ScRules> scRules;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.albRules = builder.albRules;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.dubboRules = builder.dubboRules;
            this.greyTagRouteId = builder.greyTagRouteId;
            this.name = builder.name;
            this.scRules = builder.scRules;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return albRules
         */
        public java.util.List < AlbRules> getAlbRules() {
            return this.albRules;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dubboRules
         */
        public java.util.List < DubboRules> getDubboRules() {
            return this.dubboRules;
        }

        /**
         * @return greyTagRouteId
         */
        public Long getGreyTagRouteId() {
            return this.greyTagRouteId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scRules
         */
        public java.util.List < ScRules> getScRules() {
            return this.scRules;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < AlbRules> albRules; 
            private Long createTime; 
            private String description; 
            private java.util.List < DubboRules> dubboRules; 
            private Long greyTagRouteId; 
            private String name; 
            private java.util.List < ScRules> scRules; 
            private Long updateTime; 

            /**
             * AlbRules.
             */
            public Builder albRules(java.util.List < AlbRules> albRules) {
                this.albRules = albRules;
                return this;
            }

            /**
             * The timestamp when the canary release rule was created. Unit: milliseconds.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the canary release rule.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The canary release rule of the Dubbo service.
             */
            public Builder dubboRules(java.util.List < DubboRules> dubboRules) {
                this.dubboRules = dubboRules;
                return this;
            }

            /**
             * The ID of the canary release rule.
             */
            public Builder greyTagRouteId(Long greyTagRouteId) {
                this.greyTagRouteId = greyTagRouteId;
                return this;
            }

            /**
             * The name of the canary release rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The canary release rule of the Spring Cloud application.
             */
            public Builder scRules(java.util.List < ScRules> scRules) {
                this.scRules = scRules;
                return this;
            }

            /**
             * The timestamp when the canary release rule was updated. Unit: milliseconds.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Long totalSize; 

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned on each page. Valid value: **1**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The returned result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The total number of canary release rules. Valid value: **1**.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
