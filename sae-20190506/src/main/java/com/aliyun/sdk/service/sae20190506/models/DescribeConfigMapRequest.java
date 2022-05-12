// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigMapRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigMapRequest</p>
 */
public class DescribeConfigMapRequest extends Request {
    @Query
    @NameInMap("ConfigMapId")
    @Validation(required = true)
    private Long configMapId;

    private DescribeConfigMapRequest(Builder builder) {
        super(builder);
        this.configMapId = builder.configMapId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigMapRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configMapId
     */
    public Long getConfigMapId() {
        return this.configMapId;
    }

    public static final class Builder extends Request.Builder<DescribeConfigMapRequest, Builder> {
        private Long configMapId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigMapRequest request) {
            super(request);
            this.configMapId = request.configMapId;
        } 

        /**
         * ConfigMapId.
         */
        public Builder configMapId(Long configMapId) {
            this.putQueryParameter("ConfigMapId", configMapId);
            this.configMapId = configMapId;
            return this;
        }

        @Override
        public DescribeConfigMapRequest build() {
            return new DescribeConfigMapRequest(this);
        } 

    } 

}
