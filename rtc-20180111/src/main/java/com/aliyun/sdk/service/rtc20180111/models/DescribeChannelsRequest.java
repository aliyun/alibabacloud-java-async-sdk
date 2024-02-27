// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChannelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeChannelsRequest</p>
 */
public class DescribeChannelsRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String appId;

    private DescribeChannelsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeChannelsRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChannelsRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeChannelsRequest build() {
            return new DescribeChannelsRequest(this);
        } 

    } 

}
