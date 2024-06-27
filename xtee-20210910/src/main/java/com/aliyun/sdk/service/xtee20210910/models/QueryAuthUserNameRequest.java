// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuthUserNameRequest} extends {@link RequestModel}
 *
 * <p>QueryAuthUserNameRequest</p>
 */
public class QueryAuthUserNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("bindId")
    private Long bindId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private QueryAuthUserNameRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.bindId = builder.bindId;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthUserNameRequest create() {
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
     * @return bindId
     */
    public Long getBindId() {
        return this.bindId;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<QueryAuthUserNameRequest, Builder> {
        private String lang; 
        private Long bindId; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuthUserNameRequest request) {
            super(request);
            this.lang = request.lang;
            this.bindId = request.bindId;
            this.regId = request.regId;
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
         * bindId.
         */
        public Builder bindId(Long bindId) {
            this.putQueryParameter("bindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public QueryAuthUserNameRequest build() {
            return new QueryAuthUserNameRequest(this);
        } 

    } 

}
