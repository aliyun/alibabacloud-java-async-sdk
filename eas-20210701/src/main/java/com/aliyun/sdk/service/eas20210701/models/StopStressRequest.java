// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopStressRequest} extends {@link RequestModel}
 *
 * <p>StopStressRequest</p>
 */
public class StopStressRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("StressName")
    @Validation(required = true)
    private String stressName;

    private StopStressRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.stressName = builder.stressName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopStressRequest create() {
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

    public static final class Builder extends Request.Builder<StopStressRequest, Builder> {
        private String clusterId; 
        private String stressName; 

        private Builder() {
            super();
        } 

        private Builder(StopStressRequest request) {
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
        public StopStressRequest build() {
            return new StopStressRequest(this);
        } 

    } 

}
