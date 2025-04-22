// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link PublishCodeSourceRequest} extends {@link RequestModel}
 *
 * <p>PublishCodeSourceRequest</p>
 */
public class PublishCodeSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CodeSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeSourceId;

    private PublishCodeSourceRequest(Builder builder) {
        super(builder);
        this.codeSourceId = builder.codeSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishCodeSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeSourceId
     */
    public String getCodeSourceId() {
        return this.codeSourceId;
    }

    public static final class Builder extends Request.Builder<PublishCodeSourceRequest, Builder> {
        private String codeSourceId; 

        private Builder() {
            super();
        } 

        private Builder(PublishCodeSourceRequest request) {
            super(request);
            this.codeSourceId = request.codeSourceId;
        } 

        /**
         * <p>The ID of the code source to be published. You can call <a href="https://help.aliyun.com/document_detail/459922.html">ListCodeSources</a> to query the code source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-a797*******</p>
         */
        public Builder codeSourceId(String codeSourceId) {
            this.putPathParameter("CodeSourceId", codeSourceId);
            this.codeSourceId = codeSourceId;
            return this;
        }

        @Override
        public PublishCodeSourceRequest build() {
            return new PublishCodeSourceRequest(this);
        } 

    } 

}
