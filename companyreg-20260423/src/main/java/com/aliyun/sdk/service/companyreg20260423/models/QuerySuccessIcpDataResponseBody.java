// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20260423.models;

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
 * {@link QuerySuccessIcpDataResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySuccessIcpDataResponseBody</p>
 */
public class QuerySuccessIcpDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaSuccessDataWithRiskList")
    private java.util.List<BaSuccessDataWithRiskList> baSuccessDataWithRiskList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySuccessIcpDataResponseBody(Builder builder) {
        this.baSuccessDataWithRiskList = builder.baSuccessDataWithRiskList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySuccessIcpDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baSuccessDataWithRiskList
     */
    public java.util.List<BaSuccessDataWithRiskList> getBaSuccessDataWithRiskList() {
        return this.baSuccessDataWithRiskList;
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List<BaSuccessDataWithRiskList> baSuccessDataWithRiskList; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySuccessIcpDataResponseBody model) {
            this.baSuccessDataWithRiskList = model.baSuccessDataWithRiskList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * BaSuccessDataWithRiskList.
         */
        public Builder baSuccessDataWithRiskList(java.util.List<BaSuccessDataWithRiskList> baSuccessDataWithRiskList) {
            this.baSuccessDataWithRiskList = baSuccessDataWithRiskList;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1A13ABB5-7649-5031-B55C-D2E38F9F189D</p>
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

        public QuerySuccessIcpDataResponseBody build() {
            return new QuerySuccessIcpDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySuccessIcpDataResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySuccessIcpDataResponseBody</p>
     */
    public static class AppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppRecordNum")
        private String appRecordNum;

        @com.aliyun.core.annotation.NameInMap("DomainList")
        private java.util.List<String> domainList;

        @com.aliyun.core.annotation.NameInMap("ResponsiblePersonName")
        private String responsiblePersonName;

        private AppList(Builder builder) {
            this.appName = builder.appName;
            this.appRecordNum = builder.appRecordNum;
            this.domainList = builder.domainList;
            this.responsiblePersonName = builder.responsiblePersonName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appRecordNum
         */
        public String getAppRecordNum() {
            return this.appRecordNum;
        }

        /**
         * @return domainList
         */
        public java.util.List<String> getDomainList() {
            return this.domainList;
        }

        /**
         * @return responsiblePersonName
         */
        public String getResponsiblePersonName() {
            return this.responsiblePersonName;
        }

        public static final class Builder {
            private String appName; 
            private String appRecordNum; 
            private java.util.List<String> domainList; 
            private String responsiblePersonName; 

            private Builder() {
            } 

            private Builder(AppList model) {
                this.appName = model.appName;
                this.appRecordNum = model.appRecordNum;
                this.domainList = model.domainList;
                this.responsiblePersonName = model.responsiblePersonName;
            } 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppRecordNum.
             */
            public Builder appRecordNum(String appRecordNum) {
                this.appRecordNum = appRecordNum;
                return this;
            }

            /**
             * DomainList.
             */
            public Builder domainList(java.util.List<String> domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * ResponsiblePersonName.
             */
            public Builder responsiblePersonName(String responsiblePersonName) {
                this.responsiblePersonName = responsiblePersonName;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySuccessIcpDataResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySuccessIcpDataResponseBody</p>
     */
    public static class RiskDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RectifySuggestList")
        private java.util.List<String> rectifySuggestList;

        @com.aliyun.core.annotation.NameInMap("RiskSource")
        private String riskSource;

        private RiskDetailList(Builder builder) {
            this.rectifySuggestList = builder.rectifySuggestList;
            this.riskSource = builder.riskSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskDetailList create() {
            return builder().build();
        }

        /**
         * @return rectifySuggestList
         */
        public java.util.List<String> getRectifySuggestList() {
            return this.rectifySuggestList;
        }

        /**
         * @return riskSource
         */
        public String getRiskSource() {
            return this.riskSource;
        }

        public static final class Builder {
            private java.util.List<String> rectifySuggestList; 
            private String riskSource; 

            private Builder() {
            } 

            private Builder(RiskDetailList model) {
                this.rectifySuggestList = model.rectifySuggestList;
                this.riskSource = model.riskSource;
            } 

            /**
             * RectifySuggestList.
             */
            public Builder rectifySuggestList(java.util.List<String> rectifySuggestList) {
                this.rectifySuggestList = rectifySuggestList;
                return this;
            }

            /**
             * RiskSource.
             */
            public Builder riskSource(String riskSource) {
                this.riskSource = riskSource;
                return this;
            }

            public RiskDetailList build() {
                return new RiskDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySuccessIcpDataResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySuccessIcpDataResponseBody</p>
     */
    public static class RiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadLine")
        private String deadLine;

        @com.aliyun.core.annotation.NameInMap("RiskDetailList")
        private java.util.List<RiskDetailList> riskDetailList;

        private RiskList(Builder builder) {
            this.deadLine = builder.deadLine;
            this.riskDetailList = builder.riskDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskList create() {
            return builder().build();
        }

        /**
         * @return deadLine
         */
        public String getDeadLine() {
            return this.deadLine;
        }

        /**
         * @return riskDetailList
         */
        public java.util.List<RiskDetailList> getRiskDetailList() {
            return this.riskDetailList;
        }

        public static final class Builder {
            private String deadLine; 
            private java.util.List<RiskDetailList> riskDetailList; 

            private Builder() {
            } 

            private Builder(RiskList model) {
                this.deadLine = model.deadLine;
                this.riskDetailList = model.riskDetailList;
            } 

            /**
             * DeadLine.
             */
            public Builder deadLine(String deadLine) {
                this.deadLine = deadLine;
                return this;
            }

            /**
             * RiskDetailList.
             */
            public Builder riskDetailList(java.util.List<RiskDetailList> riskDetailList) {
                this.riskDetailList = riskDetailList;
                return this;
            }

            public RiskList build() {
                return new RiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySuccessIcpDataResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySuccessIcpDataResponseBody</p>
     */
    public static class WebsiteList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainList")
        private java.util.List<String> domainList;

        @com.aliyun.core.annotation.NameInMap("ResponsiblePersonName")
        private String responsiblePersonName;

        @com.aliyun.core.annotation.NameInMap("SiteName")
        private String siteName;

        @com.aliyun.core.annotation.NameInMap("SiteRecordNum")
        private String siteRecordNum;

        private WebsiteList(Builder builder) {
            this.domainList = builder.domainList;
            this.responsiblePersonName = builder.responsiblePersonName;
            this.siteName = builder.siteName;
            this.siteRecordNum = builder.siteRecordNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebsiteList create() {
            return builder().build();
        }

        /**
         * @return domainList
         */
        public java.util.List<String> getDomainList() {
            return this.domainList;
        }

        /**
         * @return responsiblePersonName
         */
        public String getResponsiblePersonName() {
            return this.responsiblePersonName;
        }

        /**
         * @return siteName
         */
        public String getSiteName() {
            return this.siteName;
        }

        /**
         * @return siteRecordNum
         */
        public String getSiteRecordNum() {
            return this.siteRecordNum;
        }

        public static final class Builder {
            private java.util.List<String> domainList; 
            private String responsiblePersonName; 
            private String siteName; 
            private String siteRecordNum; 

            private Builder() {
            } 

            private Builder(WebsiteList model) {
                this.domainList = model.domainList;
                this.responsiblePersonName = model.responsiblePersonName;
                this.siteName = model.siteName;
                this.siteRecordNum = model.siteRecordNum;
            } 

            /**
             * DomainList.
             */
            public Builder domainList(java.util.List<String> domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * ResponsiblePersonName.
             */
            public Builder responsiblePersonName(String responsiblePersonName) {
                this.responsiblePersonName = responsiblePersonName;
                return this;
            }

            /**
             * SiteName.
             */
            public Builder siteName(String siteName) {
                this.siteName = siteName;
                return this;
            }

            /**
             * SiteRecordNum.
             */
            public Builder siteRecordNum(String siteRecordNum) {
                this.siteRecordNum = siteRecordNum;
                return this;
            }

            public WebsiteList build() {
                return new WebsiteList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySuccessIcpDataResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySuccessIcpDataResponseBody</p>
     */
    public static class BaSuccessDataWithRiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppList")
        private java.util.List<AppList> appList;

        @com.aliyun.core.annotation.NameInMap("IcpNumber")
        private String icpNumber;

        @com.aliyun.core.annotation.NameInMap("OrganizersName")
        private String organizersName;

        @com.aliyun.core.annotation.NameInMap("OrganizersNature")
        private String organizersNature;

        @com.aliyun.core.annotation.NameInMap("ResponsiblePersonName")
        private String responsiblePersonName;

        @com.aliyun.core.annotation.NameInMap("RiskList")
        private java.util.List<RiskList> riskList;

        @com.aliyun.core.annotation.NameInMap("WebsiteList")
        private java.util.List<WebsiteList> websiteList;

        private BaSuccessDataWithRiskList(Builder builder) {
            this.appList = builder.appList;
            this.icpNumber = builder.icpNumber;
            this.organizersName = builder.organizersName;
            this.organizersNature = builder.organizersNature;
            this.responsiblePersonName = builder.responsiblePersonName;
            this.riskList = builder.riskList;
            this.websiteList = builder.websiteList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaSuccessDataWithRiskList create() {
            return builder().build();
        }

        /**
         * @return appList
         */
        public java.util.List<AppList> getAppList() {
            return this.appList;
        }

        /**
         * @return icpNumber
         */
        public String getIcpNumber() {
            return this.icpNumber;
        }

        /**
         * @return organizersName
         */
        public String getOrganizersName() {
            return this.organizersName;
        }

        /**
         * @return organizersNature
         */
        public String getOrganizersNature() {
            return this.organizersNature;
        }

        /**
         * @return responsiblePersonName
         */
        public String getResponsiblePersonName() {
            return this.responsiblePersonName;
        }

        /**
         * @return riskList
         */
        public java.util.List<RiskList> getRiskList() {
            return this.riskList;
        }

        /**
         * @return websiteList
         */
        public java.util.List<WebsiteList> getWebsiteList() {
            return this.websiteList;
        }

        public static final class Builder {
            private java.util.List<AppList> appList; 
            private String icpNumber; 
            private String organizersName; 
            private String organizersNature; 
            private String responsiblePersonName; 
            private java.util.List<RiskList> riskList; 
            private java.util.List<WebsiteList> websiteList; 

            private Builder() {
            } 

            private Builder(BaSuccessDataWithRiskList model) {
                this.appList = model.appList;
                this.icpNumber = model.icpNumber;
                this.organizersName = model.organizersName;
                this.organizersNature = model.organizersNature;
                this.responsiblePersonName = model.responsiblePersonName;
                this.riskList = model.riskList;
                this.websiteList = model.websiteList;
            } 

            /**
             * AppList.
             */
            public Builder appList(java.util.List<AppList> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * IcpNumber.
             */
            public Builder icpNumber(String icpNumber) {
                this.icpNumber = icpNumber;
                return this;
            }

            /**
             * OrganizersName.
             */
            public Builder organizersName(String organizersName) {
                this.organizersName = organizersName;
                return this;
            }

            /**
             * OrganizersNature.
             */
            public Builder organizersNature(String organizersNature) {
                this.organizersNature = organizersNature;
                return this;
            }

            /**
             * ResponsiblePersonName.
             */
            public Builder responsiblePersonName(String responsiblePersonName) {
                this.responsiblePersonName = responsiblePersonName;
                return this;
            }

            /**
             * RiskList.
             */
            public Builder riskList(java.util.List<RiskList> riskList) {
                this.riskList = riskList;
                return this;
            }

            /**
             * WebsiteList.
             */
            public Builder websiteList(java.util.List<WebsiteList> websiteList) {
                this.websiteList = websiteList;
                return this;
            }

            public BaSuccessDataWithRiskList build() {
                return new BaSuccessDataWithRiskList(this);
            } 

        } 

    }
}
