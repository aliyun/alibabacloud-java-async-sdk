// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteCollectionPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteCollectionPolicyRequest</p>
 */
public class DeleteCollectionPolicyRequest extends Request {
    @Path
    @NameInMap("policyName")
    @Validation(required = true, maxLength = 63, minLength = 3)
    private String policyName;

    @Query
    @NameInMap("dataCode")
    private String dataCode;

    @Query
    @NameInMap("productCode")
    private String productCode;

    private DeleteCollectionPolicyRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.dataCode = builder.dataCode;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCollectionPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return dataCode
     */
    public String getDataCode() {
        return this.dataCode;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DeleteCollectionPolicyRequest, Builder> {
        private String policyName; 
        private String dataCode; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCollectionPolicyRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.dataCode = request.dataCode;
            this.productCode = request.productCode;
        } 

        /**
         * policyName.
         */
        public Builder policyName(String policyName) {
            this.putPathParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * dataCode.
         */
        public Builder dataCode(String dataCode) {
            this.putQueryParameter("dataCode", dataCode);
            this.dataCode = dataCode;
            return this;
        }

        /**
         * productCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DeleteCollectionPolicyRequest build() {
            return new DeleteCollectionPolicyRequest(this);
        } 

    } 

}
