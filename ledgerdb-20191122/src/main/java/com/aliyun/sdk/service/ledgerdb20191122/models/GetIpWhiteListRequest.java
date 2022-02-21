// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpWhiteListRequest} extends {@link RequestModel}
 *
 * <p>GetIpWhiteListRequest</p>
 */
public class GetIpWhiteListRequest extends Request {
    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    private GetIpWhiteListRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    public static final class Builder extends Request.Builder<GetIpWhiteListRequest, Builder> {
        private String ledgerId; 

        private Builder() {
            super();
        } 

        private Builder(GetIpWhiteListRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
        } 

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putQueryParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        @Override
        public GetIpWhiteListRequest build() {
            return new GetIpWhiteListRequest(this);
        } 

    } 

}
