// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateHcWarningsRequest} extends {@link RequestModel}
 *
 * <p>ValidateHcWarningsRequest</p>
 */
public class ValidateHcWarningsRequest extends Request {
    @Query
    @NameInMap("RiskIds")
    @Validation(required = true)
    private String riskIds;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuids")
    @Validation(required = true)
    private String uuids;

    private ValidateHcWarningsRequest(Builder builder) {
        super(builder);
        this.riskIds = builder.riskIds;
        this.sourceIp = builder.sourceIp;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateHcWarningsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return riskIds
     */
    public String getRiskIds() {
        return this.riskIds;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<ValidateHcWarningsRequest, Builder> {
        private String riskIds; 
        private String sourceIp; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(ValidateHcWarningsRequest response) {
            super(response);
            this.riskIds = response.riskIds;
            this.sourceIp = response.sourceIp;
            this.uuids = response.uuids;
        } 

        /**
         * RiskIds.
         */
        public Builder riskIds(String riskIds) {
            this.putQueryParameter("RiskIds", riskIds);
            this.riskIds = riskIds;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Uuids.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public ValidateHcWarningsRequest build() {
            return new ValidateHcWarningsRequest(this);
        } 

    } 

}
