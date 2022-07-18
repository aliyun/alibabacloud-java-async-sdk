// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartStressRequest} extends {@link RequestModel}
 *
 * <p>StartStressRequest</p>
 */
public class StartStressRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("StressName")
    @Validation(required = true)
    private String stressName;

    private StartStressRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.stressName = builder.stressName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartStressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return stressName
     */
    public String getStressName() {
        return this.stressName;
    }

    public static final class Builder extends Request.Builder<StartStressRequest, Builder> {
        private String clusterId; 
        private String stressName; 

        private Builder() {
            super();
        } 

        private Builder(StartStressRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.stressName = request.stressName;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * StressName.
         */
        public Builder stressName(String stressName) {
            this.putPathParameter("StressName", stressName);
            this.stressName = stressName;
            return this;
        }

        @Override
        public StartStressRequest build() {
            return new StartStressRequest(this);
        } 

    } 

}
