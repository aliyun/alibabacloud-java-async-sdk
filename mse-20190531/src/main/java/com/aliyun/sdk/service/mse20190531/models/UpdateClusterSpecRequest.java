// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateClusterSpecRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterSpecRequest</p>
 */
public class UpdateClusterSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterSpecification")
    private String clusterSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseVersion")
    private String mseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PubNetworkFlow")
    private Integer pubNetworkFlow;

    private UpdateClusterSpecRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.autoPay = builder.autoPay;
        this.clusterId = builder.clusterId;
        this.clusterSpecification = builder.clusterSpecification;
        this.instanceCount = builder.instanceCount;
        this.instanceId = builder.instanceId;
        this.mseVersion = builder.mseVersion;
        this.pubNetworkFlow = builder.pubNetworkFlow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterSpecRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterSpecification
     */
    public String getClusterSpecification() {
        return this.clusterSpecification;
    }

    /**
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mseVersion
     */
    public String getMseVersion() {
        return this.mseVersion;
    }

    /**
     * @return pubNetworkFlow
     */
    public Integer getPubNetworkFlow() {
        return this.pubNetworkFlow;
    }

    public static final class Builder extends Request.Builder<UpdateClusterSpecRequest, Builder> {
        private String acceptLanguage; 
        private Boolean autoPay; 
        private String clusterId; 
        private String clusterSpecification; 
        private Integer instanceCount; 
        private String instanceId; 
        private String mseVersion; 
        private Integer pubNetworkFlow; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterSpecRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.autoPay = request.autoPay;
            this.clusterId = request.clusterId;
            this.clusterSpecification = request.clusterSpecification;
            this.instanceCount = request.instanceCount;
            this.instanceId = request.instanceId;
            this.mseVersion = request.mseVersion;
            this.pubNetworkFlow = request.pubNetworkFlow;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-09k1q11****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The destination engine specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>MSE_SC_2_4_200_c</p>
         */
        public Builder clusterSpecification(String clusterSpecification) {
            this.putQueryParameter("ClusterSpecification", clusterSpecification);
            this.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * <p>The number of destination nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder instanceCount(Integer instanceCount) {
            this.putQueryParameter("InstanceCount", instanceCount);
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The MSE version.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_pro</p>
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * PubNetworkFlow.
         */
        public Builder pubNetworkFlow(Integer pubNetworkFlow) {
            this.putQueryParameter("PubNetworkFlow", pubNetworkFlow);
            this.pubNetworkFlow = pubNetworkFlow;
            return this;
        }

        @Override
        public UpdateClusterSpecRequest build() {
            return new UpdateClusterSpecRequest(this);
        } 

    } 

}
