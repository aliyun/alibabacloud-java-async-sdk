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
 * {@link ExportVocabularyRequest} extends {@link RequestModel}
 *
 * <p>ExportVocabularyRequest</p>
 */
public class ExportVocabularyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VocabularyIds")
    private java.util.List<String> vocabularyIds;

    private ExportVocabularyRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.vocabularyIds = builder.vocabularyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportVocabularyRequest create() {
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
     * @return vocabularyIds
     */
    public java.util.List<String> getVocabularyIds() {
        return this.vocabularyIds;
    }

    public static final class Builder extends Request.Builder<ExportVocabularyRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> vocabularyIds; 

        private Builder() {
            super();
        } 

        private Builder(ExportVocabularyRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.vocabularyIds = request.vocabularyIds;
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
         * VocabularyIds.
         */
        public Builder vocabularyIds(java.util.List<String> vocabularyIds) {
            String vocabularyIdsShrink = shrink(vocabularyIds, "VocabularyIds", "json");
            this.putBodyParameter("VocabularyIds", vocabularyIdsShrink);
            this.vocabularyIds = vocabularyIds;
            return this;
        }

        @Override
        public ExportVocabularyRequest build() {
            return new ExportVocabularyRequest(this);
        } 

    } 

}
