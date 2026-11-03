// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGreyTagRouteResponseBody</p>
 */
public class DescribeGreyTagRouteResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeGreyTagRouteResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The status code of the API call or a POP error code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: The request is successful.</p>
         * </li>
         * <li><p><strong>3xx</strong>: The request is redirected.</p>
         * </li>
         * <li><p><strong>4xx</strong>: A client-side error occurred.</p>
         * </li>
         * <li><p><strong>5xx</strong>: A server-side error occurred.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the canary rule.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li><p>This parameter is not returned if the request is successful.</p>
         * </li>
         * <li><p>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.NotEmpty</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message that indicates the result of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9D29CBD0-45D3-410B-9826-52F86F90****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID for querying the details of a call.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeGreyTagRouteResponseBody build() {
            return new DescribeGreyTagRouteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGreyTagRouteResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.cond = model.cond;
                this.expr = model.expr;
                this.index = model.index;
                this.name = model.name;
                this.operator = model.operator;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Currently supports ==.</p>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * <p>Not required for ALB applications.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>Not required for ALB applications.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The name of the element to match, such as a header or cookie name. This parameter is not used if type is set to sourceIp.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The matching operator. Only <strong>rawvalue</strong> is supported, which indicates a direct comparison.</p>
             * 
             * <strong>example:</strong>
             * <p>rawvalue</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The type of request element to match against. Valid values:</p>
             * <ul>
             * <li><p><strong>sourceIp</strong>: The source IP address.</p>
             * </li>
             * <li><p><strong>cookie</strong>: A cookie.</p>
             * </li>
             * <li><p><strong>header</strong>: A request header.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cookie</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value to match. This value is compared with the actual value of the element specified by <strong>type</strong> and <strong>name</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGreyTagRouteResponseBody</p>
     */
    public static class AlbRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("ingressId")
        private String ingressId;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        private AlbRules(Builder builder) {
            this.condition = builder.condition;
            this.ingressId = builder.ingressId;
            this.items = builder.items;
            this.serviceId = builder.serviceId;
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
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        public static final class Builder {
            private String condition; 
            private String ingressId; 
            private java.util.List<Items> items; 
            private String serviceId; 

            private Builder() {
            } 

            private Builder(AlbRules model) {
                this.condition = model.condition;
                this.ingressId = model.ingressId;
                this.items = model.items;
                this.serviceId = model.serviceId;
            } 

            /**
             * <p>The relationship between the conditions in the canary rule. Only <strong>AND</strong> is supported, which indicates that all conditions must be met.</p>
             * 
             * <strong>example:</strong>
             * <p>AND</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The ID of the Ingress.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder ingressId(String ingressId) {
                this.ingressId = ingressId;
                return this;
            }

            /**
             * <p>The list of conditions.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The routing service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            public AlbRules build() {
                return new AlbRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGreyTagRouteResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DubboRulesItems model) {
                this.cond = model.cond;
                this.expr = model.expr;
                this.index = model.index;
                this.name = model.name;
                this.operator = model.operator;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The comparison operator. Valid values are <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>!=</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * <p>The expression that is used to obtain the parameter value. Valid values:</p>
             * <ul>
             * <li><p><strong>Leave empty</strong>: If left empty, the value of the parameter itself is used.</p>
             * </li>
             * <li><p><strong>.name</strong>: Obtains the value of the <code>name</code> attribute of the parameter. This is equivalent to <code>args0.getName()</code>.</p>
             * </li>
             * <li><p><strong>.isEnabled()</strong>: Obtains the value of the <code>enabled</code> attribute of the parameter. This is equivalent to <code>args0.isEnabled()</code>.</p>
             * </li>
             * <li><p><strong>[0]</strong>: The parameter must be an array. This expression obtains the first value of the array, which is equivalent to <code>args0[0]</code>. Note that the expression does not start with a period (.).</p>
             * </li>
             * <li><p><strong>.get(0)</strong>: The parameter must be a list. This expression obtains the first value of the list, which is equivalent to <code>args0.get(0)</code>.</p>
             * </li>
             * <li><p><strong>.get(&quot;key&quot;)</strong>: The parameter must be a map. This expression obtains the value that corresponds to a key. This is equivalent to <code>args0.get(&quot;key&quot;)</code>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>.name</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>The parameter index. <code>0</code> indicates the first parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Not used in Dubbo services.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The matching operator. Valid values:</p>
             * <ul>
             * <li><p><strong>rawvalue</strong>: Performs a direct comparison.</p>
             * </li>
             * <li><p><strong>list</strong>: Matches against an allowlist of values.</p>
             * </li>
             * <li><p><strong>mod</strong>: Calculates the remainder of a division by 100.</p>
             * </li>
             * <li><p><strong>deterministic_proportional_steaming_division</strong>: Performs a percentage-based match.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rawvalue</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>Not used in Dubbo services.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value to match. This value is compared with the actual value retrieved by using the specified <strong>expr</strong> and <strong>index</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGreyTagRouteResponseBody</p>
     */
    public static class DubboRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<DubboRulesItems> items;

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
        public java.util.List<DubboRulesItems> getItems() {
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
            private java.util.List<DubboRulesItems> items; 
            private String methodName; 
            private String serviceName; 
            private String version; 

            private Builder() {
            } 

            private Builder(DubboRules model) {
                this.condition = model.condition;
                this.group = model.group;
                this.items = model.items;
                this.methodName = model.methodName;
                this.serviceName = model.serviceName;
                this.version = model.version;
            } 

            /**
             * <p>The relationship between the conditions in the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>AND</strong>: All conditions must be met.</p>
             * </li>
             * <li><p><strong>OR</strong>: At least one condition must be met.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OR</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The service group to which the canary rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>DUBBO</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The list of conditions.</p>
             */
            public Builder items(java.util.List<DubboRulesItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The method name of the Dubbo service.</p>
             * 
             * <strong>example:</strong>
             * <p>echo</p>
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * <p>The Dubbo service name.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibaba.edas.boot.EchoService</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The Dubbo service version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
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
    /**
     * 
     * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGreyTagRouteResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ScRulesItems model) {
                this.cond = model.cond;
                this.expr = model.expr;
                this.index = model.index;
                this.name = model.name;
                this.operator = model.operator;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The comparison operator. Valid values are <strong>&gt;</strong>, <strong>&lt;**, **&gt;=</strong>, <strong>&lt;=</strong>, <strong>==</strong>, and <strong>!=</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>==</p>
             */
            public Builder cond(String cond) {
                this.cond = cond;
                return this;
            }

            /**
             * <p>Not used in Spring Cloud applications.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder expr(String expr) {
                this.expr = expr;
                return this;
            }

            /**
             * <p>Not used in Spring Cloud applications.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The name of the element to match, as specified by the type parameter. For example, a header name or cookie name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The matching operator. Valid values:</p>
             * <ul>
             * <li><p><strong>rawvalue</strong>: Performs a direct comparison.</p>
             * </li>
             * <li><p><strong>list</strong>: Matches against an allowlist of values.</p>
             * </li>
             * <li><p><strong>mod</strong>: Calculates the remainder of a division by 100.</p>
             * </li>
             * <li><p><strong>deterministic_proportional_steaming_division</strong>: Performs a percentage-based match.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rawvalue</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The type of request element to match against. Valid values:</p>
             * <ul>
             * <li><p><strong>param</strong>: A request parameter.</p>
             * </li>
             * <li><p><strong>cookie</strong>: A cookie.</p>
             * </li>
             * <li><p><strong>header</strong>: A request header.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cookie</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value to match. This value is compared with the actual value of the element specified by <strong>type</strong> and <strong>name</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    /**
     * 
     * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGreyTagRouteResponseBody</p>
     */
    public static class ScRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<ScRulesItems> items;

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
        public java.util.List<ScRulesItems> getItems() {
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
            private java.util.List<ScRulesItems> items; 
            private String path; 

            private Builder() {
            } 

            private Builder(ScRules model) {
                this.condition = model.condition;
                this.items = model.items;
                this.path = model.path;
            } 

            /**
             * <p>The relationship between the conditions in the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>AND</strong>: All conditions must be met.</p>
             * </li>
             * <li><p><strong>OR</strong>: At least one condition must be met.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OR</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>The list of conditions.</p>
             */
            public Builder items(java.util.List<ScRulesItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The path to which the rule applies.</p>
             * 
             * <strong>example:</strong>
             * <p>/path</p>
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
    /**
     * 
     * {@link DescribeGreyTagRouteResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGreyTagRouteResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbRules")
        private java.util.List<AlbRules> albRules;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DubboRules")
        private java.util.List<DubboRules> dubboRules;

        @com.aliyun.core.annotation.NameInMap("GreyTagRouteId")
        private Long greyTagRouteId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ScRules")
        private java.util.List<ScRules> scRules;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.albRules = builder.albRules;
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
         * @return albRules
         */
        public java.util.List<AlbRules> getAlbRules() {
            return this.albRules;
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
        public java.util.List<DubboRules> getDubboRules() {
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
        public java.util.List<ScRules> getScRules() {
            return this.scRules;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List<AlbRules> albRules; 
            private String appId; 
            private Long createTime; 
            private String description; 
            private java.util.List<DubboRules> dubboRules; 
            private Long greyTagRouteId; 
            private String name; 
            private java.util.List<ScRules> scRules; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.albRules = model.albRules;
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.dubboRules = model.dubboRules;
                this.greyTagRouteId = model.greyTagRouteId;
                this.name = model.name;
                this.scRules = model.scRules;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The canary rules for the Application Load Balancer (ALB) instance.</p>
             */
            public Builder albRules(java.util.List<AlbRules> albRules) {
                this.albRules = albRules;
                return this;
            }

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3faaf993-7aed-4bcd-b189-625e6a5a****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The creation timestamp of the rule, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1619007592013</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the canary rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The canary rules for the Dubbo service.</p>
             */
            public Builder dubboRules(java.util.List<DubboRules> dubboRules) {
                this.dubboRules = dubboRules;
                return this;
            }

            /**
             * <p>The globally unique ID of the canary rule.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder greyTagRouteId(Long greyTagRouteId) {
                this.greyTagRouteId = greyTagRouteId;
                return this;
            }

            /**
             * <p>The name of the canary rule.</p>
             * 
             * <strong>example:</strong>
             * <p>rule-name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The canary rules for the Spring Cloud application.</p>
             */
            public Builder scRules(java.util.List<ScRules> scRules) {
                this.scRules = scRules;
                return this;
            }

            /**
             * <p>The timestamp of the rule\&quot;s last update, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1609434061000</p>
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
