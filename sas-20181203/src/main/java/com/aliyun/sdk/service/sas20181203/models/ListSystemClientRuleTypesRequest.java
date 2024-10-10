// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSystemClientRuleTypesRequest} extends {@link RequestModel}
 *
 * <p>ListSystemClientRuleTypesRequest</p>
 */
public class ListSystemClientRuleTypesRequest extends Request {
    private ListSystemClientRuleTypesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemClientRuleTypesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListSystemClientRuleTypesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListSystemClientRuleTypesRequest request) {
            super(request);
        } 

        @Override
        public ListSystemClientRuleTypesRequest build() {
            return new ListSystemClientRuleTypesRequest(this);
        } 

    } 

}
