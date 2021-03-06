// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveVersionOfConfigGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeActiveVersionOfConfigGroupRequest</p>
 */
public class DescribeActiveVersionOfConfigGroupRequest extends Request {
    @Query
    @NameInMap("ConfigGroupId")
    @Validation(required = true)
    private String configGroupId;

    @Query
    @NameInMap("Env")
    private String env;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeActiveVersionOfConfigGroupRequest(Builder builder) {
        super(builder);
        this.configGroupId = builder.configGroupId;
        this.env = builder.env;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveVersionOfConfigGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configGroupId
     */
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeActiveVersionOfConfigGroupRequest, Builder> {
        private String configGroupId; 
        private String env; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeActiveVersionOfConfigGroupRequest response) {
            super(response);
            this.configGroupId = response.configGroupId;
            this.env = response.env;
            this.ownerId = response.ownerId;
        } 

        /**
         * ConfigGroupId.
         */
        public Builder configGroupId(String configGroupId) {
            this.putQueryParameter("ConfigGroupId", configGroupId);
            this.configGroupId = configGroupId;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeActiveVersionOfConfigGroupRequest build() {
            return new DescribeActiveVersionOfConfigGroupRequest(this);
        } 

    } 

}
