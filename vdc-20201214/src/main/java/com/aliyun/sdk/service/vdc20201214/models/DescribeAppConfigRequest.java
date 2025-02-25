// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppConfigRequest</p>
 */
public class DescribeAppConfigRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    private DescribeAppConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAppConfigRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppConfigRequest request) {
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
        public DescribeAppConfigRequest build() {
            return new DescribeAppConfigRequest(this);
        } 

    } 

}
