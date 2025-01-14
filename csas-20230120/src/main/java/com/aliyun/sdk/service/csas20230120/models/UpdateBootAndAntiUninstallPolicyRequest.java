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
 * {@link UpdateBootAndAntiUninstallPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateBootAndAntiUninstallPolicyRequest</p>
 */
public class UpdateBootAndAntiUninstallPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowReport")
    private Boolean allowReport;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockContent")
    private BlockContent blockContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsAntiUninstall")
    private Boolean isAntiUninstall;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsBoot")
    private Boolean isBoot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WhitelistUsers")
    private java.util.List<String> whitelistUsers;

    private UpdateBootAndAntiUninstallPolicyRequest(Builder builder) {
        super(builder);
        this.allowReport = builder.allowReport;
        this.blockContent = builder.blockContent;
        this.isAntiUninstall = builder.isAntiUninstall;
        this.isBoot = builder.isBoot;
        this.userGroupIds = builder.userGroupIds;
        this.whitelistUsers = builder.whitelistUsers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBootAndAntiUninstallPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateBootAndAntiUninstallPolicyRequest, Builder> {
        private Boolean allowReport; 
        private BlockContent blockContent; 
        private Boolean isAntiUninstall; 
        private Boolean isBoot; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelistUsers; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBootAndAntiUninstallPolicyRequest request) {
            super(request);
            this.allowReport = request.allowReport;
            this.blockContent = request.blockContent;
            this.isAntiUninstall = request.isAntiUninstall;
            this.isBoot = request.isBoot;
            this.userGroupIds = request.userGroupIds;
            this.whitelistUsers = request.whitelistUsers;
        } 

        /**
         * AllowReport.
         */
        public Builder allowReport(Boolean allowReport) {
            this.putBodyParameter("AllowReport", allowReport);
            this.allowReport = allowReport;
            return this;
        }

        /**
         * BlockContent.
         */
        public Builder blockContent(BlockContent blockContent) {
            String blockContentShrink = shrink(blockContent, "BlockContent", "json");
            this.putBodyParameter("BlockContent", blockContentShrink);
            this.blockContent = blockContent;
            return this;
        }

        /**
         * IsAntiUninstall.
         */
        public Builder isAntiUninstall(Boolean isAntiUninstall) {
            this.putBodyParameter("IsAntiUninstall", isAntiUninstall);
            this.isAntiUninstall = isAntiUninstall;
            return this;
        }

        /**
         * IsBoot.
         */
        public Builder isBoot(Boolean isBoot) {
            this.putBodyParameter("IsBoot", isBoot);
            this.isBoot = isBoot;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * WhitelistUsers.
         */
        public Builder whitelistUsers(java.util.List<String> whitelistUsers) {
            this.putBodyParameter("WhitelistUsers", whitelistUsers);
            this.whitelistUsers = whitelistUsers;
            return this;
        }

        @Override
        public UpdateBootAndAntiUninstallPolicyRequest build() {
            return new UpdateBootAndAntiUninstallPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBootAndAntiUninstallPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateBootAndAntiUninstallPolicyRequest</p>
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
     * {@link UpdateBootAndAntiUninstallPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateBootAndAntiUninstallPolicyRequest</p>
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
     * {@link UpdateBootAndAntiUninstallPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateBootAndAntiUninstallPolicyRequest</p>
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
}
