// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartEaisEiRequest} extends {@link RequestModel}
 *
 * <p>StartEaisEiRequest</p>
 */
public class StartEaisEiRequest extends Request {
    @Query
    @NameInMap("EiInstanceId")
    @Validation(required = true)
    private String eiInstanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StartEaisEiRequest(Builder builder) {
        super(builder);
        this.eiInstanceId = builder.eiInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartEaisEiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eiInstanceId
     */
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartEaisEiRequest, Builder> {
        private String eiInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartEaisEiRequest request) {
            super(request);
            this.eiInstanceId = request.eiInstanceId;
            this.regionId = request.regionId;
        } 

        /**
         * EiInstanceId.
         */
        public Builder eiInstanceId(String eiInstanceId) {
            this.putQueryParameter("EiInstanceId", eiInstanceId);
            this.eiInstanceId = eiInstanceId;
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
        public StartEaisEiRequest build() {
            return new StartEaisEiRequest(this);
        } 

    } 

}
