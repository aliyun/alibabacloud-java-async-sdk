// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodDomainRequest} extends {@link RequestModel}
 *
 * <p>AddVodDomainRequest</p>
 */
public class AddVodDomainRequest extends Request {
    @Query
    @NameInMap("CheckUrl")
    private String checkUrl;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Sources")
    @Validation(required = true)
    private String sources;

    @Query
    @NameInMap("TopLevelDomain")
    private String topLevelDomain;

    private AddVodDomainRequest(Builder builder) {
        super(builder);
        this.checkUrl = builder.checkUrl;
        this.domainName = builder.domainName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.sources = builder.sources;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkUrl
     */
    public String getCheckUrl() {
        return this.checkUrl;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sources
     */
    public String getSources() {
        return this.sources;
    }

    /**
     * @return topLevelDomain
     */
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static final class Builder extends Request.Builder<AddVodDomainRequest, Builder> {
        private String checkUrl; 
        private String domainName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String scope; 
        private String securityToken; 
        private String sources; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(AddVodDomainRequest request) {
            super(request);
            this.checkUrl = request.checkUrl;
            this.domainName = request.domainName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.scope = request.scope;
            this.securityToken = request.securityToken;
            this.sources = request.sources;
            this.topLevelDomain = request.topLevelDomain;
        } 

        /**
         * ## Common errors
         * <p>
         * 
         * The following table describes the error codes that this operation can return.
         * 
         * |Error code|Error message|HTTP status code|Description|
         * |---|---|---|---|
         * |InvalidDomainName.Malformed|Specified DomainName is malformed.|400|The error message returned because the value of the DomainName parameter is invalid.|
         * |InvalidCdnType.Malformed|Specified CdnType is malformed.|400|The error message returned because the value of the CdnType parameter is invalid.|
         * |InvalidSourceType.Malformed|Specified SourceType is malformed.|400|The error message returned because the value of the SourceType parameter is invalid.|
         * |InvalidSources.Malformed|Specified Sources is malformed.|400|The error message returned because the origin address does not match the origin type.|
         * |InvalidScope.Malformed|Specified Scope is malformed.|400|The error message returned because the value of the Scope parameter is invalid.|
         * |InvaildParameter|The Certificate you provided is malformed!|400|The error message returned because the total length of the HTTPS certificate and private key exceeds the upper limit.|
         * |BusinessExist|Business exist do not repeated submission|400|The error message returned because the domain name is being added. You cannot add duplicate domain names.|
         * |DomainAlreadyExist|This domain name is exist already|400|The error message returned because the domain name is already added.|
         * |DomainOverLimit|The Number of Domain is over the limit|403|The error message returned because the number of accelerated domain names exceeds the upper limit.|
         * |DomainNotRegistration|The Domain name is not registered|404|The error message returned because the domain name does not have an ICP filing.|
         * |IllegalOperation|Illegal domain operate is not permitted.|403|The error message returned because you are not authorized to perform this operation.|
         * |ServiceBusy|The specified Domain is configuring, please retry later.|403|The error message returned because the domain name is being configured. Try again later.|
         * |InvalidDomain.NotFound|The domain provided does not belong to you.|404|The error message returned because the specified domain name does not exist or does not belong to the current account.|
         * |InnerAddDomainDenied|Your account haven\"t bind aoneId, can not add domain.|400|The error message returned because an internal account is not bound to an Aone ID. You cannot add a domain name by using the internal account.|
         * |ExtensiveAndAllBothExist|Extensive domain and the domain begins with \"all.\" can not exist at the same time.|400|The error message returned because a wildcard domain name and a domain name that starts with all. exist. They cannot exist at the same time.|
         * |CdnTypeNotSupportExtensiveDomain|Extensive domain not supported for this cdn type.|400|The error message returned because wildcard domain names are not supported for the specified business type.|
         * |ExtensiveAndSpecificDomainConflict|Extensive domain and corresponding specific domain are mutually exclusive.|400|The error message returned because the specified domain name is an exact match of an existing wildcard domain name at the same level.|
         * |InvalidParameter|Add live region parameters have error.|400|The error message returned because the system failed to specify the region for live streaming.|
         * |InvalidRegion.Malformed|Specified Region is malformed.|400|The error message returned because the value of the region parameter is invalid.|
         * |InvalidResourceGroupId.Malformed|Specified ResourceGroupId is malformed.|400|The error message returned because the value of the ResourceGroupId parameter is invalid.|
         * |EntityNotExists.ResourceGroup|The resource group does not exist.|400|The error message returned because the specified resource group does not exist.|
         * |InvalidStatus.ResourceGroup|It\"s now allowed to do this operation because of the current status of resource-group.|400|The error message returned because the resource group is in an invalid state.|
         * |InvalidPriorities.Malformed|The length of priorities is not the same with source.|400|The error message returned because the number of priorities does not match the number of origin servers.|
         * |NotInternationRealIdentity|You need to do real name authentication when you use Chinese mainland resources.|400|The error message returned because you have not completed real-name verification that is required to use resources in the Chinese mainland.|
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * *   This operation is available only in the **China (Shanghai)** region.
         * <p>
         * *   Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see [Activate ApsaraVideo VOD](~~51512~~).
         * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.
         * *   You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * The domain name that you want to accelerate. Wildcard domain names that start with periods (.) are supported. Example: .example.com.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * ## Sources
         * <p>
         * 
         * |Parameter|Type|Required|Description|
         * |---|---|---|---|
         * |type|String|Yes|The type of the origin server. Valid values: <br>**ipaddr**: an IP address. <br>**domain**: a domain name. <br>**oss**: the domain of an Object Storage Service (OSS) bucket.|
         * |content|String|Yes|The address of the origin server. You can specify an IP address or a domain name.|
         * |port|Integer|No|The port number. Valid values: **443** and **80**. <br>Default value: **80**. If you specify **443**, requests are redirected to the origin server over HTTPS. You can also specify a custom port.|
         * |priority|String|No|The priority of the origin server if multiple origin servers are specified. Valid values: **20** and **30**. Default value: **20**. **20** indicates that the origin server is the primary origin server. **30** indicates that the origin server is a secondary origin server.|
         */
        public Builder sources(String sources) {
            this.putQueryParameter("Sources", sources);
            this.sources = sources;
            return this;
        }

        /**
         * The information about the addresses of origin servers. For more information, see the **Sources** table in this topic.
         */
        public Builder topLevelDomain(String topLevelDomain) {
            this.putQueryParameter("TopLevelDomain", topLevelDomain);
            this.topLevelDomain = topLevelDomain;
            return this;
        }

        @Override
        public AddVodDomainRequest build() {
            return new AddVodDomainRequest(this);
        } 

    } 

}
