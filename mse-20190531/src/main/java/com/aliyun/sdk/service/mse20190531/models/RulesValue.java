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
 * {@link RulesValue} extends {@link TeaModel}
 *
 * <p>RulesValue</p>
 */
public class RulesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("Rate")
    private Integer rate;

    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("InstanceNum")
    private Integer instanceNum;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    private RulesValue(Builder builder) {
        this.status = builder.status;
        this.rate = builder.rate;
        this.enable = builder.enable;
        this.tag = builder.tag;
        this.name = builder.name;
        this.id = builder.id;
        this.instanceNum = builder.instanceNum;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RulesValue create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return rate
     */
    public Integer getRate() {
        return this.rate;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return rules
     */
    public Rules getRules() {
        return this.rules;
    }

    public static final class Builder {
        private Integer status; 
        private Integer rate; 
        private Boolean enable; 
        private String tag; 
        private String name; 
        private Long id; 
        private Integer instanceNum; 
        private Rules rules; 

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.status = status;
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
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * InstanceNum.
         */
        public Builder instanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        public RulesValue build() {
            return new RulesValue(this);
        } 

    } 

    /**
     * 
     * {@link RulesValue} extends {@link TeaModel}
     *
     * <p>RulesValue</p>
     */
    public static class RestItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("datum")
        private String datum;

        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("divisor")
        private Integer divisor;

        @com.aliyun.core.annotation.NameInMap("remainder")
        private Integer remainder;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private RestItems(Builder builder) {
            this.datum = builder.datum;
            this.operator = builder.operator;
            this.nameList = builder.nameList;
            this.cond = builder.cond;
            this.divisor = builder.divisor;
            this.remainder = builder.remainder;
            this.rate = builder.rate;
            this.type = builder.type;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestItems create() {
            return builder().build();
        }

        /**
         * @return datum
         */
        public String getDatum() {
            return this.datum;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return nameList
         */
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return divisor
         */
        public Integer getDivisor() {
            return this.divisor;
        }

        /**
         * @return remainder
         */
        public Integer getRemainder() {
            return this.remainder;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String datum; 
            private String operator; 
            private java.util.List<String> nameList; 
            private String cond; 
            private Integer divisor; 
            private Integer remainder; 
            private Integer rate; 
            private String type; 
            private String name; 
            private Object value; 

            /**
             * datum.
             */
            public Builder datum(String datum) {
                this.datum = datum;
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
             * nameList.
             */
            public Builder nameList(java.util.List<String> nameList) {
                this.nameList = nameList;
                return this;
            }

            /**
             * cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
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
             * remainder.
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
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
             * value.
             */
            public Builder value(Object value) {
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
     * {@link RulesValue} extends {@link TeaModel}
     *
     * <p>RulesValue</p>
     */
    public static class Springcloud extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("restItems")
        private java.util.List<RestItems> restItems;

        @com.aliyun.core.annotation.NameInMap("triggerPolicy")
        private String triggerPolicy;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("paths")
        private java.util.List<String> paths;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        private Springcloud(Builder builder) {
            this.condition = builder.condition;
            this.restItems = builder.restItems;
            this.triggerPolicy = builder.triggerPolicy;
            this.enable = builder.enable;
            this.appId = builder.appId;
            this.priority = builder.priority;
            this.tags = builder.tags;
            this.paths = builder.paths;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Springcloud create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return restItems
         */
        public java.util.List<RestItems> getRestItems() {
            return this.restItems;
        }

        /**
         * @return triggerPolicy
         */
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return paths
         */
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String condition; 
            private java.util.List<RestItems> restItems; 
            private String triggerPolicy; 
            private Boolean enable; 
            private String appId; 
            private Integer priority; 
            private java.util.List<String> tags; 
            private java.util.List<String> paths; 
            private String path; 

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * restItems.
             */
            public Builder restItems(java.util.List<RestItems> restItems) {
                this.restItems = restItems;
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
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
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
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public Springcloud build() {
                return new Springcloud(this);
            } 

        } 

    }
    /**
     * 
     * {@link RulesValue} extends {@link TeaModel}
     *
     * <p>RulesValue</p>
     */
    public static class ArgumentItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("nameList")
        private java.util.List<String> nameList;

        @com.aliyun.core.annotation.NameInMap("datum")
        private String datum;

        @com.aliyun.core.annotation.NameInMap("cond")
        private String cond;

        @com.aliyun.core.annotation.NameInMap("divisor")
        private Integer divisor;

        @com.aliyun.core.annotation.NameInMap("remainder")
        private Integer remainder;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Integer rate;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("expr")
        private String expr;

        @com.aliyun.core.annotation.NameInMap("value")
        private Object value;

        private ArgumentItems(Builder builder) {
            this.operator = builder.operator;
            this.nameList = builder.nameList;
            this.datum = builder.datum;
            this.cond = builder.cond;
            this.divisor = builder.divisor;
            this.remainder = builder.remainder;
            this.rate = builder.rate;
            this.index = builder.index;
            this.expr = builder.expr;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArgumentItems create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return nameList
         */
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        /**
         * @return datum
         */
        public String getDatum() {
            return this.datum;
        }

        /**
         * @return cond
         */
        public String getCond() {
            return this.cond;
        }

        /**
         * @return divisor
         */
        public Integer getDivisor() {
            return this.divisor;
        }

        /**
         * @return remainder
         */
        public Integer getRemainder() {
            return this.remainder;
        }

        /**
         * @return rate
         */
        public Integer getRate() {
            return this.rate;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return expr
         */
        public String getExpr() {
            return this.expr;
        }

        /**
         * @return value
         */
        public Object getValue() {
            return this.value;
        }

        public static final class Builder {
            private String operator; 
            private java.util.List<String> nameList; 
            private String datum; 
            private String cond; 
            private Integer divisor; 
            private Integer remainder; 
            private Integer rate; 
            private Integer index; 
            private String expr; 
            private Object value; 

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
             * datum.
             */
            public Builder datum(String datum) {
                this.datum = datum;
                return this;
            }

            /**
             * cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
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
             * remainder.
             */
            public Builder remainder(Integer remainder) {
                this.remainder = remainder;
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
             * index.
             */
            public Builder index(Integer index) {
                this.index = index;
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
             * value.
             */
            public Builder value(Object value) {
                this.value = value;
                return this;
            }

            public ArgumentItems build() {
                return new ArgumentItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link RulesValue} extends {@link TeaModel}
     *
     * <p>RulesValue</p>
     */
    public static class Dubbo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("triggerPolicy")
        private String triggerPolicy;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("methodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("paramTypes")
        private java.util.List<String> paramTypes;

        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("argumentItems")
        private java.util.List<ArgumentItems> argumentItems;

        private Dubbo(Builder builder) {
            this.appId = builder.appId;
            this.tags = builder.tags;
            this.triggerPolicy = builder.triggerPolicy;
            this.serviceName = builder.serviceName;
            this.group = builder.group;
            this.version = builder.version;
            this.methodName = builder.methodName;
            this.paramTypes = builder.paramTypes;
            this.condition = builder.condition;
            this.argumentItems = builder.argumentItems;
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
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        /**
         * @return triggerPolicy
         */
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
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
        public java.util.List<String> getParamTypes() {
            return this.paramTypes;
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return argumentItems
         */
        public java.util.List<ArgumentItems> getArgumentItems() {
            return this.argumentItems;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List<String> tags; 
            private String triggerPolicy; 
            private String serviceName; 
            private String group; 
            private String version; 
            private String methodName; 
            private java.util.List<String> paramTypes; 
            private String condition; 
            private java.util.List<ArgumentItems> argumentItems; 

            /**
             * appId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
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
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
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
             * version.
             */
            public Builder version(String version) {
                this.version = version;
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
            public Builder paramTypes(java.util.List<String> paramTypes) {
                this.paramTypes = paramTypes;
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
             * argumentItems.
             */
            public Builder argumentItems(java.util.List<ArgumentItems> argumentItems) {
                this.argumentItems = argumentItems;
                return this;
            }

            public Dubbo build() {
                return new Dubbo(this);
            } 

        } 

    }
    /**
     * 
     * {@link RulesValue} extends {@link TeaModel}
     *
     * <p>RulesValue</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("springcloud")
        private java.util.List<Springcloud> springcloud;

        @com.aliyun.core.annotation.NameInMap("dubbo")
        private java.util.List<Dubbo> dubbo;

        private Rules(Builder builder) {
            this.springcloud = builder.springcloud;
            this.dubbo = builder.dubbo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return springcloud
         */
        public java.util.List<Springcloud> getSpringcloud() {
            return this.springcloud;
        }

        /**
         * @return dubbo
         */
        public java.util.List<Dubbo> getDubbo() {
            return this.dubbo;
        }

        public static final class Builder {
            private java.util.List<Springcloud> springcloud; 
            private java.util.List<Dubbo> dubbo; 

            /**
             * springcloud.
             */
            public Builder springcloud(java.util.List<Springcloud> springcloud) {
                this.springcloud = springcloud;
                return this;
            }

            /**
             * dubbo.
             */
            public Builder dubbo(java.util.List<Dubbo> dubbo) {
                this.dubbo = dubbo;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
