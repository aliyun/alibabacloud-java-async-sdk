// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMseIncidentRequest} extends {@link RequestModel}
 *
 * <p>SendMseIncidentRequest</p>
 */
public class SendMseIncidentRequest extends Request {
    @Query
    @NameInMap("Incidents")
    @Validation(required = true)
    private String incidents;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * Incidents.
         */
        public Builder incidents(String incidents) {
            this.putQueryParameter("Incidents", incidents);
            this.incidents = incidents;
            return this;
        }

        /**
         * RegionId.
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
