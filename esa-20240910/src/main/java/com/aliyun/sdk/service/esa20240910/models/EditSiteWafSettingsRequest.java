// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EditSiteWafSettingsRequest} extends {@link RequestModel}
 *
 * <p>EditSiteWafSettingsRequest</p>
 */
public class EditSiteWafSettingsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Settings")
    private WafSiteSettings settings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private EditSiteWafSettingsRequest(Builder builder) {
        super(builder);
        this.settings = builder.settings;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditSiteWafSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return settings
     */
    public WafSiteSettings getSettings() {
        return this.settings;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<EditSiteWafSettingsRequest, Builder> {
        private WafSiteSettings settings; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(EditSiteWafSettingsRequest request) {
            super(request);
            this.settings = request.settings;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * Settings.
         */
        public Builder settings(WafSiteSettings settings) {
            String settingsShrink = shrink(settings, "Settings", "json");
            this.putBodyParameter("Settings", settingsShrink);
            this.settings = settings;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public EditSiteWafSettingsRequest build() {
            return new EditSiteWafSettingsRequest(this);
        } 

    } 

}
