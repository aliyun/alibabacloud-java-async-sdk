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
 * {@link AddLiveAIProduceRulesRequest} extends {@link RequestModel}
 *
 * <p>AddLiveAIProduceRulesRequest</p>
 */
public class AddLiveAIProduceRulesRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudioName")
    private String studioName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtitleName")
    private String subtitleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Suffix")
    private String suffix;

    private AddLiveAIProduceRulesRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.description = builder.description;
        this.domain = builder.domain;
        this.isLazy = builder.isLazy;
        this.liveTemplate = builder.liveTemplate;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.studioName = builder.studioName;
        this.subtitleName = builder.subtitleName;
        this.suffix = builder.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveAIProduceRulesRequest create() {
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
     * @return studioName
     */
    public String getStudioName() {
        return this.studioName;
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

    public static final class Builder extends Request.Builder<AddLiveAIProduceRulesRequest, Builder> {
        private String app; 
        private String description; 
        private String domain; 
        private Boolean isLazy; 
        private String liveTemplate; 
        private Long ownerId; 
        private String regionId; 
        private String studioName; 
        private String subtitleName; 
        private String suffix; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveAIProduceRulesRequest request) {
            super(request);
            this.app = request.app;
            this.description = request.description;
            this.domain = request.domain;
            this.isLazy = request.isLazy;
            this.liveTemplate = request.liveTemplate;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.studioName = request.studioName;
            this.subtitleName = request.subtitleName;
            this.suffix = request.suffix;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. The name can be up to 256 characters in length and can contain digits, letters, hyphens (-), and underscores (_). The name must be the same as the application name in the ingest URL. Otherwise, the rule does not take effect.</p>
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
         * <p>Specifies whether to trigger the subtitle rule when stream pulling starts. Valid values:</p>
         * <ul>
         * <li>true: generates live subtitles when stream pulling starts and stops generating live subtitles when no stream is pulled for 5 minutes. When stream pulling restarts, live subtitles are generated again.</li>
         * <li>false: generates live subtitles when stream ingest starts, regardless of whether stream pulling starts.</li>
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
         * <li><code>lp_ld</code>: landscape low definition 360p (640×360)</li>
         * <li><code>lp_ld_v</code>: portrait low definition 360p (360×640)</li>
         * <li><code>lp_sd</code>: landscape standard definition 480p (854×480)</li>
         * <li><code>lp_sd_v</code>: portrait standard definition 480p (480×854)</li>
         * <li><code>lp_hd</code>: landscape high definition 720p (1280×720)</li>
         * <li><code>lp_hd_v</code>: portrait high definition 720p (720×1280)</li>
         * <li><code>lp_ud</code>: landscape ultra-high definition 1080p (1920×1080)</li>
         * <li><code>lp_ud_v</code>: portrait ultra-high definition 1080p (1080×1920)</li>
         * </ul>
         * <p>This parameter is required.</p>
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
        public AddLiveAIProduceRulesRequest build() {
            return new AddLiveAIProduceRulesRequest(this);
        } 

    } 

}
