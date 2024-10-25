// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateSecurityGroupRequest</p>
 */
public class CreateSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupName")
    private String securityGroupName;

    private CreateSecurityGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.securityGroupName = builder.securityGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityGroupRequest create() {
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
     * @return securityGroupName
     */
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

    public static final class Builder extends Request.Builder<CreateSecurityGroupRequest, Builder> {
        private String description; 
        private String securityGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSecurityGroupRequest request) {
            super(request);
            this.description = request.description;
            this.securityGroupName = request.securityGroupName;
        } 

        /**
         * <p>The description of the security group. The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the security group. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-). By default, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Dcdn1:2_3-4</p>
         */
        public Builder securityGroupName(String securityGroupName) {
            this.putQueryParameter("SecurityGroupName", securityGroupName);
            this.securityGroupName = securityGroupName;
            return this;
        }

        @Override
        public CreateSecurityGroupRequest build() {
            return new CreateSecurityGroupRequest(this);
        } 

    } 

}
