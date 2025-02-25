// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetIntlFixPriceDomainListUrlRequest} extends {@link RequestModel}
 *
 * <p>GetIntlFixPriceDomainListUrlRequest</p>
 */
public class GetIntlFixPriceDomainListUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListDate")
    private String listDate;

    private GetIntlFixPriceDomainListUrlRequest(Builder builder) {
        super(builder);
        this.listDate = builder.listDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntlFixPriceDomainListUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listDate
     */
    public String getListDate() {
        return this.listDate;
    }

    public static final class Builder extends Request.Builder<GetIntlFixPriceDomainListUrlRequest, Builder> {
        private String listDate; 

        private Builder() {
            super();
        } 

        private Builder(GetIntlFixPriceDomainListUrlRequest request) {
            super(request);
            this.listDate = request.listDate;
        } 

        /**
         * ListDate.
         */
        public Builder listDate(String listDate) {
            this.putQueryParameter("ListDate", listDate);
            this.listDate = listDate;
            return this;
        }

        @Override
        public GetIntlFixPriceDomainListUrlRequest build() {
            return new GetIntlFixPriceDomainListUrlRequest(this);
        } 

    } 

}
