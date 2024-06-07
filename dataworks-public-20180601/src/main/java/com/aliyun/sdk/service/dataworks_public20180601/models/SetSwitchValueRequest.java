// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSwitchValueRequest} extends {@link RequestModel}
 *
 * <p>SetSwitchValueRequest</p>
 */
public class SetSwitchValueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchName")
    private String switchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchValue")
    private String switchValue;

    private SetSwitchValueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.switchName = builder.switchName;
        this.switchValue = builder.switchValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSwitchValueRequest create() {
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

    /**
     * @return switchValue
     */
    public String getSwitchValue() {
        return this.switchValue;
    }

    public static final class Builder extends Request.Builder<SetSwitchValueRequest, Builder> {
        private String regionId; 
        private String switchName; 
        private String switchValue; 

        private Builder() {
            super();
        } 

        private Builder(SetSwitchValueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.switchName = request.switchName;
            this.switchValue = request.switchValue;
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

        /**
         * SwitchValue.
         */
        public Builder switchValue(String switchValue) {
            this.putQueryParameter("SwitchValue", switchValue);
            this.switchValue = switchValue;
            return this;
        }

        @Override
        public SetSwitchValueRequest build() {
            return new SetSwitchValueRequest(this);
        } 

    } 

}
