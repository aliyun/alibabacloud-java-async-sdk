// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ModifyCustomEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomEndpointRequest</p>
 */
public class ModifyCustomEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeAutoEnter")
    private Boolean nodeAutoEnter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private String nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeRole")
    private String nodeRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyCustomEndpointRequest(Builder builder) {
        super(builder);
        this.customEndpointId = builder.customEndpointId;
        this.DBInstanceName = builder.DBInstanceName;
        this.name = builder.name;
        this.nodeAutoEnter = builder.nodeAutoEnter;
        this.nodeIds = builder.nodeIds;
        this.nodeRole = builder.nodeRole;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customEndpointId
     */
    public String getCustomEndpointId() {
        return this.customEndpointId;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeAutoEnter
     */
    public Boolean getNodeAutoEnter() {
        return this.nodeAutoEnter;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return nodeRole
     */
    public String getNodeRole() {
        return this.nodeRole;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCustomEndpointRequest, Builder> {
        private String customEndpointId; 
        private String DBInstanceName; 
        private String name; 
        private Boolean nodeAutoEnter; 
        private String nodeIds; 
        private String nodeRole; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomEndpointRequest request) {
            super(request);
            this.customEndpointId = request.customEndpointId;
            this.DBInstanceName = request.DBInstanceName;
            this.name = request.name;
            this.nodeAutoEnter = request.nodeAutoEnter;
            this.nodeIds = request.nodeIds;
            this.nodeRole = request.nodeRole;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cep-002</p>
         */
        public Builder customEndpointId(String customEndpointId) {
            this.putQueryParameter("CustomEndpointId", customEndpointId);
            this.customEndpointId = customEndpointId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mydatabase</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NodeAutoEnter.
         */
        public Builder nodeAutoEnter(Boolean nodeAutoEnter) {
            this.putQueryParameter("NodeAutoEnter", nodeAutoEnter);
            this.nodeAutoEnter = nodeAutoEnter;
            return this;
        }

        /**
         * <p>node ids</p>
         * 
         * <strong>example:</strong>
         * <p>node3</p>
         */
        public Builder nodeIds(String nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * NodeRole.
         */
        public Builder nodeRole(String nodeRole) {
            this.putQueryParameter("NodeRole", nodeRole);
            this.nodeRole = nodeRole;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyCustomEndpointRequest build() {
            return new ModifyCustomEndpointRequest(this);
        } 

    } 

}
