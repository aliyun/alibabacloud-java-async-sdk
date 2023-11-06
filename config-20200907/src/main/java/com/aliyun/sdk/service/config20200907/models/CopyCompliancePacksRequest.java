// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCompliancePacksRequest} extends {@link RequestModel}
 *
 * <p>CopyCompliancePacksRequest</p>
 */
public class CopyCompliancePacksRequest extends Request {
    @Query
    @NameInMap("DesAggregatorIds")
    private String desAggregatorIds;

    @Query
    @NameInMap("SrcAggregatorId")
    private String srcAggregatorId;

    @Query
    @NameInMap("SrcCompliancePackIds")
    @Validation(required = true)
    private String srcCompliancePackIds;

    private CopyCompliancePacksRequest(Builder builder) {
        super(builder);
        this.desAggregatorIds = builder.desAggregatorIds;
        this.srcAggregatorId = builder.srcAggregatorId;
        this.srcCompliancePackIds = builder.srcCompliancePackIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCompliancePacksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desAggregatorIds
     */
    public String getDesAggregatorIds() {
        return this.desAggregatorIds;
    }

    /**
     * @return srcAggregatorId
     */
    public String getSrcAggregatorId() {
        return this.srcAggregatorId;
    }

    /**
     * @return srcCompliancePackIds
     */
    public String getSrcCompliancePackIds() {
        return this.srcCompliancePackIds;
    }

    public static final class Builder extends Request.Builder<CopyCompliancePacksRequest, Builder> {
        private String desAggregatorIds; 
        private String srcAggregatorId; 
        private String srcCompliancePackIds; 

        private Builder() {
            super();
        } 

        private Builder(CopyCompliancePacksRequest request) {
            super(request);
            this.desAggregatorIds = request.desAggregatorIds;
            this.srcAggregatorId = request.srcAggregatorId;
            this.srcCompliancePackIds = request.srcCompliancePackIds;
        } 

        /**
         * The IDs of the destination account groups into which the compliance packages are replicated. Separate multiple account group IDs with commas (,).
         * <p>
         * 
         * > If this parameter is left empty, the compliance packages are replicated to the current account group.
         */
        public Builder desAggregatorIds(String desAggregatorIds) {
            this.putQueryParameter("DesAggregatorIds", desAggregatorIds);
            this.desAggregatorIds = desAggregatorIds;
            return this;
        }

        /**
         * The ID of the account group to which the compliance packages belong.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder srcAggregatorId(String srcAggregatorId) {
            this.putQueryParameter("SrcAggregatorId", srcAggregatorId);
            this.srcAggregatorId = srcAggregatorId;
            return this;
        }

        /**
         * The IDs of the compliance packages. Separate multiple compliance package IDs with commas (,).
         * <p>
         * 
         * For more information about how to obtain the ID of a compliance package, see [ListCompliancePacks](~~263332~~).
         */
        public Builder srcCompliancePackIds(String srcCompliancePackIds) {
            this.putQueryParameter("SrcCompliancePackIds", srcCompliancePackIds);
            this.srcCompliancePackIds = srcCompliancePackIds;
            return this;
        }

        @Override
        public CopyCompliancePacksRequest build() {
            return new CopyCompliancePacksRequest(this);
        } 

    } 

}
