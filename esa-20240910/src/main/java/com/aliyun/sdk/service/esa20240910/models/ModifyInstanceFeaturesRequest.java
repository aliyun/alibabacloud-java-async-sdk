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
 * {@link ModifyInstanceFeaturesRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceFeaturesRequest</p>
 */
public class ModifyInstanceFeaturesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteFeatures")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SiteFeatures> siteFeatures;

    private ModifyInstanceFeaturesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.siteFeatures = builder.siteFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceFeaturesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return siteFeatures
     */
    public java.util.List<SiteFeatures> getSiteFeatures() {
        return this.siteFeatures;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceFeaturesRequest, Builder> {
        private String instanceId; 
        private java.util.List<SiteFeatures> siteFeatures; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceFeaturesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.siteFeatures = request.siteFeatures;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-b6ga97vfo64g</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder siteFeatures(java.util.List<SiteFeatures> siteFeatures) {
            String siteFeaturesShrink = shrink(siteFeatures, "SiteFeatures", "json");
            this.putQueryParameter("SiteFeatures", siteFeaturesShrink);
            this.siteFeatures = siteFeatures;
            return this;
        }

        @Override
        public ModifyInstanceFeaturesRequest build() {
            return new ModifyInstanceFeaturesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceFeaturesRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceFeaturesRequest</p>
     */
    public static class SiteFeatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private String features;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        private SiteFeatures(Builder builder) {
            this.features = builder.features;
            this.siteId = builder.siteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteFeatures create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public String getFeatures() {
            return this.features;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        public static final class Builder {
            private String features; 
            private Long siteId; 

            private Builder() {
            } 

            private Builder(SiteFeatures model) {
                this.features = model.features;
                this.siteId = model.siteId;
            } 

            /**
             * Features.
             */
            public Builder features(String features) {
                this.features = features;
                return this;
            }

            /**
             * SiteId.
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            public SiteFeatures build() {
                return new SiteFeatures(this);
            } 

        } 

    }
}
