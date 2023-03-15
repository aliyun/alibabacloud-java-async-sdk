// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectStackGroupDriftRequest} extends {@link RequestModel}
 *
 * <p>DetectStackGroupDriftRequest</p>
 */
public class DetectStackGroupDriftRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OperationPreferences")
    private java.util.Map < String, ? > operationPreferences;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    private DetectStackGroupDriftRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.operationPreferences = builder.operationPreferences;
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectStackGroupDriftRequest create() {
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
     * @return operationPreferences
     */
    public java.util.Map < String, ? > getOperationPreferences() {
        return this.operationPreferences;
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

    public static final class Builder extends Request.Builder<DetectStackGroupDriftRequest, Builder> {
        private String clientToken; 
        private java.util.Map < String, ? > operationPreferences; 
        private String regionId; 
        private String stackGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DetectStackGroupDriftRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.operationPreferences = request.operationPreferences;
            this.regionId = request.regionId;
            this.stackGroupName = request.stackGroupName;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.
         * <p>
         * 
         * The value can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
         * 
         * For more information, see [How to ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The operation settings, in JSON format. The following fields are supported:
         * <p>
         * 
         * *   FailureToleranceCount
         * 
         * The maximum number of stack group operation failures that can occur. In a stack group operation, if the total number of failures does not exceed the FailureToleranceCount value, the operation succeeds. Otherwise, the operation fails.
         * 
         * If FailureToleranceCount is not specified, the default value 0 is used. You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.
         * 
         * Valid values: 0 to 20.
         * 
         * *   FailureTolerancePercentage
         * 
         * The percentage of stack group operation failures that can occur. In a stack group operation, if the percentage of failures does not exceed the FailureTolerancePercentage value, the operation succeeds. Otherwise, the operation fails.
         * 
         * You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.
         * 
         * Valid values: 0 to 100.
         * 
         * *   MaxConcurrentCount
         * 
         * The maximum number of target accounts in which a drift detection operation can be performed at a time.
         * 
         * You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.
         * 
         * Valid values: 1 to 20.
         * 
         * *   MaxConcurrentPercentage
         * 
         * The maximum percentage of target accounts in which a drift detection operation can be performed at a time.
         * 
         * You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.
         * 
         * Valid values: 1 to 100.
         */
        public Builder operationPreferences(java.util.Map < String, ? > operationPreferences) {
            String operationPreferencesShrink = shrink(operationPreferences, "OperationPreferences", "json");
            this.putQueryParameter("OperationPreferences", operationPreferencesShrink);
            this.operationPreferences = operationPreferences;
            return this;
        }

        /**
         * The region ID of the stack group. You can call the [DescribeRegions](~~131035#doc-api-ROS-DescribeRegions~~ "Queries the DescribeRegions list of a region.") operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the stack group. The name must be unique in a region.
         * <p>
         * 
         * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        @Override
        public DetectStackGroupDriftRequest build() {
            return new DetectStackGroupDriftRequest(this);
        } 

    } 

}
