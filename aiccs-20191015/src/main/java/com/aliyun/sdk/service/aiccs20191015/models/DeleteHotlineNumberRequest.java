// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link DeleteHotlineNumberRequest} extends {@link RequestModel}
 *
 * <p>DeleteHotlineNumberRequest</p>
 */
public class DeleteHotlineNumberRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HotlineNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hotlineNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DeleteHotlineNumberRequest(Builder builder) {
        super(builder);
        this.hotlineNumber = builder.hotlineNumber;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHotlineNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotlineNumber
     */
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteHotlineNumberRequest, Builder> {
        private String hotlineNumber; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHotlineNumberRequest request) {
            super(request);
            this.hotlineNumber = request.hotlineNumber;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>05710000****</p>
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putBodyParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteHotlineNumberRequest build() {
            return new DeleteHotlineNumberRequest(this);
        } 

    } 

}
