// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link VerifyPythonFileRequest} extends {@link RequestModel}
 *
 * <p>VerifyPythonFileRequest</p>
 */
public class VerifyPythonFileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    private VerifyPythonFileRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyPythonFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<VerifyPythonFileRequest, Builder> {
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(VerifyPythonFileRequest request) {
            super(request);
            this.content = request.content;
        } 

        /**
         * <p>The Python code snippet.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>import logging
         * def execute (params):
         *   success=True
         *   message=&quot;OK&quot;
         *   data=[]
         *   return (success,message,data)</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        @Override
        public VerifyPythonFileRequest build() {
            return new VerifyPythonFileRequest(this);
        } 

    } 

}
