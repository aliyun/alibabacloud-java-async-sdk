// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link RefreshAuthTokensRequest} extends {@link RequestModel}
 *
 * <p>RefreshAuthTokensRequest</p>
 */
public class RefreshAuthTokensRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
    private Long expireSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseKeys")
    private String licenseKeys;

    private RefreshAuthTokensRequest(Builder builder) {
        super(builder);
        this.expireSeconds = builder.expireSeconds;
        this.instanceIds = builder.instanceIds;
        this.licenseKeys = builder.licenseKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAuthTokensRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expireSeconds
     */
    public Long getExpireSeconds() {
        return this.expireSeconds;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return licenseKeys
     */
    public String getLicenseKeys() {
        return this.licenseKeys;
    }

    public static final class Builder extends Request.Builder<RefreshAuthTokensRequest, Builder> {
        private Long expireSeconds; 
        private String instanceIds; 
        private String licenseKeys; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAuthTokensRequest request) {
            super(request);
            this.expireSeconds = request.expireSeconds;
            this.instanceIds = request.instanceIds;
            this.licenseKeys = request.licenseKeys;
        } 

        /**
         * <p>统一过期时间（秒），同时应用于 API Key TTL 和 JWT 有效期</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder expireSeconds(Long expireSeconds) {
            this.putQueryParameter("ExpireSeconds", expireSeconds);
            this.expireSeconds = expireSeconds;
            return this;
        }

        /**
         * <p>逗号分隔的实例 ID 列表（与 LicenseKeys 至少填一个）</p>
         * 
         * <strong>example:</strong>
         * <p>acp-2zef0gov2nh2l3xxx,acp-2zef0gov2nh2l3yyy</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>逗号分隔的 licenseKey 列表（与 InstanceIds 至少填一个）</p>
         * 
         * <strong>example:</strong>
         * <p>lk-abcdef1234567890,lk-abcdef1234567891</p>
         */
        public Builder licenseKeys(String licenseKeys) {
            this.putQueryParameter("LicenseKeys", licenseKeys);
            this.licenseKeys = licenseKeys;
            return this;
        }

        @Override
        public RefreshAuthTokensRequest build() {
            return new RefreshAuthTokensRequest(this);
        } 

    } 

}
