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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateApplicationAccessPointResponseBody model) {
            this.arn = model.arn;
            this.authenticationMethod = model.authenticationMethod;
            this.description = model.description;
            this.name = model.name;
            this.policies = model.policies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the AAP.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:119285303511****:applicationaccesspoint/aap_test</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The authentication method.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientKey</p>
         */
        public Builder authenticationMethod(String authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * <p>The description of the AAP.</p>
         * 
         * <strong>example:</strong>
         * <p>aap description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the AAP.</p>
         * 
         * <strong>example:</strong>
         * <p>aap_test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The permission policy.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]</p>
         */
        public Builder policies(String policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>bcfefe15-46f0-44a3-bd96-3d422474b71a</p>
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
