// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyResponseBody</p>
 */
public class CreatePolicyResponseBody extends TeaModel {
    @NameInMap("AccessControlRules")
    private String accessControlRules;

    @NameInMap("Arn")
    private String arn;

    @NameInMap("Description")
    private String description;

    @NameInMap("KmsInstance")
    private String kmsInstance;

    @NameInMap("Name")
    private String name;

    @NameInMap("Permissions")
    private String permissions;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private String resources;

    private CreatePolicyResponseBody(Builder builder) {
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

    public static CreatePolicyResponseBody create() {
        return builder().build();
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
    public String getPermissions() {
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
    public String getResources() {
        return this.resources;
    }

    public static final class Builder {
        private String accessControlRules; 
        private String arn; 
        private String description; 
        private String kmsInstance; 
        private String name; 
        private String permissions; 
        private String requestId; 
        private String resources; 

        /**
         * The name of the access control rule.
         */
        public Builder accessControlRules(String accessControlRules) {
            this.accessControlRules = accessControlRules;
            return this;
        }

        /**
         * The ARN of the permission policy.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The scope of the permission policy.
         */
        public Builder kmsInstance(String kmsInstance) {
            this.kmsInstance = kmsInstance;
            return this;
        }

        /**
         * The name of the permission policy.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The operations that can be performed.
         */
        public Builder permissions(String permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The key and secret that are allowed to access.
         * <p>
         * 
         * *   `key/*` indicates that all keys of the KMS instance can be accessed.
         * *   `secret/*` indicates all secrets of the KMS instance can be accessed.
         */
        public Builder resources(String resources) {
            this.resources = resources;
            return this;
        }

        public CreatePolicyResponseBody build() {
            return new CreatePolicyResponseBody(this);
        } 

    } 

}
