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
 * {@link UpdateModuleBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateModuleBasicInfoRequest</p>
 */
public class UpdateModuleBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

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

    private UpdateModuleBasicInfoRequest(Builder builder) {
        super(builder);
        this.customerModuleId = builder.customerModuleId;
        this.customerModuleName = builder.customerModuleName;
        this.description = builder.description;
        this.moduleType = builder.moduleType;
        this.storePath = builder.storePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModuleBasicInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerModuleId
     */
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
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

    public static final class Builder extends Request.Builder<UpdateModuleBasicInfoRequest, Builder> {
        private Integer customerModuleId; 
        private String customerModuleName; 
        private String description; 
        private String moduleType; 
        private String storePath; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModuleBasicInfoRequest request) {
            super(request);
            this.customerModuleId = request.customerModuleId;
            this.customerModuleName = request.customerModuleName;
            this.description = request.description;
            this.moduleType = request.moduleType;
            this.storePath = request.storePath;
        } 

        /**
         * <p>Customer model ID</p>
         * 
         * <strong>example:</strong>
         * <p>456</p>
         */
        public Builder customerModuleId(Integer customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        /**
         * <p>Model name.</p>
         * 
         * <strong>example:</strong>
         * <p>moduleName</p>
         */
        public Builder customerModuleName(String customerModuleName) {
            this.putQueryParameter("CustomerModuleName", customerModuleName);
            this.customerModuleName = customerModuleName;
            return this;
        }

        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Module type.</p>
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
         * <p>Test address.</p>
         * 
         * <strong>example:</strong>
         * <p>saf/xxxxx/xxx.pmml</p>
         */
        public Builder storePath(String storePath) {
            this.putQueryParameter("StorePath", storePath);
            this.storePath = storePath;
            return this;
        }

        @Override
        public UpdateModuleBasicInfoRequest build() {
            return new UpdateModuleBasicInfoRequest(this);
        } 

    } 

}
