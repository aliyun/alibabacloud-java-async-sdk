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
 * {@link GetRecallManagementServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>GetRecallManagementServiceVersionRequest</p>
 */
public class GetRecallManagementServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
    private String recallManagementServiceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
    private String recallManagementServiceVersionId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private GetRecallManagementServiceVersionRequest(Builder builder) {
        super(builder);
        this.recallManagementServiceId = builder.recallManagementServiceId;
        this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecallManagementServiceVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementServiceId
     */
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    /**
     * @return recallManagementServiceVersionId
     */
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetRecallManagementServiceVersionRequest, Builder> {
        private String recallManagementServiceId; 
        private String recallManagementServiceVersionId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRecallManagementServiceVersionRequest request) {
            super(request);
            this.recallManagementServiceId = request.recallManagementServiceId;
            this.recallManagementServiceVersionId = request.recallManagementServiceVersionId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * RecallManagementServiceId.
         */
        public Builder recallManagementServiceId(String recallManagementServiceId) {
            this.putPathParameter("RecallManagementServiceId", recallManagementServiceId);
            this.recallManagementServiceId = recallManagementServiceId;
            return this;
        }

        /**
         * RecallManagementServiceVersionId.
         */
        public Builder recallManagementServiceVersionId(String recallManagementServiceVersionId) {
            this.putPathParameter("RecallManagementServiceVersionId", recallManagementServiceVersionId);
            this.recallManagementServiceVersionId = recallManagementServiceVersionId;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetRecallManagementServiceVersionRequest build() {
            return new GetRecallManagementServiceVersionRequest(this);
        } 

    } 

}
