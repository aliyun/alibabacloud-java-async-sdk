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
    private String appId;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

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
            this.region = request.region;
            this.tags = request.tags;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Tags.
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
