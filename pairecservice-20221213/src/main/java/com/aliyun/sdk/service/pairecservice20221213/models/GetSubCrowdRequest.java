// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubCrowdRequest} extends {@link RequestModel}
 *
 * <p>GetSubCrowdRequest</p>
 */
public class GetSubCrowdRequest extends Request {
    @Path
    @NameInMap("CrowdId")
    @Validation(required = true)
    private String crowdId;

    @Path
    @NameInMap("SubCrowdId")
    @Validation(required = true)
    private String subCrowdId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetSubCrowdRequest(Builder builder) {
        super(builder);
        this.crowdId = builder.crowdId;
        this.subCrowdId = builder.subCrowdId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubCrowdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
    }

    /**
     * @return subCrowdId
     */
    public String getSubCrowdId() {
        return this.subCrowdId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetSubCrowdRequest, Builder> {
        private String crowdId; 
        private String subCrowdId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSubCrowdRequest request) {
            super(request);
            this.crowdId = request.crowdId;
            this.subCrowdId = request.subCrowdId;
            this.instanceId = request.instanceId;
        } 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.putPathParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
            return this;
        }

        /**
         * SubCrowdId.
         */
        public Builder subCrowdId(String subCrowdId) {
            this.putPathParameter("SubCrowdId", subCrowdId);
            this.subCrowdId = subCrowdId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetSubCrowdRequest build() {
            return new GetSubCrowdRequest(this);
        } 

    } 

}
