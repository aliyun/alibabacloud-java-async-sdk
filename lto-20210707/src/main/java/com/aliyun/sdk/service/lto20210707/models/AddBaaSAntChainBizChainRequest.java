// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link AddBaaSAntChainBizChainRequest} extends {@link RequestModel}
 *
 * <p>AddBaaSAntChainBizChainRequest</p>
 */
public class AddBaaSAntChainBizChainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSAntChainChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSAntChainChainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSAntChainConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSAntChainConsortiumId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaCert")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaCertPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caCertPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientCert")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientKeyPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientKeyPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractTemplateIdList")
    private String contractTemplateIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeNameList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserKeyPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userKeyPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private AddBaaSAntChainBizChainRequest(Builder builder) {
        super(builder);
        this.baaSAntChainChainId = builder.baaSAntChainChainId;
        this.baaSAntChainConsortiumId = builder.baaSAntChainConsortiumId;
        this.caCert = builder.caCert;
        this.caCertPassword = builder.caCertPassword;
        this.clientCert = builder.clientCert;
        this.clientKey = builder.clientKey;
        this.clientKeyPassword = builder.clientKeyPassword;
        this.contractTemplateIdList = builder.contractTemplateIdList;
        this.name = builder.name;
        this.nodeNameList = builder.nodeNameList;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.userKey = builder.userKey;
        this.userKeyPassword = builder.userKeyPassword;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBaaSAntChainBizChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baaSAntChainChainId
     */
    public String getBaaSAntChainChainId() {
        return this.baaSAntChainChainId;
    }

    /**
     * @return baaSAntChainConsortiumId
     */
    public String getBaaSAntChainConsortiumId() {
        return this.baaSAntChainConsortiumId;
    }

    /**
     * @return caCert
     */
    public String getCaCert() {
        return this.caCert;
    }

    /**
     * @return caCertPassword
     */
    public String getCaCertPassword() {
        return this.caCertPassword;
    }

    /**
     * @return clientCert
     */
    public String getClientCert() {
        return this.clientCert;
    }

    /**
     * @return clientKey
     */
    public String getClientKey() {
        return this.clientKey;
    }

    /**
     * @return clientKeyPassword
     */
    public String getClientKeyPassword() {
        return this.clientKeyPassword;
    }

    /**
     * @return contractTemplateIdList
     */
    public String getContractTemplateIdList() {
        return this.contractTemplateIdList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeNameList
     */
    public String getNodeNameList() {
        return this.nodeNameList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return userKey
     */
    public String getUserKey() {
        return this.userKey;
    }

    /**
     * @return userKeyPassword
     */
    public String getUserKeyPassword() {
        return this.userKeyPassword;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<AddBaaSAntChainBizChainRequest, Builder> {
        private String baaSAntChainChainId; 
        private String baaSAntChainConsortiumId; 
        private String caCert; 
        private String caCertPassword; 
        private String clientCert; 
        private String clientKey; 
        private String clientKeyPassword; 
        private String contractTemplateIdList; 
        private String name; 
        private String nodeNameList; 
        private String regionId; 
        private String remark; 
        private String userKey; 
        private String userKeyPassword; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(AddBaaSAntChainBizChainRequest request) {
            super(request);
            this.baaSAntChainChainId = request.baaSAntChainChainId;
            this.baaSAntChainConsortiumId = request.baaSAntChainConsortiumId;
            this.caCert = request.caCert;
            this.caCertPassword = request.caCertPassword;
            this.clientCert = request.clientCert;
            this.clientKey = request.clientKey;
            this.clientKeyPassword = request.clientKeyPassword;
            this.contractTemplateIdList = request.contractTemplateIdList;
            this.name = request.name;
            this.nodeNameList = request.nodeNameList;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.userKey = request.userKey;
            this.userKeyPassword = request.userKeyPassword;
            this.userName = request.userName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSAntChainChainId(String baaSAntChainChainId) {
            this.putQueryParameter("BaaSAntChainChainId", baaSAntChainChainId);
            this.baaSAntChainChainId = baaSAntChainChainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
            this.putQueryParameter("BaaSAntChainConsortiumId", baaSAntChainConsortiumId);
            this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder caCert(String caCert) {
            this.putQueryParameter("CaCert", caCert);
            this.caCert = caCert;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder caCertPassword(String caCertPassword) {
            this.putQueryParameter("CaCertPassword", caCertPassword);
            this.caCertPassword = caCertPassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientCert(String clientCert) {
            this.putQueryParameter("ClientCert", clientCert);
            this.clientCert = clientCert;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientKey(String clientKey) {
            this.putQueryParameter("ClientKey", clientKey);
            this.clientKey = clientKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientKeyPassword(String clientKeyPassword) {
            this.putQueryParameter("ClientKeyPassword", clientKeyPassword);
            this.clientKeyPassword = clientKeyPassword;
            return this;
        }

        /**
         * ContractTemplateIdList.
         */
        public Builder contractTemplateIdList(String contractTemplateIdList) {
            this.putQueryParameter("ContractTemplateIdList", contractTemplateIdList);
            this.contractTemplateIdList = contractTemplateIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nodeNameList(String nodeNameList) {
            this.putQueryParameter("NodeNameList", nodeNameList);
            this.nodeNameList = nodeNameList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         */
        public Builder userKey(String userKey) {
            this.putQueryParameter("UserKey", userKey);
            this.userKey = userKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userKeyPassword(String userKeyPassword) {
            this.putQueryParameter("UserKeyPassword", userKeyPassword);
            this.userKeyPassword = userKeyPassword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public AddBaaSAntChainBizChainRequest build() {
            return new AddBaaSAntChainBizChainRequest(this);
        } 

    } 

}
