// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link DisableCustomFieldRequest} extends {@link RequestModel}
 *
 * <p>DisableCustomFieldRequest</p>
 */
public class DisableCustomFieldRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String fieldId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private DisableCustomFieldRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fieldId = builder.fieldId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableCustomFieldRequest create() {
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
     * @return fieldId
     */
    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DisableCustomFieldRequest, Builder> {
        private String regionId; 
        private String fieldId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisableCustomFieldRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fieldId = request.fieldId;
            this.instanceId = request.instanceId;
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
         * <p>fieldId</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ufd_001</p>
         */
        public Builder fieldId(String fieldId) {
            this.putQueryParameter("FieldId", fieldId);
            this.fieldId = fieldId;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DisableCustomFieldRequest build() {
            return new DisableCustomFieldRequest(this);
        } 

    } 

}
