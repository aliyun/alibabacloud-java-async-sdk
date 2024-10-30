// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeletePolicyBindingRequest} extends {@link RequestModel}
 *
 * <p>DeletePolicyBindingRequest</p>
 */
public class DeletePolicyBindingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceIds")
    private java.util.List < String > dataSourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private DeletePolicyBindingRequest(Builder builder) {
        super(builder);
        this.dataSourceIds = builder.dataSourceIds;
        this.policyId = builder.policyId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolicyBindingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceIds
     */
    public java.util.List < String > getDataSourceIds() {
        return this.dataSourceIds;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<DeletePolicyBindingRequest, Builder> {
        private java.util.List < String > dataSourceIds; 
        private String policyId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(DeletePolicyBindingRequest request) {
            super(request);
            this.dataSourceIds = request.dataSourceIds;
            this.policyId = request.policyId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The IDs of the data sources that you want to disassociate from the backup policy.</p>
         */
        public Builder dataSourceIds(java.util.List < String > dataSourceIds) {
            String dataSourceIdsShrink = shrink(dataSourceIds, "DataSourceIds", "json");
            this.putBodyParameter("DataSourceIds", dataSourceIdsShrink);
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        /**
         * <p>The ID of the backup policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>po-000************hgp</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>UDM_ECS</strong>: ECS instance backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UDM_ECS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public DeletePolicyBindingRequest build() {
            return new DeletePolicyBindingRequest(this);
        } 

    } 

}
