// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDetectLanguageRequest} extends {@link RequestModel}
 *
 * <p>GetDetectLanguageRequest</p>
 */
public class GetDetectLanguageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceText")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceText;

    private GetDetectLanguageRequest(Builder builder) {
        super(builder);
        this.sourceText = builder.sourceText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetectLanguageRequest create() {
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

    public static final class Builder extends Request.Builder<GetDetectLanguageRequest, Builder> {
        private String sourceText; 

        private Builder() {
            super();
        } 

        private Builder(GetDetectLanguageRequest request) {
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
        public GetDetectLanguageRequest build() {
            return new GetDetectLanguageRequest(this);
        } 

    } 

}
