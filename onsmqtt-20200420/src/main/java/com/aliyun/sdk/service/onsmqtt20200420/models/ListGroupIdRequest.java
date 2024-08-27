// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupIdRequest} extends {@link RequestModel}
 *
 * <p>ListGroupIdRequest</p>
 */
public class ListGroupIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ListGroupIdRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupIdRequest create() {
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

    public static final class Builder extends Request.Builder<ListGroupIdRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupIdRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the ApsaraMQ for MQTT instance whose groups you want to query.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListGroupIdRequest build() {
            return new ListGroupIdRequest(this);
        } 

    } 

}
