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
 * {@link DescribeImageCriteriaRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageCriteriaRequest</p>
 */
public class DescribeImageCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private DescribeImageCriteriaRequest(Builder builder) {
        super(builder);
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageCriteriaRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeImageCriteriaRequest, Builder> {
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageCriteriaRequest request) {
            super(request);
            this.value = request.value;
        } 

        /**
         * <p>The fuzzy match value used to query images.</p>
         * <blockquote>
         * <p>This parameter supports fuzzy queries for image IDs, image tags, image instance IDs, image repository names, image repository IDs, image repository namespaces, image regions, image digests, and image repository types.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>525</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeImageCriteriaRequest build() {
            return new DescribeImageCriteriaRequest(this);
        } 

    } 

}
