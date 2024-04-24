// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetStackInstanceRequest</p>
 */
public class GetStackInstanceRequest extends Request {
    @Query
    @NameInMap("OutputOption")
    private String outputOption;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    @Query
    @NameInMap("StackInstanceAccountId")
    @Validation(required = true)
    private String stackInstanceAccountId;

    @Query
    @NameInMap("StackInstanceRegionId")
    @Validation(required = true)
    private String stackInstanceRegionId;

    private GetStackInstanceRequest(Builder builder) {
        super(builder);
        this.outputOption = builder.outputOption;
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
        this.stackInstanceAccountId = builder.stackInstanceAccountId;
        this.stackInstanceRegionId = builder.stackInstanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    /**
     * @return stackInstanceAccountId
     */
    public String getStackInstanceAccountId() {
        return this.stackInstanceAccountId;
    }

    /**
     * @return stackInstanceRegionId
     */
    public String getStackInstanceRegionId() {
        return this.stackInstanceRegionId;
    }

    public static final class Builder extends Request.Builder<GetStackInstanceRequest, Builder> {
        private String outputOption; 
        private String regionId; 
        private String stackGroupName; 
        private String stackInstanceAccountId; 
        private String stackInstanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackInstanceRequest request) {
            super(request);
            this.outputOption = request.outputOption;
            this.regionId = request.regionId;
            this.stackGroupName = request.stackGroupName;
            this.stackInstanceAccountId = request.stackInstanceAccountId;
            this.stackInstanceRegionId = request.stackInstanceRegionId;
        } 

        /**
         * Specifies whether to return the Outputs parameter. The Outputs parameter specifies the outputs of the stack. Valid values:
         * <p>
         * 
         * *   Enabled: returns the Outputs parameter.
         * *   Disabled (default): does not return the Outputs parameter.
         * 
         * >  The Outputs parameter requires a long period of time to calculate. If you do not require the outputs of the stack, we recommend that you set OutputOption to Disabled to improve the response speed of the API operation.
         */
        public Builder outputOption(String outputOption) {
            this.putQueryParameter("OutputOption", outputOption);
            this.outputOption = outputOption;
            return this;
        }

        /**
         * The region ID of the stack group. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the stack group. The name must be unique within a region.\
         * <p>
         * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * The ID of the destination account to which the stack belongs.
         * <p>
         * 
         * *   If the stack group is granted self-managed permissions, the stack belongs to an Alibaba Cloud account.
         * *   If the stack group is granted service-managed permissions, the stack belongs to a member in a resource directory.
         * 
         * > For more information about the destination account, see [Overview](~~154578~~).
         */
        public Builder stackInstanceAccountId(String stackInstanceAccountId) {
            this.putQueryParameter("StackInstanceAccountId", stackInstanceAccountId);
            this.stackInstanceAccountId = stackInstanceAccountId;
            return this;
        }

        /**
         * The region ID of the stack.
         */
        public Builder stackInstanceRegionId(String stackInstanceRegionId) {
            this.putQueryParameter("StackInstanceRegionId", stackInstanceRegionId);
            this.stackInstanceRegionId = stackInstanceRegionId;
            return this;
        }

        @Override
        public GetStackInstanceRequest build() {
            return new GetStackInstanceRequest(this);
        } 

    } 

}
