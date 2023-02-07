// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HangUpDoubleCallRequest} extends {@link RequestModel}
 *
 * <p>HangUpDoubleCallRequest</p>
 */
public class HangUpDoubleCallRequest extends Request {
    @Query
    @NameInMap("Acid")
    private String acid;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private HangUpDoubleCallRequest(Builder builder) {
        super(builder);
        this.acid = builder.acid;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HangUpDoubleCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<HangUpDoubleCallRequest, Builder> {
        private String acid; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(HangUpDoubleCallRequest request) {
            super(request);
            this.acid = request.acid;
            this.instanceId = request.instanceId;
        } 

        /**
         * 会话ID
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public HangUpDoubleCallRequest build() {
            return new HangUpDoubleCallRequest(this);
        } 

    } 

}
