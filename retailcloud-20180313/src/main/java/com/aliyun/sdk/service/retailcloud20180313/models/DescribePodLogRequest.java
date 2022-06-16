// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePodLogRequest} extends {@link RequestModel}
 *
 * <p>DescribePodLogRequest</p>
 */
public class DescribePodLogRequest extends Request {
    @Body
    @NameInMap("AppInstId")
    @Validation(required = true)
    private String appInstId;

    @Body
    @NameInMap("DeployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    private DescribePodLogRequest(Builder builder) {
        super(builder);
        this.appInstId = builder.appInstId;
        this.deployOrderId = builder.deployOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePodLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstId
     */
    public String getAppInstId() {
        return this.appInstId;
    }

    /**
     * @return deployOrderId
     */
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    public static final class Builder extends Request.Builder<DescribePodLogRequest, Builder> {
        private String appInstId; 
        private Long deployOrderId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePodLogRequest request) {
            super(request);
            this.appInstId = request.appInstId;
            this.deployOrderId = request.deployOrderId;
        } 

        /**
         * AppInstId.
         */
        public Builder appInstId(String appInstId) {
            this.putBodyParameter("AppInstId", appInstId);
            this.appInstId = appInstId;
            return this;
        }

        /**
         * DeployOrderId.
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putBodyParameter("DeployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        @Override
        public DescribePodLogRequest build() {
            return new DescribePodLogRequest(this);
        } 

    } 

}
