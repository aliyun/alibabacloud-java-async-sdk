// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEcuRequest} extends {@link RequestModel}
 *
 * <p>DeleteEcuRequest</p>
 */
public class DeleteEcuRequest extends Request {
    @Query
    @NameInMap("EcuId")
    @Validation(required = true)
    private String ecuId;

    private DeleteEcuRequest(Builder builder) {
        super(builder);
        this.ecuId = builder.ecuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEcuRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecuId
     */
    public String getEcuId() {
        return this.ecuId;
    }

    public static final class Builder extends Request.Builder<DeleteEcuRequest, Builder> {
        private String ecuId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEcuRequest request) {
            super(request);
            this.ecuId = request.ecuId;
        } 

        /**
         * The unique ID of the ECU to be deleted.
         */
        public Builder ecuId(String ecuId) {
            this.putQueryParameter("EcuId", ecuId);
            this.ecuId = ecuId;
            return this;
        }

        @Override
        public DeleteEcuRequest build() {
            return new DeleteEcuRequest(this);
        } 

    } 

}
