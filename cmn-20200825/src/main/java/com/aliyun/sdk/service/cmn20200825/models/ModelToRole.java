// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModelToRole} extends {@link TeaModel}
 *
 * <p>ModelToRole</p>
 */
public class ModelToRole extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Id")
    private String id;

    @NameInMap("Model")
    private String model;

    @NameInMap("ModelToRoleId")
    private String modelToRoleId;

    @NameInMap("NetworkArchitectureIterationId")
    private String networkArchitectureIterationId;

    @NameInMap("Role")
    private String role;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Vendor")
    private String vendor;

    private ModelToRole(Builder builder) {
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.model = builder.model;
        this.modelToRoleId = builder.modelToRoleId;
        this.networkArchitectureIterationId = builder.networkArchitectureIterationId;
        this.role = builder.role;
        this.updateTime = builder.updateTime;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelToRole create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return modelToRoleId
     */
    public String getModelToRoleId() {
        return this.modelToRoleId;
    }

    /**
     * @return networkArchitectureIterationId
     */
    public String getNetworkArchitectureIterationId() {
        return this.networkArchitectureIterationId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String createTime; 
        private String id; 
        private String model; 
        private String modelToRoleId; 
        private String networkArchitectureIterationId; 
        private String role; 
        private String updateTime; 
        private String vendor; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * ModelToRoleId.
         */
        public Builder modelToRoleId(String modelToRoleId) {
            this.modelToRoleId = modelToRoleId;
            return this;
        }

        /**
         * NetworkArchitectureIterationId.
         */
        public Builder networkArchitectureIterationId(String networkArchitectureIterationId) {
            this.networkArchitectureIterationId = networkArchitectureIterationId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public ModelToRole build() {
            return new ModelToRole(this);
        } 

    } 

}
