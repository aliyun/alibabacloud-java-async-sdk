// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeExposedInstanceCriteriaRequest</p>
 */
public class DescribeExposedInstanceCriteriaRequest extends Request {
    @Query
    @NameInMap("Value")
    private String value;

    private DescribeExposedInstanceCriteriaRequest(Builder builder) {
        super(builder);
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedInstanceCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeExposedInstanceCriteriaRequest, Builder> {
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExposedInstanceCriteriaRequest request) {
            super(request);
            this.value = request.value;
        } 

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeExposedInstanceCriteriaRequest build() {
            return new DescribeExposedInstanceCriteriaRequest(this);
        } 

    } 

}
