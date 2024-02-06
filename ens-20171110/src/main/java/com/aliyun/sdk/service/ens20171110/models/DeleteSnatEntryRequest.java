// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnatEntryRequest} extends {@link RequestModel}
 *
 * <p>DeleteSnatEntryRequest</p>
 */
public class DeleteSnatEntryRequest extends Request {
    @Query
    @NameInMap("SnatEntryId")
    @Validation(required = true)
    private String snatEntryId;

    private DeleteSnatEntryRequest(Builder builder) {
        super(builder);
        this.snatEntryId = builder.snatEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnatEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    public static final class Builder extends Request.Builder<DeleteSnatEntryRequest, Builder> {
        private String snatEntryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSnatEntryRequest request) {
            super(request);
            this.snatEntryId = request.snatEntryId;
        } 

        /**
         * The ID of the SNAT entry that you want to delete.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.putQueryParameter("SnatEntryId", snatEntryId);
            this.snatEntryId = snatEntryId;
            return this;
        }

        @Override
        public DeleteSnatEntryRequest build() {
            return new DeleteSnatEntryRequest(this);
        } 

    } 

}
