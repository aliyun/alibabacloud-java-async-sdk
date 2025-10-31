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
 * {@link TurnOnZoneRequest} extends {@link RequestModel}
 *
 * <p>TurnOnZoneRequest</p>
 */
public class TurnOnZoneRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("zone")
    private String zone;

    private TurnOnZoneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TurnOnZoneRequest create() {
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

    public static final class Builder extends Request.Builder<TurnOnZoneRequest, Builder> {
        private String instanceId; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(TurnOnZoneRequest request) {
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
        public TurnOnZoneRequest build() {
            return new TurnOnZoneRequest(this);
        } 

    } 

}
