// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockedRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlockedRegionsRequest</p>
 */
public class DescribeBlockedRegionsRequest extends Request {
    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeBlockedRegionsRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockedRegionsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeBlockedRegionsRequest, Builder> {
        private String language; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlockedRegionsRequest response) {
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
        public DescribeBlockedRegionsRequest build() {
            return new DescribeBlockedRegionsRequest(this);
        } 

    } 

}
