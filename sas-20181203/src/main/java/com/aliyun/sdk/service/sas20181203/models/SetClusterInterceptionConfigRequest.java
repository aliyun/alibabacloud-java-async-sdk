// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetClusterInterceptionConfigRequest} extends {@link RequestModel}
 *
 * <p>SetClusterInterceptionConfigRequest</p>
 */
public class SetClusterInterceptionConfigRequest extends Request {
    @Query
    @NameInMap("ClusterIds")
    @Validation(required = true)
    private String clusterIds;

    @Query
    @NameInMap("SwitchOn")
    @Validation(required = true)
    private Integer switchOn;

    @Query
    @NameInMap("SwitchType")
    @Validation(required = true)
    private Integer switchType;

    private SetClusterInterceptionConfigRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.switchOn = builder.switchOn;
        this.switchType = builder.switchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClusterInterceptionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public String getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return switchOn
     */
    public Integer getSwitchOn() {
        return this.switchOn;
    }

    /**
     * @return switchType
     */
    public Integer getSwitchType() {
        return this.switchType;
    }

    public static final class Builder extends Request.Builder<SetClusterInterceptionConfigRequest, Builder> {
        private String clusterIds; 
        private Integer switchOn; 
        private Integer switchType; 

        private Builder() {
            super();
        } 

        private Builder(SetClusterInterceptionConfigRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.switchOn = request.switchOn;
            this.switchType = request.switchType;
        } 

        /**
         * ClusterIds.
         */
        public Builder clusterIds(String clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * SwitchOn.
         */
        public Builder switchOn(Integer switchOn) {
            this.putQueryParameter("SwitchOn", switchOn);
            this.switchOn = switchOn;
            return this;
        }

        /**
         * SwitchType.
         */
        public Builder switchType(Integer switchType) {
            this.putQueryParameter("SwitchType", switchType);
            this.switchType = switchType;
            return this;
        }

        @Override
        public SetClusterInterceptionConfigRequest build() {
            return new SetClusterInterceptionConfigRequest(this);
        } 

    } 

}
