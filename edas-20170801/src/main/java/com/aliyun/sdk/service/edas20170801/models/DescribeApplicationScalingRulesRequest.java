// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link DescribeApplicationScalingRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationScalingRulesRequest</p>
 */
public class DescribeApplicationScalingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
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
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
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
