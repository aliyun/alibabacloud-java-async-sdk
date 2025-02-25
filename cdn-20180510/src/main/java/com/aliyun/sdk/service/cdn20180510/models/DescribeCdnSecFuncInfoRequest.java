// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnSecFuncInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnSecFuncInfoRequest</p>
 */
public class DescribeCdnSecFuncInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecFuncType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secFuncType;

    private DescribeCdnSecFuncInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.secFuncType = builder.secFuncType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSecFuncInfoRequest create() {
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
     * @return secFuncType
     */
    public String getSecFuncType() {
        return this.secFuncType;
    }

    public static final class Builder extends Request.Builder<DescribeCdnSecFuncInfoRequest, Builder> {
        private String lang; 
        private String secFuncType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnSecFuncInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.secFuncType = request.secFuncType;
        } 

        /**
         * <p>The language.</p>
         * <ul>
         * <li>en: English</li>
         * <li>zh: Chinese</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The type of the security feature. Valid values:</p>
         * <ul>
         * <li>CipherSuiteGroupCustomize: custom cipher suite.</li>
         * <li>CipherSuiteGroupStrict: dustom cipher suite.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CipherSuiteGroupCustomize</p>
         */
        public Builder secFuncType(String secFuncType) {
            this.putQueryParameter("SecFuncType", secFuncType);
            this.secFuncType = secFuncType;
            return this;
        }

        @Override
        public DescribeCdnSecFuncInfoRequest build() {
            return new DescribeCdnSecFuncInfoRequest(this);
        } 

    } 

}
