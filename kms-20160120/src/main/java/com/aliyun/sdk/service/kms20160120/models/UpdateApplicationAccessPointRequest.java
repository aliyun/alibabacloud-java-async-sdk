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
 * {@link UpdateApplicationAccessPointRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationAccessPointRequest</p>
 */
public class UpdateApplicationAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policies")
    private String policies;

    private UpdateApplicationAccessPointRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.policies = builder.policies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationAccessPointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateApplicationAccessPointRequest, Builder> {
        private String description; 
        private String name; 
        private String policies; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationAccessPointRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.policies = request.policies;
        } 

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>aap description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the AAP that you want to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aap_test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The permission policy that you want to update.</p>
         * <blockquote>
         * <p>You can associate up to three permission policies with each AAP.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]</p>
         */
        public Builder policies(String policies) {
            this.putQueryParameter("Policies", policies);
            this.policies = policies;
            return this;
        }

        @Override
        public UpdateApplicationAccessPointRequest build() {
            return new UpdateApplicationAccessPointRequest(this);
        } 

    } 

}
