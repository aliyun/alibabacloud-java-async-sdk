// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeywordsRequest} extends {@link RequestModel}
 *
 * <p>ImportKeywordsRequest</p>
 */
public class ImportKeywordsRequest extends Request {
    @Query
    @NameInMap("KeywordLibId")
    @Validation(required = true)
    private Integer keywordLibId;

    @Query
    @NameInMap("KeywordsObject")
    @Validation(required = true)
    private String keywordsObject;

    private ImportKeywordsRequest(Builder builder) {
        super(builder);
        this.keywordLibId = builder.keywordLibId;
        this.keywordsObject = builder.keywordsObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeywordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keywordLibId
     */
    public Integer getKeywordLibId() {
        return this.keywordLibId;
    }

    /**
     * @return keywordsObject
     */
    public String getKeywordsObject() {
        return this.keywordsObject;
    }

    public static final class Builder extends Request.Builder<ImportKeywordsRequest, Builder> {
        private Integer keywordLibId; 
        private String keywordsObject; 

        private Builder() {
            super();
        } 

        private Builder(ImportKeywordsRequest request) {
            super(request);
            this.keywordLibId = request.keywordLibId;
            this.keywordsObject = request.keywordsObject;
        } 

        /**
         * KeywordLibId.
         */
        public Builder keywordLibId(Integer keywordLibId) {
            this.putQueryParameter("KeywordLibId", keywordLibId);
            this.keywordLibId = keywordLibId;
            return this;
        }

        /**
         * KeywordsObject.
         */
        public Builder keywordsObject(String keywordsObject) {
            this.putQueryParameter("KeywordsObject", keywordsObject);
            this.keywordsObject = keywordsObject;
            return this;
        }

        @Override
        public ImportKeywordsRequest build() {
            return new ImportKeywordsRequest(this);
        } 

    } 

}
