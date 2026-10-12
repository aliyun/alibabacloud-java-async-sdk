// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetApiPathFieldTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetApiPathFieldTemplateRequest</p>
 */
public class GetApiPathFieldTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    private GetApiPathFieldTemplateRequest(Builder builder) {
        super(builder);
        this.path = builder.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApiPathFieldTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    public static final class Builder extends Request.Builder<GetApiPathFieldTemplateRequest, Builder> {
        private String path; 

        private Builder() {
            super();
        } 

        private Builder(GetApiPathFieldTemplateRequest request) {
            super(request);
            this.path = request.path;
        } 

        /**
         * <p>The gateway type.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/chat/completions</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("path", path);
            this.path = path;
            return this;
        }

        @Override
        public GetApiPathFieldTemplateRequest build() {
            return new GetApiPathFieldTemplateRequest(this);
        } 

    } 

}
