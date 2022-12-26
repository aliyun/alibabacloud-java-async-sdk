// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRepoCriteriaRequest</p>
 */
public class DescribeImageRepoCriteriaRequest extends Request {
    @Query
    @NameInMap("Value")
    private String value;

    private DescribeImageRepoCriteriaRequest(Builder builder) {
        super(builder);
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageRepoCriteriaRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeImageRepoCriteriaRequest, Builder> {
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageRepoCriteriaRequest request) {
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
        public DescribeImageRepoCriteriaRequest build() {
            return new DescribeImageRepoCriteriaRequest(this);
        } 

    } 

}
