// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateSlsLogDispatchRequest} extends {@link RequestModel}
 *
 * <p>CreateSlsLogDispatchRequest</p>
 */
public class CreateSlsLogDispatchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SlsRegionId")
    private String slsRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Long ttl;

    private CreateSlsLogDispatchRequest(Builder builder) {
        super(builder);
        this.slsRegionId = builder.slsRegionId;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlsLogDispatchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    /**
     * @return ttl
     */
    public Long getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<CreateSlsLogDispatchRequest, Builder> {
        private String slsRegionId; 
        private Long ttl; 

        private Builder() {
            super();
        } 

        private Builder(CreateSlsLogDispatchRequest request) {
            super(request);
            this.slsRegionId = request.slsRegionId;
            this.ttl = request.ttl;
        } 

        /**
         * <p>The region ID of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putBodyParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
            return this;
        }

        /**
         * <p>The log retention period. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder ttl(Long ttl) {
            this.putBodyParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public CreateSlsLogDispatchRequest build() {
            return new CreateSlsLogDispatchRequest(this);
        } 

    } 

}
