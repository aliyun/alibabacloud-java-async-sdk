// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCurrentVersionPublishResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E67FE</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.autoUpgrade = model.autoUpgrade;
                this.bigCustomer = model.bigCustomer;
                this.curVersion = model.curVersion;
                this.forceUpgradeTime = model.forceUpgradeTime;
                this.graySwitchStatus = model.graySwitchStatus;
                this.latestVersion = model.latestVersion;
                this.latestVersionCreate = model.latestVersionCreate;
                this.latestVersionDesc = model.latestVersionDesc;
                this.publishStatus = model.publishStatus;
                this.upgradeVersion = model.upgradeVersion;
            } 

            /**
             * <p>Indicates whether automatic upgrade is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Enabled.</li>
             * <li><strong>0</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder autoUpgrade(Integer autoUpgrade) {
                this.autoUpgrade = autoUpgrade;
                return this;
            }

            /**
             * <p>Indicates whether the current user supports custom upgrades in Security Center. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Supported.</li>
             * <li><strong>false</strong>: Not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bigCustomer(Boolean bigCustomer) {
                this.bigCustomer = bigCustomer;
                return this;
            }

            /**
             * <p>The current version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.8</p>
             */
            public Builder curVersion(String curVersion) {
                this.curVersion = curVersion;
                return this;
            }

            /**
             * <p>The timestamp for the forced client upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>1732506308000</p>
             */
            public Builder forceUpgradeTime(Long forceUpgradeTime) {
                this.forceUpgradeTime = forceUpgradeTime;
                return this;
            }

            /**
             * <p>Indicates whether the canary release policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Enabled.</li>
             * <li><strong>0</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder graySwitchStatus(Integer graySwitchStatus) {
                this.graySwitchStatus = graySwitchStatus;
                return this;
            }

            /**
             * <p>The latest client version number.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.9</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>The timestamp when the latest client version was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1662639150000</p>
             */
            public Builder latestVersionCreate(Long latestVersionCreate) {
                this.latestVersionCreate = latestVersionCreate;
                return this;
            }

            /**
             * <p>The description of the latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder latestVersionDesc(String latestVersionDesc) {
                this.latestVersionDesc = latestVersionDesc;
                return this;
            }

            /**
             * <p>The release status of the current version. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not started.</li>
             * <li><strong>1</strong>: Being released.</li>
             * <li><strong>2</strong>: Release completed.</li>
             * <li><strong>3</strong>: Release paused.</li>
             * <li><strong>4</strong>: Forced upgrade in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder publishStatus(Integer publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * <p>The target version to upgrade to.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.9</p>
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
