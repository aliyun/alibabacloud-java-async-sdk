// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUnhealthyHostAvailabilityRequest} extends {@link RequestModel}
 *
 * <p>DescribeUnhealthyHostAvailabilityRequest</p>
 */
public class DescribeUnhealthyHostAvailabilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > id;

    private DescribeUnhealthyHostAvailabilityRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUnhealthyHostAvailabilityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public java.util.List < Long > getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DescribeUnhealthyHostAvailabilityRequest, Builder> {
        private java.util.List < Long > id; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUnhealthyHostAvailabilityRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(java.util.List < Long > id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DescribeUnhealthyHostAvailabilityRequest build() {
            return new DescribeUnhealthyHostAvailabilityRequest(this);
        } 

    } 

}
