// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeywordRequest} extends {@link RequestModel}
 *
 * <p>CreateKeywordRequest</p>
 */
public class CreateKeywordRequest extends Request {
    @Query
    @NameInMap("KeywordLibId")
    @Validation(required = true)
    private Long keywordLibId;

    @Query
    @NameInMap("Keywords")
    @Validation(required = true)
    private String keywords;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private CreateKeywordRequest(Builder builder) {
        super(builder);
        this.keywordLibId = builder.keywordLibId;
        this.keywords = builder.keywords;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeywordRequest create() {
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

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateKeywordRequest, Builder> {
        private Long keywordLibId; 
        private String keywords; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeywordRequest request) {
            super(request);
            this.keywordLibId = request.keywordLibId;
            this.keywords = request.keywords;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * KeywordLibId.
         */
        public Builder keywordLibId(Long keywordLibId) {
            this.putQueryParameter("KeywordLibId", keywordLibId);
            this.keywordLibId = keywordLibId;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putQueryParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateKeywordRequest build() {
            return new CreateKeywordRequest(this);
        } 

    } 

}
