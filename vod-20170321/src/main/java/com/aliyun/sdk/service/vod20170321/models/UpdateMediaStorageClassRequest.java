// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaStorageClassRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaStorageClassRequest</p>
 */
public class UpdateMediaStorageClassRequest extends Request {
    @Query
    @NameInMap("MediaIds")
    private String mediaIds;

    @Query
    @NameInMap("RestoreTier")
    private String restoreTier;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("StorageClass")
    private String storageClass;

    private UpdateMediaStorageClassRequest(Builder builder) {
        super(builder);
        this.mediaIds = builder.mediaIds;
        this.restoreTier = builder.restoreTier;
        this.scope = builder.scope;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaStorageClassRequest create() {
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

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<UpdateMediaStorageClassRequest, Builder> {
        private String mediaIds; 
        private String restoreTier; 
        private String scope; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaStorageClassRequest request) {
            super(request);
            this.mediaIds = request.mediaIds;
            this.restoreTier = request.restoreTier;
            this.scope = request.scope;
            this.storageClass = request.storageClass;
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

        /**
         * StorageClass.
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public UpdateMediaStorageClassRequest build() {
            return new UpdateMediaStorageClassRequest(this);
        } 

    } 

}
