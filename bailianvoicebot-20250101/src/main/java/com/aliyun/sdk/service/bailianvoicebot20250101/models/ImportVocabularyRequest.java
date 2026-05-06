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
 * {@link ImportVocabularyRequest} extends {@link RequestModel}
 *
 * <p>ImportVocabularyRequest</p>
 */
public class ImportVocabularyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileKey")
    private String fileKey;

    private ImportVocabularyRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.fileKey = builder.fileKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportVocabularyRequest create() {
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
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    public static final class Builder extends Request.Builder<ImportVocabularyRequest, Builder> {
        private String businessUnitId; 
        private String fileKey; 

        private Builder() {
            super();
        } 

        private Builder(ImportVocabularyRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.fileKey = request.fileKey;
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
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.putBodyParameter("FileKey", fileKey);
            this.fileKey = fileKey;
            return this;
        }

        @Override
        public ImportVocabularyRequest build() {
            return new ImportVocabularyRequest(this);
        } 

    } 

}
