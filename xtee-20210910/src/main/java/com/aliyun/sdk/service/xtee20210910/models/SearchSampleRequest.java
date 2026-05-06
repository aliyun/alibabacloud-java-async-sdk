// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link SearchSampleRequest} extends {@link RequestModel}
 *
 * <p>SearchSampleRequest</p>
 */
public class SearchSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTimeEnd")
    private String uploadTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTimeStart")
    private String uploadTimeStart;

    private SearchSampleRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.tab = builder.tab;
        this.type = builder.type;
        this.uploadTimeEnd = builder.uploadTimeEnd;
        this.uploadTimeStart = builder.uploadTimeStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchSampleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uploadTimeEnd
     */
    public String getUploadTimeEnd() {
        return this.uploadTimeEnd;
    }

    /**
     * @return uploadTimeStart
     */
    public String getUploadTimeStart() {
        return this.uploadTimeStart;
    }

    public static final class Builder extends Request.Builder<SearchSampleRequest, Builder> {
        private String keyword; 
        private String lang; 
        private String regId; 
        private String tab; 
        private String type; 
        private String uploadTimeEnd; 
        private String uploadTimeStart; 

        private Builder() {
            super();
        } 

        private Builder(SearchSampleRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.regId = request.regId;
            this.tab = request.tab;
            this.type = request.type;
            this.uploadTimeEnd = request.uploadTimeEnd;
            this.uploadTimeStart = request.uploadTimeStart;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UploadTimeEnd.
         */
        public Builder uploadTimeEnd(String uploadTimeEnd) {
            this.putQueryParameter("UploadTimeEnd", uploadTimeEnd);
            this.uploadTimeEnd = uploadTimeEnd;
            return this;
        }

        /**
         * UploadTimeStart.
         */
        public Builder uploadTimeStart(String uploadTimeStart) {
            this.putQueryParameter("UploadTimeStart", uploadTimeStart);
            this.uploadTimeStart = uploadTimeStart;
            return this;
        }

        @Override
        public SearchSampleRequest build() {
            return new SearchSampleRequest(this);
        } 

    } 

}
