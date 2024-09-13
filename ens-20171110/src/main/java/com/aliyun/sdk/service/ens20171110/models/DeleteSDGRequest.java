// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSDGRequest} extends {@link RequestModel}
 *
 * <p>DeleteSDGRequest</p>
 */
public class DeleteSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > SDGId;

    private DeleteSDGRequest(Builder builder) {
        super(builder);
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSDGRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return SDGId
     */
    public java.util.List < String > getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<DeleteSDGRequest, Builder> {
        private java.util.List < String > SDGId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSDGRequest request) {
            super(request);
            this.SDGId = request.SDGId;
        } 

        /**
         * The IDs of the SDGs that you want to delete.
         */
        public Builder SDGId(java.util.List < String > SDGId) {
            String SDGIdShrink = shrink(SDGId, "SDGId", "json");
            this.putQueryParameter("SDGId", SDGIdShrink);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public DeleteSDGRequest build() {
            return new DeleteSDGRequest(this);
        } 

    } 

}
