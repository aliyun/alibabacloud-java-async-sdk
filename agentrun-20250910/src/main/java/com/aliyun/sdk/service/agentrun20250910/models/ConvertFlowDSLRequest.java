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
 * {@link ConvertFlowDSLRequest} extends {@link RequestModel}
 *
 * <p>ConvertFlowDSLRequest</p>
 */
public class ConvertFlowDSLRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConvertFlowDSLInput body;

    private ConvertFlowDSLRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertFlowDSLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public ConvertFlowDSLInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ConvertFlowDSLRequest, Builder> {
        private ConvertFlowDSLInput body; 

        private Builder() {
            super();
        } 

        private Builder(ConvertFlowDSLRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>包含待转换的工作流DSL内容和转换选项，支持多种DSL格式（如Dify、n8n等）以及inline和base64两种输入方式</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(ConvertFlowDSLInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ConvertFlowDSLRequest build() {
            return new ConvertFlowDSLRequest(this);
        } 

    } 

}
