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
 * {@link PAApplicationUnauthorizedAccessConfig} extends {@link TeaModel}
 *
 * <p>PAApplicationUnauthorizedAccessConfig</p>
 */
public class PAApplicationUnauthorizedAccessConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowReport")
    private Boolean allowReport;

    @com.aliyun.core.annotation.NameInMap("BlockContent")
    private BlockContent blockContent;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("ReportProcessId")
    private String reportProcessId;

    private PAApplicationUnauthorizedAccessConfig(Builder builder) {
        this.allowReport = builder.allowReport;
        this.blockContent = builder.blockContent;
        this.enabled = builder.enabled;
        this.reportProcessId = builder.reportProcessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PAApplicationUnauthorizedAccessConfig create() {
        return builder().build();
    }

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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return reportProcessId
     */
    public String getReportProcessId() {
        return this.reportProcessId;
    }

    public static final class Builder {
        private Boolean allowReport; 
        private BlockContent blockContent; 
        private Boolean enabled; 
        private String reportProcessId; 

        private Builder() {
        } 

        private Builder(PAApplicationUnauthorizedAccessConfig model) {
            this.allowReport = model.allowReport;
            this.blockContent = model.blockContent;
            this.enabled = model.enabled;
            this.reportProcessId = model.reportProcessId;
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
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * ReportProcessId.
         */
        public Builder reportProcessId(String reportProcessId) {
            this.reportProcessId = reportProcessId;
            return this;
        }

        public PAApplicationUnauthorizedAccessConfig build() {
            return new PAApplicationUnauthorizedAccessConfig(this);
        } 

    } 

    /**
     * 
     * {@link PAApplicationUnauthorizedAccessConfig} extends {@link TeaModel}
     *
     * <p>PAApplicationUnauthorizedAccessConfig</p>
     */
    public static class BlockTextEn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrowserAlertContent")
        private String browserAlertContent;

        @com.aliyun.core.annotation.NameInMap("BrowserAlertStyle")
        private String browserAlertStyle;

        @com.aliyun.core.annotation.NameInMap("BrowserAlertTitle")
        private String browserAlertTitle;

        @com.aliyun.core.annotation.NameInMap("ReportButtonText")
        private String reportButtonText;

        private BlockTextEn(Builder builder) {
            this.browserAlertContent = builder.browserAlertContent;
            this.browserAlertStyle = builder.browserAlertStyle;
            this.browserAlertTitle = builder.browserAlertTitle;
            this.reportButtonText = builder.reportButtonText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockTextEn create() {
            return builder().build();
        }

        /**
         * @return browserAlertContent
         */
        public String getBrowserAlertContent() {
            return this.browserAlertContent;
        }

        /**
         * @return browserAlertStyle
         */
        public String getBrowserAlertStyle() {
            return this.browserAlertStyle;
        }

        /**
         * @return browserAlertTitle
         */
        public String getBrowserAlertTitle() {
            return this.browserAlertTitle;
        }

        /**
         * @return reportButtonText
         */
        public String getReportButtonText() {
            return this.reportButtonText;
        }

        public static final class Builder {
            private String browserAlertContent; 
            private String browserAlertStyle; 
            private String browserAlertTitle; 
            private String reportButtonText; 

            private Builder() {
            } 

            private Builder(BlockTextEn model) {
                this.browserAlertContent = model.browserAlertContent;
                this.browserAlertStyle = model.browserAlertStyle;
                this.browserAlertTitle = model.browserAlertTitle;
                this.reportButtonText = model.reportButtonText;
            } 

            /**
             * BrowserAlertContent.
             */
            public Builder browserAlertContent(String browserAlertContent) {
                this.browserAlertContent = browserAlertContent;
                return this;
            }

            /**
             * BrowserAlertStyle.
             */
            public Builder browserAlertStyle(String browserAlertStyle) {
                this.browserAlertStyle = browserAlertStyle;
                return this;
            }

            /**
             * BrowserAlertTitle.
             */
            public Builder browserAlertTitle(String browserAlertTitle) {
                this.browserAlertTitle = browserAlertTitle;
                return this;
            }

            /**
             * ReportButtonText.
             */
            public Builder reportButtonText(String reportButtonText) {
                this.reportButtonText = reportButtonText;
                return this;
            }

            public BlockTextEn build() {
                return new BlockTextEn(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAApplicationUnauthorizedAccessConfig} extends {@link TeaModel}
     *
     * <p>PAApplicationUnauthorizedAccessConfig</p>
     */
    public static class BlockTextZh extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrowserAlertContent")
        private String browserAlertContent;

        @com.aliyun.core.annotation.NameInMap("BrowserAlertStyle")
        private String browserAlertStyle;

        @com.aliyun.core.annotation.NameInMap("BrowserAlertTitle")
        private String browserAlertTitle;

        @com.aliyun.core.annotation.NameInMap("ReportButtonText")
        private String reportButtonText;

        private BlockTextZh(Builder builder) {
            this.browserAlertContent = builder.browserAlertContent;
            this.browserAlertStyle = builder.browserAlertStyle;
            this.browserAlertTitle = builder.browserAlertTitle;
            this.reportButtonText = builder.reportButtonText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockTextZh create() {
            return builder().build();
        }

        /**
         * @return browserAlertContent
         */
        public String getBrowserAlertContent() {
            return this.browserAlertContent;
        }

        /**
         * @return browserAlertStyle
         */
        public String getBrowserAlertStyle() {
            return this.browserAlertStyle;
        }

        /**
         * @return browserAlertTitle
         */
        public String getBrowserAlertTitle() {
            return this.browserAlertTitle;
        }

        /**
         * @return reportButtonText
         */
        public String getReportButtonText() {
            return this.reportButtonText;
        }

        public static final class Builder {
            private String browserAlertContent; 
            private String browserAlertStyle; 
            private String browserAlertTitle; 
            private String reportButtonText; 

            private Builder() {
            } 

            private Builder(BlockTextZh model) {
                this.browserAlertContent = model.browserAlertContent;
                this.browserAlertStyle = model.browserAlertStyle;
                this.browserAlertTitle = model.browserAlertTitle;
                this.reportButtonText = model.reportButtonText;
            } 

            /**
             * BrowserAlertContent.
             */
            public Builder browserAlertContent(String browserAlertContent) {
                this.browserAlertContent = browserAlertContent;
                return this;
            }

            /**
             * BrowserAlertStyle.
             */
            public Builder browserAlertStyle(String browserAlertStyle) {
                this.browserAlertStyle = browserAlertStyle;
                return this;
            }

            /**
             * BrowserAlertTitle.
             */
            public Builder browserAlertTitle(String browserAlertTitle) {
                this.browserAlertTitle = browserAlertTitle;
                return this;
            }

            /**
             * ReportButtonText.
             */
            public Builder reportButtonText(String reportButtonText) {
                this.reportButtonText = reportButtonText;
                return this;
            }

            public BlockTextZh build() {
                return new BlockTextZh(this);
            } 

        } 

    }
    /**
     * 
     * {@link PAApplicationUnauthorizedAccessConfig} extends {@link TeaModel}
     *
     * <p>PAApplicationUnauthorizedAccessConfig</p>
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
}
