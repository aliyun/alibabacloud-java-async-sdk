// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpotDiscountHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpotDiscountHistoryRequest</p>
 */
public class DescribeSpotDiscountHistoryRequest extends Request {
    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("IsProtect")
    private Boolean isProtect;

    private DescribeSpotDiscountHistoryRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
        this.isProtect = builder.isProtect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotDiscountHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isProtect
     */
    public Boolean getIsProtect() {
        return this.isProtect;
    }

    public static final class Builder extends Request.Builder<DescribeSpotDiscountHistoryRequest, Builder> {
        private String instanceType; 
        private Boolean isProtect; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpotDiscountHistoryRequest request) {
            super(request);
            this.instanceType = request.instanceType;
            this.isProtect = request.isProtect;
        } 

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * IsProtect.
         */
        public Builder isProtect(Boolean isProtect) {
            this.putQueryParameter("IsProtect", isProtect);
            this.isProtect = isProtect;
            return this;
        }

        @Override
        public DescribeSpotDiscountHistoryRequest build() {
            return new DescribeSpotDiscountHistoryRequest(this);
        } 

    } 

}
