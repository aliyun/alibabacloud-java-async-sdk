// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetTokenRequest} extends {@link RequestModel}
 *
 * <p>GetTokenRequest</p>
 */
public class GetTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Audience")
    private String audience;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Integer expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetTokenRequest(Builder builder) {
        super(builder);
        this.audience = builder.audience;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audience
     */
    public String getAudience() {
        return this.audience;
    }

    /**
     * @return expireTime
     */
    public Integer getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetTokenRequest, Builder> {
        private String audience; 
        private Integer expireTime; 
        private String instanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetTokenRequest request) {
            super(request);
            this.audience = request.audience;
            this.expireTime = request.expireTime;
            this.instanceId = request.instanceId;
            this.type = request.type;
        } 

        /**
         * Audience.
         */
        public Builder audience(String audience) {
            this.putQueryParameter("Audience", audience);
            this.audience = audience;
            return this;
        }

        /**
         * <p>The validity period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder expireTime(Integer expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetTokenRequest build() {
            return new GetTokenRequest(this);
        } 

    } 

}
