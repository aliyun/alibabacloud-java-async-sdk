// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdminRamIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String adminRamIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private String numberList;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.adminRamIdList = builder.adminRamIdList;
        this.description = builder.description;
        this.domainName = builder.domainName;
        this.name = builder.name;
        this.numberList = builder.numberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adminRamIdList
     */
    public String getAdminRamIdList() {
        return this.adminRamIdList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String adminRamIdList; 
        private String description; 
        private String domainName; 
        private String name; 
        private String numberList; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.adminRamIdList = request.adminRamIdList;
            this.description = request.description;
            this.domainName = request.domainName;
            this.name = request.name;
            this.numberList = request.numberList;
        } 

        /**
         * <p>List of RAM IDs to be assigned as administrators of this Cloud Contact Center instance. After successful creation, the RAM IDs in this list will be automatically imported into the newly created instance with administrator privileges.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;24861380681070****&quot;,&quot;105980354482****&quot;]</p>
         */
        public Builder adminRamIdList(String adminRamIdList) {
            this.putQueryParameter("AdminRamIdList", adminRamIdList);
            this.adminRamIdList = adminRamIdList;
            return this;
        }

        /**
         * <p>Description of the instance. The length must not exceed 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>云联络中心的测试实例。</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Second-level domain name of the Cloud Contact Center instance, which serves as the instance ID and is globally unique. It must be 4 to 48 characters long and can only contain uppercase and lowercase English letters, digits, underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Instance name. The length must be between 4 and 32 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>测试实例</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>List of phone numbers for the Cloud Contact Center instance to be created. The current account must have usage rights to these numbers, and the numbers must not be associated with any other instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;0830011xxxx&quot;, &quot;0830312xxxx&quot;]</p>
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
