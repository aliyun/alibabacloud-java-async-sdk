// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
         * <p>The alias to detach.</p>
         * <p>An alias supports up to 128 bytes (one Chinese character counts as 3 bytes). This field is required when UnbindAll is false. You can detach up to 10 aliases at once. Separate multiple aliases with commas.</p>
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
         * <p>The AppKey.</p>
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
         * <p>The unique device identifier for push notifications. It is 32 characters long and consists of digits and lowercase letters.</p>
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
         * <p>Whether to detach all aliases. Default is false.</p>
         * <p>If true, detaches all aliases currently bound to the device. If false, detaches only the aliases specified in AliasName.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
