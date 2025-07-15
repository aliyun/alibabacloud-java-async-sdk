// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateLiveAIProduceRulesRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAIProduceRulesRequest</p>
 */
public class UpdateLiveAIProduceRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsLazy")
    private Boolean isLazy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveTemplate")
    private String liveTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RulesId")
    private String rulesId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudioName")
    private String studioName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleId")
    private String subtitleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleName")
    private String subtitleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Suffix")
    private String suffix;

    private UpdateLiveAIProduceRulesRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.description = builder.description;
        this.domain = builder.domain;
        this.isLazy = builder.isLazy;
        this.liveTemplate = builder.liveTemplate;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.rulesId = builder.rulesId;
        this.studioName = builder.studioName;
        this.subtitleId = builder.subtitleId;
        this.subtitleName = builder.subtitleName;
        this.suffix = builder.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveAIProduceRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return isLazy
     */
    public Boolean getIsLazy() {
        return this.isLazy;
    }

    /**
     * @return liveTemplate
     */
    public String getLiveTemplate() {
        return this.liveTemplate;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rulesId
     */
    public String getRulesId() {
        return this.rulesId;
    }

    /**
     * @return studioName
     */
    public String getStudioName() {
        return this.studioName;
    }

    /**
     * @return subtitleId
     */
    public String getSubtitleId() {
        return this.subtitleId;
    }

    /**
     * @return subtitleName
     */
    public String getSubtitleName() {
        return this.subtitleName;
    }

    /**
     * @return suffix
     */
    public String getSuffix() {
        return this.suffix;
    }

    public static final class Builder extends Request.Builder<UpdateLiveAIProduceRulesRequest, Builder> {
        private String app; 
        private String description; 
        private String domain; 
        private Boolean isLazy; 
        private String liveTemplate; 
        private Long ownerId; 
        private String regionId; 
        private String rulesId; 
        private String studioName; 
        private String subtitleId; 
        private String subtitleName; 
        private String suffix; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveAIProduceRulesRequest request) {
            super(request);
            this.app = request.app;
            this.description = request.description;
            this.domain = request.domain;
            this.isLazy = request.isLazy;
            this.liveTemplate = request.liveTemplate;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.rulesId = request.rulesId;
            this.studioName = request.studioName;
            this.subtitleId = request.subtitleId;
            this.subtitleName = request.subtitleName;
            this.suffix = request.suffix;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AppName</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The description of the subtitle rule. The description can be up to 128 characters in length and can contain letters, digits, and special characters.</p>
         * 
         * <strong>example:</strong>
         * <p>live AI subtitle template</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Specifies whether to generate live subtitles when stream pulling starts. Valid values:</p>
         * <ul>
         * <li>true: generates live subtitles when stream pulling starts and stops generating live subtitles when no streams are pulled for 5 minutes. When stream pulling restarts, live subtitles are generated again.</li>
         * <li>false: generates live subtitles when stream ingest starts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isLazy(Boolean isLazy) {
            this.putQueryParameter("IsLazy", isLazy);
            this.isLazy = isLazy;
            return this;
        }

        /**
         * <p>The specification of the output subtitles. Valid values:</p>
         * <ul>
         * <li><code>lp_ld</code>: 360p (640 × 360)</li>
         * <li><code>lp_ld_v</code>: 360p (360 × 640)</li>
         * <li><code>lp_sd</code>: 480p (854 × 480)</li>
         * <li><code>lp_sd_v</code>: 480p (480 × 854)</li>
         * <li><code>lp_hd</code>: 720p (1280 × 720)</li>
         * <li><code>lp_hd_v</code>: 720p (720 × 1280)</li>
         * <li><code>lp_ud</code>: 1080p (1920 × 1080)</li>
         * <li><code>lp_ud_v</code>: 1080p (1080 × 1920)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lp_ld</p>
         */
        public Builder liveTemplate(String liveTemplate) {
            this.putQueryParameter("LiveTemplate", liveTemplate);
            this.liveTemplate = liveTemplate;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the subtitle rule.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
         */
        public Builder rulesId(String rulesId) {
            this.putQueryParameter("RulesId", rulesId);
            this.rulesId = rulesId;
            return this;
        }

        /**
         * <p>The name of the virtual background template.</p>
         * 
         * <strong>example:</strong>
         * <p>sub02</p>
         */
        public Builder studioName(String studioName) {
            this.putQueryParameter("StudioName", studioName);
            this.studioName = studioName;
            return this;
        }

        /**
         * <p>The ID of the subtitle template.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder subtitleId(String subtitleId) {
            this.putQueryParameter("SubtitleId", subtitleId);
            this.subtitleId = subtitleId;
            return this;
        }

        /**
         * <p>The name of the subtitle template.</p>
         * 
         * <strong>example:</strong>
         * <p>sub01</p>
         */
        public Builder subtitleName(String subtitleName) {
            this.putQueryParameter("SubtitleName", subtitleName);
            this.subtitleName = subtitleName;
            return this;
        }

        /**
         * <p>The suffix to match.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder suffix(String suffix) {
            this.putQueryParameter("Suffix", suffix);
            this.suffix = suffix;
            return this;
        }

        @Override
        public UpdateLiveAIProduceRulesRequest build() {
            return new UpdateLiveAIProduceRulesRequest(this);
        } 

    } 

}
