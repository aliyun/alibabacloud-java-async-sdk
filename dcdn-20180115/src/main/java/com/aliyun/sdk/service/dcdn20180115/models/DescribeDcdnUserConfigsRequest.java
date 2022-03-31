// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserConfigsRequest</p>
 */
public class DescribeDcdnUserConfigsRequest extends Request {
    @Query
    @NameInMap("FunctionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDcdnUserConfigsRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserConfigsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnUserConfigsRequest, Builder> {
        private String functionName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserConfigsRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.ownerId = request.ownerId;
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
        public DescribeDcdnUserConfigsRequest build() {
            return new DescribeDcdnUserConfigsRequest(this);
        } 

    } 

}
