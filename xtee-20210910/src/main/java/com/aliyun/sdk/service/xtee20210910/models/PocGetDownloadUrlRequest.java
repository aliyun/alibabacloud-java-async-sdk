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
 * {@link PocGetDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>PocGetDownloadUrlRequest</p>
 */
public class PocGetDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private PocGetDownloadUrlRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PocGetDownloadUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<PocGetDownloadUrlRequest, Builder> {
        private String lang; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(PocGetDownloadUrlRequest request) {
            super(request);
            this.lang = request.lang;
            this.token = request.token;
        } 

        /**
         * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Task token.</p>
         * 
         * <strong>example:</strong>
         * <p>d83221f51752805880</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public PocGetDownloadUrlRequest build() {
            return new PocGetDownloadUrlRequest(this);
        } 

    } 

}
