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
 * {@link ModifyAssetCleanConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyAssetCleanConfigRequest</p>
 */
public class ModifyAssetCleanConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetCleanConfigs")
    private java.util.List<AssetCleanConfigs> assetCleanConfigs;

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
    public java.util.List<AssetCleanConfigs> getAssetCleanConfigs() {
        return this.assetCleanConfigs;
    }

    public static final class Builder extends Request.Builder<ModifyAssetCleanConfigRequest, Builder> {
        private java.util.List<AssetCleanConfigs> assetCleanConfigs; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAssetCleanConfigRequest request) {
            super(request);
            this.assetCleanConfigs = request.assetCleanConfigs;
        } 

        /**
         * <p>The asset cleanup configurations.</p>
         */
        public Builder assetCleanConfigs(java.util.List<AssetCleanConfigs> assetCleanConfigs) {
            this.putQueryParameter("AssetCleanConfigs", assetCleanConfigs);
            this.assetCleanConfigs = assetCleanConfigs;
            return this;
        }

        @Override
        public ModifyAssetCleanConfigRequest build() {
            return new ModifyAssetCleanConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAssetCleanConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyAssetCleanConfigRequest</p>
     */
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
             * <p>The number of days before hosts whose provider cannot be identified are automatically cleaned after they enter the offline state. Valid value: an integer that ranges from 1 to 30.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder cleanDays(Integer cleanDays) {
                this.cleanDays = cleanDays;
                return this;
            }

            /**
             * <p>Specifies whether to enable the feature of cleaning the offline hosts whose provider cannot be identified. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disables the feature.</li>
             * <li><strong>1</strong>: enables the feature.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of hosts that you want to clean.</p>
             * <p>Set the value to <strong>1</strong>, which indicates hosts whose provider cannot be identified.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
