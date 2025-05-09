// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeCloudPhoneNodesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudPhoneNodesRequest</p>
 */
public class DescribeCloudPhoneNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerType")
    private String serverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeCloudPhoneNodesRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeIds = builder.nodeIds;
        this.nodeName = builder.nodeName;
        this.serverType = builder.serverType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudPhoneNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeCloudPhoneNodesRequest, Builder> {
        private String bizRegionId; 
        private String chargeType; 
        private String maxResults; 
        private String nextToken; 
        private java.util.List<String> nodeIds; 
        private String nodeName; 
        private String serverType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudPhoneNodesRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeIds = request.nodeIds;
            this.nodeName = request.nodeName;
            this.serverType = request.serverType;
            this.status = request.status;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The billing method. Only the subscription billing method is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If a query doesn&quot;t return all results, the response includes a NextToken value for pagination. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The matrix IDs.</p>
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>The matrix name.</p>
         * 
         * <strong>example:</strong>
         * <p>node_name</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The matrix specification.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cpm.gn6.gx1</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpm.gn6.gx1</p>
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        /**
         * <p>The matrix status.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>FAILED: The matrix failed to be created.</li>
         * <li>RUNNING: The matrix is available.</li>
         * <li>DELETING: The matrix is being deleted.</li>
         * <li>NODE_READY: The matrix is ready, and cloud phone instances are being created.</li>
         * <li>DELETED: The matrix is deleted.</li>
         * <li>CREATING: The matrix is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeCloudPhoneNodesRequest build() {
            return new DescribeCloudPhoneNodesRequest(this);
        } 

    } 

}
