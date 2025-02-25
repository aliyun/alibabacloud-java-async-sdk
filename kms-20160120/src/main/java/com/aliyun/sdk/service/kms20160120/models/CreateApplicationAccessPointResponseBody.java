// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationAccessPointResponseBody</p>
 */
public class CreateApplicationAccessPointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("AuthenticationMethod")
    private String authenticationMethod;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Policies")
    private String policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApplicationAccessPointResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.authenticationMethod = builder.authenticationMethod;
        this.description = builder.description;
        this.name = builder.name;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationAccessPointResponseBody create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return authenticationMethod
     */
    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policies
     */
    public String getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String arn; 
        private String authenticationMethod; 
        private String description; 
        private String name; 
        private String policies; 
        private String requestId; 

        /**
         * The Alibaba Cloud Resource Name (ARN) of the AAP.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The authentication method.
         */
        public Builder authenticationMethod(String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * The description of the AAP.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The name of the AAP.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The permission policy.
         */
        public Builder policies(String policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationAccessPointResponseBody build() {
            return new CreateApplicationAccessPointResponseBody(this);
        } 

    } 

}
