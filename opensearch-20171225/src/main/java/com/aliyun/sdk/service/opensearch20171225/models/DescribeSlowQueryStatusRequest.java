// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowQueryStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeSlowQueryStatusRequest</p>
 */
public class DescribeSlowQueryStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    private DescribeSlowQueryStatusRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowQueryStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    public static final class Builder extends Request.Builder<DescribeSlowQueryStatusRequest, Builder> {
        private String appGroupIdentity; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSlowQueryStatusRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
        } 

        /**
         * my_app_group_name
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        @Override
        public DescribeSlowQueryStatusRequest build() {
            return new DescribeSlowQueryStatusRequest(this);
        } 

    } 

}
