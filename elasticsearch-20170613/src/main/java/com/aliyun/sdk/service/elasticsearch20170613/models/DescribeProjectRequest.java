// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectRequest} extends {@link RequestModel}
 *
 * <p>DescribeProjectRequest</p>
 */
public class DescribeProjectRequest extends Request {
    @Path
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DescribeProjectRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeProjectRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProjectRequest response) {
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
        public DescribeProjectRequest build() {
            return new DescribeProjectRequest(this);
        } 

    } 

}
