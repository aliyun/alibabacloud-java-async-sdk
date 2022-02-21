// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertActionPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertActionPoliciesRequest</p>
 */
public class DescribeAlertActionPoliciesRequest extends Request {
    @Body
    @NameInMap("Page")
    private Integer page;

    private DescribeAlertActionPoliciesRequest(Builder builder) {
        super(builder);
        this.page = builder.page;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertActionPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    public static final class Builder extends Request.Builder<DescribeAlertActionPoliciesRequest, Builder> {
        private Integer page; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertActionPoliciesRequest response) {
            super(response);
            this.page = response.page;
        } 

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        @Override
        public DescribeAlertActionPoliciesRequest build() {
            return new DescribeAlertActionPoliciesRequest(this);
        } 

    } 

}
