// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTensorboardSharedUrlRequest} extends {@link RequestModel}
 *
 * <p>GetTensorboardSharedUrlRequest</p>
 */
public class GetTensorboardSharedUrlRequest extends Request {
    @Path
    @NameInMap("TensorboardId")
    @Validation(required = true)
    private String tensorboardId;

    @Query
    @NameInMap("ExpireTimeSeconds")
    private String expireTimeSeconds;

    private GetTensorboardSharedUrlRequest(Builder builder) {
        super(builder);
        this.tensorboardId = builder.tensorboardId;
        this.expireTimeSeconds = builder.expireTimeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTensorboardSharedUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    /**
     * @return expireTimeSeconds
     */
    public String getExpireTimeSeconds() {
        return this.expireTimeSeconds;
    }

    public static final class Builder extends Request.Builder<GetTensorboardSharedUrlRequest, Builder> {
        private String tensorboardId; 
        private String expireTimeSeconds; 

        private Builder() {
            super();
        } 

        private Builder(GetTensorboardSharedUrlRequest request) {
            super(request);
            this.tensorboardId = request.tensorboardId;
            this.expireTimeSeconds = request.expireTimeSeconds;
        } 

        /**
         * TensorboardId.
         */
        public Builder tensorboardId(String tensorboardId) {
            this.putPathParameter("TensorboardId", tensorboardId);
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * ExpireTimeSeconds.
         */
        public Builder expireTimeSeconds(String expireTimeSeconds) {
            this.putQueryParameter("ExpireTimeSeconds", expireTimeSeconds);
            this.expireTimeSeconds = expireTimeSeconds;
            return this;
        }

        @Override
        public GetTensorboardSharedUrlRequest build() {
            return new GetTensorboardSharedUrlRequest(this);
        } 

    } 

}
