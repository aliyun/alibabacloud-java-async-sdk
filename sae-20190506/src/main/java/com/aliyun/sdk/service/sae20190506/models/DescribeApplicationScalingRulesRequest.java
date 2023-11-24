// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationScalingRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationScalingRulesRequest</p>
 */
public class DescribeApplicationScalingRulesRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    private DescribeApplicationScalingRulesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationScalingRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationScalingRulesRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationScalingRulesRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * 7171a6ca-d1cd-4928-8642-7d5cfe69\*\*\*\*
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeApplicationScalingRulesRequest build() {
            return new DescribeApplicationScalingRulesRequest(this);
        } 

    } 

}
