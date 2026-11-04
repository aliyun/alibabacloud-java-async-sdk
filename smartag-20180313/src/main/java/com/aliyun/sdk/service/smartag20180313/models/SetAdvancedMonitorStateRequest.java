// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link SetAdvancedMonitorStateRequest} extends {@link RequestModel}
 *
 * <p>SetAdvancedMonitorStateRequest</p>
 */
public class SetAdvancedMonitorStateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagId;

    private SetAdvancedMonitorStateRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.regionId = builder.regionId;
        this.sagId = builder.sagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAdvancedMonitorStateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sagId
     */
    public String getSagId() {
        return this.sagId;
    }

    public static final class Builder extends Request.Builder<SetAdvancedMonitorStateRequest, Builder> {
        private Boolean enable; 
        private String regionId; 
        private String sagId; 

        private Builder() {
            super();
        } 

        private Builder(SetAdvancedMonitorStateRequest request) {
            super(request);
            this.enable = request.enable;
            this.regionId = request.regionId;
            this.sagId = request.sagId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sagId(String sagId) {
            this.putQueryParameter("SagId", sagId);
            this.sagId = sagId;
            return this;
        }

        @Override
        public SetAdvancedMonitorStateRequest build() {
            return new SetAdvancedMonitorStateRequest(this);
        } 

    } 

}
