// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link DeleteSubRequest} extends {@link RequestModel}
 *
 * <p>DeleteSubRequest</p>
 */
public class DeleteSubRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long subId;

    private DeleteSubRequest(Builder builder) {
        super(builder);
        this.subId = builder.subId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return subId
     */
    public Long getSubId() {
        return this.subId;
    }

    public static final class Builder extends Request.Builder<DeleteSubRequest, Builder> {
        private Long subId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSubRequest request) {
            super(request);
            this.subId = request.subId;
        } 

        /**
         * <p>Subscription album record ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        public Builder subId(Long subId) {
            this.putQueryParameter("SubId", subId);
            this.subId = subId;
            return this;
        }

        @Override
        public DeleteSubRequest build() {
            return new DeleteSubRequest(this);
        } 

    } 

}
