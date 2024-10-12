// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest} extends {@link RequestModel}
 *
 * <p>AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest</p>
 */
public class AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest extends Request {
    private AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest request) {
            super(request);
        } 

        @Override
        public AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest build() {
            return new AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest(this);
        } 

    } 

}
