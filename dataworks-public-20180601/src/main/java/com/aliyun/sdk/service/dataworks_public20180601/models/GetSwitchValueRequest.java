// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link GetSwitchValueRequest} extends {@link RequestModel}
 *
 * <p>GetSwitchValueRequest</p>
 */
public class GetSwitchValueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchName")
    private String switchName;

    private GetSwitchValueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.switchName = builder.switchName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwitchValueRequest create() {
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
     * @return switchName
     */
    public String getSwitchName() {
        return this.switchName;
    }

    public static final class Builder extends Request.Builder<GetSwitchValueRequest, Builder> {
        private String regionId; 
        private String switchName; 

        private Builder() {
            super();
        } 

        private Builder(GetSwitchValueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.switchName = request.switchName;
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
         * SwitchName.
         */
        public Builder switchName(String switchName) {
            this.putQueryParameter("SwitchName", switchName);
            this.switchName = switchName;
            return this;
        }

        @Override
        public GetSwitchValueRequest build() {
            return new GetSwitchValueRequest(this);
        } 

    } 

}
