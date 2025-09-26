// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetBrowserRequest} extends {@link RequestModel}
 *
 * <p>GetBrowserRequest</p>
 */
public class GetBrowserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("browserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String browserId;

    private GetBrowserRequest(Builder builder) {
        super(builder);
        this.browserId = builder.browserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBrowserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserId
     */
    public String getBrowserId() {
        return this.browserId;
    }

    public static final class Builder extends Request.Builder<GetBrowserRequest, Builder> {
        private String browserId; 

        private Builder() {
            super();
        } 

        private Builder(GetBrowserRequest request) {
            super(request);
            this.browserId = request.browserId;
        } 

        /**
         * <p>要获取详情的浏览器实例的唯一标识符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-1234-1234-123456789abc</p>
         */
        public Builder browserId(String browserId) {
            this.putPathParameter("browserId", browserId);
            this.browserId = browserId;
            return this;
        }

        @Override
        public GetBrowserRequest build() {
            return new GetBrowserRequest(this);
        } 

    } 

}
