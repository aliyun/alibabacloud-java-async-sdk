// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSensitiveDefineRuleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetSensitiveDefineRuleConfigResponseBody</p>
 */
public class GetSensitiveDefineRuleConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSensitiveDefineRuleConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveDefineRuleConfigResponseBody create() {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
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

        public GetSensitiveDefineRuleConfigResponseBody build() {
            return new GetSensitiveDefineRuleConfigResponseBody(this);
        } 

    } 

    public static class RuleList extends TeaModel {
        @NameInMap("RuleKey")
        private String ruleKey;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Selected")
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

            /**
             * RuleKey.
             */
            public Builder ruleKey(String ruleKey) {
                this.ruleKey = ruleKey;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Selected.
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
    public static class RuleTree extends TeaModel {
        @NameInMap("ClassKey")
        private String classKey;

        @NameInMap("ClassName")
        private String className;

        @NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

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
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String classKey; 
            private String className; 
            private java.util.List < RuleList> ruleList; 

            /**
             * ClassKey.
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * ClassName.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public RuleTree build() {
                return new RuleTree(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("RuleCount")
        private Integer ruleCount;

        @NameInMap("RuleTree")
        private java.util.List < RuleTree> ruleTree;

        @NameInMap("SelectedCount")
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
        public java.util.List < RuleTree> getRuleTree() {
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
            private java.util.List < RuleTree> ruleTree; 
            private Integer selectedCount; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * RuleCount.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * RuleTree.
             */
            public Builder ruleTree(java.util.List < RuleTree> ruleTree) {
                this.ruleTree = ruleTree;
                return this;
            }

            /**
             * SelectedCount.
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
