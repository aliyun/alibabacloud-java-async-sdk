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
 * {@link DeleteVocabularyRequest} extends {@link RequestModel}
 *
 * <p>DeleteVocabularyRequest</p>
 */
public class DeleteVocabularyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VocabularyId")
    private String vocabularyId;

    private DeleteVocabularyRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
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
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    /**
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    public static final class Builder extends Request.Builder<DeleteVocabularyRequest, Builder> {
        private String businessUnitId; 
        private String vocabularyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVocabularyRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.vocabularyId = request.vocabularyId;
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
