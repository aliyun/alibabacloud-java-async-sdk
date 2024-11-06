// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRoutineRelatedDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRoutineRelatedDomainsRequest</p>
 */
public class DescribeRoutineRelatedDomainsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DescribeRoutineRelatedDomainsRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRoutineRelatedDomainsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeRoutineRelatedDomainsRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRoutineRelatedDomainsRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>The name of the routine. The name is unique in the same account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>routine_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeRoutineRelatedDomainsRequest build() {
            return new DescribeRoutineRelatedDomainsRequest(this);
        } 

    } 

}
