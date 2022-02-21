// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSourceRequest</p>
 */
public class DescribeDataSourceRequest extends Request {
    @Path
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DescribeDataSourceRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DescribeDataSourceRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSourceRequest response) {
            super(response);
            this.id = response.id;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DescribeDataSourceRequest build() {
            return new DescribeDataSourceRequest(this);
        } 

    } 

}
