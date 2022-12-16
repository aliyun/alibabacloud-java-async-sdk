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
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("FilterSide")
    private String filterSide;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("Tags")
    @Validation(required = true)
    private java.util.List < String > tags;

    private UpdateMessageQueueRouteRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.enable = builder.enable;
        this.filterSide = builder.filterSide;
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
        private Boolean enable; 
        private String filterSide; 
        private String region; 
        private java.util.List < String > tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMessageQueueRouteRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.enable = request.enable;
            this.filterSide = request.filterSide;
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
