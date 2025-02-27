// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateAdInsertionRequest} extends {@link RequestModel}
 *
 * <p>UpdateAdInsertionRequest</p>
 */
public class UpdateAdInsertionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdMarkerPassthrough")
    private String adMarkerPassthrough;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdsUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adsUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CdnAdSegmentUrlPrefix")
    private String cdnAdSegmentUrlPrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CdnContentSegmentUrlPrefix")
    private String cdnContentSegmentUrlPrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigAliases")
    private String configAliases;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentUrlPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentUrlPrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PersonalizationThreshold")
    private Integer personalizationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlateAdUrl")
    private String slateAdUrl;

    private UpdateAdInsertionRequest(Builder builder) {
        super(builder);
        this.adMarkerPassthrough = builder.adMarkerPassthrough;
        this.adsUrl = builder.adsUrl;
        this.cdnAdSegmentUrlPrefix = builder.cdnAdSegmentUrlPrefix;
        this.cdnContentSegmentUrlPrefix = builder.cdnContentSegmentUrlPrefix;
        this.configAliases = builder.configAliases;
        this.contentUrlPrefix = builder.contentUrlPrefix;
        this.name = builder.name;
        this.personalizationThreshold = builder.personalizationThreshold;
        this.slateAdUrl = builder.slateAdUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAdInsertionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adMarkerPassthrough
     */
    public String getAdMarkerPassthrough() {
        return this.adMarkerPassthrough;
    }

    /**
     * @return adsUrl
     */
    public String getAdsUrl() {
        return this.adsUrl;
    }

    /**
     * @return cdnAdSegmentUrlPrefix
     */
    public String getCdnAdSegmentUrlPrefix() {
        return this.cdnAdSegmentUrlPrefix;
    }

    /**
     * @return cdnContentSegmentUrlPrefix
     */
    public String getCdnContentSegmentUrlPrefix() {
        return this.cdnContentSegmentUrlPrefix;
    }

    /**
     * @return configAliases
     */
    public String getConfigAliases() {
        return this.configAliases;
    }

    /**
     * @return contentUrlPrefix
     */
    public String getContentUrlPrefix() {
        return this.contentUrlPrefix;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return personalizationThreshold
     */
    public Integer getPersonalizationThreshold() {
        return this.personalizationThreshold;
    }

    /**
     * @return slateAdUrl
     */
    public String getSlateAdUrl() {
        return this.slateAdUrl;
    }

    public static final class Builder extends Request.Builder<UpdateAdInsertionRequest, Builder> {
        private String adMarkerPassthrough; 
        private String adsUrl; 
        private String cdnAdSegmentUrlPrefix; 
        private String cdnContentSegmentUrlPrefix; 
        private String configAliases; 
        private String contentUrlPrefix; 
        private String name; 
        private Integer personalizationThreshold; 
        private String slateAdUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAdInsertionRequest request) {
            super(request);
            this.adMarkerPassthrough = request.adMarkerPassthrough;
            this.adsUrl = request.adsUrl;
            this.cdnAdSegmentUrlPrefix = request.cdnAdSegmentUrlPrefix;
            this.cdnContentSegmentUrlPrefix = request.cdnContentSegmentUrlPrefix;
            this.configAliases = request.configAliases;
            this.contentUrlPrefix = request.contentUrlPrefix;
            this.name = request.name;
            this.personalizationThreshold = request.personalizationThreshold;
            this.slateAdUrl = request.slateAdUrl;
        } 

        /**
         * <p>Specifies whether to enable ad marker passthrough. Default value: OFF.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OFF: Disable.</li>
         * <li>ON: Enable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder adMarkerPassthrough(String adMarkerPassthrough) {
            this.putBodyParameter("AdMarkerPassthrough", adMarkerPassthrough);
            this.adMarkerPassthrough = adMarkerPassthrough;
            return this;
        }

        /**
         * <p>The request URL of the ad decision server (ADS). HTTP and HTTPS are supported. The maximum length is 2,048 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ads.com/ad1?param1=%5Bpalyer_params.p1%5D">http://ads.com/ad1?param1=[palyer_params.p1]</a></p>
         */
        public Builder adsUrl(String adsUrl) {
            this.putBodyParameter("AdsUrl", adsUrl);
            this.adsUrl = adsUrl;
            return this;
        }

        /**
         * <p>The CDN prefix for ad segments. HTTP and HTTPS are supported. The maximum length is 512 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        public Builder cdnAdSegmentUrlPrefix(String cdnAdSegmentUrlPrefix) {
            this.putBodyParameter("CdnAdSegmentUrlPrefix", cdnAdSegmentUrlPrefix);
            this.cdnAdSegmentUrlPrefix = cdnAdSegmentUrlPrefix;
            return this;
        }

        /**
         * <p>The CDN prefix for content segments. HTTP and HTTPS are supported. The maximum length is 512 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://cdn.com/">http://cdn.com/</a></p>
         */
        public Builder cdnContentSegmentUrlPrefix(String cdnContentSegmentUrlPrefix) {
            this.putBodyParameter("CdnContentSegmentUrlPrefix", cdnContentSegmentUrlPrefix);
            this.cdnContentSegmentUrlPrefix = cdnContentSegmentUrlPrefix;
            return this;
        }

        /**
         * <p>A JSON string that specifies the player parameter variables and aliases. Format: { &quot;player_params.{name}&quot;: { &quot;{key}&quot;: &quot;{value}&quot; } }. You can add up to 20 player_params.{name} entries. The name field can be up to 150 characters in length. Each player parameter can include up to 50 key-value pairs. A key can be up to 150 characters long, and a value can be up to 500 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;player_params.p1&quot;: { &quot;1&quot;: &quot;abc&quot; } }</p>
         */
        public Builder configAliases(String configAliases) {
            this.putBodyParameter("ConfigAliases", configAliases);
            this.configAliases = configAliases;
            return this;
        }

        /**
         * <p>The URL prefix for the source content. HTTP and HTTPS are supported. The maximum length is 512 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://source.com/">https://source.com/</a></p>
         */
        public Builder contentUrlPrefix(String contentUrlPrefix) {
            this.putBodyParameter("ContentUrlPrefix", contentUrlPrefix);
            this.contentUrlPrefix = contentUrlPrefix;
            return this;
        }

        /**
         * <p>The configuration name, which cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_ad</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies the maximum duration of underfilled time allowed in an ad break. Unit: seconds. Default value: 8 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder personalizationThreshold(Integer personalizationThreshold) {
            this.putBodyParameter("PersonalizationThreshold", personalizationThreshold);
            this.personalizationThreshold = personalizationThreshold;
            return this;
        }

        /**
         * <p>The HTTP or HTTPS URL of the slate ad. Only MP4 format is supported. The maximum length is 2,048 characters.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://storage.com/slate1.mp4">http://storage.com/slate1.mp4</a></p>
         */
        public Builder slateAdUrl(String slateAdUrl) {
            this.putBodyParameter("SlateAdUrl", slateAdUrl);
            this.slateAdUrl = slateAdUrl;
            return this;
        }

        @Override
        public UpdateAdInsertionRequest build() {
            return new UpdateAdInsertionRequest(this);
        } 

    } 

}
