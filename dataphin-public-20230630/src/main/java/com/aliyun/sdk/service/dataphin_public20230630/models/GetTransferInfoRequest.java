// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetTransferInfoRequest} extends {@link RequestModel}
 *
 * <p>GetTransferInfoRequest</p>
 */
public class GetTransferInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProposalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long proposalId;

    private GetTransferInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.proposalId = builder.proposalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTransferInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return proposalId
     */
    public Long getProposalId() {
        return this.proposalId;
    }

    public static final class Builder extends Request.Builder<GetTransferInfoRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private Long proposalId; 

        private Builder() {
            super();
        } 

        private Builder(GetTransferInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.proposalId = request.proposalId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder proposalId(Long proposalId) {
            this.putQueryParameter("ProposalId", proposalId);
            this.proposalId = proposalId;
            return this;
        }

        @Override
        public GetTransferInfoRequest build() {
            return new GetTransferInfoRequest(this);
        } 

    } 

}
