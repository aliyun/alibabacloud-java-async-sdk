// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteRuleListResponseBody</p>
 */
public class DescribeWhiteRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeWhiteRuleListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteRuleListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeWhiteRuleListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
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
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeWhiteRuleListResponseBody build() {
            return new DescribeWhiteRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteRuleListResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteRuleListResponseBody</p>
     */
    public static class Left extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsVar")
        private Boolean isVar;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierParam")
        private java.util.Map<String, ?> modifierParam;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Left(Builder builder) {
            this.isVar = builder.isVar;
            this.modifier = builder.modifier;
            this.modifierParam = builder.modifierParam;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Left create() {
            return builder().build();
        }

        /**
         * @return isVar
         */
        public Boolean getIsVar() {
            return this.isVar;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierParam
         */
        public java.util.Map<String, ?> getModifierParam() {
            return this.modifierParam;
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
            private Boolean isVar; 
            private String modifier; 
            private java.util.Map<String, ?> modifierParam; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Left model) {
                this.isVar = model.isVar;
                this.modifier = model.modifier;
                this.modifierParam = model.modifierParam;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the left operand is a variable. Valid values:</p>
             * <ul>
             * <li>true: variable.</li>
             * <li>false: constant.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isVar(Boolean isVar) {
                this.isVar = isVar;
                return this;
            }

            /**
             * <p>The remarks on the right operand.</p>
             * 
             * <strong>example:</strong>
             * <p>length</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The key-value pair information of the remarks.</p>
             */
            public Builder modifierParam(java.util.Map<String, ?> modifierParam) {
                this.modifierParam = modifierParam;
                return this;
            }

            /**
             * <p>Indicates whether the left operand is a constant. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The variable of the left operand.</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Left build() {
                return new Left(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteRuleListResponseBody</p>
     */
    public static class Right extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsVar")
        private Boolean isVar;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierParam")
        private java.util.Map<String, ?> modifierParam;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Right(Builder builder) {
            this.isVar = builder.isVar;
            this.modifier = builder.modifier;
            this.modifierParam = builder.modifierParam;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Right create() {
            return builder().build();
        }

        /**
         * @return isVar
         */
        public Boolean getIsVar() {
            return this.isVar;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierParam
         */
        public java.util.Map<String, ?> getModifierParam() {
            return this.modifierParam;
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
            private Boolean isVar; 
            private String modifier; 
            private java.util.Map<String, ?> modifierParam; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Right model) {
                this.isVar = model.isVar;
                this.modifier = model.modifier;
                this.modifierParam = model.modifierParam;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the right operand is a constant or a runtime variable that is obtained from the runtime context. Valid values:</p>
             * <ul>
             * <li>true: runtime variable.</li>
             * <li>false: constant.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isVar(Boolean isVar) {
                this.isVar = isVar;
                return this;
            }

            /**
             * <p>The remarks on the right operand.</p>
             * 
             * <strong>example:</strong>
             * <p>length</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>The key-value pair information of the remarks.</p>
             */
            public Builder modifierParam(java.util.Map<String, ?> modifierParam) {
                this.modifierParam = modifierParam;
                return this;
            }

            /**
             * <p>The data type of the right operand.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The right operand.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Right build() {
                return new Right(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteRuleListResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsNot")
        private Boolean isNot;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Integer itemId;

        @com.aliyun.core.annotation.NameInMap("Left")
        private Left left;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Right")
        private Right right;

        private Conditions(Builder builder) {
            this.isNot = builder.isNot;
            this.itemId = builder.itemId;
            this.left = builder.left;
            this.operator = builder.operator;
            this.right = builder.right;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return isNot
         */
        public Boolean getIsNot() {
            return this.isNot;
        }

        /**
         * @return itemId
         */
        public Integer getItemId() {
            return this.itemId;
        }

        /**
         * @return left
         */
        public Left getLeft() {
            return this.left;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return right
         */
        public Right getRight() {
            return this.right;
        }

        public static final class Builder {
            private Boolean isNot; 
            private Integer itemId; 
            private Left left; 
            private String operator; 
            private Right right; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.isNot = model.isNot;
                this.itemId = model.itemId;
                this.left = model.left;
                this.operator = model.operator;
                this.right = model.right;
            } 

            /**
             * <p>Indicates whether the result is inverted. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isNot(Boolean isNot) {
                this.isNot = isNot;
                return this;
            }

            /**
             * <p>The ID of the rule condition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder itemId(Integer itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The left operand of the rule condition.</p>
             */
            public Builder left(Left left) {
                this.left = left;
                return this;
            }

            /**
             * <p>The logical operator of the rule condition. Valid values:</p>
             * <ul>
             * <li><code>=</code>: equals to.</li>
             * <li><code>&lt;&gt;</code>: does not equal to.</li>
             * <li><code>in</code>: contains.</li>
             * <li><code>not in</code>: does not contain.</li>
             * <li><code>REGEXP</code>: matches a regular expression.</li>
             * <li><code>NOT REGEXP</code>: does not match a regular expression.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGEXP</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The right operand of the rule condition.</p>
             */
            public Builder right(Right right) {
                this.right = right;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteRuleListResponseBody</p>
     */
    public static class Expression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private String logic;

        private Expression(Builder builder) {
            this.conditions = builder.conditions;
            this.logic = builder.logic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expression create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return logic
         */
        public String getLogic() {
            return this.logic;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private String logic; 

            private Builder() {
            } 

            private Builder(Expression model) {
                this.conditions = model.conditions;
                this.logic = model.logic;
            } 

            /**
             * <p>The rule conditions.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The logical relationships among the rule conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>(1&amp;2)|(3&amp;4)</p>
             */
            public Builder logic(String logic) {
                this.logic = logic;
                return this;
            }

            public Expression build() {
                return new Expression(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteRuleListResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertNameId")
        private String alertNameId;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("AlertTypeId")
        private String alertTypeId;

        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private Expression expression;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubAliuid")
        private Long subAliuid;

        private ResponseData(Builder builder) {
            this.alertName = builder.alertName;
            this.alertNameId = builder.alertNameId;
            this.alertType = builder.alertType;
            this.alertTypeId = builder.alertTypeId;
            this.alertUuid = builder.alertUuid;
            this.aliuid = builder.aliuid;
            this.expression = builder.expression;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.incidentUuid = builder.incidentUuid;
            this.status = builder.status;
            this.subAliuid = builder.subAliuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertNameId
         */
        public String getAlertNameId() {
            return this.alertNameId;
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return alertTypeId
         */
        public String getAlertTypeId() {
            return this.alertTypeId;
        }

        /**
         * @return alertUuid
         */
        public String getAlertUuid() {
            return this.alertUuid;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return expression
         */
        public Expression getExpression() {
            return this.expression;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subAliuid
         */
        public Long getSubAliuid() {
            return this.subAliuid;
        }

        public static final class Builder {
            private String alertName; 
            private String alertNameId; 
            private String alertType; 
            private String alertTypeId; 
            private String alertUuid; 
            private Long aliuid; 
            private Expression expression; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String incidentUuid; 
            private Integer status; 
            private Long subAliuid; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.alertName = model.alertName;
                this.alertNameId = model.alertNameId;
                this.alertType = model.alertType;
                this.alertTypeId = model.alertTypeId;
                this.alertUuid = model.alertUuid;
                this.aliuid = model.aliuid;
                this.expression = model.expression;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.incidentUuid = model.incidentUuid;
                this.status = model.status;
                this.subAliuid = model.subAliuid;
            } 

            /**
             * <p>The alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>Try SNMP weak password</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The ID of the alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>Try SNMP weak password</p>
             */
            public Builder alertNameId(String alertNameId) {
                this.alertNameId = alertNameId;
                return this;
            }

            /**
             * <p>The alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>scan</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The ID of the alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>scan</p>
             */
            public Builder alertTypeId(String alertTypeId) {
                this.alertTypeId = alertTypeId;
                return this;
            }

            /**
             * <p>The UUID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_71e24437d2797ce8fc59692905a4****</p>
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>127608589417****</p>
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The conditions in the rule. The value is a JSON array.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;conditions&quot;:[{&quot;isNot&quot;:false,&quot;itemId&quot;:0,&quot;left&quot;:{&quot;value&quot;:&quot;host_uuid.host_name&quot;},&quot;operator&quot;:&quot;containsString&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;Cloud-MCH&quot;}}]}]</p>
             */
            public Builder expression(Expression expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The time when the whitelist rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the whitelist rule was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The UUID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * <p>The status of the whitelist rule. Valid values:</p>
             * <ul>
             * <li>1: enabled.</li>
             * <li>0: disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the whitelist rule.</p>
             * 
             * <strong>example:</strong>
             * <p>176555323***</p>
             */
            public Builder subAliuid(Long subAliuid) {
                this.subAliuid = subAliuid;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWhiteRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteRuleListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List<ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List<ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List<ResponseData> responseData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageInfo = model.pageInfo;
                this.responseData = model.responseData;
            } 

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The detailed data.</p>
             */
            public Builder responseData(java.util.List<ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
