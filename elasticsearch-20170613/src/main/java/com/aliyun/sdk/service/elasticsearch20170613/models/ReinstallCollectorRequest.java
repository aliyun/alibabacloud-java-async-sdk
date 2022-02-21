// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReinstallCollectorRequest} extends {@link RequestModel}
 *
 * <p>ReinstallCollectorRequest</p>
 */
public class ReinstallCollectorRequest extends Request {
    @Path
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private ReinstallCollectorRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReinstallCollectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<ReinstallCollectorRequest, Builder> {
        private String resId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(ReinstallCollectorRequest response) {
            super(response);
            this.resId = response.resId;
            this.clientToken = response.clientToken;
        } 

        /**
         * ResId.
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public ReinstallCollectorRequest build() {
            return new ReinstallCollectorRequest(this);
        } 

    } 

}
