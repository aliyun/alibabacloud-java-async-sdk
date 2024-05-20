// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppVersionResponseBody</p>
 */
public class ListAppVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("Versions")
    private java.util.List < Versions> versions;

    private ListAppVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return versions
     */
    public java.util.List < Versions> getVersions() {
        return this.versions;
    }

    public static final class Builder {
        private String requestId; 
        private Long total; 
        private java.util.List < Versions> versions; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * Versions.
         */
        public Builder versions(java.util.List < Versions> versions) {
            this.versions = versions;
            return this;
        }

        public ListAppVersionResponseBody build() {
            return new ListAppVersionResponseBody(this);
        } 

    } 

    public static class Versions extends TeaModel {
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

        private Versions(Builder builder) {
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
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
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

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
}
