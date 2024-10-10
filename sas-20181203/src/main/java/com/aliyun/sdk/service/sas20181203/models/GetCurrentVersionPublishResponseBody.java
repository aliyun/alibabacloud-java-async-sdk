// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCurrentVersionPublishResponseBody} extends {@link TeaModel}
 *
 * <p>GetCurrentVersionPublishResponseBody</p>
 */
public class GetCurrentVersionPublishResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCurrentVersionPublishResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCurrentVersionPublishResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCurrentVersionPublishResponseBody build() {
            return new GetCurrentVersionPublishResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCurrentVersionPublishResponseBody} extends {@link TeaModel}
     *
     * <p>GetCurrentVersionPublishResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoUpgrade")
        private Integer autoUpgrade;

        @com.aliyun.core.annotation.NameInMap("BigCustomer")
        private Boolean bigCustomer;

        @com.aliyun.core.annotation.NameInMap("CurVersion")
        private String curVersion;

        @com.aliyun.core.annotation.NameInMap("ForceUpgradeTime")
        private Long forceUpgradeTime;

        @com.aliyun.core.annotation.NameInMap("GraySwitchStatus")
        private Integer graySwitchStatus;

        @com.aliyun.core.annotation.NameInMap("LatestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("LatestVersionCreate")
        private Long latestVersionCreate;

        @com.aliyun.core.annotation.NameInMap("LatestVersionDesc")
        private String latestVersionDesc;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private Integer publishStatus;

        @com.aliyun.core.annotation.NameInMap("UpgradeVersion")
        private String upgradeVersion;

        private Data(Builder builder) {
            this.autoUpgrade = builder.autoUpgrade;
            this.bigCustomer = builder.bigCustomer;
            this.curVersion = builder.curVersion;
            this.forceUpgradeTime = builder.forceUpgradeTime;
            this.graySwitchStatus = builder.graySwitchStatus;
            this.latestVersion = builder.latestVersion;
            this.latestVersionCreate = builder.latestVersionCreate;
            this.latestVersionDesc = builder.latestVersionDesc;
            this.publishStatus = builder.publishStatus;
            this.upgradeVersion = builder.upgradeVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoUpgrade
         */
        public Integer getAutoUpgrade() {
            return this.autoUpgrade;
        }

        /**
         * @return bigCustomer
         */
        public Boolean getBigCustomer() {
            return this.bigCustomer;
        }

        /**
         * @return curVersion
         */
        public String getCurVersion() {
            return this.curVersion;
        }

        /**
         * @return forceUpgradeTime
         */
        public Long getForceUpgradeTime() {
            return this.forceUpgradeTime;
        }

        /**
         * @return graySwitchStatus
         */
        public Integer getGraySwitchStatus() {
            return this.graySwitchStatus;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return latestVersionCreate
         */
        public Long getLatestVersionCreate() {
            return this.latestVersionCreate;
        }

        /**
         * @return latestVersionDesc
         */
        public String getLatestVersionDesc() {
            return this.latestVersionDesc;
        }

        /**
         * @return publishStatus
         */
        public Integer getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return upgradeVersion
         */
        public String getUpgradeVersion() {
            return this.upgradeVersion;
        }

        public static final class Builder {
            private Integer autoUpgrade; 
            private Boolean bigCustomer; 
            private String curVersion; 
            private Long forceUpgradeTime; 
            private Integer graySwitchStatus; 
            private String latestVersion; 
            private Long latestVersionCreate; 
            private String latestVersionDesc; 
            private Integer publishStatus; 
            private String upgradeVersion; 

            /**
             * AutoUpgrade.
             */
            public Builder autoUpgrade(Integer autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * BigCustomer.
             */
            public Builder bigCustomer(Boolean bigCustomer) {
                this.bigCustomer = bigCustomer;
                return this;
            }

            /**
             * CurVersion.
             */
            public Builder curVersion(String curVersion) {
                this.curVersion = curVersion;
                return this;
            }

            /**
             * ForceUpgradeTime.
             */
            public Builder forceUpgradeTime(Long forceUpgradeTime) {
                this.forceUpgradeTime = forceUpgradeTime;
                return this;
            }

            /**
             * GraySwitchStatus.
             */
            public Builder graySwitchStatus(Integer graySwitchStatus) {
                this.graySwitchStatus = graySwitchStatus;
                return this;
            }

            /**
             * LatestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * LatestVersionCreate.
             */
            public Builder latestVersionCreate(Long latestVersionCreate) {
                this.latestVersionCreate = latestVersionCreate;
                return this;
            }

            /**
             * LatestVersionDesc.
             */
            public Builder latestVersionDesc(String latestVersionDesc) {
                this.latestVersionDesc = latestVersionDesc;
                return this;
            }

            /**
             * PublishStatus.
             */
            public Builder publishStatus(Integer publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * UpgradeVersion.
             */
            public Builder upgradeVersion(String upgradeVersion) {
                this.upgradeVersion = upgradeVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
