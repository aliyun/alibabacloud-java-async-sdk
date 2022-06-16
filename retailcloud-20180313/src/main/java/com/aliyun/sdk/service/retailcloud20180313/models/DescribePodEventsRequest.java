// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePodEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribePodEventsRequest</p>
 */
public class DescribePodEventsRequest extends Request {
    @Query
    @NameInMap("AppInstId")
    @Validation(required = true)
    private String appInstId;

    @Query
    @NameInMap("DeployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    private DescribePodEventsRequest(Builder builder) {
        super(builder);
        this.appInstId = builder.appInstId;
        this.deployOrderId = builder.deployOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePodEventsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePodEventsRequest, Builder> {
        private String appInstId; 
        private Long deployOrderId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePodEventsRequest request) {
            super(request);
            this.appInstId = request.appInstId;
            this.deployOrderId = request.deployOrderId;
        } 

        /**
         * AppInstId.
         */
        public Builder appInstId(String appInstId) {
            this.putQueryParameter("AppInstId", appInstId);
            this.appInstId = appInstId;
            return this;
        }

        /**
         * DeployOrderId.
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putQueryParameter("DeployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        @Override
        public DescribePodEventsRequest build() {
            return new DescribePodEventsRequest(this);
        } 

    } 

}
