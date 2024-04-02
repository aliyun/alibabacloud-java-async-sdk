// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKeywordRequest} extends {@link RequestModel}
 *
 * <p>DeleteKeywordRequest</p>
 */
public class DeleteKeywordRequest extends Request {
    @Query
    @NameInMap("Ids")
    private String ids;

    @Query
    @NameInMap("KeywordLibId")
    @Validation(required = true)
    private String keywordLibId;

    @Query
    @NameInMap("Keywords")
    private String keywords;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DeleteKeywordRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.keywordLibId = builder.keywordLibId;
        this.keywords = builder.keywords;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKeywordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return keywordLibId
     */
    public String getKeywordLibId() {
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

    public static final class Builder extends Request.Builder<DeleteKeywordRequest, Builder> {
        private String ids; 
        private String keywordLibId; 
        private String keywords; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeywordRequest request) {
            super(request);
            this.ids = request.ids;
            this.keywordLibId = request.keywordLibId;
            this.keywords = request.keywords;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * KeywordLibId.
         */
        public Builder keywordLibId(String keywordLibId) {
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
        public DeleteKeywordRequest build() {
            return new DeleteKeywordRequest(this);
        } 

    } 

}
