// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ListVirtualMFADevicesRequest} extends {@link RequestModel}
 *
 * <p>ListVirtualMFADevicesRequest</p>
 */
public class ListVirtualMFADevicesRequest extends Request {
    private ListVirtualMFADevicesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualMFADevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListVirtualMFADevicesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListVirtualMFADevicesRequest request) {
            super(request);
        } 

        @Override
        public ListVirtualMFADevicesRequest build() {
            return new ListVirtualMFADevicesRequest(this);
        } 

    } 

}
