// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
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

    public static final class Builder extends Request.Builder<Builder> {

        public GetBackupStorageCountRequest build() {
            return new GetBackupStorageCountRequest(this);
        } 

    } 

}
