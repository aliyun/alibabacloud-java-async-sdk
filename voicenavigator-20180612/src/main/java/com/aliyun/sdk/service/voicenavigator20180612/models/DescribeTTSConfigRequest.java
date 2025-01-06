// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DescribeTTSConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeTTSConfigRequest</p>
 */
public class DescribeTTSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    private DescribeTTSConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTTSConfigRequest create() {
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
     * @return instanceOwnerId
     */
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public static final class Builder extends Request.Builder<DescribeTTSConfigRequest, Builder> {
        private String instanceId; 
        private Long instanceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTTSConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc437bba-5a25-4bbc-b4c2-f268864bebb5</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceOwnerId.
         */
        public Builder instanceOwnerId(Long instanceOwnerId) {
            this.putQueryParameter("InstanceOwnerId", instanceOwnerId);
            this.instanceOwnerId = instanceOwnerId;
            return this;
        }

        @Override
        public DescribeTTSConfigRequest build() {
            return new DescribeTTSConfigRequest(this);
        } 

    } 

}
