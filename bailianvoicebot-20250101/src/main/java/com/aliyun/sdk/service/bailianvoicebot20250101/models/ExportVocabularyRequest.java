// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VocabularyIds")
    private java.util.List<String> vocabularyIds;

    private ExportVocabularyRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
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
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return vocabularyIds
     */
    public java.util.List<String> getVocabularyIds() {
        return this.vocabularyIds;
    }

    public static final class Builder extends Request.Builder<ExportVocabularyRequest, Builder> {
        private String businessUnitId; 
        private java.util.List<String> vocabularyIds; 

        private Builder() {
            super();
        } 

        private Builder(ExportVocabularyRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.vocabularyIds = request.vocabularyIds;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
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
