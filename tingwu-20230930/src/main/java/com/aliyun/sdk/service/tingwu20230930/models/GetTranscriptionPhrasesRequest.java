// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscriptionPhrasesRequest} extends {@link RequestModel}
 *
 * <p>GetTranscriptionPhrasesRequest</p>
 */
public class GetTranscriptionPhrasesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PhraseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phraseId;

    private GetTranscriptionPhrasesRequest(Builder builder) {
        super(builder);
        this.phraseId = builder.phraseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscriptionPhrasesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phraseId
     */
    public String getPhraseId() {
        return this.phraseId;
    }

    public static final class Builder extends Request.Builder<GetTranscriptionPhrasesRequest, Builder> {
        private String phraseId; 

        private Builder() {
            super();
        } 

        private Builder(GetTranscriptionPhrasesRequest request) {
            super(request);
            this.phraseId = request.phraseId;
        } 

        /**
         * PhraseId.
         */
        public Builder phraseId(String phraseId) {
            this.putPathParameter("PhraseId", phraseId);
            this.phraseId = phraseId;
            return this;
        }

        @Override
        public GetTranscriptionPhrasesRequest build() {
            return new GetTranscriptionPhrasesRequest(this);
        } 

    } 

}
