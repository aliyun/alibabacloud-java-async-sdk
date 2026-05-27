// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link DeleteMcpServiceRequest} extends {@link RequestModel}
 *
 * <p>DeleteMcpServiceRequest</p>
 */
public class DeleteMcpServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("mcpServiceName")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String mcpServiceName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteMcpServiceRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.mcpServiceName = builder.mcpServiceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMcpServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return mcpServiceName
     */
    public String getMcpServiceName() {
        return this.mcpServiceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteMcpServiceRequest, Builder> {
        private String name; 
        private String mcpServiceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMcpServiceRequest request) {
            super(request);
            this.name = request.name;
            this.mcpServiceName = request.mcpServiceName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-agent</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>log-query</p>
         */
        public Builder mcpServiceName(String mcpServiceName) {
            this.putPathParameter("mcpServiceName", mcpServiceName);
            this.mcpServiceName = mcpServiceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteMcpServiceRequest build() {
            return new DeleteMcpServiceRequest(this);
        } 

    } 

}
