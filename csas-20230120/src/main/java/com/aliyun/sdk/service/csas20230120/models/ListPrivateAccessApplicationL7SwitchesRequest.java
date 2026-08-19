// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListPrivateAccessApplicationL7SwitchesRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessApplicationL7SwitchesRequest</p>
 */
public class ListPrivateAccessApplicationL7SwitchesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    private ListPrivateAccessApplicationL7SwitchesRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessApplicationL7SwitchesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationIds
     */
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public static final class Builder extends Request.Builder<ListPrivateAccessApplicationL7SwitchesRequest, Builder> {
        private java.util.List<String> applicationIds; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateAccessApplicationL7SwitchesRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putQueryParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        @Override
        public ListPrivateAccessApplicationL7SwitchesRequest build() {
            return new ListPrivateAccessApplicationL7SwitchesRequest(this);
        } 

    } 

}
