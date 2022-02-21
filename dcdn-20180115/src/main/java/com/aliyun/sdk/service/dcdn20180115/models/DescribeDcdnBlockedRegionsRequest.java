// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnBlockedRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnBlockedRegionsRequest</p>
 */
public class DescribeDcdnBlockedRegionsRequest extends Request {
    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDcdnBlockedRegionsRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnBlockedRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnBlockedRegionsRequest, Builder> {
        private String language; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnBlockedRegionsRequest response) {
            super(response);
            this.language = response.language;
            this.ownerId = response.ownerId;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
        public DescribeDcdnBlockedRegionsRequest build() {
            return new DescribeDcdnBlockedRegionsRequest(this);
        } 

    } 

}
