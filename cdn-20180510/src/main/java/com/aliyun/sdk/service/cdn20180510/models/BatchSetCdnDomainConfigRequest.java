// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetCdnDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>BatchSetCdnDomainConfigRequest</p>
 */
public class BatchSetCdnDomainConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private BatchSetCdnDomainConfigRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.functions = builder.functions;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetCdnDomainConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<BatchSetCdnDomainConfigRequest, Builder> {
        private String domainNames; 
        private String functions; 
        private String ownerAccount; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetCdnDomainConfigRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.functions = request.functions;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The accelerated domain names. You can specify multiple accelerated domain names and separate them with commas (,).
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * The features that you want to configure. Format:
         * <p>
         * 
         * *   **functionName**: the name of the feature. This parameter is required. Separate multiple values with commas (,). For more information, see [Parameters for configuring features for domain names](~~388460~~).
         * *   **argName**: the feature parameter for **functionName**. This parameter is required. You can specify multiple feature parameters.
         * *   **argValue**: the parameter value that is specified for **functionName**. This parameter is required.
         * *   **parentid**: the rule condition ID. This parameter is optional. You can use the **condition** rule engine to create a rule condition. For information, see [Parameters for configuring features for domain names](~~388460~~). A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule condition, a [configid](~~388994~~) is generated. A configid can be used as parentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.
         * 
         * If the **ParentId** parameter is \*\*-1\*\*, the existing rule conditions in the configurations are deleted.
         * 
         * ```[{
         *    "functionArgs": [{
         *      "argName": "Parameter A", 
         *      "argValue": "Value of parameter A"
         *     }, 
         *   {
         *     "argName": "Parameter B", 
         *     "argValue": "Value of parameter B"
         *      }], 
         *  "functionName": "Feature name"
         *  "parentId": Optional. parentId corresponds to configid of the referenced rule condition
         * }]
         * ```
         * 
         * The following code provides a sample configuration if **parentId** is not used. In this example, the **origin_request_header** feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is **configid=222728944812032** is referenced.
         * 
         * ```[{
         *         "functionArgs": [{
         *             "argName": "header_operation_type",
         *             "argValue": "add"
         *         }, {
         *             "argName": "header_name",
         *             "argValue": "Accept-Encoding"
         *         }, {
         *             "argName": "header_value",
         *             "argValue": "gzip"
         *         }, {
         *             "argName": "duplicate",
         *             "argValue": "off"
         *         }],
         *         "functionName": "origin_request_header"
         * }]
         * ```
         * 
         * The following code shows a sample configuration if **parentId** is used. In this example, the **origin_request_header** feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is **222728944812032** is referenced.
         * 
         * ```[{
         *         "functionArgs": [{
         *             "argName": "header_operation_type",
         *             "argValue": "add"
         *         }, {
         *             "argName": "header_name",
         *             "argValue": "Accept-Encoding"
         *         }, {
         *             "argName": "header_value",
         *             "argValue": "gzip"
         *         }, {
         *             "argName": "duplicate",
         *             "argValue": "off"
         *         }],
         *         "functionName": "origin_request_header",
         *         "parentId": 222728944812032
         * }]
         * ```
         * 
         * The following code provides a sample configuration that deletes the reference to **parentId** for a feature that uses **parentId**. This example shows how to delete the rule condition that has a configuration ID of **222728944812032** and is referenced when **origin_request_header** feature is used to add back-to-origin HTTP headers.
         * 
         * ```[{
         *         "functionArgs": [{
         *             "argName": "header_operation_type",
         *             "argValue": "add"
         *         }, {
         *             "argName": "header_name",
         *             "argValue": "Accept-Encoding"
         *         }, {
         *             "argName": "header_value",
         *             "argValue": "gzip"
         *         }, {
         *             "argName": "duplicate",
         *             "argValue": "off"
         *         }],
         *         "functionName": "origin_request_header",
         *         "parentId": -1
         * }]
         * ```
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public BatchSetCdnDomainConfigRequest build() {
            return new BatchSetCdnDomainConfigRequest(this);
        } 

    } 

}
