// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListRecentGovernanceMetricsRequest} extends {@link RequestModel}
 *
 * <p>ListRecentGovernanceMetricsRequest</p>
 */
public class ListRecentGovernanceMetricsRequest extends Request {
    private ListRecentGovernanceMetricsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentGovernanceMetricsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRecentGovernanceMetricsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRecentGovernanceMetricsRequest request) {
            super(request);
        } 

        @Override
        public ListRecentGovernanceMetricsRequest build() {
            return new ListRecentGovernanceMetricsRequest(this);
        } 

    } 

}
