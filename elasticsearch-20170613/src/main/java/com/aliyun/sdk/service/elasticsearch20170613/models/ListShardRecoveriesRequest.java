// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShardRecoveriesRequest} extends {@link RequestModel}
 *
 * <p>ListShardRecoveriesRequest</p>
 */
public class ListShardRecoveriesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("activeOnly")
    private Boolean activeOnly;

    @Body
    @NameInMap("body")
    private String body;

    private ListShardRecoveriesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.activeOnly = builder.activeOnly;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShardRecoveriesRequest create() {
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
     * @return activeOnly
     */
    public Boolean getActiveOnly() {
        return this.activeOnly;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListShardRecoveriesRequest, Builder> {
        private String instanceId; 
        private Boolean activeOnly; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(ListShardRecoveriesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.activeOnly = request.activeOnly;
            this.body = request.body;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * activeOnly.
         */
        public Builder activeOnly(Boolean activeOnly) {
            this.putQueryParameter("activeOnly", activeOnly);
            this.activeOnly = activeOnly;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListShardRecoveriesRequest build() {
            return new ListShardRecoveriesRequest(this);
        } 

    } 

}
