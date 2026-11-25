// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifySQLRateLimitingRulesRequest} extends {@link RequestModel}
 *
 * <p>ModifySQLRateLimitingRulesRequest</p>
 */
public class ModifySQLRateLimitingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private ModifySQLRateLimitingRulesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleConfig = builder.ruleConfig;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySQLRateLimitingRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<ModifySQLRateLimitingRulesRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ruleConfig; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(ModifySQLRateLimitingRulesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleConfig = request.ruleConfig;
            this.ruleName = request.ruleName;
        } 

        /**
         * <p>The cluster ID. Call instructions: Engine compatibility note: Explicitly list the database types that support SQL throttling, such as PolarDB for MySQL 8.0 only, in the description of the DBClusterId parameter or the API prerequisites.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * <p>The JSON string of the configuration parameters and their values for the SQL throttling rule to be modified. All parameter values are of the string type. Example: <code>{&quot;id&quot;:&quot;test&quot;,&quot;enabled&quot;:&quot;true&quot;,&quot;match_mode&quot;:&quot;0&quot;,&quot;template&quot;:&quot;dXBkYXRlIHQgc2V0IGEgPSAxIHdoZXJlIGlkID0gMQ==&quot;,&quot;user&quot;:&quot;&quot;,&quot;database&quot;:&quot;&quot;,&quot;waiting&quot;:1024,&quot;endpoint&quot;:&quot;[{&quot;EndpointName&quot;:&quot;pe-***********&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Address&quot;}]&quot;,&quot;throttle_mode&quot;:0,&quot;concurrency&quot;:1}</code>. Parameters:</p>
         * <ul>
         * <li><code>&quot;id&quot;</code>: Required. The name of the throttling rule. The name must meet the following requirements:<ul>
         * <li>The name cannot exceed 30 characters in length.</li>
         * <li>The name must consist of uppercase letters, lowercase letters, and digits. Call instructions: Complete sub-parameter documentation: Annotate the type, value range, business meaning, and conditional dependencies for each field, such as the enumeration values and meanings of match_mode, the values and meanings of throttle_mode, the valid ranges of waiting and concurrency, and the conditional requirement rules for endpoint.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:&quot;test&quot;,&quot;enabled&quot;:&quot;true&quot;,&quot;match_mode&quot;:&quot;0&quot;,&quot;template&quot;:&quot;dXBkYXRlIHQgc2V0IGEgPSAxIHdoZXJlIGlkID0gMQ==&quot;,&quot;user&quot;:&quot;&quot;,&quot;database&quot;:&quot;&quot;,&quot;waiting&quot;:1024,&quot;endpoint&quot;:&quot;[{&quot;EndpointName&quot;:&quot;pe-***********&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Address&quot;}]&quot;,&quot;throttle_mode&quot;:0,&quot;concurrency&quot;:1}</p>
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putQueryParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>The name of the SQL throttling rule. You can specify only one rule name at a time.</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeSQLRateLimitingRules</a> operation to query the details of all SQL throttling rules in the specified cluster, including the rule names.</li>
         * <li>If the specified rule name does not exist in the current cluster, the system automatically creates a new SQL throttling rule based on the name and the value of <code>RuleConfig</code>.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public ModifySQLRateLimitingRulesRequest build() {
            return new ModifySQLRateLimitingRulesRequest(this);
        } 

    } 

}
