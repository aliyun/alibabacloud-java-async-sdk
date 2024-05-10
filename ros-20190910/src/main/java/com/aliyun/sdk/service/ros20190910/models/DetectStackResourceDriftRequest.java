// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectStackResourceDriftRequest} extends {@link RequestModel}
 *
 * <p>DetectStackResourceDriftRequest</p>
 */
public class DetectStackResourceDriftRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("StackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    private DetectStackResourceDriftRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logicalResourceId = builder.logicalResourceId;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectStackResourceDriftRequest create() {
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
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<DetectStackResourceDriftRequest, Builder> {
        private String clientToken; 
        private String logicalResourceId; 
        private String regionId; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(DetectStackResourceDriftRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.logicalResourceId = request.logicalResourceId;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
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
         * The name of the resource.
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
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
         * The ID of the stack.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public DetectStackResourceDriftRequest build() {
            return new DetectStackResourceDriftRequest(this);
        } 

    } 

}
