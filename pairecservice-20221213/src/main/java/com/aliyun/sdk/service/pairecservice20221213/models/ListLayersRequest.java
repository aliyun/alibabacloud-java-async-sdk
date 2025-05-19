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
 * {@link ListLayersRequest} extends {@link RequestModel}
 *
 * <p>ListLayersRequest</p>
 */
public class ListLayersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LaboratoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String laboratoryId;

    private ListLayersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.laboratoryId = builder.laboratoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    public static final class Builder extends Request.Builder<ListLayersRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String laboratoryId; 

        private Builder() {
            super();
        } 

        private Builder(ListLayersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.laboratoryId = request.laboratoryId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-abcdefg1234</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder laboratoryId(String laboratoryId) {
            this.putQueryParameter("LaboratoryId", laboratoryId);
            this.laboratoryId = laboratoryId;
            return this;
        }

        @Override
        public ListLayersRequest build() {
            return new ListLayersRequest(this);
        } 

    } 

}
