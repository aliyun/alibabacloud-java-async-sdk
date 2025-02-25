// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetectStackGroupDriftRequest} extends {@link RequestModel}
 *
 * <p>DetectStackGroupDriftRequest</p>
 */
public class DetectStackGroupDriftRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationPreferences")
    private java.util.Map < String, ? > operationPreferences;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
         * <p>The value can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
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
         * <p>The operation settings, in JSON format. The following fields are supported:</p>
         * <ul>
         * <li>FailureToleranceCount</li>
         * </ul>
         * <p>The maximum number of stack group operation failures that can occur. In a stack group operation, if the total number of failures does not exceed the FailureToleranceCount value, the operation succeeds. Otherwise, the operation fails.</p>
         * <p>If FailureToleranceCount is not specified, the default value 0 is used. You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.</p>
         * <p>Valid values: 0 to 20.</p>
         * <ul>
         * <li>FailureTolerancePercentage</li>
         * </ul>
         * <p>The percentage of stack group operation failures that can occur. In a stack group operation, if the percentage of failures does not exceed the FailureTolerancePercentage value, the operation succeeds. Otherwise, the operation fails.</p>
         * <p>You can specify one of FailureToleranceCount or FailureTolerancePercentage parameters, but you cannot specify both of them.</p>
         * <p>Valid values: 0 to 100.</p>
         * <ul>
         * <li>MaxConcurrentCount</li>
         * </ul>
         * <p>The maximum number of target accounts in which a drift detection operation can be performed at a time.</p>
         * <p>You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.</p>
         * <p>Valid values: 1 to 20.</p>
         * <ul>
         * <li>MaxConcurrentPercentage</li>
         * </ul>
         * <p>The maximum percentage of target accounts in which a drift detection operation can be performed at a time.</p>
         * <p>You can specify one of MaxConcurrentCount or MaxConcurrentPercentage parameters, but you cannot specify both of them.</p>
         * <p>Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;FailureToleranceCount&quot;: 1, &quot;MaxConcurrentCount&quot;: 2}</p>
         */
        public Builder operationPreferences(java.util.Map < String, ? > operationPreferences) {
            String operationPreferencesShrink = shrink(operationPreferences, "OperationPreferences", "json");
            this.putQueryParameter("OperationPreferences", operationPreferencesShrink);
            this.operationPreferences = operationPreferences;
            return this;
        }

        /**
         * <p>The region ID of the stack group. You can call the <a href="~~131035#doc-api-ROS-DescribeRegions~~" title="Queries the DescribeRegions list of a region.">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The name of the stack group. The name must be unique in a region.</p>
         * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
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
