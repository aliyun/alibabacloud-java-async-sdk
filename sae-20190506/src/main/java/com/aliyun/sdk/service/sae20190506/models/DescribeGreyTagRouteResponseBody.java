// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGreyTagRouteResponseBody</p>
 */
public class DescribeGreyTagRouteResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeGreyTagRouteResponseBody(Builder builder) {
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

    public static DescribeGreyTagRouteResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeGreyTagRouteResponseBody build() {
            return new DescribeGreyTagRouteResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("cond")
        private String cond;

        @NameInMap("expr")
        private String expr;

        @NameInMap("index")
        private Integer index;

        @NameInMap("name")
        private String name;

        @NameInMap("operator")
        private String operator;

        @NameInMap("type")
        private String type;

        @NameInMap("value")
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
             * abandon
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
             * abandon
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
    public static class DubboRules extends TeaModel {
        @NameInMap("condition")
        private String condition;

        @NameInMap("group")
        private String group;

        @NameInMap("items")
        private java.util.List < Items> items;

        @NameInMap("methodName")
        private String methodName;

        @NameInMap("serviceName")
        private String serviceName;

        @NameInMap("version")
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
        public java.util.List < Items> getItems() {
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
            private java.util.List < Items> items; 
            private String methodName; 
            private String serviceName; 
            private String version; 

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
             * items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
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
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * version.
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
        @NameInMap("cond")
        private String cond;

        @NameInMap("expr")
        private String expr;

        @NameInMap("index")
        private Integer index;

        @NameInMap("name")
        private String name;

        @NameInMap("operator")
        private String operator;

        @NameInMap("type")
        private String type;

        @NameInMap("value")
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
             * cond.
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * abandon
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * abandon
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * abandon
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
             * abandon
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

            public ScRulesItems build() {
                return new ScRulesItems(this);
            } 

        } 

    }
    public static class ScRules extends TeaModel {
        @NameInMap("condition")
        private String condition;

        @NameInMap("items")
        private java.util.List < ScRulesItems> items;

        @NameInMap("path")
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
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * items.
             */
            public Builder items(java.util.List < ScRulesItems> items) {
                this.items = items;
                return this;
            }

            /**
             * path.
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
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DubboRules")
        private java.util.List < DubboRules> dubboRules;

        @NameInMap("GreyTagRouteId")
        private Long greyTagRouteId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ScRules")
        private java.util.List < ScRules> scRules;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.appId = builder.appId;
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

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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
            private String appId; 
            private Long createTime; 
            private String description; 
            private java.util.List < DubboRules> dubboRules; 
            private Long greyTagRouteId; 
            private String name; 
            private java.util.List < ScRules> scRules; 
            private Long updateTime; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DubboRules.
             */
            public Builder dubboRules(java.util.List < DubboRules> dubboRules) {
                this.dubboRules = dubboRules;
                return this;
            }

            /**
             * GreyTagRouteId.
             */
            public Builder greyTagRouteId(Long greyTagRouteId) {
                this.greyTagRouteId = greyTagRouteId;
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
             * ScRules.
             */
            public Builder scRules(java.util.List < ScRules> scRules) {
                this.scRules = scRules;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
