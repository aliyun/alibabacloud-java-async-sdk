// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetStackResourceRequest} extends {@link RequestModel}
 *
 * <p>GetStackResourceRequest</p>
 */
public class GetStackResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logicalResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAttributes")
    private java.util.List<String> resourceAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowResourceAttributes")
    private Boolean showResourceAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    private GetStackResourceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logicalResourceId = builder.logicalResourceId;
        this.regionId = builder.regionId;
        this.resourceAttributes = builder.resourceAttributes;
        this.showResourceAttributes = builder.showResourceAttributes;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackResourceRequest create() {
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
     * @return logicalResourceId
     */
    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceAttributes
     */
    public java.util.List<String> getResourceAttributes() {
        return this.resourceAttributes;
    }

    /**
     * @return showResourceAttributes
     */
    public Boolean getShowResourceAttributes() {
        return this.showResourceAttributes;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<GetStackResourceRequest, Builder> {
        private String clientToken; 
        private String logicalResourceId; 
        private String regionId; 
        private java.util.List<String> resourceAttributes; 
        private Boolean showResourceAttributes; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackResourceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.logicalResourceId = request.logicalResourceId;
            this.regionId = request.regionId;
            this.resourceAttributes = request.resourceAttributes;
            this.showResourceAttributes = request.showResourceAttributes;
            this.stackId = request.stackId;
        } 

        /**
         * <p>Specifies whether to query the resource properties. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of resource property N that you want to query.</p>
         * <blockquote>
         * <p> Maximum value of N: 20.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WebServer</p>
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * <p>The logical ID of the resource defined in the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the resource. Valid values:</p>
         * <ul>
         * <li>CREATE_COMPLETE</li>
         * <li>CREATE_FAILED</li>
         * <li>CREATE_IN_PROGRESS</li>
         * <li>UPDATE_IN_PROGRESS</li>
         * <li>UPDATE_FAILED</li>
         * <li>UPDATE_COMPLETE</li>
         * <li>DELETE_IN_PROGRESS</li>
         * <li>DELETE_FAILED</li>
         * <li>CHECK_IN_PROGRESS</li>
         * <li>CHECK_FAILED</li>
         * <li>CHECK_COMPLETE</li>
         * <li>IMPORT_IN_PROGRESS</li>
         * <li>IMPORT_FAILED</li>
         * <li>IMPORT_COMPLETE</li>
         * </ul>
         */
        public Builder resourceAttributes(java.util.List<String> resourceAttributes) {
            this.putQueryParameter("ResourceAttributes", resourceAttributes);
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * <p>The name of resource property N that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showResourceAttributes(Boolean showResourceAttributes) {
            this.putQueryParameter("ShowResourceAttributes", showResourceAttributes);
            this.showResourceAttributes = showResourceAttributes;
            return this;
        }

        /**
         * <p>The ID of the region to which the stack belongs. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public GetStackResourceRequest build() {
            return new GetStackResourceRequest(this);
        } 

    } 

}
