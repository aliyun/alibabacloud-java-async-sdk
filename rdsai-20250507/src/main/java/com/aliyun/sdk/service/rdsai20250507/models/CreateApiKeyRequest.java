// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateApiKeyRequest</p>
 */
public class CreateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DailyTokenQuota")
    private Long dailyTokenQuota;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitRate")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Double limitRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LimitType")
    private String limitType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenQuota")
    private Long tokenQuota;

    private CreateApiKeyRequest(Builder builder) {
        super(builder);
        this.dailyTokenQuota = builder.dailyTokenQuota;
        this.instanceId = builder.instanceId;
        this.keyName = builder.keyName;
        this.limitRate = builder.limitRate;
        this.limitType = builder.limitType;
        this.quantity = builder.quantity;
        this.roleArn = builder.roleArn;
        this.roleName = builder.roleName;
        this.tokenQuota = builder.tokenQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyTokenQuota
     */
    public Long getDailyTokenQuota() {
        return this.dailyTokenQuota;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    /**
     * @return limitRate
     */
    public Double getLimitRate() {
        return this.limitRate;
    }

    /**
     * @return limitType
     */
    public String getLimitType() {
        return this.limitType;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return tokenQuota
     */
    public Long getTokenQuota() {
        return this.tokenQuota;
    }

    public static final class Builder extends Request.Builder<CreateApiKeyRequest, Builder> {
        private Long dailyTokenQuota; 
        private String instanceId; 
        private String keyName; 
        private Double limitRate; 
        private String limitType; 
        private Integer quantity; 
        private String roleArn; 
        private String roleName; 
        private Long tokenQuota; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiKeyRequest request) {
            super(request);
            this.dailyTokenQuota = request.dailyTokenQuota;
            this.instanceId = request.instanceId;
            this.keyName = request.keyName;
            this.limitRate = request.limitRate;
            this.limitType = request.limitType;
            this.quantity = request.quantity;
            this.roleArn = request.roleArn;
            this.roleName = request.roleName;
            this.tokenQuota = request.tokenQuota;
        } 

        /**
         * <p>The daily quota of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        public Builder dailyTokenQuota(Long dailyTokenQuota) {
            this.putQueryParameter("DailyTokenQuota", dailyTokenQuota);
            this.dailyTokenQuota = dailyTokenQuota;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_copilot***_public_cn-*********6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The API key name.</p>
         * 
         * <strong>example:</strong>
         * <p>api-*****</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        /**
         * <p>The quota percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        public Builder limitRate(Double limitRate) {
            this.putQueryParameter("LimitRate", limitRate);
            this.limitRate = limitRate;
            return this;
        }

        /**
         * <p>The quota allocation method. Valid values:</p>
         * <ul>
         * <li>ratio: by percentage.</li>
         * <li>fixed: by fixed value.</li>
         * <li>auto: automatic allocation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fixed</p>
         */
        public Builder limitType(String limitType) {
            this.putQueryParameter("LimitType", limitType);
            this.limitType = limitType;
            return this;
        }

        /**
         * <p>The number of API keys to create. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The quota limit for the current key.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder tokenQuota(Long tokenQuota) {
            this.putQueryParameter("TokenQuota", tokenQuota);
            this.tokenQuota = tokenQuota;
            return this;
        }

        @Override
        public CreateApiKeyRequest build() {
            return new CreateApiKeyRequest(this);
        } 

    } 

}
