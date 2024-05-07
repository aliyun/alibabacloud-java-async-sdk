// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationsWithTagRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationsWithTagRulesResponseBody</p>
 */
public class ListApplicationsWithTagRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListApplicationsWithTagRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationsWithTagRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   If the request is successful, a success message is returned.
         * *   If the request fails, an error message is returned.
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListApplicationsWithTagRulesResponseBody build() {
            return new ListApplicationsWithTagRulesResponseBody(this);
        } 

    } 

    public static class ArgumentItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("datum")
        private String datum;

        @com.aliyun.core.annotation.NameInMap("divisor")
        private Integer divisor;

        @com.aliyun.core.annotation.NameInMap("expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List < String > nameList;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("remainder")
        private Integer remainder;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ArgumentItems(Builder builder) {
            this.cond = builder.cond;
            this.datum = builder.datum;
            this.divisor = builder.divisor;
            this.expr = builder.expr;
            this.index = builder.index;
            this.nameList = builder.nameList;
            this.operator = builder.operator;
            this.rate = builder.rate;
            this.remainder = builder.remainder;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArgumentItems create() {
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String cond; 
            private String datum; 
            private Integer divisor; 
            private String expr; 
            private Integer index; 
            private java.util.List < String > nameList; 
            private String operator; 
            private Integer rate; 
            private Integer remainder; 
            private String value; 

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
             * nameList.
             */
            public Builder nameList(java.util.List < String > nameList) {
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
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ArgumentItems build() {
                return new ArgumentItems(this);
            } 

        } 

    }
    public static class Dubbo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("argumentItems")
        private java.util.List < ArgumentItems> argumentItems;

        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("methodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("paramTypes")
        private java.util.List < String > paramTypes;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < String > tags;

        @com.aliyun.core.annotation.NameInMap("triggerPolicy")
        private String triggerPolicy;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Dubbo(Builder builder) {
            this.appId = builder.appId;
            this.argumentItems = builder.argumentItems;
            this.condition = builder.condition;
            this.group = builder.group;
            this.methodName = builder.methodName;
            this.paramTypes = builder.paramTypes;
            this.serviceName = builder.serviceName;
            this.tags = builder.tags;
            this.triggerPolicy = builder.triggerPolicy;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dubbo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return argumentItems
         */
        public java.util.List < ArgumentItems> getArgumentItems() {
            return this.argumentItems;
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
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return paramTypes
         */
        public java.util.List < String > getParamTypes() {
            return this.paramTypes;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return triggerPolicy
         */
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List < ArgumentItems> argumentItems; 
            private String condition; 
            private String group; 
            private String methodName; 
            private java.util.List < String > paramTypes; 
            private String serviceName; 
            private java.util.List < String > tags; 
            private String triggerPolicy; 
            private String version; 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * argumentItems.
             */
            public Builder argumentItems(java.util.List < ArgumentItems> argumentItems) {
                this.argumentItems = argumentItems;
                return this;
            }

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * methodName.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * paramTypes.
             */
            public Builder paramTypes(java.util.List < String > paramTypes) {
                this.paramTypes = paramTypes;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * triggerPolicy.
             */
            public Builder triggerPolicy(String triggerPolicy) {
                this.triggerPolicy = triggerPolicy;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Dubbo build() {
                return new Dubbo(this);
            } 

        } 

    }
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
        private java.util.List < String > nameList;

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
            public Builder nameList(java.util.List < String > nameList) {
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
    public static class Springcloud extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List < String > paths;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("restItems")
        private java.util.List < RestItems> restItems;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < String > tags;

        @com.aliyun.core.annotation.NameInMap("triggerPolicy")
        private String triggerPolicy;

        private Springcloud(Builder builder) {
            this.appId = builder.appId;
            this.condition = builder.condition;
            this.enable = builder.enable;
            this.path = builder.path;
            this.paths = builder.paths;
            this.priority = builder.priority;
            this.restItems = builder.restItems;
            this.tags = builder.tags;
            this.triggerPolicy = builder.triggerPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Springcloud create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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

        /**
         * @return tags
         */
        public java.util.List < String > getTags() {
            return this.tags;
        }

        /**
         * @return triggerPolicy
         */
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        public static final class Builder {
            private String appId; 
            private String condition; 
            private Boolean enable; 
            private String path; 
            private java.util.List < String > paths; 
            private Integer priority; 
            private java.util.List < RestItems> restItems; 
            private java.util.List < String > tags; 
            private String triggerPolicy; 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
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
            public Builder paths(java.util.List < String > paths) {
                this.paths = paths;
                return this;
            }

            /**
             * priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * restItems.
             */
            public Builder restItems(java.util.List < RestItems> restItems) {
                this.restItems = restItems;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List < String > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * triggerPolicy.
             */
            public Builder triggerPolicy(String triggerPolicy) {
                this.triggerPolicy = triggerPolicy;
                return this;
            }

            public Springcloud build() {
                return new Springcloud(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dubbo")
        private java.util.List < Dubbo> dubbo;

        @com.aliyun.core.annotation.NameInMap("springcloud")
        private java.util.List < Springcloud> springcloud;

        private Rules(Builder builder) {
            this.dubbo = builder.dubbo;
            this.springcloud = builder.springcloud;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return dubbo
         */
        public java.util.List < Dubbo> getDubbo() {
            return this.dubbo;
        }

        /**
         * @return springcloud
         */
        public java.util.List < Springcloud> getSpringcloud() {
            return this.springcloud;
        }

        public static final class Builder {
            private java.util.List < Dubbo> dubbo; 
            private java.util.List < Springcloud> springcloud; 

            /**
             * dubbo.
             */
            public Builder dubbo(java.util.List < Dubbo> dubbo) {
                this.dubbo = dubbo;
                return this;
            }

            /**
             * springcloud.
             */
            public Builder springcloud(java.util.List < Springcloud> springcloud) {
                this.springcloud = springcloud;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class RouteRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceNum")
        private Integer instanceNum;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private RouteRules(Builder builder) {
            this.enable = builder.enable;
            this.id = builder.id;
            this.instanceNum = builder.instanceNum;
            this.name = builder.name;
            this.rate = builder.rate;
            this.rules = builder.rules;
            this.status = builder.status;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteRules create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
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

        public static final class Builder {
            private Boolean enable; 
            private Long id; 
            private Integer instanceNum; 
            private String name; 
            private Integer rate; 
            private Rules rules; 
            private Integer status; 
            private String tag; 

            /**
             * Indicates whether the alert rule is enabled. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The rule ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * The rule name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * The details of the routing rule.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The tag.
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public RouteRules build() {
                return new RouteRules(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RouteRules")
        private java.util.List < RouteRules> routeRules;

        @com.aliyun.core.annotation.NameInMap("RouteStatus")
        private Long routeStatus;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.namespace = builder.namespace;
            this.routeRules = builder.routeRules;
            this.routeStatus = builder.routeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return routeRules
         */
        public java.util.List < RouteRules> getRouteRules() {
            return this.routeRules;
        }

        /**
         * @return routeStatus
         */
        public Long getRouteStatus() {
            return this.routeStatus;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String namespace; 
            private java.util.List < RouteRules> routeRules; 
            private Long routeStatus; 

            /**
             * The application ID.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The application name.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The MSE namespace to which the application belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The queried rules.
             */
            public Builder routeRules(java.util.List < RouteRules> routeRules) {
                this.routeRules = routeRules;
                return this;
            }

            /**
             * The route state. Valid values:
             * <p>
             * 
             * *   0: disabled
             * *   1: enabled
             */
            public Builder routeStatus(Long routeStatus) {
                this.routeStatus = routeStatus;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
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
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The returned data.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
