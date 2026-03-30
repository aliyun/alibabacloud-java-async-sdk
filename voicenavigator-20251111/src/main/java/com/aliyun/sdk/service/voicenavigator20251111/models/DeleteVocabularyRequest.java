// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link DeleteVocabularyRequest} extends {@link RequestModel}
 *
 * <p>DeleteVocabularyRequest</p>
 */
public class DeleteVocabularyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VocabularyId")
    private String vocabularyId;

    private DeleteVocabularyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.vocabularyId = builder.vocabularyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVocabularyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public static final class Builder extends Request.Builder<DeleteVocabularyRequest, Builder> {
        private String instanceId; 
        private String vocabularyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVocabularyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.vocabularyId = request.vocabularyId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * VocabularyId.
         */
        public Builder vocabularyId(String vocabularyId) {
            this.putBodyParameter("VocabularyId", vocabularyId);
            this.vocabularyId = vocabularyId;
            return this;
        }

        @Override
        public DeleteVocabularyRequest build() {
            return new DeleteVocabularyRequest(this);
        } 

    } 

}
