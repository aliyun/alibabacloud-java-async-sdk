// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreMediaRequest} extends {@link RequestModel}
 *
 * <p>RestoreMediaRequest</p>
 */
public class RestoreMediaRequest extends Request {
    @Query
    @NameInMap("MediaIds")
    private String mediaIds;

    @Query
    @NameInMap("RestoreDays")
    private String restoreDays;

    @Query
    @NameInMap("RestoreTier")
    private String restoreTier;

    @Query
    @NameInMap("Scope")
    private String scope;

    private RestoreMediaRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
        this.restoreDays = builder.restoreDays;
        this.restoreTier = builder.restoreTier;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreMediaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    /**
     * @return restoreDays
     */
    public String getRestoreDays() {
        return this.restoreDays;
    }

    /**
     * @return restoreTier
     */
    public String getRestoreTier() {
        return this.restoreTier;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<RestoreMediaRequest, Builder> {
        private String mediaIds; 
        private String restoreDays; 
        private String restoreTier; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(RestoreMediaRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
            this.restoreDays = request.restoreDays;
            this.restoreTier = request.restoreTier;
            this.scope = request.scope;
        } 

        /**
         * MediaIds.
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        /**
         * RestoreDays.
         */
        public Builder restoreDays(String restoreDays) {
            this.putQueryParameter("RestoreDays", restoreDays);
            this.restoreDays = restoreDays;
            return this;
        }

        /**
         * RestoreTier.
         */
        public Builder restoreTier(String restoreTier) {
            this.putQueryParameter("RestoreTier", restoreTier);
            this.restoreTier = restoreTier;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public RestoreMediaRequest build() {
            return new RestoreMediaRequest(this);
        } 

    } 

}
