// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link FlightExceedApplyQueryRequest} extends {@link RequestModel}
 *
 * <p>FlightExceedApplyQueryRequest</p>
 */
public class FlightExceedApplyQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apply_id")
    private Long applyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("business_instance_id")
    private String businessInstanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private FlightExceedApplyQueryRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.businessInstanceId = builder.businessInstanceId;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightExceedApplyQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return businessInstanceId
     */
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<FlightExceedApplyQueryRequest, Builder> {
        private Long applyId; 
        private String businessInstanceId; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(FlightExceedApplyQueryRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.businessInstanceId = request.businessInstanceId;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * apply_id.
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("apply_id", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * business_instance_id.
         */
        public Builder businessInstanceId(String businessInstanceId) {
            this.putQueryParameter("business_instance_id", businessInstanceId);
            this.businessInstanceId = businessInstanceId;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public FlightExceedApplyQueryRequest build() {
            return new FlightExceedApplyQueryRequest(this);
        } 

    } 

}
