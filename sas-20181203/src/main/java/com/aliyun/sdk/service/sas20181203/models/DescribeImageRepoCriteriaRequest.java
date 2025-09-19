// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageRepoCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageRepoCriteriaRequest</p>
 */
public class DescribeImageRepoCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
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
         * <p>The value of the filter condition.</p>
         * <blockquote>
         * <p>You can perform fuzzy search based on the image ID, image tag, image instance ID, image repository name, image repository namespace, image repository ID, image repository region, image digest, and image repository type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2.0.2</p>
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
