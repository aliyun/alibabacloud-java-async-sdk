// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAssetInfoPublishResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetInfoPublishResponseBody</p>
 */
public class ListAssetInfoPublishResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private java.util.List < AssetList> assetList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAssetInfoPublishResponseBody(Builder builder) {
        this.assetList = builder.assetList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetInfoPublishResponseBody create() {
        return builder().build();
    }

    /**
     * @return assetList
     */
    public java.util.List < AssetList> getAssetList() {
        return this.assetList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AssetList> assetList; 
        private String requestId; 

        /**
         * AssetList.
         */
        public Builder assetList(java.util.List < AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAssetInfoPublishResponseBody build() {
            return new ListAssetInfoPublishResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetInfoPublishResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetInfoPublishResponseBody</p>
     */
    public static class AssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurVersion")
        private String curVersion;

        @com.aliyun.core.annotation.NameInMap("LastUpgradeTime")
        private Long lastUpgradeTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UpgradeEnable")
        private Boolean upgradeEnable;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private AssetList(Builder builder) {
            this.curVersion = builder.curVersion;
            this.lastUpgradeTime = builder.lastUpgradeTime;
            this.status = builder.status;
            this.upgradeEnable = builder.upgradeEnable;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetList create() {
            return builder().build();
        }

        /**
         * @return curVersion
         */
        public String getCurVersion() {
            return this.curVersion;
        }

        /**
         * @return lastUpgradeTime
         */
        public Long getLastUpgradeTime() {
            return this.lastUpgradeTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return upgradeEnable
         */
        public Boolean getUpgradeEnable() {
            return this.upgradeEnable;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String curVersion; 
            private Long lastUpgradeTime; 
            private Integer status; 
            private Boolean upgradeEnable; 
            private String uuid; 

            /**
             * CurVersion.
             */
            public Builder curVersion(String curVersion) {
                this.curVersion = curVersion;
                return this;
            }

            /**
             * LastUpgradeTime.
             */
            public Builder lastUpgradeTime(Long lastUpgradeTime) {
                this.lastUpgradeTime = lastUpgradeTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UpgradeEnable.
             */
            public Builder upgradeEnable(Boolean upgradeEnable) {
                this.upgradeEnable = upgradeEnable;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AssetList build() {
                return new AssetList(this);
            } 

        } 

    }
}
