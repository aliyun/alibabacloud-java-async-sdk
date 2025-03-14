// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryPrepaidCardsRequest} extends {@link RequestModel}
 *
 * <p>QueryPrepaidCardsRequest</p>
 */
public class QueryPrepaidCardsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveOrNot")
    private Boolean effectiveOrNot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiryTimeEnd")
    private String expiryTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiryTimeStart")
    private String expiryTimeStart;

    private QueryPrepaidCardsRequest(Builder builder) {
        super(builder);
        this.effectiveOrNot = builder.effectiveOrNot;
        this.expiryTimeEnd = builder.expiryTimeEnd;
        this.expiryTimeStart = builder.expiryTimeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPrepaidCardsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveOrNot
     */
    public Boolean getEffectiveOrNot() {
        return this.effectiveOrNot;
    }

    /**
     * @return expiryTimeEnd
     */
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    /**
     * @return expiryTimeStart
     */
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

    public static final class Builder extends Request.Builder<QueryPrepaidCardsRequest, Builder> {
        private Boolean effectiveOrNot; 
        private String expiryTimeEnd; 
        private String expiryTimeStart; 

        private Builder() {
            super();
        } 

        private Builder(QueryPrepaidCardsRequest request) {
            super(request);
            this.effectiveOrNot = request.effectiveOrNot;
            this.expiryTimeEnd = request.expiryTimeEnd;
            this.expiryTimeStart = request.expiryTimeStart;
        } 

        /**
         * <p>Specifies whether the prepaid card takes effect. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder effectiveOrNot(Boolean effectiveOrNot) {
            this.putQueryParameter("EffectiveOrNot", effectiveOrNot);
            this.effectiveOrNot = effectiveOrNot;
            return this;
        }

        /**
         * <p>The end of the expiration time of prepaid cards to query. The value must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-01T00:00:00Z</p>
         */
        public Builder expiryTimeEnd(String expiryTimeEnd) {
            this.putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
            this.expiryTimeEnd = expiryTimeEnd;
            return this;
        }

        /**
         * <p>The start of the expiration time of prepaid cards to query. The value must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-01T00:00:00Z</p>
         */
        public Builder expiryTimeStart(String expiryTimeStart) {
            this.putQueryParameter("ExpiryTimeStart", expiryTimeStart);
            this.expiryTimeStart = expiryTimeStart;
            return this;
        }

        @Override
        public QueryPrepaidCardsRequest build() {
            return new QueryPrepaidCardsRequest(this);
        } 

    } 

}
