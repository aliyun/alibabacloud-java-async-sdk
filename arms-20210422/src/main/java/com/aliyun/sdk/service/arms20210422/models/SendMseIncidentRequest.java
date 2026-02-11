// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link SendMseIncidentRequest} extends {@link RequestModel}
 *
 * <p>SendMseIncidentRequest</p>
 */
public class SendMseIncidentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Incidents")
    @com.aliyun.core.annotation.Validation(required = true)
    private String incidents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private SendMseIncidentRequest(Builder builder) {
        super(builder);
        this.incidents = builder.incidents;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMseIncidentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return incidents
     */
    public String getIncidents() {
        return this.incidents;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SendMseIncidentRequest, Builder> {
        private String incidents; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SendMseIncidentRequest request) {
            super(request);
            this.incidents = request.incidents;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder incidents(String incidents) {
            this.putQueryParameter("Incidents", incidents);
            this.incidents = incidents;
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

        @Override
        public SendMseIncidentRequest build() {
            return new SendMseIncidentRequest(this);
        } 

    } 

}
