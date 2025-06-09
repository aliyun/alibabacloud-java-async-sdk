// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationNlbsRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationNlbsRequest</p>
 */
public class DescribeApplicationNlbsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    private DescribeApplicationNlbsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationNlbsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeApplicationNlbsRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationNlbsRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeApplicationNlbsRequest build() {
            return new DescribeApplicationNlbsRequest(this);
        } 

    } 

}
