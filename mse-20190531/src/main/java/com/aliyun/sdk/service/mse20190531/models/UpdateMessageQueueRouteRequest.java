// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateMessageQueueRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageQueueRouteRequest</p>
 */
public class UpdateMessageQueueRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterSide")
    private String filterSide;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < String > tags;

    private UpdateMessageQueueRouteRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.filterSide = builder.filterSide;
        this.namespace = builder.namespace;
        this.region = builder.region;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMessageQueueRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return filterSide
     */
    public String getFilterSide() {
        return this.filterSide;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateMessageQueueRouteRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private Boolean enable; 
        private String filterSide; 
        private String namespace; 
        private String region; 
        private java.util.List < String > tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMessageQueueRouteRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.enable = request.enable;
            this.filterSide = request.filterSide;
            this.namespace = request.namespace;
            this.region = request.region;
            this.tags = request.tags;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@c3df23522baa898</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Specifies whether the canary release for messaging feature is enabled for the application. Valid values:</p>
         * <ul>
         * <li><code>true</code>: enabled</li>
         * <li><code>false</code>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The side for message filtering when the canary release for messaging feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Server</p>
         */
        public Builder filterSide(String filterSide) {
            this.putQueryParameter("FilterSide", filterSide);
            this.filterSide = filterSide;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The tag that is negligible for the untagged environment of the application.</p>
         */
        public Builder tags(java.util.List < String > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateMessageQueueRouteRequest build() {
            return new UpdateMessageQueueRouteRequest(this);
        } 

    } 

}
