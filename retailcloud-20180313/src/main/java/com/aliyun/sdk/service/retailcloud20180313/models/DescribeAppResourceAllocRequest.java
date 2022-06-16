// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppResourceAllocRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppResourceAllocRequest</p>
 */
public class DescribeAppResourceAllocRequest extends Request {
    @Query
    @NameInMap("AppEnvId")
    @Validation(required = true)
    private Long appEnvId;

    private DescribeAppResourceAllocRequest(Builder builder) {
        super(builder);
        this.appEnvId = builder.appEnvId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppResourceAllocRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appEnvId
     */
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    public static final class Builder extends Request.Builder<DescribeAppResourceAllocRequest, Builder> {
        private Long appEnvId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppResourceAllocRequest request) {
            super(request);
            this.appEnvId = request.appEnvId;
        } 

        /**
         * AppEnvId.
         */
        public Builder appEnvId(Long appEnvId) {
            this.putQueryParameter("AppEnvId", appEnvId);
            this.appEnvId = appEnvId;
            return this;
        }

        @Override
        public DescribeAppResourceAllocRequest build() {
            return new DescribeAppResourceAllocRequest(this);
        } 

    } 

}
