// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverEndpointRequest} extends {@link RequestModel}
 *
 * <p>DescribeResolverEndpointRequest</p>
 */
public class DescribeResolverEndpointRequest extends Request {
    @Query
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeResolverEndpointRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeResolverEndpointRequest, Builder> {
        private String endpointId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResolverEndpointRequest response) {
            super(response);
            this.endpointId = response.endpointId;
            this.lang = response.lang;
        } 

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeResolverEndpointRequest build() {
            return new DescribeResolverEndpointRequest(this);
        } 

    } 

}
