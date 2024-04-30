// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsResourceSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRdsResourceSettingsResponseBody</p>
 */
public class DescribeRdsResourceSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RdsInstanceResourceSettings")
    private RdsInstanceResourceSettings rdsInstanceResourceSettings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRdsResourceSettingsResponseBody(Builder builder) {
        this.rdsInstanceResourceSettings = builder.rdsInstanceResourceSettings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsResourceSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return rdsInstanceResourceSettings
     */
    public RdsInstanceResourceSettings getRdsInstanceResourceSettings() {
        return this.rdsInstanceResourceSettings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RdsInstanceResourceSettings rdsInstanceResourceSettings; 
        private String requestId; 

        /**
         * RdsInstanceResourceSettings.
         */
        public Builder rdsInstanceResourceSettings(RdsInstanceResourceSettings rdsInstanceResourceSettings) {
            this.rdsInstanceResourceSettings = rdsInstanceResourceSettings;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRdsResourceSettingsResponseBody build() {
            return new DescribeRdsResourceSettingsResponseBody(this);
        } 

    } 

    public static class RdsInstanceResourceSetting extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("IsTop")
        private String isTop;

        @com.aliyun.core.annotation.NameInMap("NoticeBarContent")
        private String noticeBarContent;

        @com.aliyun.core.annotation.NameInMap("PoppedUpButtonText")
        private String poppedUpButtonText;

        @com.aliyun.core.annotation.NameInMap("PoppedUpButtonType")
        private String poppedUpButtonType;

        @com.aliyun.core.annotation.NameInMap("PoppedUpButtonUrl")
        private String poppedUpButtonUrl;

        @com.aliyun.core.annotation.NameInMap("PoppedUpContent")
        private String poppedUpContent;

        @com.aliyun.core.annotation.NameInMap("ResourceNiche")
        private String resourceNiche;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        private RdsInstanceResourceSetting(Builder builder) {
            this.endDate = builder.endDate;
            this.isTop = builder.isTop;
            this.noticeBarContent = builder.noticeBarContent;
            this.poppedUpButtonText = builder.poppedUpButtonText;
            this.poppedUpButtonType = builder.poppedUpButtonType;
            this.poppedUpButtonUrl = builder.poppedUpButtonUrl;
            this.poppedUpContent = builder.poppedUpContent;
            this.resourceNiche = builder.resourceNiche;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsInstanceResourceSetting create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return isTop
         */
        public String getIsTop() {
            return this.isTop;
        }

        /**
         * @return noticeBarContent
         */
        public String getNoticeBarContent() {
            return this.noticeBarContent;
        }

        /**
         * @return poppedUpButtonText
         */
        public String getPoppedUpButtonText() {
            return this.poppedUpButtonText;
        }

        /**
         * @return poppedUpButtonType
         */
        public String getPoppedUpButtonType() {
            return this.poppedUpButtonType;
        }

        /**
         * @return poppedUpButtonUrl
         */
        public String getPoppedUpButtonUrl() {
            return this.poppedUpButtonUrl;
        }

        /**
         * @return poppedUpContent
         */
        public String getPoppedUpContent() {
            return this.poppedUpContent;
        }

        /**
         * @return resourceNiche
         */
        public String getResourceNiche() {
            return this.resourceNiche;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private String endDate; 
            private String isTop; 
            private String noticeBarContent; 
            private String poppedUpButtonText; 
            private String poppedUpButtonType; 
            private String poppedUpButtonUrl; 
            private String poppedUpContent; 
            private String resourceNiche; 
            private String startDate; 

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * IsTop.
             */
            public Builder isTop(String isTop) {
                this.isTop = isTop;
                return this;
            }

            /**
             * NoticeBarContent.
             */
            public Builder noticeBarContent(String noticeBarContent) {
                this.noticeBarContent = noticeBarContent;
                return this;
            }

            /**
             * PoppedUpButtonText.
             */
            public Builder poppedUpButtonText(String poppedUpButtonText) {
                this.poppedUpButtonText = poppedUpButtonText;
                return this;
            }

            /**
             * PoppedUpButtonType.
             */
            public Builder poppedUpButtonType(String poppedUpButtonType) {
                this.poppedUpButtonType = poppedUpButtonType;
                return this;
            }

            /**
             * PoppedUpButtonUrl.
             */
            public Builder poppedUpButtonUrl(String poppedUpButtonUrl) {
                this.poppedUpButtonUrl = poppedUpButtonUrl;
                return this;
            }

            /**
             * PoppedUpContent.
             */
            public Builder poppedUpContent(String poppedUpContent) {
                this.poppedUpContent = poppedUpContent;
                return this;
            }

            /**
             * ResourceNiche.
             */
            public Builder resourceNiche(String resourceNiche) {
                this.resourceNiche = resourceNiche;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public RdsInstanceResourceSetting build() {
                return new RdsInstanceResourceSetting(this);
            } 

        } 

    }
    public static class RdsInstanceResourceSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RdsInstanceResourceSetting")
        private java.util.List < RdsInstanceResourceSetting> rdsInstanceResourceSetting;

        private RdsInstanceResourceSettings(Builder builder) {
            this.rdsInstanceResourceSetting = builder.rdsInstanceResourceSetting;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RdsInstanceResourceSettings create() {
            return builder().build();
        }

        /**
         * @return rdsInstanceResourceSetting
         */
        public java.util.List < RdsInstanceResourceSetting> getRdsInstanceResourceSetting() {
            return this.rdsInstanceResourceSetting;
        }

        public static final class Builder {
            private java.util.List < RdsInstanceResourceSetting> rdsInstanceResourceSetting; 

            /**
             * RdsInstanceResourceSetting.
             */
            public Builder rdsInstanceResourceSetting(java.util.List < RdsInstanceResourceSetting> rdsInstanceResourceSetting) {
                this.rdsInstanceResourceSetting = rdsInstanceResourceSetting;
                return this;
            }

            public RdsInstanceResourceSettings build() {
                return new RdsInstanceResourceSettings(this);
            } 

        } 

    }
}
