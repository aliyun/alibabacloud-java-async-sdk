// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStackRequest} extends {@link RequestModel}
 *
 * <p>GetStackRequest</p>
 */
public class GetStackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogOption")
    private String logOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputOption")
    private String outputOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowResourceProgress")
    private String showResourceProgress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    private GetStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logOption = builder.logOption;
        this.outputOption = builder.outputOption;
        this.regionId = builder.regionId;
        this.showResourceProgress = builder.showResourceProgress;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackRequest create() {
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
     * @return logOption
     */
    public String getLogOption() {
        return this.logOption;
    }

    /**
     * @return outputOption
     */
    public String getOutputOption() {
        return this.outputOption;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showResourceProgress
     */
    public String getShowResourceProgress() {
        return this.showResourceProgress;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<GetStackRequest, Builder> {
        private String clientToken; 
        private String logOption; 
        private String outputOption; 
        private String regionId; 
        private String showResourceProgress; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.logOption = request.logOption;
            this.outputOption = request.outputOption;
            this.regionId = request.regionId;
            this.showResourceProgress = request.showResourceProgress;
            this.stackId = request.stackId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.<br>The token can be up to 64 characters in length.<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">Ensure idempotence</a>.</p>
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
         * <p>The option for returning logs. Valid values:</p>
         * <ul>
         * <li>None: does not return logs.</li>
         * <li>Stack (default): returns the logs of the stack.</li>
         * <li>Resource: returns the logs of resources in the stack.</li>
         * <li>All: returns all logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stack</p>
         */
        public Builder logOption(String logOption) {
            this.putQueryParameter("LogOption", logOption);
            this.logOption = logOption;
            return this;
        }

        /**
         * <p>Specifies whether to return Outputs. Valid values:</p>
         * <ul>
         * <li>Enabled (default)</li>
         * <li>Disabled</li>
         * </ul>
         * <blockquote>
         * <p> The Outputs parameter requires a long period of time to calculate. If you do not require Outputs of the stack, we recommend that you set OutputOption to Disabled to improve the response speed of the GetStack operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder outputOption(String outputOption) {
            this.putQueryParameter("OutputOption", outputOption);
            this.outputOption = outputOption;
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
         * <p>Specifies whether to return information about ResourceProgress. Valid values:</p>
         * <ul>
         * <li>Disabled (default): does not return information about ResourceProgress.</li>
         * <li>PercentageOnly: returns StackOperationProgress and StackActionProgress of ResourceProgress.</li>
         * </ul>
         * <blockquote>
         * <p> ROS and Terraform stacks are supported. Creation, resumed creation, update, deletion, import, and rollback operations on stacks are supported.</p>
         * </blockquote>
         * <ul>
         * <li>EnabledIfCreateStack (not recommend): returns *Count and InProgressResourceDetails of ResourceProgress only during a stack creation operation.</li>
         * </ul>
         * <blockquote>
         * <p> During a creation operation, a stack is in one of the following states: CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, CREATE_ROLLBACK_IN_PROGRESS, CREATE_ROLLBACK_COMPLETE, and CREATE_ROLLBACK_FAILED.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder showResourceProgress(String showResourceProgress) {
            this.putQueryParameter("ShowResourceProgress", showResourceProgress);
            this.showResourceProgress = showResourceProgress;
            return this;
        }

        /**
         * <p>The stack ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c754d2a4-28f1-46df-b557-9586173a****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public GetStackRequest build() {
            return new GetStackRequest(this);
        } 

    } 

}
