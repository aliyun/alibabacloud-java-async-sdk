// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHotlineNumberRequest} extends {@link RequestModel}
 *
 * <p>DeleteHotlineNumberRequest</p>
 */
public class DeleteHotlineNumberRequest extends Request {
    @Body
    @NameInMap("HotlineNumber")
    @Validation(required = true)
    private String hotlineNumber;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
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

        private Builder(DeleteHotlineNumberRequest response) {
            super(response);
            this.hotlineNumber = response.hotlineNumber;
            this.instanceId = response.instanceId;
        } 

        /**
         * 号码
         */
        public Builder hotlineNumber(String hotlineNumber) {
            this.putBodyParameter("HotlineNumber", hotlineNumber);
            this.hotlineNumber = hotlineNumber;
            return this;
        }

        /**
         * 实例id
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
