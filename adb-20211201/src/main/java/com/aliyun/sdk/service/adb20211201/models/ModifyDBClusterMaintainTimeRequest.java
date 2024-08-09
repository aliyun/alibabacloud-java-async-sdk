// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterMaintainTimeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterMaintainTimeRequest</p>
 */
public class ModifyDBClusterMaintainTimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maintainTime;

    private ModifyDBClusterMaintainTimeRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.maintainTime = builder.maintainTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterMaintainTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return maintainTime
     */
    public String getMaintainTime() {
        return this.maintainTime;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterMaintainTimeRequest, Builder> {
        private String DBClusterId; 
        private String maintainTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterMaintainTimeRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.maintainTime = request.maintainTime;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The maintenance window of the cluster. It must be in the hh:mmZ-hh:mmZ format.
         * <p>
         * 
         * > The interval must be 1 hour and start and end at the beginning of an hour.
         */
        public Builder maintainTime(String maintainTime) {
            this.putQueryParameter("MaintainTime", maintainTime);
            this.maintainTime = maintainTime;
            return this;
        }

        @Override
        public ModifyDBClusterMaintainTimeRequest build() {
            return new ModifyDBClusterMaintainTimeRequest(this);
        } 

    } 

}
