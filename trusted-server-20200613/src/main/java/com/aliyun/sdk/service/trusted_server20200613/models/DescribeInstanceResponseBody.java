// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Extensions")
    private String extensions;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("GmtRecentReport")
    private Long gmtRecentReport;

    @NameInMap("OnlineStatus")
    private Integer onlineStatus;

    @NameInMap("ProgramExceptionNum")
    private Integer programExceptionNum;

    @NameInMap("ProgramTrustDetail")
    private String programTrustDetail;

    @NameInMap("ProgramTrustStatus")
    private Integer programTrustStatus;

    @NameInMap("ProgramWhiteListId")
    private Integer programWhiteListId;

    @NameInMap("ProgramWhiteListName")
    private String programWhiteListName;

    @NameInMap("PropertyAffiliation")
    private Integer propertyAffiliation;

    @NameInMap("PropertyName")
    private String propertyName;

    @NameInMap("PropertyPrivateIp")
    private String propertyPrivateIp;

    @NameInMap("PropertyPublicIp")
    private String propertyPublicIp;

    @NameInMap("PropertyUuid")
    private String propertyUuid;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemExceptionNum")
    private Integer systemExceptionNum;

    @NameInMap("SystemTrustDetail")
    private String systemTrustDetail;

    @NameInMap("SystemTrustStatus")
    private Integer systemTrustStatus;

    @NameInMap("SystemWhiteListId")
    private Integer systemWhiteListId;

    private DescribeInstanceResponseBody(Builder builder) {
        this.extensions = builder.extensions;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.gmtRecentReport = builder.gmtRecentReport;
        this.onlineStatus = builder.onlineStatus;
        this.programExceptionNum = builder.programExceptionNum;
        this.programTrustDetail = builder.programTrustDetail;
        this.programTrustStatus = builder.programTrustStatus;
        this.programWhiteListId = builder.programWhiteListId;
        this.programWhiteListName = builder.programWhiteListName;
        this.propertyAffiliation = builder.propertyAffiliation;
        this.propertyName = builder.propertyName;
        this.propertyPrivateIp = builder.propertyPrivateIp;
        this.propertyPublicIp = builder.propertyPublicIp;
        this.propertyUuid = builder.propertyUuid;
        this.requestId = builder.requestId;
        this.systemExceptionNum = builder.systemExceptionNum;
        this.systemTrustDetail = builder.systemTrustDetail;
        this.systemTrustStatus = builder.systemTrustStatus;
        this.systemWhiteListId = builder.systemWhiteListId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
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
     * @return gmtRecentReport
     */
    public Long getGmtRecentReport() {
        return this.gmtRecentReport;
    }

    /**
     * @return onlineStatus
     */
    public Integer getOnlineStatus() {
        return this.onlineStatus;
    }

    /**
     * @return programExceptionNum
     */
    public Integer getProgramExceptionNum() {
        return this.programExceptionNum;
    }

    /**
     * @return programTrustDetail
     */
    public String getProgramTrustDetail() {
        return this.programTrustDetail;
    }

    /**
     * @return programTrustStatus
     */
    public Integer getProgramTrustStatus() {
        return this.programTrustStatus;
    }

    /**
     * @return programWhiteListId
     */
    public Integer getProgramWhiteListId() {
        return this.programWhiteListId;
    }

    /**
     * @return programWhiteListName
     */
    public String getProgramWhiteListName() {
        return this.programWhiteListName;
    }

    /**
     * @return propertyAffiliation
     */
    public Integer getPropertyAffiliation() {
        return this.propertyAffiliation;
    }

    /**
     * @return propertyName
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * @return propertyPrivateIp
     */
    public String getPropertyPrivateIp() {
        return this.propertyPrivateIp;
    }

    /**
     * @return propertyPublicIp
     */
    public String getPropertyPublicIp() {
        return this.propertyPublicIp;
    }

    /**
     * @return propertyUuid
     */
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemExceptionNum
     */
    public Integer getSystemExceptionNum() {
        return this.systemExceptionNum;
    }

    /**
     * @return systemTrustDetail
     */
    public String getSystemTrustDetail() {
        return this.systemTrustDetail;
    }

    /**
     * @return systemTrustStatus
     */
    public Integer getSystemTrustStatus() {
        return this.systemTrustStatus;
    }

    /**
     * @return systemWhiteListId
     */
    public Integer getSystemWhiteListId() {
        return this.systemWhiteListId;
    }

    public static final class Builder {
        private String extensions; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private Long gmtRecentReport; 
        private Integer onlineStatus; 
        private Integer programExceptionNum; 
        private String programTrustDetail; 
        private Integer programTrustStatus; 
        private Integer programWhiteListId; 
        private String programWhiteListName; 
        private Integer propertyAffiliation; 
        private String propertyName; 
        private String propertyPrivateIp; 
        private String propertyPublicIp; 
        private String propertyUuid; 
        private String requestId; 
        private Integer systemExceptionNum; 
        private String systemTrustDetail; 
        private Integer systemTrustStatus; 
        private Integer systemWhiteListId; 

        /**
         * Extensions.
         */
        public Builder extensions(String extensions) {
            this.extensions = extensions;
            return this;
        }

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
         * GmtRecentReport.
         */
        public Builder gmtRecentReport(Long gmtRecentReport) {
            this.gmtRecentReport = gmtRecentReport;
            return this;
        }

        /**
         * OnlineStatus.
         */
        public Builder onlineStatus(Integer onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }

        /**
         * ProgramExceptionNum.
         */
        public Builder programExceptionNum(Integer programExceptionNum) {
            this.programExceptionNum = programExceptionNum;
            return this;
        }

        /**
         * ProgramTrustDetail.
         */
        public Builder programTrustDetail(String programTrustDetail) {
            this.programTrustDetail = programTrustDetail;
            return this;
        }

        /**
         * ProgramTrustStatus.
         */
        public Builder programTrustStatus(Integer programTrustStatus) {
            this.programTrustStatus = programTrustStatus;
            return this;
        }

        /**
         * ProgramWhiteListId.
         */
        public Builder programWhiteListId(Integer programWhiteListId) {
            this.programWhiteListId = programWhiteListId;
            return this;
        }

        /**
         * ProgramWhiteListName.
         */
        public Builder programWhiteListName(String programWhiteListName) {
            this.programWhiteListName = programWhiteListName;
            return this;
        }

        /**
         * PropertyAffiliation.
         */
        public Builder propertyAffiliation(Integer propertyAffiliation) {
            this.propertyAffiliation = propertyAffiliation;
            return this;
        }

        /**
         * PropertyName.
         */
        public Builder propertyName(String propertyName) {
            this.propertyName = propertyName;
            return this;
        }

        /**
         * PropertyPrivateIp.
         */
        public Builder propertyPrivateIp(String propertyPrivateIp) {
            this.propertyPrivateIp = propertyPrivateIp;
            return this;
        }

        /**
         * PropertyPublicIp.
         */
        public Builder propertyPublicIp(String propertyPublicIp) {
            this.propertyPublicIp = propertyPublicIp;
            return this;
        }

        /**
         * PropertyUuid.
         */
        public Builder propertyUuid(String propertyUuid) {
            this.propertyUuid = propertyUuid;
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
         * SystemExceptionNum.
         */
        public Builder systemExceptionNum(Integer systemExceptionNum) {
            this.systemExceptionNum = systemExceptionNum;
            return this;
        }

        /**
         * SystemTrustDetail.
         */
        public Builder systemTrustDetail(String systemTrustDetail) {
            this.systemTrustDetail = systemTrustDetail;
            return this;
        }

        /**
         * SystemTrustStatus.
         */
        public Builder systemTrustStatus(Integer systemTrustStatus) {
            this.systemTrustStatus = systemTrustStatus;
            return this;
        }

        /**
         * SystemWhiteListId.
         */
        public Builder systemWhiteListId(Integer systemWhiteListId) {
            this.systemWhiteListId = systemWhiteListId;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

}
