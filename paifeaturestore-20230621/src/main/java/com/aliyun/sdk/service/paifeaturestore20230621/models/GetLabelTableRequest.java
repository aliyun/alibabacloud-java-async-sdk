// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLabelTableRequest} extends {@link RequestModel}
 *
 * <p>GetLabelTableRequest</p>
 */
public class GetLabelTableRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("LabelTableId")
    @Validation(required = true)
    private String labelTableId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetLabelTableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.labelTableId = builder.labelTableId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLabelTableRequest create() {
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
     * @return labelTableId
     */
    public String getLabelTableId() {
        return this.labelTableId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetLabelTableRequest, Builder> {
        private String instanceId; 
        private String labelTableId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLabelTableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.labelTableId = request.labelTableId;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LabelTableId.
         */
        public Builder labelTableId(String labelTableId) {
            this.putPathParameter("LabelTableId", labelTableId);
            this.labelTableId = labelTableId;
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
        public GetLabelTableRequest build() {
            return new GetLabelTableRequest(this);
        } 

    } 

}
