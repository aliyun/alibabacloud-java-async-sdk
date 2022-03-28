// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnAclFieldsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnAclFieldsRequest</p>
 */
public class DescribeDcdnAclFieldsRequest extends Request {
    @Query
    @NameInMap("Lang")
    @Validation(required = true)
    private String lang;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDcdnAclFieldsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnAclFieldsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnAclFieldsRequest, Builder> {
        private String lang; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnAclFieldsRequest request) {
            super(request);
            this.lang = request.lang;
            this.ownerId = request.ownerId;
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

        @Override
        public DescribeDcdnAclFieldsRequest build() {
            return new DescribeDcdnAclFieldsRequest(this);
        } 

    } 

}
