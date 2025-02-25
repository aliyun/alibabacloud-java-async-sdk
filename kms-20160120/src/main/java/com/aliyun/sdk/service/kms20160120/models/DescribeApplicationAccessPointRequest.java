// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationAccessPointRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationAccessPointRequest</p>
 */
public class DescribeApplicationAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DescribeApplicationAccessPointRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationAccessPointRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationAccessPointRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the AAP that you want to query.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeApplicationAccessPointRequest build() {
            return new DescribeApplicationAccessPointRequest(this);
        } 

    } 

}
