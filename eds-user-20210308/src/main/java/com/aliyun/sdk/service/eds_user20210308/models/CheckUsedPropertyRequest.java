// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link CheckUsedPropertyRequest} extends {@link RequestModel}
 *
 * <p>CheckUsedPropertyRequest</p>
 */
public class CheckUsedPropertyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyId;

    private CheckUsedPropertyRequest(Builder builder) {
        super(builder);
        this.propertyId = builder.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUsedPropertyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return propertyId
     */
    public Long getPropertyId() {
        return this.propertyId;
    }

    public static final class Builder extends Request.Builder<CheckUsedPropertyRequest, Builder> {
        private Long propertyId; 

        private Builder() {
            super();
        } 

        private Builder(CheckUsedPropertyRequest request) {
            super(request);
            this.propertyId = request.propertyId;
        } 

        /**
         * <p>The ID of the property. You can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the property ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>390</p>
         */
        public Builder propertyId(Long propertyId) {
            this.putQueryParameter("PropertyId", propertyId);
            this.propertyId = propertyId;
            return this;
        }

        @Override
        public CheckUsedPropertyRequest build() {
            return new CheckUsedPropertyRequest(this);
        } 

    } 

}
