// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UnbindAliasRequest} extends {@link RequestModel}
 *
 * <p>UnbindAliasRequest</p>
 */
public class UnbindAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnbindAll")
    private Boolean unbindAll;

    private UnbindAliasRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.appKey = builder.appKey;
        this.deviceId = builder.deviceId;
        this.unbindAll = builder.unbindAll;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAliasRequest create() {
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

    /**
     * @return unbindAll
     */
    public Boolean getUnbindAll() {
        return this.unbindAll;
    }

    public static final class Builder extends Request.Builder<UnbindAliasRequest, Builder> {
        private String aliasName; 
        private Long appKey; 
        private String deviceId; 
        private Boolean unbindAll; 

        private Builder() {
            super();
        } 

        private Builder(UnbindAliasRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.appKey = request.appKey;
            this.deviceId = request.deviceId;
            this.unbindAll = request.unbindAll;
        } 

        /**
         * AliasName.
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

        /**
         * UnbindAll.
         */
        public Builder unbindAll(Boolean unbindAll) {
            this.putQueryParameter("UnbindAll", unbindAll);
            this.unbindAll = unbindAll;
            return this;
        }

        @Override
        public UnbindAliasRequest build() {
            return new UnbindAliasRequest(this);
        } 

    } 

}
