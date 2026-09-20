// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link DeleteEngineConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteEngineConfigRequest</p>
 */
public class DeleteEngineConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("EngineConfigId")
    private String engineConfigId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAll")
    private Boolean deleteAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private DeleteEngineConfigRequest(Builder builder) {
        super(builder);
        this.engineConfigId = builder.engineConfigId;
        this.regionId = builder.regionId;
        this.deleteAll = builder.deleteAll;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEngineConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engineConfigId
     */
    public String getEngineConfigId() {
        return this.engineConfigId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteEngineConfigRequest, Builder> {
        private String engineConfigId; 
        private String regionId; 
        private Boolean deleteAll; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEngineConfigRequest request) {
            super(request);
            this.engineConfigId = request.engineConfigId;
            this.regionId = request.regionId;
            this.deleteAll = request.deleteAll;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The engine configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder engineConfigId(String engineConfigId) {
            this.putPathParameter("EngineConfigId", engineConfigId);
            this.engineConfigId = engineConfigId;
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

        /**
         * <p>Specifies whether to delete all engine configurations with the same name.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder deleteAll(Boolean deleteAll) {
            this.putQueryParameter("DeleteAll", deleteAll);
            this.deleteAll = deleteAll;
            return this;
        }

        /**
         * <p>The instance ID. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-***test1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteEngineConfigRequest build() {
            return new DeleteEngineConfigRequest(this);
        } 

    } 

}
