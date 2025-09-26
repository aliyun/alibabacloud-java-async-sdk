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
 * {@link DeleteBrowserRequest} extends {@link RequestModel}
 *
 * <p>DeleteBrowserRequest</p>
 */
public class DeleteBrowserRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("browserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String browserId;

    private DeleteBrowserRequest(Builder builder) {
        super(builder);
        this.browserId = builder.browserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBrowserRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBrowserRequest, Builder> {
        private String browserId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBrowserRequest request) {
            super(request);
            this.browserId = request.browserId;
        } 

        /**
         * <p>要删除的浏览器实例的唯一标识符</p>
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
        public DeleteBrowserRequest build() {
            return new DeleteBrowserRequest(this);
        } 

    } 

}
