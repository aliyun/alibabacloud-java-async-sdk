// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20180509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileAsyncScanV2Request} extends {@link RequestModel}
 *
 * <p>FileAsyncScanV2Request</p>
 */
public class FileAsyncScanV2Request extends Request {
    private FileAsyncScanV2Request(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileAsyncScanV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<FileAsyncScanV2Request, Builder> {

        private Builder() {
            super();
        } 

        private Builder(FileAsyncScanV2Request request) {
            super(request);
        } 

        @Override
        public FileAsyncScanV2Request build() {
            return new FileAsyncScanV2Request(this);
        } 

    } 

}
