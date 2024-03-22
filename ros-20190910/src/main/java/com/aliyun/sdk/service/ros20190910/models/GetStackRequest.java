// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackRequest} extends {@link RequestModel}
 *
 * <p>GetStackRequest</p>
 */
public class GetStackRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("LogOption")
    private String logOption;

    @Query
    @NameInMap("OutputOption")
    private String outputOption;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ShowResourceProgress")
    private String showResourceProgress;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.\
         * <p>
         * The token can be up to 64 characters in length.\
         * For more information, see [Ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The option for returning logs. Valid values:
         * <p>
         * 
         * *   None: does not return logs.
         * *   Stack (default): returns the logs of the stack.
         * *   Resource: returns the logs of resources in the stack.
         * *   All: returns all logs.
         */
        public Builder logOption(String logOption) {
            this.putQueryParameter("LogOption", logOption);
            this.logOption = logOption;
            return this;
        }

        /**
         * Specifies whether to return Outputs. Valid values:
         * <p>
         * 
         * *   Enabled (default)
         * *   Disabled
         * 
         * >  The Outputs parameter requires a long period of time to calculate. If you do not require Outputs of the stack, we recommend that you set OutputOption to Disabled to improve the response speed of the GetStack operation.
         */
        public Builder outputOption(String outputOption) {
            this.putQueryParameter("OutputOption", outputOption);
            this.outputOption = outputOption;
            return this;
        }

        /**
         * The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to return information about ResourceProgress. Valid values:
         * <p>
         * 
         * *   Disabled (default): does not return information about ResourceProgress.
         * *   PercentageOnly: returns StackOperationProgress and StackActionProgress of ResourceProgress.
         * 
         * >  ROS and Terraform stacks are supported. Creation, resumed creation, update, deletion, import, and rollback operations on stacks are supported.
         * 
         * *   EnabledIfCreateStack (not recommend): returns \*Count and InProgressResourceDetails of ResourceProgress only during a stack creation operation.
         * 
         * >  During a creation operation, a stack is in one of the following states: CREATE_IN_PROGRESS, CREATE_COMPLETE, CREATE_FAILED, CREATE_ROLLBACK_IN_PROGRESS, CREATE_ROLLBACK_COMPLETE, and CREATE_ROLLBACK_FAILED.
         */
        public Builder showResourceProgress(String showResourceProgress) {
            this.putQueryParameter("ShowResourceProgress", showResourceProgress);
            this.showResourceProgress = showResourceProgress;
            return this;
        }

        /**
         * The stack ID.
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
