// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link DescribePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyResponseBody</p>
 */
public class DescribePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessControlRules")
    private String accessControlRules;

    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("KmsInstance")
    private String kmsInstance;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List<String> permissions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<String> resources;

    private DescribePolicyResponseBody(Builder builder) {
        this.accessControlRules = builder.accessControlRules;
        this.arn = builder.arn;
        this.description = builder.description;
        this.kmsInstance = builder.kmsInstance;
        this.name = builder.name;
        this.permissions = builder.permissions;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessControlRules
     */
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return kmsInstance
     */
    public String getKmsInstance() {
        return this.kmsInstance;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return permissions
     */
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String accessControlRules; 
        private String arn; 
        private String description; 
        private String kmsInstance; 
        private String name; 
        private java.util.List<String> permissions; 
        private String requestId; 
        private java.util.List<String> resources; 

        private Builder() {
        } 

        private Builder(DescribePolicyResponseBody model) {
            this.accessControlRules = model.accessControlRules;
            this.arn = model.arn;
            this.description = model.description;
            this.kmsInstance = model.kmsInstance;
            this.name = model.name;
            this.permissions = model.permissions;
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * <p>The network access rule that is associated with the permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NetworkRules&quot;:[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]}</p>
         */
        public Builder accessControlRules(String accessControlRules) {
            this.accessControlRules = accessControlRules;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:119285303511****:policy/policy_test</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>policy  description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The scope of the permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-hzz634e67d126u9p9****</p>
         */
        public Builder kmsInstance(String kmsInstance) {
            this.kmsInstance = kmsInstance;
            return this;
        }

        /**
         * <p>The name of the permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy_test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>A list of operations that can be performed.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;RbacPermission/Template/CryptoServiceKeyUser&quot;, &quot;RbacPermission/Template/CryptoServiceSecretUser&quot;]</p>
         */
        public Builder permissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f455324b-e229-4066-9f58-9c1cf3fe83a9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of keys and secrets that are allowed to access.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;secret/acs/ram/user/ram-secret&quot;, &quot;secret/acs/ram/user/acr-master&quot;, &quot;key/key-hzz63d9c8d3dfv8cv****&quot;]</p>
         */
        public Builder resources(java.util.List<String> resources) {
            this.resources = resources;
            return this;
        }

        public DescribePolicyResponseBody build() {
            return new DescribePolicyResponseBody(this);
        } 

    } 

}
