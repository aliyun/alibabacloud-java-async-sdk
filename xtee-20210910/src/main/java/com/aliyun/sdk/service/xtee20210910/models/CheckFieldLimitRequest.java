// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFieldLimitRequest} extends {@link RequestModel}
 *
 * <p>CheckFieldLimitRequest</p>
 */
public class CheckFieldLimitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private CheckFieldLimitRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFieldLimitRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CheckFieldLimitRequest, Builder> {
        private String lang; 
        private String regId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CheckFieldLimitRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.source = request.source;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public CheckFieldLimitRequest build() {
            return new CheckFieldLimitRequest(this);
        } 

    } 

}
