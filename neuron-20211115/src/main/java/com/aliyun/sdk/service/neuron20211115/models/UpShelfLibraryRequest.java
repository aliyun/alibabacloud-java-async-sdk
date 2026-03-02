// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link UpShelfLibraryRequest} extends {@link RequestModel}
 *
 * <p>UpShelfLibraryRequest</p>
 */
public class UpShelfLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    private UpShelfLibraryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.marketId = builder.marketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpShelfLibraryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    public static final class Builder extends Request.Builder<UpShelfLibraryRequest, Builder> {
        private Long id; 
        private Long marketId; 

        private Builder() {
            super();
        } 

        private Builder(UpShelfLibraryRequest request) {
            super(request);
            this.id = request.id;
            this.marketId = request.marketId;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.putQueryParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        @Override
        public UpShelfLibraryRequest build() {
            return new UpShelfLibraryRequest(this);
        } 

    } 

}
