// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link CreateRenderingInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRenderingInstanceResponseBody</p>
 */
public class CreateRenderingInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
    private String renderingInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateRenderingInstanceResponseBody(Builder builder) {
        this.renderingInstanceId = builder.renderingInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRenderingInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return renderingInstanceId
     */
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String renderingInstanceId; 
        private String requestId; 

        /**
         * RenderingInstanceId.
         */
        public Builder renderingInstanceId(String renderingInstanceId) {
            this.renderingInstanceId = renderingInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRenderingInstanceResponseBody build() {
            return new CreateRenderingInstanceResponseBody(this);
        } 

    } 

}
