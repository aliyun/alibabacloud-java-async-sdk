// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuditCallbackRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuditCallbackRequest</p>
 */
public class UpdateAuditCallbackRequest extends Request {
    @Query
    @NameInMap("Callback")
    private String callback;

    @Query
    @NameInMap("CryptType")
    private Integer cryptType;

    @Query
    @NameInMap("Seed")
    private String seed;

    private UpdateAuditCallbackRequest(Builder builder) {
        super(builder);
        this.callback = builder.callback;
        this.cryptType = builder.cryptType;
        this.seed = builder.seed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuditCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return cryptType
     */
    public Integer getCryptType() {
        return this.cryptType;
    }

    /**
     * @return seed
     */
    public String getSeed() {
        return this.seed;
    }

    public static final class Builder extends Request.Builder<UpdateAuditCallbackRequest, Builder> {
        private String callback; 
        private Integer cryptType; 
        private String seed; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuditCallbackRequest request) {
            super(request);
            this.callback = request.callback;
            this.cryptType = request.cryptType;
            this.seed = request.seed;
        } 

        /**
         * Callback.
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * CryptType.
         */
        public Builder cryptType(Integer cryptType) {
            this.putQueryParameter("CryptType", cryptType);
            this.cryptType = cryptType;
            return this;
        }

        /**
         * Seed.
         */
        public Builder seed(String seed) {
            this.putQueryParameter("Seed", seed);
            this.seed = seed;
            return this;
        }

        @Override
        public UpdateAuditCallbackRequest build() {
            return new UpdateAuditCallbackRequest(this);
        } 

    } 

}
