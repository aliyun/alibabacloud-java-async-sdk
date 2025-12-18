// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListConfigRuleOperatorsRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRuleOperatorsRequest</p>
 */
public class ListConfigRuleOperatorsRequest extends Request {
    private ListConfigRuleOperatorsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRuleOperatorsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListConfigRuleOperatorsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListConfigRuleOperatorsRequest request) {
            super(request);
        } 

        @Override
        public ListConfigRuleOperatorsRequest build() {
            return new ListConfigRuleOperatorsRequest(this);
        } 

    } 

}
