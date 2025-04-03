// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link CopyCompliancePacksRequest} extends {@link RequestModel}
 *
 * <p>CopyCompliancePacksRequest</p>
 */
public class CopyCompliancePacksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesAggregatorIds")
    private String desAggregatorIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcAggregatorId")
    private String srcAggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcCompliancePackIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The IDs of the destination account groups into which the compliance packages are replicated. Separate multiple account group IDs with commas (,).</p>
         * <blockquote>
         * <p>If this parameter is left empty, the compliance packages are replicated to the current account group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ca-c73c626622af00f8****</p>
         */
        public Builder desAggregatorIds(String desAggregatorIds) {
            this.putQueryParameter("DesAggregatorIds", desAggregatorIds);
            this.desAggregatorIds = desAggregatorIds;
            return this;
        }

        /**
         * <p>The ID of the account group to which the compliance packages belong.</p>
         * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-05e6626622af0050****</p>
         */
        public Builder srcAggregatorId(String srcAggregatorId) {
            this.putQueryParameter("SrcAggregatorId", srcAggregatorId);
            this.srcAggregatorId = srcAggregatorId;
            return this;
        }

        /**
         * <p>The IDs of the compliance packages. Separate multiple compliance package IDs with commas (,).</p>
         * <p>For more information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/263332.html">ListCompliancePacks</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-4c02626622af0050****,cp-47c1626622af0050****</p>
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
