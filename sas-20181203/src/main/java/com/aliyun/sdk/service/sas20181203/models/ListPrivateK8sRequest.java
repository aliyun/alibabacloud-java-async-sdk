// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListPrivateK8sRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateK8sRequest</p>
 */
public class ListPrivateK8sRequest extends Request {
    private ListPrivateK8sRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateK8sRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListPrivateK8sRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListPrivateK8sRequest request) {
            super(request);
        } 

        @Override
        public ListPrivateK8sRequest build() {
            return new ListPrivateK8sRequest(this);
        } 

    } 

}
