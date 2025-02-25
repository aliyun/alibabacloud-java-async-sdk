// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupplementRequest} extends {@link RequestModel}
 *
 * <p>DescribeSupplementRequest</p>
 */
public class DescribeSupplementRequest extends Request {
    @Query
    @NameInMap("SupplementId")
    @Validation(required = true)
    private Long supplementId;

    private DescribeSupplementRequest(Builder builder) {
        super(builder);
        this.supplementId = builder.supplementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupplementRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return supplementId
     */
    public Long getSupplementId() {
        return this.supplementId;
    }

    public static final class Builder extends Request.Builder<DescribeSupplementRequest, Builder> {
        private Long supplementId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSupplementRequest request) {
            super(request);
            this.supplementId = request.supplementId;
        } 

        /**
         * SupplementId.
         */
        public Builder supplementId(Long supplementId) {
            this.putQueryParameter("SupplementId", supplementId);
            this.supplementId = supplementId;
            return this;
        }

        @Override
        public DescribeSupplementRequest build() {
            return new DescribeSupplementRequest(this);
        } 

    } 

}
