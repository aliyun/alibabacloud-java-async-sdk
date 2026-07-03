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
 * {@link AttachCcnInstanceToCenRequest} extends {@link RequestModel}
 *
 * <p>AttachCcnInstanceToCenRequest</p>
 */
public class AttachCcnInstanceToCenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcnId")
    private String ccnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subnet")
    private String subnet;

    private AttachCcnInstanceToCenRequest(Builder builder) {
        super(builder);
        this.ccnId = builder.ccnId;
        this.cenId = builder.cenId;
        this.regionId = builder.regionId;
        this.subnet = builder.subnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachCcnInstanceToCenRequest create() {
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

    /**
     * @return subnet
     */
    public String getSubnet() {
        return this.subnet;
    }

    public static final class Builder extends Request.Builder<AttachCcnInstanceToCenRequest, Builder> {
        private String ccnId; 
        private String cenId; 
        private String regionId; 
        private String subnet; 

        private Builder() {
            super();
        } 

        private Builder(AttachCcnInstanceToCenRequest request) {
            super(request);
            this.ccnId = request.ccnId;
            this.cenId = request.cenId;
            this.regionId = request.regionId;
            this.subnet = request.subnet;
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

        /**
         * Subnet.
         */
        public Builder subnet(String subnet) {
            this.putQueryParameter("Subnet", subnet);
            this.subnet = subnet;
            return this;
        }

        @Override
        public AttachCcnInstanceToCenRequest build() {
            return new AttachCcnInstanceToCenRequest(this);
        } 

    } 

}
