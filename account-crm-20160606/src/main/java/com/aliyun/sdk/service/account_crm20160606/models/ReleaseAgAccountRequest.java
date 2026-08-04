// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseAgAccountRequest} extends {@link RequestModel}
 *
 * <p>ReleaseAgAccountRequest</p>
 */
public class ReleaseAgAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReleaseReason")
    private String releaseReason;

    private ReleaseAgAccountRequest(Builder builder) {
        super(builder);
        this.mpk = builder.mpk;
        this.pk = builder.pk;
        this.releaseReason = builder.releaseReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseAgAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return releaseReason
     */
    public String getReleaseReason() {
        return this.releaseReason;
    }

    public static final class Builder extends Request.Builder<ReleaseAgAccountRequest, Builder> {
        private String mpk; 
        private String pk; 
        private String releaseReason; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseAgAccountRequest request) {
            super(request);
            this.mpk = request.mpk;
            this.pk = request.pk;
            this.releaseReason = request.releaseReason;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * ReleaseReason.
         */
        public Builder releaseReason(String releaseReason) {
            this.putQueryParameter("ReleaseReason", releaseReason);
            this.releaseReason = releaseReason;
            return this;
        }

        @Override
        public ReleaseAgAccountRequest build() {
            return new ReleaseAgAccountRequest(this);
        } 

    } 

}
