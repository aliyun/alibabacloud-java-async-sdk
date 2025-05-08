// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link GetDetectLanguageVpcRequest} extends {@link RequestModel}
 *
 * <p>GetDetectLanguageVpcRequest</p>
 */
public class GetDetectLanguageVpcRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceText")
    private String sourceText;

    private GetDetectLanguageVpcRequest(Builder builder) {
        super(builder);
        this.sourceText = builder.sourceText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetectLanguageVpcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceText
     */
    public String getSourceText() {
        return this.sourceText;
    }

    public static final class Builder extends Request.Builder<GetDetectLanguageVpcRequest, Builder> {
        private String sourceText; 

        private Builder() {
            super();
        } 

        private Builder(GetDetectLanguageVpcRequest request) {
            super(request);
            this.sourceText = request.sourceText;
        } 

        /**
         * SourceText.
         */
        public Builder sourceText(String sourceText) {
            this.putBodyParameter("SourceText", sourceText);
            this.sourceText = sourceText;
            return this;
        }

        @Override
        public GetDetectLanguageVpcRequest build() {
            return new GetDetectLanguageVpcRequest(this);
        } 

    } 

}
