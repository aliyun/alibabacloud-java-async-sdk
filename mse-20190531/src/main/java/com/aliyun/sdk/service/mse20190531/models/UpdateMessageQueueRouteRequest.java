// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageQueueRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateMessageQueueRouteRequest</p>
 */
public class UpdateMessageQueueRouteRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AppName")
    @Validation(maxLength = 64)
    private String appName;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("FilterSide")
    private String filterSide;

    @Query
    @NameInMap("Namespace")
    @Validation(maxLength = 64)
    private String namespace;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("Tags")
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
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 应用名称
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Specifies whether the canary release for messaging feature is enabled for the application. Valid values:
         * <p>
         * 
         * *   `true`: enabled
         * *   `false`: disabled
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The side for message filtering when the canary release for messaging feature is enabled.
         */
        public Builder filterSide(String filterSide) {
            this.putQueryParameter("FilterSide", filterSide);
            this.filterSide = filterSide;
            return this;
        }

        /**
         * MSE命名空间名字
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The tag that is negligible for the untagged environment of the application.
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
