// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConnectionPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListConnectionPoliciesRequest</p>
 */
public class ListConnectionPoliciesRequest extends Request {
    @Body
    @NameInMap("ArchitectureIterationId")
    @Validation(required = true)
    private String architectureIterationId;

    @Body
    @NameInMap("ConnectionPolicyId")
    private String connectionPolicyId;

    @Body
    @NameInMap("DownlinkArchitectureDeviceId")
    private String downlinkArchitectureDeviceId;

    @Body
    @NameInMap("DownlinkArchitectureModuleId")
    private String downlinkArchitectureModuleId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MaxResults")
    @Validation(required = true, maximum = 1000)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("UplinkArchitectureDeviceId")
    private String uplinkArchitectureDeviceId;

    @Body
    @NameInMap("UplinkArchitectureModuleId")
    private String uplinkArchitectureModuleId;

    private ListConnectionPoliciesRequest(Builder builder) {
        super(builder);
        this.architectureIterationId = builder.architectureIterationId;
        this.connectionPolicyId = builder.connectionPolicyId;
        this.downlinkArchitectureDeviceId = builder.downlinkArchitectureDeviceId;
        this.downlinkArchitectureModuleId = builder.downlinkArchitectureModuleId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.uplinkArchitectureDeviceId = builder.uplinkArchitectureDeviceId;
        this.uplinkArchitectureModuleId = builder.uplinkArchitectureModuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConnectionPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architectureIterationId
     */
    public String getArchitectureIterationId() {
        return this.architectureIterationId;
    }

    /**
     * @return connectionPolicyId
     */
    public String getConnectionPolicyId() {
        return this.connectionPolicyId;
    }

    /**
     * @return downlinkArchitectureDeviceId
     */
    public String getDownlinkArchitectureDeviceId() {
        return this.downlinkArchitectureDeviceId;
    }

    /**
     * @return downlinkArchitectureModuleId
     */
    public String getDownlinkArchitectureModuleId() {
        return this.downlinkArchitectureModuleId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return uplinkArchitectureDeviceId
     */
    public String getUplinkArchitectureDeviceId() {
        return this.uplinkArchitectureDeviceId;
    }

    /**
     * @return uplinkArchitectureModuleId
     */
    public String getUplinkArchitectureModuleId() {
        return this.uplinkArchitectureModuleId;
    }

    public static final class Builder extends Request.Builder<ListConnectionPoliciesRequest, Builder> {
        private String architectureIterationId; 
        private String connectionPolicyId; 
        private String downlinkArchitectureDeviceId; 
        private String downlinkArchitectureModuleId; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String uplinkArchitectureDeviceId; 
        private String uplinkArchitectureModuleId; 

        private Builder() {
            super();
        } 

        private Builder(ListConnectionPoliciesRequest request) {
            super(request);
            this.architectureIterationId = request.architectureIterationId;
            this.connectionPolicyId = request.connectionPolicyId;
            this.downlinkArchitectureDeviceId = request.downlinkArchitectureDeviceId;
            this.downlinkArchitectureModuleId = request.downlinkArchitectureModuleId;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.uplinkArchitectureDeviceId = request.uplinkArchitectureDeviceId;
            this.uplinkArchitectureModuleId = request.uplinkArchitectureModuleId;
        } 

        /**
         * 架构迭代uid
         */
        public Builder architectureIterationId(String architectureIterationId) {
            this.putBodyParameter("ArchitectureIterationId", architectureIterationId);
            this.architectureIterationId = architectureIterationId;
            return this;
        }

        /**
         * 连接策略名字
         */
        public Builder connectionPolicyId(String connectionPolicyId) {
            this.putBodyParameter("ConnectionPolicyId", connectionPolicyId);
            this.connectionPolicyId = connectionPolicyId;
            return this;
        }

        /**
         * 下联设备uid
         */
        public Builder downlinkArchitectureDeviceId(String downlinkArchitectureDeviceId) {
            this.putBodyParameter("DownlinkArchitectureDeviceId", downlinkArchitectureDeviceId);
            this.downlinkArchitectureDeviceId = downlinkArchitectureDeviceId;
            return this;
        }

        /**
         * 下联模块uid
         */
        public Builder downlinkArchitectureModuleId(String downlinkArchitectureModuleId) {
            this.putBodyParameter("DownlinkArchitectureModuleId", downlinkArchitectureModuleId);
            this.downlinkArchitectureModuleId = downlinkArchitectureModuleId;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 上联设备uid
         */
        public Builder uplinkArchitectureDeviceId(String uplinkArchitectureDeviceId) {
            this.putBodyParameter("UplinkArchitectureDeviceId", uplinkArchitectureDeviceId);
            this.uplinkArchitectureDeviceId = uplinkArchitectureDeviceId;
            return this;
        }

        /**
         * 上联模块uid
         */
        public Builder uplinkArchitectureModuleId(String uplinkArchitectureModuleId) {
            this.putBodyParameter("UplinkArchitectureModuleId", uplinkArchitectureModuleId);
            this.uplinkArchitectureModuleId = uplinkArchitectureModuleId;
            return this;
        }

        @Override
        public ListConnectionPoliciesRequest build() {
            return new ListConnectionPoliciesRequest(this);
        } 

    } 

}
