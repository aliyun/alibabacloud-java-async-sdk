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
 * {@link ChangeRecallManagementServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>ChangeRecallManagementServiceVersionRequest</p>
 */
public class ChangeRecallManagementServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceId")
    private String recallManagementServiceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecallManagementServiceVersionId")
    private String recallManagementServiceVersionId;

    private ChangeRecallManagementServiceVersionRequest(Builder builder) {
        super(builder);
        this.recallManagementServiceId = builder.recallManagementServiceId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.recallManagementServiceVersionId = builder.recallManagementServiceVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeRecallManagementServiceVersionRequest create() {
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

    /**
     * @return recallManagementServiceVersionId
     */
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    public static final class Builder extends Request.Builder<ChangeRecallManagementServiceVersionRequest, Builder> {
        private String recallManagementServiceId; 
        private String regionId; 
        private String instanceId; 
        private String recallManagementServiceVersionId; 

        private Builder() {
            super();
        } 

        private Builder(ChangeRecallManagementServiceVersionRequest request) {
            super(request);
            this.recallManagementServiceId = request.recallManagementServiceId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.recallManagementServiceVersionId = request.recallManagementServiceVersionId;
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
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RecallManagementServiceVersionId.
         */
        public Builder recallManagementServiceVersionId(String recallManagementServiceVersionId) {
            this.putBodyParameter("RecallManagementServiceVersionId", recallManagementServiceVersionId);
            this.recallManagementServiceVersionId = recallManagementServiceVersionId;
            return this;
        }

        @Override
        public ChangeRecallManagementServiceVersionRequest build() {
            return new ChangeRecallManagementServiceVersionRequest(this);
        } 

    } 

}
