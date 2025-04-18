// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link ListNisInspectionResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>ListNisInspectionResourceTypeRequest</p>
 */
public class ListNisInspectionResourceTypeRequest extends Request {
    private ListNisInspectionResourceTypeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNisInspectionResourceTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListNisInspectionResourceTypeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListNisInspectionResourceTypeRequest request) {
            super(request);
        } 

        @Override
        public ListNisInspectionResourceTypeRequest build() {
            return new ListNisInspectionResourceTypeRequest(this);
        } 

    } 

}
