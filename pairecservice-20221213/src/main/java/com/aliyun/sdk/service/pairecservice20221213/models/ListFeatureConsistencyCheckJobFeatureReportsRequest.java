// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureConsistencyCheckJobFeatureReportsRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureConsistencyCheckJobFeatureReportsRequest</p>
 */
public class ListFeatureConsistencyCheckJobFeatureReportsRequest extends Request {
    @Path
    @NameInMap("FeatureConsistencyCheckJobId")
    @Validation(required = true)
    private String featureConsistencyCheckJobId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LogItemId")
    @Validation(required = true)
    private String logItemId;

    @Query
    @NameInMap("LogRequestId")
    @Validation(required = true)
    private String logRequestId;

    @Query
    @NameInMap("LogUserId")
    @Validation(required = true)
    private String logUserId;

    private ListFeatureConsistencyCheckJobFeatureReportsRequest(Builder builder) {
        super(builder);
        this.featureConsistencyCheckJobId = builder.featureConsistencyCheckJobId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.logItemId = builder.logItemId;
        this.logRequestId = builder.logRequestId;
        this.logUserId = builder.logUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureConsistencyCheckJobFeatureReportsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureConsistencyCheckJobId
     */
    public String getFeatureConsistencyCheckJobId() {
        return this.featureConsistencyCheckJobId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logItemId
     */
    public String getLogItemId() {
        return this.logItemId;
    }

    /**
     * @return logRequestId
     */
    public String getLogRequestId() {
        return this.logRequestId;
    }

    /**
     * @return logUserId
     */
    public String getLogUserId() {
        return this.logUserId;
    }

    public static final class Builder extends Request.Builder<ListFeatureConsistencyCheckJobFeatureReportsRequest, Builder> {
        private String featureConsistencyCheckJobId; 
        private String regionId; 
        private String instanceId; 
        private String logItemId; 
        private String logRequestId; 
        private String logUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListFeatureConsistencyCheckJobFeatureReportsRequest request) {
            super(request);
            this.featureConsistencyCheckJobId = request.featureConsistencyCheckJobId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.logItemId = request.logItemId;
            this.logRequestId = request.logRequestId;
            this.logUserId = request.logUserId;
        } 

        /**
         * FeatureConsistencyCheckJobId.
         */
        public Builder featureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
            this.putPathParameter("FeatureConsistencyCheckJobId", featureConsistencyCheckJobId);
            this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * LogItemId.
         */
        public Builder logItemId(String logItemId) {
            this.putQueryParameter("LogItemId", logItemId);
            this.logItemId = logItemId;
            return this;
        }

        /**
         * LogRequestId.
         */
        public Builder logRequestId(String logRequestId) {
            this.putQueryParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        /**
         * LogUserId.
         */
        public Builder logUserId(String logUserId) {
            this.putQueryParameter("LogUserId", logUserId);
            this.logUserId = logUserId;
            return this;
        }

        @Override
        public ListFeatureConsistencyCheckJobFeatureReportsRequest build() {
            return new ListFeatureConsistencyCheckJobFeatureReportsRequest(this);
        } 

    } 

}
