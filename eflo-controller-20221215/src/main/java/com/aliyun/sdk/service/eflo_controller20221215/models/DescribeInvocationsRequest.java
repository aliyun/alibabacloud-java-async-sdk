// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeInvocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationsRequest</p>
 */
public class DescribeInvocationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeOutput")
    private Boolean includeOutput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invokeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private DescribeInvocationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contentEncoding = builder.contentEncoding;
        this.includeOutput = builder.includeOutput;
        this.invokeId = builder.invokeId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return includeOutput
     */
    public Boolean getIncludeOutput() {
        return this.includeOutput;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationsRequest, Builder> {
        private String regionId; 
        private String contentEncoding; 
        private Boolean includeOutput; 
        private String invokeId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contentEncoding = request.contentEncoding;
            this.includeOutput = request.includeOutput;
            this.invokeId = request.invokeId;
            this.nodeId = request.nodeId;
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
         * <p>The encoding method for the CommandContent and Output fields in the response. Valid values:</p>
         * <ul>
         * <li>PlainText: Returns the original command content and output.</li>
         * <li>Base64 (default): Returns the Base64-encoded command content and output.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PlainText</p>
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putBodyParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * <p>Specifies whether to return the command output in the results.</p>
         * <ul>
         * <li>true: Returns the output. In this case, specify at least the InvokeId or InstanceId parameter.</li>
         * <li>false (default): Does not return the output.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeOutput(Boolean includeOutput) {
            this.putBodyParameter("IncludeOutput", includeOutput);
            this.includeOutput = includeOutput;
            return this;
        }

        /**
         * <p>The command execution ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-cd03crwys0lrls0</p>
         */
        public Builder invokeId(String invokeId) {
            this.putBodyParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr08</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public DescribeInvocationsRequest build() {
            return new DescribeInvocationsRequest(this);
        } 

    } 

}
