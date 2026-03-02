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
 * {@link CompleteRegisterLibraryRequest} extends {@link RequestModel}
 *
 * <p>CompleteRegisterLibraryRequest</p>
 */
public class CompleteRegisterLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dependIntegral")
    private Integer dependIntegral;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("marketId")
    private Long marketId;

    private CompleteRegisterLibraryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.dependIntegral = builder.dependIntegral;
        this.marketId = builder.marketId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompleteRegisterLibraryRequest create() {
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
     * @return dependIntegral
     */
    public Integer getDependIntegral() {
        return this.dependIntegral;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    public static final class Builder extends Request.Builder<CompleteRegisterLibraryRequest, Builder> {
        private Long id; 
        private Integer dependIntegral; 
        private Long marketId; 

        private Builder() {
            super();
        } 

        private Builder(CompleteRegisterLibraryRequest request) {
            super(request);
            this.id = request.id;
            this.dependIntegral = request.dependIntegral;
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
         * dependIntegral.
         */
        public Builder dependIntegral(Integer dependIntegral) {
            this.putBodyParameter("dependIntegral", dependIntegral);
            this.dependIntegral = dependIntegral;
            return this;
        }

        /**
         * marketId.
         */
        public Builder marketId(Long marketId) {
            this.putBodyParameter("marketId", marketId);
            this.marketId = marketId;
            return this;
        }

        @Override
        public CompleteRegisterLibraryRequest build() {
            return new CompleteRegisterLibraryRequest(this);
        } 

    } 

}
