// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetBuildRiskDefineRuleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetBuildRiskDefineRuleConfigResponseBody</p>
 */
public class GetBuildRiskDefineRuleConfigResponseBody extends TeaModel {
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

    private GetBuildRiskDefineRuleConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBuildRiskDefineRuleConfigResponseBody create() {
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

        private Builder(GetBuildRiskDefineRuleConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBuildRiskDefineRuleConfigResponseBody build() {
            return new GetBuildRiskDefineRuleConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBuildRiskDefineRuleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetBuildRiskDefineRuleConfigResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleKey")
        private String ruleKey;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private RuleList(Builder builder) {
            this.ruleKey = builder.ruleKey;
            this.ruleName = builder.ruleName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return ruleKey
         */
        public String getRuleKey() {
            return this.ruleKey;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String ruleKey; 
            private String ruleName; 
            private Boolean selected; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.ruleKey = model.ruleKey;
                this.ruleName = model.ruleName;
                this.selected = model.selected;
            } 

            /**
             * <p>The check item.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder ruleKey(String ruleKey) {
                this.ruleKey = ruleKey;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>used ADD</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Indicates whether the check item is selected. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBuildRiskDefineRuleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetBuildRiskDefineRuleConfigResponseBody</p>
     */
    public static class RuleTree extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassKey")
        private String classKey;

        @com.aliyun.core.annotation.NameInMap("ClassName")
        private String className;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        private RuleTree(Builder builder) {
            this.classKey = builder.classKey;
            this.className = builder.className;
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleTree create() {
            return builder().build();
        }

        /**
         * @return classKey
         */
        public String getClassKey() {
            return this.classKey;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String classKey; 
            private String className; 
            private java.util.List<RuleList> ruleList; 

            private Builder() {
            } 

            private Builder(RuleTree model) {
                this.classKey = model.classKey;
                this.className = model.className;
                this.ruleList = model.ruleList;
            } 

            /**
             * <p>The check item type.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * <p>The name of the check item type.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * <p>The check items of the type.</p>
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public RuleTree build() {
                return new RuleTree(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBuildRiskDefineRuleConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetBuildRiskDefineRuleConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        @com.aliyun.core.annotation.NameInMap("RuleTree")
        private java.util.List<RuleTree> ruleTree;

        @com.aliyun.core.annotation.NameInMap("SelectedCount")
        private Integer selectedCount;

        private Data(Builder builder) {
            this.id = builder.id;
            this.ruleCount = builder.ruleCount;
            this.ruleTree = builder.ruleTree;
            this.selectedCount = builder.selectedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return ruleTree
         */
        public java.util.List<RuleTree> getRuleTree() {
            return this.ruleTree;
        }

        /**
         * @return selectedCount
         */
        public Integer getSelectedCount() {
            return this.selectedCount;
        }

        public static final class Builder {
            private Long id; 
            private Integer ruleCount; 
            private java.util.List<RuleTree> ruleTree; 
            private Integer selectedCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.id = model.id;
                this.ruleCount = model.ruleCount;
                this.ruleTree = model.ruleTree;
                this.selectedCount = model.selectedCount;
            } 

            /**
             * <p>The configuration ID for scanning image build command risks.</p>
             * 
             * <strong>example:</strong>
             * <p>273698***</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The total number of check items.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * <p>The details of all check items.</p>
             */
            public Builder ruleTree(java.util.List<RuleTree> ruleTree) {
                this.ruleTree = ruleTree;
                return this;
            }

            /**
             * <p>The number of selected check items.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder selectedCount(Integer selectedCount) {
                this.selectedCount = selectedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
