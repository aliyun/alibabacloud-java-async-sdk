// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ModifySiteFeaturesRequest} extends {@link RequestModel}
 *
 * <p>ModifySiteFeaturesRequest</p>
 */
public class ModifySiteFeaturesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteFeatures")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteFeatures;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ModifySiteFeaturesRequest(Builder builder) {
        super(builder);
        this.newInstanceId = builder.newInstanceId;
        this.siteFeatures = builder.siteFeatures;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySiteFeaturesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newInstanceId
     */
    public String getNewInstanceId() {
        return this.newInstanceId;
    }

    /**
     * @return siteFeatures
     */
    public String getSiteFeatures() {
        return this.siteFeatures;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ModifySiteFeaturesRequest, Builder> {
        private String newInstanceId; 
        private String siteFeatures; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySiteFeaturesRequest request) {
            super(request);
            this.newInstanceId = request.newInstanceId;
            this.siteFeatures = request.siteFeatures;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-bl39ryjtineo</p>
         */
        public Builder newInstanceId(String newInstanceId) {
            this.putQueryParameter("NewInstanceId", newInstanceId);
            this.newInstanceId = newInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>network_optimization|smart_routing,loadbalance</p>
         */
        public Builder siteFeatures(String siteFeatures) {
            this.putQueryParameter("SiteFeatures", siteFeatures);
            this.siteFeatures = siteFeatures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1067072706415168</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ModifySiteFeaturesRequest build() {
            return new ModifySiteFeaturesRequest(this);
        } 

    } 

}
