// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCountriesRequest} extends {@link RequestModel}
 *
 * <p>ListCountriesRequest</p>
 */
public class ListCountriesRequest extends Request {
    private ListCountriesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCountriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListCountriesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListCountriesRequest request) {
            super(request);
        } 

        @Override
        public ListCountriesRequest build() {
            return new ListCountriesRequest(this);
        } 

    } 

}
