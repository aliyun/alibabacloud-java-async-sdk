// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link CreateSmartAccessGatewayClientUserRequest} extends {@link RequestModel}
 *
 * <p>CreateSmartAccessGatewayClientUserRequest</p>
 */
public class CreateSmartAccessGatewayClientUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartAGId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String smartAGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserMail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userMail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private CreateSmartAccessGatewayClientUserRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientIp = builder.clientIp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.smartAGId = builder.smartAGId;
        this.userMail = builder.userMail;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmartAccessGatewayClientUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
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

    /**
     * @return smartAGId
     */
    public String getSmartAGId() {
        return this.smartAGId;
    }

    /**
     * @return userMail
     */
    public String getUserMail() {
        return this.userMail;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateSmartAccessGatewayClientUserRequest, Builder> {
        private Long bandwidth; 
        private String clientIp; 
        private String ownerAccount; 
        private Long ownerId; 
        private String password; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String smartAGId; 
        private String userMail; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmartAccessGatewayClientUserRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientIp = request.clientIp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.smartAGId = request.smartAGId;
            this.userMail = request.userMail;
            this.userName = request.userName;
        } 

        /**
         * <p>The maximum bandwidth value. Unit: Kbit/s. Valid values: <strong>1 to 20000</strong>. Default value: <strong>2000</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <ul>
         * <li>If you enable the client app service, you must set the IP address of the client app. The current client account uses the specified IP address to connect to Alibaba Cloud.</li>
         * </ul>
         * <blockquote>
         * <p> The IP address must fall within a private CIDR block.</p>
         * </blockquote>
         * <ul>
         * <li>If you disable the client app service, an IP address within a private CIDR block is assigned to the client account. Each connection to Alibaba Cloud uses a different IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.0.XX.XX</p>
         */
        public Builder clientIp(String clientIp) {
            this.putQueryParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
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
         * <p>The password that is used to log on to the SAG app.</p>
         * <p>The password must be 8 to 32 characters in length. It can contain letters, digits, underscores (_), at signs (@), and hyphens (-). It must start with a letter or a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>duuf****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID of the Smart Access Gateway (SAG) app instance.</p>
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

        /**
         * <p>The ID of the SAG app instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-gnhe6sywtare5****</p>
         */
        public Builder smartAGId(String smartAGId) {
            this.putQueryParameter("SmartAGId", smartAGId);
            this.smartAGId = smartAGId;
            return this;
        }

        /**
         * <p>The email address of the client account. The username and password are sent to the specified email address by the administrator.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder userMail(String userMail) {
            this.putQueryParameter("UserMail", userMail);
            this.userMail = userMail;
            return this;
        }

        /**
         * <p>The username of the client account. The usernames of client accounts added to the same SAG app instance must be unique.</p>
         * <p>The username must be 7 to 33 characters in length, and can contain letters, digits, underscores (_), at signs (@), periods (.), and hyphens (-). It must start with a letter or a digit.</p>
         * <blockquote>
         * <p> For a client account, if you specify the username, you must also specify the password. If you specify the password, you must specify the username.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateSmartAccessGatewayClientUserRequest build() {
            return new CreateSmartAccessGatewayClientUserRequest(this);
        } 

    } 

}
