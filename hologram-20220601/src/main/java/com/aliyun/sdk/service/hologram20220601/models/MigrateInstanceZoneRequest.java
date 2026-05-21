// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link MigrateInstanceZoneRequest} extends {@link RequestModel}
 *
 * <p>MigrateInstanceZoneRequest</p>
 */
public class MigrateInstanceZoneRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private MigrateInstanceZoneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateInstanceZoneRequest create() {
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<MigrateInstanceZoneRequest, Builder> {
        private String instanceId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateInstanceZoneRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.zoneId = request.zoneId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putBodyParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public MigrateInstanceZoneRequest build() {
            return new MigrateInstanceZoneRequest(this);
        } 

    } 

}
