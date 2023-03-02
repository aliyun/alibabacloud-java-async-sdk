// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceRequest} extends {@link RequestModel}
 *
 * <p>QueryInstanceRequest</p>
 */
public class QueryInstanceRequest extends Request {
    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private QueryInstanceRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<QueryInstanceRequest, Builder> {
        private String bizType; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryInstanceRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.instanceId = request.instanceId;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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

        @Override
        public QueryInstanceRequest build() {
            return new QueryInstanceRequest(this);
        } 

    } 

}
