// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAssetCleanConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAssetCleanConfigRequest</p>
 */
public class ModifyAssetCleanConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetCleanConfigs")
    private java.util.List < AssetCleanConfigs> assetCleanConfigs;

    private ModifyAssetCleanConfigRequest(Builder builder) {
        super(builder);
        this.assetCleanConfigs = builder.assetCleanConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAssetCleanConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetCleanConfigs
     */
    public java.util.List < AssetCleanConfigs> getAssetCleanConfigs() {
        return this.assetCleanConfigs;
    }

    public static final class Builder extends Request.Builder<ModifyAssetCleanConfigRequest, Builder> {
        private java.util.List < AssetCleanConfigs> assetCleanConfigs; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAssetCleanConfigRequest request) {
            super(request);
            this.assetCleanConfigs = request.assetCleanConfigs;
        } 

        /**
         * The asset cleanup configurations.
         */
        public Builder assetCleanConfigs(java.util.List < AssetCleanConfigs> assetCleanConfigs) {
            this.putQueryParameter("AssetCleanConfigs", assetCleanConfigs);
            this.assetCleanConfigs = assetCleanConfigs;
            return this;
        }

        @Override
        public ModifyAssetCleanConfigRequest build() {
            return new ModifyAssetCleanConfigRequest(this);
        } 

    } 

    public static class AssetCleanConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CleanDays")
        private Integer cleanDays;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private AssetCleanConfigs(Builder builder) {
            this.cleanDays = builder.cleanDays;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetCleanConfigs create() {
            return builder().build();
        }

        /**
         * @return cleanDays
         */
        public Integer getCleanDays() {
            return this.cleanDays;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer cleanDays; 
            private Integer status; 
            private Integer type; 

            /**
             * The number of days before hosts whose provider cannot be identified are automatically cleaned after they enter the offline state. Valid value: an integer that ranges from 1 to 30.
             */
            public Builder cleanDays(Integer cleanDays) {
                this.cleanDays = cleanDays;
                return this;
            }

            /**
             * Specifies whether to enable the feature of cleaning the offline hosts whose provider cannot be identified. Valid values:
             * <p>
             * 
             * *   **0**: disables the feature.
             * *   **1**: enables the feature.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The type of hosts that you want to clean.
             * <p>
             * 
             * Set the value to **1**, which indicates hosts whose provider cannot be identified.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public AssetCleanConfigs build() {
                return new AssetCleanConfigs(this);
            } 

        } 

    }
}
