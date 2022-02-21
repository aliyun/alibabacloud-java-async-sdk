// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaInfoRequest} extends {@link RequestModel}
 *
 * <p>DeleteMediaInfoRequest</p>
 */
public class DeleteMediaInfoRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("MediaIds")
    @Validation(required = true)
    private String mediaIds;

    private DeleteMediaInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.mediaIds = builder.mediaIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMediaInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return mediaIds
     */
    public String getMediaIds() {
        return this.mediaIds;
    }

    public static final class Builder extends Request.Builder<DeleteMediaInfoRequest, Builder> {
        private String appId; 
        private String mediaIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMediaInfoRequest response) {
            super(response);
            this.appId = response.appId;
            this.mediaIds = response.mediaIds;
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
         * 媒资Ids，用逗号分隔
         */
        public Builder mediaIds(String mediaIds) {
            this.putQueryParameter("MediaIds", mediaIds);
            this.mediaIds = mediaIds;
            return this;
        }

        @Override
        public DeleteMediaInfoRequest build() {
            return new DeleteMediaInfoRequest(this);
        } 

    } 

}
