// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link ModifyComponentAssetRequest} extends {@link RequestModel}
 *
 * <p>ModifyComponentAssetRequest</p>
 */
public class ModifyComponentAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ModifyComponentAssetRequest(Builder builder) {
        super(builder);
        this.assetConfig = builder.assetConfig;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyComponentAssetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetConfig
     */
    public String getAssetConfig() {
        return this.assetConfig;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ModifyComponentAssetRequest, Builder> {
        private String assetConfig; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ModifyComponentAssetRequest request) {
            super(request);
            this.assetConfig = request.assetConfig;
            this.lang = request.lang;
        } 

        /**
         * <p>The configuration of the asset. The value is a JSON object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;name&quot;: &quot;test asset&quot;,
         *     &quot;componentName&quot;: &quot;SLS&quot;,
         *     &quot;params&quot;: [
         *         {
         *             &quot;name&quot;: &quot;end_point&quot;,
         *             &quot;value&quot;: &quot;xxx&quot;
         *         },
         *         {
         *             &quot;name&quot;: &quot;sub_id&quot;,
         *             &quot;value&quot;: &quot;xxxx&quot;
         *         },
         *         {
         *             &quot;name&quot;: &quot;access_key&quot;,
         *             &quot;value&quot;: &quot;xxxx&quot;
         *         }
         *     ]
         * }</p>
         */
        public Builder assetConfig(String assetConfig) {
            this.putQueryParameter("AssetConfig", assetConfig);
            this.assetConfig = assetConfig;
            return this;
        }

        /**
         * <p>The language of the content within the request and response.</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ModifyComponentAssetRequest build() {
            return new ModifyComponentAssetRequest(this);
        } 

    } 

}
