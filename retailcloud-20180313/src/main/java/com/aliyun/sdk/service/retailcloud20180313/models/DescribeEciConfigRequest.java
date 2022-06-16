// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEciConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeEciConfigRequest</p>
 */
public class DescribeEciConfigRequest extends Request {
    @Query
    @NameInMap("AppEnvId")
    private Long appEnvId;

    private DescribeEciConfigRequest(Builder builder) {
        super(builder);
        this.appEnvId = builder.appEnvId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEciConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEciConfigRequest, Builder> {
        private Long appEnvId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEciConfigRequest request) {
            super(request);
            this.appEnvId = request.appEnvId;
        } 

        /**
         * appEnvId
         */
        public Builder appEnvId(Long appEnvId) {
            this.putQueryParameter("AppEnvId", appEnvId);
            this.appEnvId = appEnvId;
            return this;
        }

        @Override
        public DescribeEciConfigRequest build() {
            return new DescribeEciConfigRequest(this);
        } 

    } 

}
