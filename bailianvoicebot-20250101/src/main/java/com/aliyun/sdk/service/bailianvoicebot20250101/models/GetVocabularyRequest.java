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
 * {@link GetVocabularyRequest} extends {@link RequestModel}
 *
 * <p>GetVocabularyRequest</p>
 */
public class GetVocabularyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VocabularyId")
    private String vocabularyId;

    private GetVocabularyRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.vocabularyId = builder.vocabularyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVocabularyRequest create() {
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

    public static final class Builder extends Request.Builder<GetVocabularyRequest, Builder> {
        private String businessUnitId; 
        private String vocabularyId; 

        private Builder() {
            super();
        } 

        private Builder(GetVocabularyRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.vocabularyId = request.vocabularyId;
        } 

        /**
         * <p>The ID of the Model Studio business space.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-zop7ukgtksltamo4</p>
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * <p>The hot word vocabulary ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4061</p>
         */
        public Builder vocabularyId(String vocabularyId) {
            this.putBodyParameter("VocabularyId", vocabularyId);
            this.vocabularyId = vocabularyId;
            return this;
        }

        @Override
        public GetVocabularyRequest build() {
            return new GetVocabularyRequest(this);
        } 

    } 

}
