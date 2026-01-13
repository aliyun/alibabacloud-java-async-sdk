// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link CreateCustomerModuleBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomerModuleBasicInfoRequest</p>
 */
public class CreateCustomerModuleBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleName")
    private String customerModuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleType")
    private String moduleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorePath")
    private String storePath;

    private CreateCustomerModuleBasicInfoRequest(Builder builder) {
        super(builder);
        this.customerModuleName = builder.customerModuleName;
        this.description = builder.description;
        this.moduleType = builder.moduleType;
        this.storePath = builder.storePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomerModuleBasicInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerModuleName
     */
    public String getCustomerModuleName() {
        return this.customerModuleName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return moduleType
     */
    public String getModuleType() {
        return this.moduleType;
    }

    /**
     * @return storePath
     */
    public String getStorePath() {
        return this.storePath;
    }

    public static final class Builder extends Request.Builder<CreateCustomerModuleBasicInfoRequest, Builder> {
        private String customerModuleName; 
        private String description; 
        private String moduleType; 
        private String storePath; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomerModuleBasicInfoRequest request) {
            super(request);
            this.customerModuleName = request.customerModuleName;
            this.description = request.description;
            this.moduleType = request.moduleType;
            this.storePath = request.storePath;
        } 

        /**
         * <p>The display identifier of the model for customers.</p>
         * 
         * <strong>example:</strong>
         * <p>module01</p>
         */
        public Builder customerModuleName(String customerModuleName) {
            this.putQueryParameter("CustomerModuleName", customerModuleName);
            this.customerModuleName = customerModuleName;
            return this;
        }

        /**
         * <p>Model description.</p>
         * 
         * <strong>example:</strong>
         * <p>模型描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Model deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>PMML</p>
         */
        public Builder moduleType(String moduleType) {
            this.putQueryParameter("ModuleType", moduleType);
            this.moduleType = moduleType;
            return this;
        }

        /**
         * <p>Model storage path.</p>
         * 
         * <strong>example:</strong>
         * <p>customer/xxxxxxxxx/xxxxxxxx.pmml</p>
         */
        public Builder storePath(String storePath) {
            this.putQueryParameter("StorePath", storePath);
            this.storePath = storePath;
            return this;
        }

        @Override
        public CreateCustomerModuleBasicInfoRequest build() {
            return new CreateCustomerModuleBasicInfoRequest(this);
        } 

    } 

}
