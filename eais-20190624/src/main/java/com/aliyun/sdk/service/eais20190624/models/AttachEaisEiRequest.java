// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEaisEiRequest} extends {@link RequestModel}
 *
 * <p>AttachEaisEiRequest</p>
 */
public class AttachEaisEiRequest extends Request {
    @Query
    @NameInMap("ClientInstanceId")
    @Validation(required = true)
    private String clientInstanceId;

    @Query
    @NameInMap("EiInstanceId")
    private String eiInstanceId;

    @Query
    @NameInMap("EiInstanceType")
    private String eiInstanceType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AttachEaisEiRequest(Builder builder) {
        super(builder);
        this.clientInstanceId = builder.clientInstanceId;
        this.eiInstanceId = builder.eiInstanceId;
        this.eiInstanceType = builder.eiInstanceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEaisEiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientInstanceId
     */
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    /**
     * @return eiInstanceId
     */
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    /**
     * @return eiInstanceType
     */
    public String getEiInstanceType() {
        return this.eiInstanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AttachEaisEiRequest, Builder> {
        private String clientInstanceId; 
        private String eiInstanceId; 
        private String eiInstanceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachEaisEiRequest request) {
            super(request);
            this.clientInstanceId = request.clientInstanceId;
            this.eiInstanceId = request.eiInstanceId;
            this.eiInstanceType = request.eiInstanceType;
            this.regionId = request.regionId;
        } 

        /**
         * ClientInstanceId.
         */
        public Builder clientInstanceId(String clientInstanceId) {
            this.putQueryParameter("ClientInstanceId", clientInstanceId);
            this.clientInstanceId = clientInstanceId;
            return this;
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
         * EiInstanceType.
         */
        public Builder eiInstanceType(String eiInstanceType) {
            this.putQueryParameter("EiInstanceType", eiInstanceType);
            this.eiInstanceType = eiInstanceType;
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
        public AttachEaisEiRequest build() {
            return new AttachEaisEiRequest(this);
        } 

    } 

}
