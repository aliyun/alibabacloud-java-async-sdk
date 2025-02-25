// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubCrowdRequest} extends {@link RequestModel}
 *
 * <p>DeleteSubCrowdRequest</p>
 */
public class DeleteSubCrowdRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CrowdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String crowdId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("SubCrowdId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subCrowdId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteSubCrowdRequest(Builder builder) {
        super(builder);
        this.crowdId = builder.crowdId;
        this.subCrowdId = builder.subCrowdId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubCrowdRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSubCrowdRequest, Builder> {
        private String crowdId; 
        private String subCrowdId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSubCrowdRequest request) {
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
        public DeleteSubCrowdRequest build() {
            return new DeleteSubCrowdRequest(this);
        } 

    } 

}
