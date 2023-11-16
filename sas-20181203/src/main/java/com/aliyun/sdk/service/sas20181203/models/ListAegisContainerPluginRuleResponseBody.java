// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAegisContainerPluginRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListAegisContainerPluginRuleResponseBody</p>
 */
public class ListAegisContainerPluginRuleResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleList")
    private java.util.List < RuleList> ruleList;

    private ListAegisContainerPluginRuleResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.ruleList = builder.ruleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAegisContainerPluginRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleList
     */
    public java.util.List < RuleList> getRuleList() {
        return this.ruleList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < RuleList> ruleList; 

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * RuleList.
         */
        public Builder ruleList(java.util.List < RuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }

        public ListAegisContainerPluginRuleResponseBody build() {
            return new ListAegisContainerPluginRuleResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

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
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class RuleList extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Mode")
        private Integer mode;

        @NameInMap("RuleDescription")
        private String ruleDescription;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleTemplateId")
        private String ruleTemplateId;

        @NameInMap("RuleTemplateName")
        private String ruleTemplateName;

        @NameInMap("SelectedPolicy")
        private java.util.List < String > selectedPolicy;

        @NameInMap("SwitchId")
        private String switchId;

        @NameInMap("WhiteImages")
        private java.util.List < String > whiteImages;

        private RuleList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.mode = builder.mode;
            this.ruleDescription = builder.ruleDescription;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleTemplateId = builder.ruleTemplateId;
            this.ruleTemplateName = builder.ruleTemplateName;
            this.selectedPolicy = builder.selectedPolicy;
            this.switchId = builder.switchId;
            this.whiteImages = builder.whiteImages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return ruleDescription
         */
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleTemplateId
         */
        public String getRuleTemplateId() {
            return this.ruleTemplateId;
        }

        /**
         * @return ruleTemplateName
         */
        public String getRuleTemplateName() {
            return this.ruleTemplateName;
        }

        /**
         * @return selectedPolicy
         */
        public java.util.List < String > getSelectedPolicy() {
            return this.selectedPolicy;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return whiteImages
         */
        public java.util.List < String > getWhiteImages() {
            return this.whiteImages;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Integer mode; 
            private String ruleDescription; 
            private Long ruleId; 
            private String ruleName; 
            private String ruleTemplateId; 
            private String ruleTemplateName; 
            private java.util.List < String > selectedPolicy; 
            private String switchId; 
            private java.util.List < String > whiteImages; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * RuleDescription.
             */
            public Builder ruleDescription(String ruleDescription) {
                this.ruleDescription = ruleDescription;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
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
             * RuleTemplateId.
             */
            public Builder ruleTemplateId(String ruleTemplateId) {
                this.ruleTemplateId = ruleTemplateId;
                return this;
            }

            /**
             * RuleTemplateName.
             */
            public Builder ruleTemplateName(String ruleTemplateName) {
                this.ruleTemplateName = ruleTemplateName;
                return this;
            }

            /**
             * SelectedPolicy.
             */
            public Builder selectedPolicy(java.util.List < String > selectedPolicy) {
                this.selectedPolicy = selectedPolicy;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * WhiteImages.
             */
            public Builder whiteImages(java.util.List < String > whiteImages) {
                this.whiteImages = whiteImages;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
}
