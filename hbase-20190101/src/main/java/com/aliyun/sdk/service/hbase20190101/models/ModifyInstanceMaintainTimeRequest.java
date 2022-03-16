// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceMaintainTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceMaintainTimeRequest</p>
 */
public class ModifyInstanceMaintainTimeRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("MaintainEndTime")
    @Validation(required = true)
    private String maintainEndTime;

    @Query
    @NameInMap("MaintainStartTime")
    @Validation(required = true)
    private String maintainStartTime;

    private ModifyInstanceMaintainTimeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceMaintainTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceMaintainTimeRequest, Builder> {
        private String clusterId; 
        private String maintainEndTime; 
        private String maintainStartTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceMaintainTimeRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.maintainEndTime = request.maintainEndTime;
            this.maintainStartTime = request.maintainStartTime;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * MaintainEndTime.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        @Override
        public ModifyInstanceMaintainTimeRequest build() {
            return new ModifyInstanceMaintainTimeRequest(this);
        } 

    } 

}
