// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTranscriptionPhrasesRequest} extends {@link RequestModel}
 *
 * <p>DeleteTranscriptionPhrasesRequest</p>
 */
public class DeleteTranscriptionPhrasesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PhraseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phraseId;

    private DeleteTranscriptionPhrasesRequest(Builder builder) {
        super(builder);
        this.phraseId = builder.phraseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTranscriptionPhrasesRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteTranscriptionPhrasesRequest, Builder> {
        private String phraseId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTranscriptionPhrasesRequest request) {
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
        public DeleteTranscriptionPhrasesRequest build() {
            return new DeleteTranscriptionPhrasesRequest(this);
        } 

    } 

}
