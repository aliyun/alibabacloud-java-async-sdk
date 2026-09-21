// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link DeleteQuotaRequest} extends {@link RequestModel}
 *
 * <p>DeleteQuotaRequest</p>
 */
public class DeleteQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tagValue")
    private String tagValue;

    private DeleteQuotaRequest(Builder builder) {
        super(builder);
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder extends Request.Builder<DeleteQuotaRequest, Builder> {
        private String tagValue; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQuotaRequest request) {
            super(request);
            this.tagValue = request.tagValue;
        } 

        /**
         * tagValue.
         */
        public Builder tagValue(String tagValue) {
            this.putQueryParameter("tagValue", tagValue);
            this.tagValue = tagValue;
            return this;
        }

        @Override
        public DeleteQuotaRequest build() {
            return new DeleteQuotaRequest(this);
        } 

    } 

}
