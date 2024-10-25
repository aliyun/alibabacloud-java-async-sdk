// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteForwardEntryRequest</p>
 */
public class DeleteForwardEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardEntryId;

    private DeleteForwardEntryRequest(Builder builder) {
        super(builder);
        this.forwardEntryId = builder.forwardEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteForwardEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardEntryId
     */
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public static final class Builder extends Request.Builder<DeleteForwardEntryRequest, Builder> {
        private String forwardEntryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteForwardEntryRequest request) {
            super(request);
            this.forwardEntryId = request.forwardEntryId;
        } 

        /**
         * <p>The ID of the DNAT entry that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fwd-5tfk8qgepr9ijjkqxt8do****</p>
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.putQueryParameter("ForwardEntryId", forwardEntryId);
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        @Override
        public DeleteForwardEntryRequest build() {
            return new DeleteForwardEntryRequest(this);
        } 

    } 

}
