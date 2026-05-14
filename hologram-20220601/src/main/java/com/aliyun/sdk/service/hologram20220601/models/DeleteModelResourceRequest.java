// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link DeleteModelResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelResourceRequest</p>
 */
public class DeleteModelResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aiInstanceId")
    private String aiInstanceId;

    private DeleteModelResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.aiInstanceId = builder.aiInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelResourceRequest create() {
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
     * @return aiInstanceId
     */
    public String getAiInstanceId() {
        return this.aiInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteModelResourceRequest, Builder> {
        private String instanceId; 
        private String aiInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelResourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.aiInstanceId = request.aiInstanceId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * aiInstanceId.
         */
        public Builder aiInstanceId(String aiInstanceId) {
            this.putQueryParameter("aiInstanceId", aiInstanceId);
            this.aiInstanceId = aiInstanceId;
            return this;
        }

        @Override
        public DeleteModelResourceRequest build() {
            return new DeleteModelResourceRequest(this);
        } 

    } 

}
