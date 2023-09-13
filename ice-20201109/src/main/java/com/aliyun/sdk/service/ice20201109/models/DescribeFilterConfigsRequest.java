// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFilterConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFilterConfigsRequest</p>
 */
public class DescribeFilterConfigsRequest extends Request {
    @Query
    @NameInMap("Type")
    private String type;

    private DescribeFilterConfigsRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilterConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeFilterConfigsRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFilterConfigsRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeFilterConfigsRequest build() {
            return new DescribeFilterConfigsRequest(this);
        } 

    } 

}
