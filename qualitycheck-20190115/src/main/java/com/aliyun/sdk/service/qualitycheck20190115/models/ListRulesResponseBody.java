// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link ListRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRulesResponseBody</p>
 */
public class ListRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRulesResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Integer count; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRulesResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code. A value of 200 means success. Any other value means failure. Use this field to identify the cause of failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The rule list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Details about an error if the request failed. If the request succeeded, the value is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the rule list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>82C91484-B2D5-4D2A-A21F-A6D73F**</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded. A value of true means success. A value of false or null means failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRulesResponseBody build() {
            return new ListRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessCategoryNameList")
        private java.util.List<String> businessCategoryNameList;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private Integer ruleType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private Data(Builder builder) {
            this.businessCategoryNameList = builder.businessCategoryNameList;
            this.comments = builder.comments;
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.rid = builder.rid;
            this.ruleType = builder.ruleType;
            this.type = builder.type;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessCategoryNameList
         */
        public java.util.List<String> getBusinessCategoryNameList() {
            return this.businessCategoryNameList;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return ruleType
         */
        public Integer getRuleType() {
            return this.ruleType;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private java.util.List<String> businessCategoryNameList; 
            private String comments; 
            private String createTime; 
            private String name; 
            private Long rid; 
            private Integer ruleType; 
            private Integer type; 
            private String typeName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.businessCategoryNameList = model.businessCategoryNameList;
                this.comments = model.comments;
                this.createTime = model.createTime;
                this.name = model.name;
                this.rid = model.rid;
                this.ruleType = model.ruleType;
                this.type = model.type;
                this.typeName = model.typeName;
            } 

            /**
             * <p>The names of business categories associated with the rule.</p>
             */
            public Builder businessCategoryNameList(java.util.List<String> businessCategoryNameList) {
                this.businessCategoryNameList = businessCategoryNameList;
                return this;
            }

            /**
             * <p>Comments for the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>检测是否出现了禁用语</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The time when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-20T20:10Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>禁用语检测</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * <p>The rule category. Valid values:</p>
             * <ul>
             * <li><p>1: Custom rule</p>
             * </li>
             * <li><p>0: System-provided rule</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The type value of the rule\&quot;s rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The name of the rule\&quot;s rule type.</p>
             * 
             * <strong>example:</strong>
             * <p>服务规范</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
