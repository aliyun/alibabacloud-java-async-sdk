// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link UpdateLoadBalancerProtectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateLoadBalancerProtectionRequest</p>
 */
public class UpdateLoadBalancerProtectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeletionProtectionEnabled")
    private Boolean deletionProtectionEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeletionProtectionReason")
    private String deletionProtectionReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionReason")
    private String modificationProtectionReason;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionStatus")
    private String modificationProtectionStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateLoadBalancerProtectionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deletionProtectionEnabled = builder.deletionProtectionEnabled;
        this.deletionProtectionReason = builder.deletionProtectionReason;
        this.dryRun = builder.dryRun;
        this.loadBalancerId = builder.loadBalancerId;
        this.modificationProtectionReason = builder.modificationProtectionReason;
        this.modificationProtectionStatus = builder.modificationProtectionStatus;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerProtectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deletionProtectionEnabled
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * @return deletionProtectionReason
     */
    public String getDeletionProtectionReason() {
        return this.deletionProtectionReason;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    /**
     * @return modificationProtectionReason
     */
    public String getModificationProtectionReason() {
        return this.modificationProtectionReason;
    }

    /**
     * @return modificationProtectionStatus
     */
    public String getModificationProtectionStatus() {
        return this.modificationProtectionStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateLoadBalancerProtectionRequest, Builder> {
        private String clientToken; 
        private Boolean deletionProtectionEnabled; 
        private String deletionProtectionReason; 
        private Boolean dryRun; 
        private String loadBalancerId; 
        private String modificationProtectionReason; 
        private String modificationProtectionStatus; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLoadBalancerProtectionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.deletionProtectionEnabled = request.deletionProtectionEnabled;
            this.deletionProtectionReason = request.deletionProtectionReason;
            this.dryRun = request.dryRun;
            this.loadBalancerId = request.loadBalancerId;
            this.modificationProtectionReason = request.modificationProtectionReason;
            this.modificationProtectionStatus = request.modificationProtectionStatus;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate this value. Ensure that the value is unique among all requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** <strong>RequestId</strong> of each request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            this.putBodyParameter("DeletionProtectionEnabled", deletionProtectionEnabled);
            this.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }

        /**
         * <p>The reason why deletion protection is enabled. The reason must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>DeletionProtectionEnabled</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Instance_Is_Bound_By_Acceleration_Instance</p>
         */
        public Builder deletionProtectionReason(String deletionProtectionReason) {
            this.putBodyParameter("DeletionProtectionReason", deletionProtectionReason);
            this.deletionProtectionReason = deletionProtectionReason;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run, without sending the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends a request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the NLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-83ckzc8d4xlp8o****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putBodyParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The reason why the configuration read-only mode is enabled. The reason must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        public Builder modificationProtectionReason(String modificationProtectionReason) {
            this.putBodyParameter("ModificationProtectionReason", modificationProtectionReason);
            this.modificationProtectionReason = modificationProtectionReason;
            return this;
        }

        /**
         * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
         * <ul>
         * <li><strong>NonProtection</strong>: disables the configuration read-only mode. In this case, you cannot set the <strong>ModificationProtectionReason</strong> parameter. If you specify <strong>ModificationProtectionReason</strong>, the value is cleared.</li>
         * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode. In this case, you can specify <strong>ModificationProtectionReason</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the NLB console to modify configurations of the NLB instance. However, you can call API operations to modify the instance configurations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ConsoleProtection</p>
         */
        public Builder modificationProtectionStatus(String modificationProtectionStatus) {
            this.putBodyParameter("ModificationProtectionStatus", modificationProtectionStatus);
            this.modificationProtectionStatus = modificationProtectionStatus;
            return this;
        }

        /**
         * <p>The region ID of the NLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateLoadBalancerProtectionRequest build() {
            return new UpdateLoadBalancerProtectionRequest(this);
        } 

    } 

}
