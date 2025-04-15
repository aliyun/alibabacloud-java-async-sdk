// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateBootAndAntiUninstallPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBootAndAntiUninstallPolicyResponseBody</p>
 */
public class UpdateBootAndAntiUninstallPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategy")
    private Strategy strategy;

    private UpdateBootAndAntiUninstallPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBootAndAntiUninstallPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategy
     */
    public Strategy getStrategy() {
        return this.strategy;
    }

    public static final class Builder {
        private String requestId; 
        private Strategy strategy; 

        private Builder() {
        } 

        private Builder(UpdateBootAndAntiUninstallPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.strategy = model.strategy;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Strategy.
         */
        public Builder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public UpdateBootAndAntiUninstallPolicyResponseBody build() {
            return new UpdateBootAndAntiUninstallPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBootAndAntiUninstallPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateBootAndAntiUninstallPolicyResponseBody</p>
     */
    public static class BlockTextEn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("MainButtonText")
        private String mainButtonText;

        @com.aliyun.core.annotation.NameInMap("MinorButtonText")
        private String minorButtonText;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private BlockTextEn(Builder builder) {
            this.content = builder.content;
            this.mainButtonText = builder.mainButtonText;
            this.minorButtonText = builder.minorButtonText;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockTextEn create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return mainButtonText
         */
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        /**
         * @return minorButtonText
         */
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String mainButtonText; 
            private String minorButtonText; 
            private String title; 

            private Builder() {
            } 

            private Builder(BlockTextEn model) {
                this.content = model.content;
                this.mainButtonText = model.mainButtonText;
                this.minorButtonText = model.minorButtonText;
                this.title = model.title;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * MainButtonText.
             */
            public Builder mainButtonText(String mainButtonText) {
                this.mainButtonText = mainButtonText;
                return this;
            }

            /**
             * MinorButtonText.
             */
            public Builder minorButtonText(String minorButtonText) {
                this.minorButtonText = minorButtonText;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public BlockTextEn build() {
                return new BlockTextEn(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBootAndAntiUninstallPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateBootAndAntiUninstallPolicyResponseBody</p>
     */
    public static class BlockTextZh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("MainButtonText")
        private String mainButtonText;

        @com.aliyun.core.annotation.NameInMap("MinorButtonText")
        private String minorButtonText;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private BlockTextZh(Builder builder) {
            this.content = builder.content;
            this.mainButtonText = builder.mainButtonText;
            this.minorButtonText = builder.minorButtonText;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockTextZh create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return mainButtonText
         */
        public String getMainButtonText() {
            return this.mainButtonText;
        }

        /**
         * @return minorButtonText
         */
        public String getMinorButtonText() {
            return this.minorButtonText;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String content; 
            private String mainButtonText; 
            private String minorButtonText; 
            private String title; 

            private Builder() {
            } 

            private Builder(BlockTextZh model) {
                this.content = model.content;
                this.mainButtonText = model.mainButtonText;
                this.minorButtonText = model.minorButtonText;
                this.title = model.title;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * MainButtonText.
             */
            public Builder mainButtonText(String mainButtonText) {
                this.mainButtonText = mainButtonText;
                return this;
            }

            /**
             * MinorButtonText.
             */
            public Builder minorButtonText(String minorButtonText) {
                this.minorButtonText = minorButtonText;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public BlockTextZh build() {
                return new BlockTextZh(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBootAndAntiUninstallPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateBootAndAntiUninstallPolicyResponseBody</p>
     */
    public static class BlockContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockTextEn")
        private BlockTextEn blockTextEn;

        @com.aliyun.core.annotation.NameInMap("BlockTextZh")
        private BlockTextZh blockTextZh;

        private BlockContent(Builder builder) {
            this.blockTextEn = builder.blockTextEn;
            this.blockTextZh = builder.blockTextZh;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockContent create() {
            return builder().build();
        }

        /**
         * @return blockTextEn
         */
        public BlockTextEn getBlockTextEn() {
            return this.blockTextEn;
        }

        /**
         * @return blockTextZh
         */
        public BlockTextZh getBlockTextZh() {
            return this.blockTextZh;
        }

        public static final class Builder {
            private BlockTextEn blockTextEn; 
            private BlockTextZh blockTextZh; 

            private Builder() {
            } 

            private Builder(BlockContent model) {
                this.blockTextEn = model.blockTextEn;
                this.blockTextZh = model.blockTextZh;
            } 

            /**
             * BlockTextEn.
             */
            public Builder blockTextEn(BlockTextEn blockTextEn) {
                this.blockTextEn = blockTextEn;
                return this;
            }

            /**
             * BlockTextZh.
             */
            public Builder blockTextZh(BlockTextZh blockTextZh) {
                this.blockTextZh = blockTextZh;
                return this;
            }

            public BlockContent build() {
                return new BlockContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBootAndAntiUninstallPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateBootAndAntiUninstallPolicyResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowReport")
        private Boolean allowReport;

        @com.aliyun.core.annotation.NameInMap("BlockContent")
        private BlockContent blockContent;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IsAntiUninstall")
        private Boolean isAntiUninstall;

        @com.aliyun.core.annotation.NameInMap("IsBoot")
        private Boolean isBoot;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("ReportProcessId")
        private String reportProcessId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("WhitelistUsers")
        private java.util.List<String> whitelistUsers;

        private Strategy(Builder builder) {
            this.allowReport = builder.allowReport;
            this.blockContent = builder.blockContent;
            this.createTime = builder.createTime;
            this.isAntiUninstall = builder.isAntiUninstall;
            this.isBoot = builder.isBoot;
            this.policyId = builder.policyId;
            this.reportProcessId = builder.reportProcessId;
            this.updateTime = builder.updateTime;
            this.userGroupIds = builder.userGroupIds;
            this.whitelistUsers = builder.whitelistUsers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return allowReport
         */
        public Boolean getAllowReport() {
            return this.allowReport;
        }

        /**
         * @return blockContent
         */
        public BlockContent getBlockContent() {
            return this.blockContent;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isAntiUninstall
         */
        public Boolean getIsAntiUninstall() {
            return this.isAntiUninstall;
        }

        /**
         * @return isBoot
         */
        public Boolean getIsBoot() {
            return this.isBoot;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return reportProcessId
         */
        public String getReportProcessId() {
            return this.reportProcessId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        /**
         * @return whitelistUsers
         */
        public java.util.List<String> getWhitelistUsers() {
            return this.whitelistUsers;
        }

        public static final class Builder {
            private Boolean allowReport; 
            private BlockContent blockContent; 
            private String createTime; 
            private Boolean isAntiUninstall; 
            private Boolean isBoot; 
            private String policyId; 
            private String reportProcessId; 
            private String updateTime; 
            private java.util.List<String> userGroupIds; 
            private java.util.List<String> whitelistUsers; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.allowReport = model.allowReport;
                this.blockContent = model.blockContent;
                this.createTime = model.createTime;
                this.isAntiUninstall = model.isAntiUninstall;
                this.isBoot = model.isBoot;
                this.policyId = model.policyId;
                this.reportProcessId = model.reportProcessId;
                this.updateTime = model.updateTime;
                this.userGroupIds = model.userGroupIds;
                this.whitelistUsers = model.whitelistUsers;
            } 

            /**
             * AllowReport.
             */
            public Builder allowReport(Boolean allowReport) {
                this.allowReport = allowReport;
                return this;
            }

            /**
             * BlockContent.
             */
            public Builder blockContent(BlockContent blockContent) {
                this.blockContent = blockContent;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IsAntiUninstall.
             */
            public Builder isAntiUninstall(Boolean isAntiUninstall) {
                this.isAntiUninstall = isAntiUninstall;
                return this;
            }

            /**
             * IsBoot.
             */
            public Builder isBoot(Boolean isBoot) {
                this.isBoot = isBoot;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * ReportProcessId.
             */
            public Builder reportProcessId(String reportProcessId) {
                this.reportProcessId = reportProcessId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserGroupIds.
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * WhitelistUsers.
             */
            public Builder whitelistUsers(java.util.List<String> whitelistUsers) {
                this.whitelistUsers = whitelistUsers;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
}
