// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetDedicatedIpWarmUpInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDedicatedIpWarmUpInfoRequest</p>
 */
public class GetDedicatedIpWarmUpInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedIp")
    private String dedicatedIp;

    private GetDedicatedIpWarmUpInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dedicatedIp = builder.dedicatedIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDedicatedIpWarmUpInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dedicatedIp
     */
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    public static final class Builder extends Request.Builder<GetDedicatedIpWarmUpInfoRequest, Builder> {
        private String regionId; 
        private String dedicatedIp; 

        private Builder() {
            super();
        } 

        private Builder(GetDedicatedIpWarmUpInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dedicatedIp = request.dedicatedIp;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DedicatedIp.
         */
        public Builder dedicatedIp(String dedicatedIp) {
            this.putQueryParameter("DedicatedIp", dedicatedIp);
            this.dedicatedIp = dedicatedIp;
            return this;
        }

        @Override
        public GetDedicatedIpWarmUpInfoRequest build() {
            return new GetDedicatedIpWarmUpInfoRequest(this);
        } 

    } 

}
