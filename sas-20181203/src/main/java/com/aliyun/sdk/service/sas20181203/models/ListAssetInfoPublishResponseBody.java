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
 * {@link ListAssetInfoPublishResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetInfoPublishResponseBody</p>
 */
public class ListAssetInfoPublishResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssetList")
    private java.util.List<AssetList> assetList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetList
     */
    public java.util.List<AssetList> getAssetList() {
        return this.assetList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AssetList> assetList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAssetInfoPublishResponseBody model) {
            this.assetList = model.assetList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The server list information.</p>
         */
        public Builder assetList(java.util.List<AssetList> assetList) {
            this.assetList = assetList;
            return this;
        }

        /**
         * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3956048F-9D73-5EDB-834B-4827BB483977</p>
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

            private Builder() {
            } 

            private Builder(AssetList model) {
                this.curVersion = model.curVersion;
                this.lastUpgradeTime = model.lastUpgradeTime;
                this.status = model.status;
                this.upgradeEnable = model.upgradeEnable;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The current client version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.8</p>
             */
            public Builder curVersion(String curVersion) {
                this.curVersion = curVersion;
                return this;
            }

            /**
             * <p>The time of the last upgrade. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1724522400000</p>
             */
            public Builder lastUpgradeTime(Long lastUpgradeTime) {
                this.lastUpgradeTime = lastUpgradeTime;
                return this;
            }

            /**
             * <p>The client release status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Not started.</li>
             * <li><strong>1</strong>: Publishing.</li>
             * <li><strong>2</strong>: Publishing completed.</li>
             * <li><strong>3</strong>: Publishing paused.</li>
             * <li><strong>4</strong>: Force upgrading.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Indicates whether the upgrade is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Not enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder upgradeEnable(Boolean upgradeEnable) {
                this.upgradeEnable = upgradeEnable;
                return this;
            }

            /**
             * <p>The UUID of the Security Center asset.</p>
             * 
             * <strong>example:</strong>
             * <p>2a98f149-0256-414c-a29a-a69f8a75****</p>
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
