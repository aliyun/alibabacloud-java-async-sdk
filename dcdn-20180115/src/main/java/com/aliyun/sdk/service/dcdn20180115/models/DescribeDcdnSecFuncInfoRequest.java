// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSecFuncInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnSecFuncInfoRequest</p>
 */
public class DescribeDcdnSecFuncInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecFuncType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secFuncType;

    private DescribeDcdnSecFuncInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.secFuncType = builder.secFuncType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSecFuncInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnSecFuncInfoRequest, Builder> {
        private String lang; 
        private String secFuncType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnSecFuncInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.secFuncType = request.secFuncType;
        } 

        /**
         * The language. Valid values: en and zh. Default value: en.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The type of the drop-down list. Valid values: RobotRuleName and RobotObject.
         */
        public Builder secFuncType(String secFuncType) {
            this.putQueryParameter("SecFuncType", secFuncType);
            this.secFuncType = secFuncType;
            return this;
        }

        @Override
        public DescribeDcdnSecFuncInfoRequest build() {
            return new DescribeDcdnSecFuncInfoRequest(this);
        } 

    } 

}
