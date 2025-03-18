// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ForceSwitchRequest} extends {@link RequestModel}
 *
 * <p>ForceSwitchRequest</p>
 */
public class ForceSwitchRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("fsmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsmId;

    private ForceSwitchRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.fsmId = builder.fsmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForceSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return fsmId
     */
    public String getFsmId() {
        return this.fsmId;
    }

    public static final class Builder extends Request.Builder<ForceSwitchRequest, Builder> {
        private String instanceId; 
        private String fsmId; 

        private Builder() {
            super();
        } 

        private Builder(ForceSwitchRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.fsmId = request.fsmId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-tl32m2c4u01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tisplus_opensearch@roll_index_fsm@ha-cn-0ju2je4zj01@bj_vpc_domain_2@null@bj_vpc_domain_2_general_odps_false@1644312508597@934743</p>
         */
        public Builder fsmId(String fsmId) {
            this.putPathParameter("fsmId", fsmId);
            this.fsmId = fsmId;
            return this;
        }

        @Override
        public ForceSwitchRequest build() {
            return new ForceSwitchRequest(this);
        } 

    } 

}
