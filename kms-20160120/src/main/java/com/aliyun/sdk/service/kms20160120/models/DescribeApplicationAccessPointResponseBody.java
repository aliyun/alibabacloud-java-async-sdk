// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationAccessPointResponseBody</p>
 */
public class DescribeApplicationAccessPointResponseBody extends TeaModel {
    @NameInMap("Arn")
    private String arn;

    @NameInMap("AuthenticationMethod")
    private String authenticationMethod;

    @NameInMap("Description")
    private String description;

    @NameInMap("Name")
    private String name;

    @NameInMap("Policies")
    private String policies;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationAccessPointResponseBody(Builder builder) {
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

    public static DescribeApplicationAccessPointResponseBody create() {
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
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * AuthenticationMethod.
         */
        public Builder authenticationMethod(String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Policies.
         */
        public Builder policies(String policies) {
            this.policies = policies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationAccessPointResponseBody build() {
            return new DescribeApplicationAccessPointResponseBody(this);
        } 

    } 

}
