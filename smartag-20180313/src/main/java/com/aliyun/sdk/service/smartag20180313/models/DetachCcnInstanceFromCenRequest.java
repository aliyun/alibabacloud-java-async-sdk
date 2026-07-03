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
 * {@link DetachCcnInstanceFromCenRequest} extends {@link RequestModel}
 *
 * <p>DetachCcnInstanceFromCenRequest</p>
 */
public class DetachCcnInstanceFromCenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcnId")
    private String ccnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DetachCcnInstanceFromCenRequest(Builder builder) {
        super(builder);
        this.ccnId = builder.ccnId;
        this.cenId = builder.cenId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachCcnInstanceFromCenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ccnId
     */
    public String getCcnId() {
        return this.ccnId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachCcnInstanceFromCenRequest, Builder> {
        private String ccnId; 
        private String cenId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachCcnInstanceFromCenRequest request) {
            super(request);
            this.ccnId = request.ccnId;
            this.cenId = request.cenId;
            this.regionId = request.regionId;
        } 

        /**
         * CcnId.
         */
        public Builder ccnId(String ccnId) {
            this.putQueryParameter("CcnId", ccnId);
            this.ccnId = ccnId;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
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
        public DetachCcnInstanceFromCenRequest build() {
            return new DetachCcnInstanceFromCenRequest(this);
        } 

    } 

}
