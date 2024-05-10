// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseManagedIndexRequest} extends {@link RequestModel}
 *
 * <p>CloseManagedIndexRequest</p>
 */
public class CloseManagedIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Index")
    @com.aliyun.core.annotation.Validation(required = true)
    private String index;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private CloseManagedIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.index = builder.index;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseManagedIndexRequest create() {
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
     * @return index
     */
    public String getIndex() {
        return this.index;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<CloseManagedIndexRequest, Builder> {
        private String instanceId; 
        private String index; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CloseManagedIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.index = request.index;
            this.clientToken = request.clientToken;
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
         * Index.
         */
        public Builder index(String index) {
            this.putPathParameter("Index", index);
            this.index = index;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public CloseManagedIndexRequest build() {
            return new CloseManagedIndexRequest(this);
        } 

    } 

}
