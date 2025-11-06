// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link FetchStaticAccountRequest} extends {@link RequestModel}
 *
 * <p>FetchStaticAccountRequest</p>
 */
public class FetchStaticAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountAccessKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountAccessKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long createTimeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretSign")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private FetchStaticAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountAccessKey = builder.accountAccessKey;
        this.consoleSessionId = builder.consoleSessionId;
        this.createTimeStamp = builder.createTimeStamp;
        this.instanceId = builder.instanceId;
        this.remark = builder.remark;
        this.sKey = builder.sKey;
        this.secretSign = builder.secretSign;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchStaticAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accountAccessKey
     */
    public String getAccountAccessKey() {
        return this.accountAccessKey;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sKey
     */
    public String getSKey() {
        return this.sKey;
    }

    /**
     * @return secretSign
     */
    public String getSecretSign() {
        return this.secretSign;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<FetchStaticAccountRequest, Builder> {
        private String regionId; 
        private String accountAccessKey; 
        private String consoleSessionId; 
        private Long createTimeStamp; 
        private String instanceId; 
        private String remark; 
        private String sKey; 
        private String secretSign; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(FetchStaticAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountAccessKey = request.accountAccessKey;
            this.consoleSessionId = request.consoleSessionId;
            this.createTimeStamp = request.createTimeStamp;
            this.instanceId = request.instanceId;
            this.remark = request.remark;
            this.sKey = request.sKey;
            this.secretSign = request.secretSign;
            this.userName = request.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        public Builder accountAccessKey(String accountAccessKey) {
            this.putQueryParameter("AccountAccessKey", accountAccessKey);
            this.accountAccessKey = accountAccessKey;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1671175303522</p>
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.putQueryParameter("CreateTimeStamp", createTimeStamp);
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22c2d7d1769cb53c5a6d9213248e2de524******</p>
         */
        public Builder sKey(String sKey) {
            this.putQueryParameter("SKey", sKey);
            this.sKey = sKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c1a6367ce4c4255e9617326f9133ac635******</p>
         */
        public Builder secretSign(String secretSign) {
            this.putQueryParameter("SecretSign", secretSign);
            this.secretSign = secretSign;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mjo****************</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public FetchStaticAccountRequest build() {
            return new FetchStaticAccountRequest(this);
        } 

    } 

}
