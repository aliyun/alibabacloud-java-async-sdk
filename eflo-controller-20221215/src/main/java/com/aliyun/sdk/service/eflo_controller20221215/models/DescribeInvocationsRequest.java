// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationsRequest</p>
 */
public class DescribeInvocationsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ContentEncoding")
    private String contentEncoding;

    @Body
    @NameInMap("IncludeOutput")
    private Boolean includeOutput;

    @Body
    @NameInMap("InvokeId")
    @Validation(required = true)
    private String invokeId;

    @Body
    @NameInMap("NodeId")
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
         * ContentEncoding.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putBodyParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * IncludeOutput.
         */
        public Builder includeOutput(Boolean includeOutput) {
            this.putBodyParameter("IncludeOutput", includeOutput);
            this.includeOutput = includeOutput;
            return this;
        }

        /**
         * InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.putBodyParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * NodeId.
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
