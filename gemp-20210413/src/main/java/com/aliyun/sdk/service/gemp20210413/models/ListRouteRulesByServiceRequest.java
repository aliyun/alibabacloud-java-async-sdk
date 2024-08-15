// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRouteRulesByServiceRequest} extends {@link RequestModel}
 *
 * <p>ListRouteRulesByServiceRequest</p>
 */
public class ListRouteRulesByServiceRequest extends Request {
    private ListRouteRulesByServiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteRulesByServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListRouteRulesByServiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListRouteRulesByServiceRequest request) {
            super(request);
        } 

        @Override
        public ListRouteRulesByServiceRequest build() {
            return new ListRouteRulesByServiceRequest(this);
        } 

    } 

}
