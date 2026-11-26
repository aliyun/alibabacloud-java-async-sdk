// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetQualityRuleListResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityRuleListResponseBody</p>
 */
public class GetQualityRuleListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityRuleListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleListResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityRuleListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The quality check rule information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityRuleListResponseBody build() {
            return new GetQualityRuleListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleListResponseBody</p>
     */
    public static class QualityRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private java.util.List<String> keyWords;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private Integer matchType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleCreateTime")
        private String ruleCreateTime;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleTag")
        private Integer ruleTag;

        private QualityRuleList(Builder builder) {
            this.keyWords = builder.keyWords;
            this.matchType = builder.matchType;
            this.name = builder.name;
            this.ruleCreateTime = builder.ruleCreateTime;
            this.ruleId = builder.ruleId;
            this.ruleTag = builder.ruleTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityRuleList create() {
            return builder().build();
        }

        /**
         * @return keyWords
         */
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return matchType
         */
        public Integer getMatchType() {
            return this.matchType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleCreateTime
         */
        public String getRuleCreateTime() {
            return this.ruleCreateTime;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleTag
         */
        public Integer getRuleTag() {
            return this.ruleTag;
        }

        public static final class Builder {
            private java.util.List<String> keyWords; 
            private Integer matchType; 
            private String name; 
            private String ruleCreateTime; 
            private Long ruleId; 
            private Integer ruleTag; 

            private Builder() {
            } 

            private Builder(QualityRuleList model) {
                this.keyWords = model.keyWords;
                this.matchType = model.matchType;
                this.name = model.name;
                this.ruleCreateTime = model.ruleCreateTime;
                this.ruleId = model.ruleId;
                this.ruleTag = model.ruleTag;
            } 

            /**
             * <p>The keywords.</p>
             */
            public Builder keyWords(java.util.List<String> keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * <p>The keyword match type. Valid values:	</p>
             * <ul>
             * <li><strong>1</strong>: Any keyword appears.</li>
             * <li><strong>2</strong>: All keywords appear.</li>
             * <li><strong>3</strong>: No keywords appear.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchType(Integer matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Automatically created quality check rule</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>Mon Mar 29 22:14:02 CST 2021</p>
             */
            public Builder ruleCreateTime(String ruleCreateTime) {
                this.ruleCreateTime = ruleCreateTime;
                return this;
            }

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>5369</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The tag of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>638</p>
             */
            public Builder ruleTag(Integer ruleTag) {
                this.ruleTag = ruleTag;
                return this;
            }

            public QualityRuleList build() {
                return new QualityRuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityRuleListResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("QualityRuleList")
        private java.util.List<QualityRuleList> qualityRuleList;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.qualityRuleList = builder.qualityRuleList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return qualityRuleList
         */
        public java.util.List<QualityRuleList> getQualityRuleList() {
            return this.qualityRuleList;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<QualityRuleList> qualityRuleList; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.qualityRuleList = model.qualityRuleList;
                this.total = model.total;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * <p>The list of rule details.</p>
             */
            public Builder qualityRuleList(java.util.List<QualityRuleList> qualityRuleList) {
                this.qualityRuleList = qualityRuleList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>84</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
