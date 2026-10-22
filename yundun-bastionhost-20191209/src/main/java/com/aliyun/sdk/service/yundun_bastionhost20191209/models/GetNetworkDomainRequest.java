// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetNetworkDomainRequest} extends {@link RequestModel}
 *
 * <p>GetNetworkDomainRequest</p>
 */
public class GetNetworkDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckProxyState")
    private String checkProxyState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkDomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkDomainId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetNetworkDomainRequest(Builder builder) {
        super(builder);
        this.checkProxyState = builder.checkProxyState;
        this.instanceId = builder.instanceId;
        this.networkDomainId = builder.networkDomainId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkDomainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkProxyState
     */
    public String getCheckProxyState() {
        return this.checkProxyState;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkDomainId
     */
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetNetworkDomainRequest, Builder> {
        private String checkProxyState; 
        private String instanceId; 
        private String networkDomainId; 
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetNetworkDomainRequest request) {
            super(request);
            this.checkProxyState = request.checkProxyState;
            this.instanceId = request.instanceId;
            this.networkDomainId = request.networkDomainId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to immediately re-check the proxy server status. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Immediately re-checks the proxy server status and returns the latest ProxyState/ProxyStateErrorCode.</p>
         * </li>
         * <li><p><strong>false</strong>: Default value. Does not re-check the proxy server status and directly returns the currently recorded status.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder checkProxyState(String checkProxyState) {
            this.putQueryParameter("CheckProxyState", checkProxyState);
            this.checkProxyState = checkProxyState;
            return this;
        }

        /**
         * <p>The instance ID of the bastion host.</p>
         * <blockquote>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-i7m2btk6g48</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the network domain to query.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder networkDomainId(String networkDomainId) {
            this.putQueryParameter("NetworkDomainId", networkDomainId);
            this.networkDomainId = networkDomainId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetNetworkDomainRequest build() {
            return new GetNetworkDomainRequest(this);
        } 

    } 

}
