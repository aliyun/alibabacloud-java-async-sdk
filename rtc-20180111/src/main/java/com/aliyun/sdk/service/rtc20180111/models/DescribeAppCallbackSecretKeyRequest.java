// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppCallbackSecretKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppCallbackSecretKeyRequest</p>
 */
public class DescribeAppCallbackSecretKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private DescribeAppCallbackSecretKeyRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppCallbackSecretKeyRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAppCallbackSecretKeyRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppCallbackSecretKeyRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9qb1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DescribeAppCallbackSecretKeyRequest build() {
            return new DescribeAppCallbackSecretKeyRequest(this);
        } 

    } 

}
