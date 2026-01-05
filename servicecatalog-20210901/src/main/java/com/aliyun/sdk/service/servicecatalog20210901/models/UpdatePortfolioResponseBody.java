// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link UpdatePortfolioResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePortfolioResponseBody</p>
 */
public class UpdatePortfolioResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortfolioId")
    private String portfolioId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdatePortfolioResponseBody(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePortfolioResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portfolioId
     */
    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String portfolioId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdatePortfolioResponseBody model) {
            this.portfolioId = model.portfolioId;
            this.requestId = model.requestId;
        } 

        /**
         * PortfolioId.
         */
        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePortfolioResponseBody build() {
            return new UpdatePortfolioResponseBody(this);
        } 

    } 

}
