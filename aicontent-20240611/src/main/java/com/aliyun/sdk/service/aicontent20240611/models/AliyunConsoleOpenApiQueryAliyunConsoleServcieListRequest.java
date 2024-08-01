// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest} extends {@link RequestModel}
 *
 * <p>AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest</p>
 */
public class AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest extends Request {
    private AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest request) {
            super(request);
        } 

        @Override
        public AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest build() {
            return new AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest(this);
        } 

    } 

}
