// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppVersionResponseBody</p>
 */
public class GetAppVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    @com.aliyun.core.annotation.NameInMap("AppVersionName")
    private String appVersionName;

    @com.aliyun.core.annotation.NameInMap("AppVersionStatus")
    private String appVersionStatus;

    @com.aliyun.core.annotation.NameInMap("AppVersionStatusMemo")
    private String appVersionStatusMemo;

    @com.aliyun.core.annotation.NameInMap("ConsumeCu")
    private Double consumeCu;

    @com.aliyun.core.annotation.NameInMap("FileAddress")
    private String fileAddress;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("FileUploadFinishTime")
    private String fileUploadFinishTime;

    @com.aliyun.core.annotation.NameInMap("FileUploadType")
    private String fileUploadType;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAppVersionResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appVersionId = builder.appVersionId;
        this.appVersionName = builder.appVersionName;
        this.appVersionStatus = builder.appVersionStatus;
        this.appVersionStatusMemo = builder.appVersionStatusMemo;
        this.consumeCu = builder.consumeCu;
        this.fileAddress = builder.fileAddress;
        this.fileSize = builder.fileSize;
        this.fileUploadFinishTime = builder.fileUploadFinishTime;
        this.fileUploadType = builder.fileUploadType;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return appVersionName
     */
    public String getAppVersionName() {
        return this.appVersionName;
    }

    /**
     * @return appVersionStatus
     */
    public String getAppVersionStatus() {
        return this.appVersionStatus;
    }

    /**
     * @return appVersionStatusMemo
     */
    public String getAppVersionStatusMemo() {
        return this.appVersionStatusMemo;
    }

    /**
     * @return consumeCu
     */
    public Double getConsumeCu() {
        return this.consumeCu;
    }

    /**
     * @return fileAddress
     */
    public String getFileAddress() {
        return this.fileAddress;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return fileUploadFinishTime
     */
    public String getFileUploadFinishTime() {
        return this.fileUploadFinishTime;
    }

    /**
     * @return fileUploadType
     */
    public String getFileUploadType() {
        return this.fileUploadType;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String appVersionId; 
        private String appVersionName; 
        private String appVersionStatus; 
        private String appVersionStatusMemo; 
        private Double consumeCu; 
        private String fileAddress; 
        private Long fileSize; 
        private String fileUploadFinishTime; 
        private String fileUploadType; 
        private String gmtCreate; 
        private String gmtModified; 
        private String requestId; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * AppVersionName.
         */
        public Builder appVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }

        /**
         * AppVersionStatus.
         */
        public Builder appVersionStatus(String appVersionStatus) {
            this.appVersionStatus = appVersionStatus;
            return this;
        }

        /**
         * AppVersionStatusMemo.
         */
        public Builder appVersionStatusMemo(String appVersionStatusMemo) {
            this.appVersionStatusMemo = appVersionStatusMemo;
            return this;
        }

        /**
         * ConsumeCu.
         */
        public Builder consumeCu(Double consumeCu) {
            this.consumeCu = consumeCu;
            return this;
        }

        /**
         * FileAddress.
         */
        public Builder fileAddress(String fileAddress) {
            this.fileAddress = fileAddress;
            return this;
        }

        /**
         * FileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * FileUploadFinishTime.
         */
        public Builder fileUploadFinishTime(String fileUploadFinishTime) {
            this.fileUploadFinishTime = fileUploadFinishTime;
            return this;
        }

        /**
         * FileUploadType.
         */
        public Builder fileUploadType(String fileUploadType) {
            this.fileUploadType = fileUploadType;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAppVersionResponseBody build() {
            return new GetAppVersionResponseBody(this);
        } 

    } 

}
