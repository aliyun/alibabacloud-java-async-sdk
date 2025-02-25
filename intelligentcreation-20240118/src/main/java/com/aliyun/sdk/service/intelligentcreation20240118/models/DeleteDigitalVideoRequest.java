// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDigitalVideoRequest} extends {@link RequestModel}
 *
 * <p>DeleteDigitalVideoRequest</p>
 */
public class DeleteDigitalVideoRequest extends Request {
    @Body
    @NameInMap("accountId")
    private String accountId;

    @Body
    @NameInMap("videoId")
    private String videoId;

    private DeleteDigitalVideoRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDigitalVideoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<DeleteDigitalVideoRequest, Builder> {
        private String accountId; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDigitalVideoRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.videoId = request.videoId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putBodyParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * videoId.
         */
        public Builder videoId(String videoId) {
            this.putBodyParameter("videoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public DeleteDigitalVideoRequest build() {
            return new DeleteDigitalVideoRequest(this);
        } 

    } 

}
