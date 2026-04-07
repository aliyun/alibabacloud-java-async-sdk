// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link DeleteVariableRequest} extends {@link RequestModel}
 *
 * <p>DeleteVariableRequest</p>
 */
public class DeleteVariableRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VariableId")
    private String variableId;

    private DeleteVariableRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVariableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return variableId
     */
    public String getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<DeleteVariableRequest, Builder> {
        private String businessUnitId; 
        private String variableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVariableRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.variableId = request.variableId;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * VariableId.
         */
        public Builder variableId(String variableId) {
            this.putBodyParameter("VariableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public DeleteVariableRequest build() {
            return new DeleteVariableRequest(this);
        } 

    } 

}
