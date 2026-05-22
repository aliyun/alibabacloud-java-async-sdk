// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link PushTimesUsageRequest} extends {@link RequestModel}
 *
 * <p>PushTimesUsageRequest</p>
 */
public class PushTimesUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Times")
    private Long times;

    private PushTimesUsageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.times = builder.times;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushTimesUsageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return times
     */
    public Long getTimes() {
        return this.times;
    }

    public static final class Builder extends Request.Builder<PushTimesUsageRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private Long times; 

        private Builder() {
            super();
        } 

        private Builder(PushTimesUsageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.times = request.times;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Times.
         */
        public Builder times(Long times) {
            this.putQueryParameter("Times", times);
            this.times = times;
            return this;
        }

        @Override
        public PushTimesUsageRequest build() {
            return new PushTimesUsageRequest(this);
        } 

    } 

}
