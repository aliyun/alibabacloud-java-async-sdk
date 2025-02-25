// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link CreatePdnsAppKeyRequest} extends {@link RequestModel}
 *
 * <p>CreatePdnsAppKeyRequest</p>
 */
public class CreatePdnsAppKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private CreatePdnsAppKeyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePdnsAppKeyRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<CreatePdnsAppKeyRequest, Builder> {
        private String lang; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(CreatePdnsAppKeyRequest request) {
            super(request);
            this.lang = request.lang;
            this.remark = request.remark;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public CreatePdnsAppKeyRequest build() {
            return new CreatePdnsAppKeyRequest(this);
        } 

    } 

}
