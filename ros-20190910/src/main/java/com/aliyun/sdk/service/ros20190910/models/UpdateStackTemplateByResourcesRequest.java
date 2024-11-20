// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateStackTemplateByResourcesRequest} extends {@link RequestModel}
 *
 * <p>UpdateStackTemplateByResourcesRequest</p>
 */
public class UpdateStackTemplateByResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
    private java.util.List < String > logicalResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateFormat")
    private String templateFormat;

    private UpdateStackTemplateByResourcesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.logicalResourceId = builder.logicalResourceId;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.templateFormat = builder.templateFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackTemplateByResourcesRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return logicalResourceId
     */
    public java.util.List < String > getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return templateFormat
     */
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public static final class Builder extends Request.Builder<UpdateStackTemplateByResourcesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > logicalResourceId; 
        private String regionId; 
        private String stackId; 
        private String templateFormat; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStackTemplateByResourcesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.logicalResourceId = request.logicalResourceId;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.templateFormat = request.templateFormat;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests.</p>
         * <p>The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
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
         * <p>Specifies whether to only preview the corrected template in this request. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: returns the content of the corrected template and does not correct the template. After Resource Orchestration Service (ROS) compares the corrected template with the original template, ROS determines whether to execute the correction.</li>
         * <li>false: corrects the template to eliminate drift.</li>
         * </ul>
         * <blockquote>
         * <p> We recommend that you set the DryRun parameter to true to preview the corrected template. If the template content meets expectations, set the DryRun parameter to false to execute the correction.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The logical ID of resource.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        public Builder logicalResourceId(java.util.List < String > logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the stack.</p>
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

        /**
         * <p>The format of the returned template. Default value: JSON. Valid values:</p>
         * <ul>
         * <li>JSON</li>
         * <li>YAML</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder templateFormat(String templateFormat) {
            this.putQueryParameter("TemplateFormat", templateFormat);
            this.templateFormat = templateFormat;
            return this;
        }

        @Override
        public UpdateStackTemplateByResourcesRequest build() {
            return new UpdateStackTemplateByResourcesRequest(this);
        } 

    } 

}
