// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListFeatureConsistencyCheckJobFeatureReportsRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureConsistencyCheckJobFeatureReportsRequest</p>
 */
public class ListFeatureConsistencyCheckJobFeatureReportsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogUserId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9010</p>
         */
        public Builder logItemId(String logItemId) {
            this.putQueryParameter("LogItemId", logItemId);
            this.logItemId = logItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
         */
        public Builder logRequestId(String logRequestId) {
            this.putQueryParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1010</p>
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
