// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalSpaceTopoRequest} extends {@link RequestModel}
 *
 * <p>GetPhysicalSpaceTopoRequest</p>
 */
public class GetPhysicalSpaceTopoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhysicalSpaceId")
    @Validation(required = true)
    private String physicalSpaceId;

    @Query
    @NameInMap("TopoType")
    @Validation(required = true)
    private String topoType;

    private GetPhysicalSpaceTopoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.physicalSpaceId = builder.physicalSpaceId;
        this.topoType = builder.topoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalSpaceTopoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return physicalSpaceId
     */
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    /**
     * @return topoType
     */
    public String getTopoType() {
        return this.topoType;
    }

    public static final class Builder extends Request.Builder<GetPhysicalSpaceTopoRequest, Builder> {
        private String instanceId; 
        private String physicalSpaceId; 
        private String topoType; 

        private Builder() {
            super();
        } 

        private Builder(GetPhysicalSpaceTopoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.physicalSpaceId = request.physicalSpaceId;
            this.topoType = request.topoType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PhysicalSpaceId.
         */
        public Builder physicalSpaceId(String physicalSpaceId) {
            this.putQueryParameter("PhysicalSpaceId", physicalSpaceId);
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }

        /**
         * TopoType.
         */
        public Builder topoType(String topoType) {
            this.putQueryParameter("TopoType", topoType);
            this.topoType = topoType;
            return this;
        }

        @Override
        public GetPhysicalSpaceTopoRequest build() {
            return new GetPhysicalSpaceTopoRequest(this);
        } 

    } 

}
