// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InitComputingResourceRequest} extends {@link RequestModel}
 *
 * <p>InitComputingResourceRequest</p>
 */
public class InitComputingResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private InitComputingResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.key = builder.key;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitComputingResourceRequest create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<InitComputingResourceRequest, Builder> {
        private String instanceId; 
        private String key; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(InitComputingResourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.key = request.key;
            this.type = request.type;
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
         * key.
         */
        public Builder key(String key) {
            this.putQueryParameter("key", key);
            this.key = key;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public InitComputingResourceRequest build() {
            return new InitComputingResourceRequest(this);
        } 

    } 

}
