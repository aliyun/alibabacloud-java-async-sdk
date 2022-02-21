// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnUserConfigsRequest</p>
 */
public class DescribeCdnUserConfigsRequest extends Request {
    @Query
    @NameInMap("FunctionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeCdnUserConfigsRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnUserConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeCdnUserConfigsRequest, Builder> {
        private String functionName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnUserConfigsRequest response) {
            super(response);
            this.functionName = response.functionName;
            this.ownerId = response.ownerId;
        } 

        /**
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
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
        public DescribeCdnUserConfigsRequest build() {
            return new DescribeCdnUserConfigsRequest(this);
        } 

    } 

}
