// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The response code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeWhiteRuleListResponseBody build() {
            return new DescribeWhiteRuleListResponseBody(this);
        } 

    } 

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

            /**
             * The current page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
    public static class Left extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsVar")
        private Boolean isVar;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierParam")
        private java.util.Map < String, ? > modifierParam;

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
        public java.util.Map < String, ? > getModifierParam() {
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
            private java.util.Map < String, ? > modifierParam; 
            private String type; 
            private String value; 

            /**
             * Indicates whether the left operand is a variable. Valid values:
             * <p>
             * 
             * *   true: variable.
             * *   false: constant.
             */
            public Builder isVar(Boolean isVar) {
                this.isVar = isVar;
                return this;
            }

            /**
             * The remarks on the right operand.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * The key-value pair information of the remarks.
             */
            public Builder modifierParam(java.util.Map < String, ? > modifierParam) {
                this.modifierParam = modifierParam;
                return this;
            }

            /**
             * Indicates whether the left operand is a constant. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The variable of the left operand.
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
    public static class Right extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsVar")
        private Boolean isVar;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("ModifierParam")
        private java.util.Map < String, ? > modifierParam;

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
        public java.util.Map < String, ? > getModifierParam() {
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
            private java.util.Map < String, ? > modifierParam; 
            private String type; 
            private String value; 

            /**
             * Indicates whether the right operand is a constant or a runtime variable that is obtained from the runtime context. Valid values:
             * <p>
             * 
             * *   true: runtime variable.
             * *   false: constant.
             */
            public Builder isVar(Boolean isVar) {
                this.isVar = isVar;
                return this;
            }

            /**
             * The remarks on the right operand.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * The key-value pair information of the remarks.
             */
            public Builder modifierParam(java.util.Map < String, ? > modifierParam) {
                this.modifierParam = modifierParam;
                return this;
            }

            /**
             * The data type of the right operand.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The right operand.
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

            /**
             * Indicates whether the result is inverted. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder isNot(Boolean isNot) {
                this.isNot = isNot;
                return this;
            }

            /**
             * The ID of the rule condition.
             */
            public Builder itemId(Integer itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * The left operand of the rule condition.
             */
            public Builder left(Left left) {
                this.left = left;
                return this;
            }

            /**
             * The logical operator of the rule condition. Valid values:
             * <p>
             * 
             * *   `=`: equals to.
             * *   `<>`: does not equal to.
             * *   `in`: contains.
             * *   `not in`: does not contain.
             * *   `REGEXP`: matches a regular expression.
             * *   `NOT REGEXP`: does not match a regular expression.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The right operand of the rule condition.
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
    public static class Expression extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

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
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return logic
         */
        public String getLogic() {
            return this.logic;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 
            private String logic; 

            /**
             * The rule conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The logical relationships among the rule conditions.
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

            /**
             * The alert name.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The ID of the alert name.
             */
            public Builder alertNameId(String alertNameId) {
                this.alertNameId = alertNameId;
                return this;
            }

            /**
             * The alert type.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The ID of the alert type.
             */
            public Builder alertTypeId(String alertTypeId) {
                this.alertTypeId = alertTypeId;
                return this;
            }

            /**
             * The UUID of the alert.
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The conditions in the rule. The value is a JSON array.
             */
            public Builder expression(Expression expression) {
                this.expression = expression;
                return this;
            }

            /**
             * The time when the whitelist rule was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the whitelist rule was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the whitelist rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The UUID of the event.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * The status of the whitelist rule. Valid values:
             * <p>
             * 
             * *   1: enabled.
             * *   0: disabled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the whitelist rule.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List < ResponseData> responseData;

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
        public java.util.List < ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List < ResponseData> responseData; 

            /**
             * The pagination information.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * The detailed data.
             */
            public Builder responseData(java.util.List < ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
