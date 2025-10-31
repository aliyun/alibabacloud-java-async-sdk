// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link TurnOffZoneRequest} extends {@link RequestModel}
 *
 * <p>TurnOffZoneRequest</p>
 */
public class TurnOffZoneRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("zone")
    private String zone;

    private TurnOffZoneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TurnOffZoneRequest create() {
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
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<TurnOffZoneRequest, Builder> {
        private String instanceId; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(TurnOffZoneRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.zone = request.zone;
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
         * zone.
         */
        public Builder zone(String zone) {
            this.putQueryParameter("zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public TurnOffZoneRequest build() {
            return new TurnOffZoneRequest(this);
        } 

    } 

}
