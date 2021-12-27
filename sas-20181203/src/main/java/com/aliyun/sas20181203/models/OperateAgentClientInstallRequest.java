// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OperateAgentClientInstallRequest} extends {@link RequestModel}
 *
 * <p>OperateAgentClientInstallRequest</p>
 */
public class OperateAgentClientInstallRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Uuids")
    private String uuids;


    private OperateAgentClientInstallRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAgentClientInstallRequest create() {
        return builder().build();
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String instanceIds; 
        private String uuids; 

        /**
         * <p>InstanceIds.</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        public OperateAgentClientInstallRequest build() {
            return new OperateAgentClientInstallRequest(this);
        } 

    } 

}
