// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationStatusRequest</p>
 */
public class DescribeApplicationStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private DescribeApplicationStatusRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationStatusRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeApplicationStatusRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationStatusRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * 0099b7be-5f5b-4512-a7fc-56049ef1\*\*\*\*
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeApplicationStatusRequest build() {
            return new DescribeApplicationStatusRequest(this);
        } 

    } 

}
