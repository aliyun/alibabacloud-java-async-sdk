// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindAliasRequest} extends {@link RequestModel}
 *
 * <p>BindAliasRequest</p>
 */
public class BindAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    private BindAliasRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.appKey = builder.appKey;
        this.deviceId = builder.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    public static final class Builder extends Request.Builder<BindAliasRequest, Builder> {
        private String aliasName; 
        private Long appKey; 
        private String deviceId; 

        private Builder() {
            super();
        } 

        private Builder(BindAliasRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.appKey = request.appKey;
            this.deviceId = request.deviceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_alias</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e2ba19de97604f55b16557673****</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        @Override
        public BindAliasRequest build() {
            return new BindAliasRequest(this);
        } 

    } 

}
