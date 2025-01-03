// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DeleteHBaseHaDBRequest} extends {@link RequestModel}
 *
 * <p>DeleteHBaseHaDBRequest</p>
 */
public class DeleteHBaseHaDBRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bds-bp14112fd7g52s1****</p>
         */
        public Builder bdsId(String bdsId) {
            this.putQueryParameter("BdsId", bdsId);
            this.bdsId = bdsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-sw2o0l01s4r76****</p>
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
