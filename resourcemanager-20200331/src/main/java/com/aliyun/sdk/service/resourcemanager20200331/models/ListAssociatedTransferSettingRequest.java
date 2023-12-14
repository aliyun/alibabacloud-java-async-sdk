// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssociatedTransferSettingRequest} extends {@link RequestModel}
 *
 * <p>ListAssociatedTransferSettingRequest</p>
 */
public class ListAssociatedTransferSettingRequest extends Request {
    private ListAssociatedTransferSettingRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssociatedTransferSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAssociatedTransferSettingRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAssociatedTransferSettingRequest request) {
            super(request);
        } 

        @Override
        public ListAssociatedTransferSettingRequest build() {
            return new ListAssociatedTransferSettingRequest(this);
        } 

    } 

}
