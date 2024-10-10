// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBackupStorageCountRequest} extends {@link RequestModel}
 *
 * <p>GetBackupStorageCountRequest</p>
 */
public class GetBackupStorageCountRequest extends Request {
    private GetBackupStorageCountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupStorageCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetBackupStorageCountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetBackupStorageCountRequest request) {
            super(request);
        } 

        @Override
        public GetBackupStorageCountRequest build() {
            return new GetBackupStorageCountRequest(this);
        } 

    } 

}
