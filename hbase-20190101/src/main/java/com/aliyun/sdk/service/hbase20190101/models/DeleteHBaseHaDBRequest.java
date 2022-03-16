// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHBaseHaDBRequest} extends {@link RequestModel}
 *
 * <p>DeleteHBaseHaDBRequest</p>
 */
public class DeleteHBaseHaDBRequest extends Request {
    @Query
    @NameInMap("BdsId")
    @Validation(required = true)
    private String bdsId;

    @Query
    @NameInMap("HaId")
    @Validation(required = true)
    private String haId;

    private DeleteHBaseHaDBRequest(Builder builder) {
        super(builder);
        this.bdsId = builder.bdsId;
        this.haId = builder.haId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHBaseHaDBRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bdsId
     */
    public String getBdsId() {
        return this.bdsId;
    }

    /**
     * @return haId
     */
    public String getHaId() {
        return this.haId;
    }

    public static final class Builder extends Request.Builder<DeleteHBaseHaDBRequest, Builder> {
        private String bdsId; 
        private String haId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHBaseHaDBRequest request) {
            super(request);
            this.bdsId = request.bdsId;
            this.haId = request.haId;
        } 

        /**
         * BdsId.
         */
        public Builder bdsId(String bdsId) {
            this.putQueryParameter("BdsId", bdsId);
            this.bdsId = bdsId;
            return this;
        }

        /**
         * HaId.
         */
        public Builder haId(String haId) {
            this.putQueryParameter("HaId", haId);
            this.haId = haId;
            return this;
        }

        @Override
        public DeleteHBaseHaDBRequest build() {
            return new DeleteHBaseHaDBRequest(this);
        } 

    } 

}
