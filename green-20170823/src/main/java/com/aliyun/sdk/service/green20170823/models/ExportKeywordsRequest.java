// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportKeywordsRequest} extends {@link RequestModel}
 *
 * <p>ExportKeywordsRequest</p>
 */
public class ExportKeywordsRequest extends Request {
    @Query
    @NameInMap("KeywordLibId")
    @Validation(required = true)
    private Long keywordLibId;

    private ExportKeywordsRequest(Builder builder) {
        super(builder);
        this.keywordLibId = builder.keywordLibId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportKeywordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keywordLibId
     */
    public Long getKeywordLibId() {
        return this.keywordLibId;
    }

    public static final class Builder extends Request.Builder<ExportKeywordsRequest, Builder> {
        private Long keywordLibId; 

        private Builder() {
            super();
        } 

        private Builder(ExportKeywordsRequest request) {
            super(request);
            this.keywordLibId = request.keywordLibId;
        } 

        /**
         * KeywordLibId.
         */
        public Builder keywordLibId(Long keywordLibId) {
            this.putQueryParameter("KeywordLibId", keywordLibId);
            this.keywordLibId = keywordLibId;
            return this;
        }

        @Override
        public ExportKeywordsRequest build() {
            return new ExportKeywordsRequest(this);
        } 

    } 

}
