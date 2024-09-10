// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountsInResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>ListAccountsInResourceDirectoryRequest</p>
 */
public class ListAccountsInResourceDirectoryRequest extends Request {
    private ListAccountsInResourceDirectoryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsInResourceDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListAccountsInResourceDirectoryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListAccountsInResourceDirectoryRequest request) {
            super(request);
        } 

        @Override
        public ListAccountsInResourceDirectoryRequest build() {
            return new ListAccountsInResourceDirectoryRequest(this);
        } 

    } 

}
