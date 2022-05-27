// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessKeyLeakDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessKeyLeakDetailRequest</p>
 */
public class DescribeAccessKeyLeakDetailRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private DescribeAccessKeyLeakDetailRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessKeyLeakDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DescribeAccessKeyLeakDetailRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessKeyLeakDetailRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DescribeAccessKeyLeakDetailRequest build() {
            return new DescribeAccessKeyLeakDetailRequest(this);
        } 

    } 

}
