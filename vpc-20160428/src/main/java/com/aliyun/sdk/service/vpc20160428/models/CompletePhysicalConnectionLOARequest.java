// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CompletePhysicalConnectionLOARequest} extends {@link RequestModel}
 *
 * <p>CompletePhysicalConnectionLOARequest</p>
 */
public class CompletePhysicalConnectionLOARequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinishWork")
    private Boolean finishWork;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineCode")
    private String lineCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineLabel")
    private String lineLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineSPContactInfo")
    private String lineSPContactInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LineServiceProvider")
    private String lineServiceProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CompletePhysicalConnectionLOARequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.finishWork = builder.finishWork;
        this.instanceId = builder.instanceId;
        this.lineCode = builder.lineCode;
        this.lineLabel = builder.lineLabel;
        this.lineSPContactInfo = builder.lineSPContactInfo;
        this.lineServiceProvider = builder.lineServiceProvider;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompletePhysicalConnectionLOARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return finishWork
     */
    public Boolean getFinishWork() {
        return this.finishWork;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lineCode
     */
    public String getLineCode() {
        return this.lineCode;
    }

    /**
     * @return lineLabel
     */
    public String getLineLabel() {
        return this.lineLabel;
    }

    /**
     * @return lineSPContactInfo
     */
    public String getLineSPContactInfo() {
        return this.lineSPContactInfo;
    }

    /**
     * @return lineServiceProvider
     */
    public String getLineServiceProvider() {
        return this.lineServiceProvider;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CompletePhysicalConnectionLOARequest, Builder> {
        private String clientToken; 
        private Boolean finishWork; 
        private String instanceId; 
        private String lineCode; 
        private String lineLabel; 
        private String lineSPContactInfo; 
        private String lineServiceProvider; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CompletePhysicalConnectionLOARequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.finishWork = request.finishWork;
            this.instanceId = request.instanceId;
            this.lineCode = request.lineCode;
            this.lineLabel = request.lineLabel;
            this.lineSPContactInfo = request.lineSPContactInfo;
            this.lineServiceProvider = request.lineServiceProvider;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
         * <blockquote>
         * <p> If you do not set this parameter, the system automatically uses <strong>RequestId</strong> as <strong>ClientToken</strong>. <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-230e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether the construction is completed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder finishWork(Boolean finishWork) {
            this.putQueryParameter("FinishWork", finishWork);
            this.finishWork = finishWork;
            return this;
        }

        /**
         * <p>The ID of the Express Connect circuit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp10tvlhnwkw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The circuit code provided by the connectivity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa111****</p>
         */
        public Builder lineCode(String lineCode) {
            this.putQueryParameter("LineCode", lineCode);
            this.lineCode = lineCode;
            return this;
        }

        /**
         * <p>The label of the cable in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>bbb222****</p>
         */
        public Builder lineLabel(String lineLabel) {
            this.putQueryParameter("LineLabel", lineLabel);
            this.lineLabel = lineLabel;
            return this;
        }

        /**
         * <p>The contact information about line O&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>1388888****</p>
         */
        public Builder lineSPContactInfo(String lineSPContactInfo) {
            this.putQueryParameter("LineSPContactInfo", lineSPContactInfo);
            this.lineSPContactInfo = lineSPContactInfo;
            return this;
        }

        /**
         * <p>The ISP. Valid values:</p>
         * <ul>
         * <li><strong>China Telecom</strong></li>
         * <li><strong>China Unicom</strong></li>
         * <li><strong>China Mobile</strong></li>
         * <li><strong>Other ISPs in China</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Other ISPs in China</p>
         */
        public Builder lineServiceProvider(String lineServiceProvider) {
            this.putQueryParameter("LineServiceProvider", lineServiceProvider);
            this.lineServiceProvider = lineServiceProvider;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the Express Connect circuit.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CompletePhysicalConnectionLOARequest build() {
            return new CompletePhysicalConnectionLOARequest(this);
        } 

    } 

}
