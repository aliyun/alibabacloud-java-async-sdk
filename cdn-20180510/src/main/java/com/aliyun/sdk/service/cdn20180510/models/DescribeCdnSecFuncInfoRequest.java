// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSecFuncInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnSecFuncInfoRequest</p>
 */
public class DescribeCdnSecFuncInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    @Validation(required = true)
    private String lang;

    @Query
    @NameInMap("SecFuncType")
    @Validation(required = true)
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SecFuncType.
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
