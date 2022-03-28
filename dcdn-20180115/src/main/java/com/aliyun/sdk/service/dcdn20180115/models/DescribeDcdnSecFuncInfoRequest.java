// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSecFuncInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnSecFuncInfoRequest</p>
 */
public class DescribeDcdnSecFuncInfoRequest extends Request {
    @Query
    @NameInMap("Lang")
    @Validation(required = true)
    private String lang;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecFuncType")
    @Validation(required = true)
    private String secFuncType;

    private DescribeDcdnSecFuncInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return secFuncType
     */
    public String getSecFuncType() {
        return this.secFuncType;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnSecFuncInfoRequest, Builder> {
        private String lang; 
        private Long ownerId; 
        private String secFuncType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnSecFuncInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.ownerId = request.ownerId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public DescribeDcdnSecFuncInfoRequest build() {
            return new DescribeDcdnSecFuncInfoRequest(this);
        } 

    } 

}
