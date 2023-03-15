// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SignalResourceRequest} extends {@link RequestModel}
 *
 * <p>SignalResourceRequest</p>
 */
public class SignalResourceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("LogicalResourceId")
    @Validation(required = true)
    private String logicalResourceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
    private String stackId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("UniqueId")
    @Validation(required = true)
    private String uniqueId;

    private SignalResourceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logicalResourceId = builder.logicalResourceId;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.status = builder.status;
        this.uniqueId = builder.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SignalResourceRequest create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uniqueId
     */
    public String getUniqueId() {
        return this.uniqueId;
    }

    public static final class Builder extends Request.Builder<SignalResourceRequest, Builder> {
        private String clientToken; 
        private String logicalResourceId; 
        private String regionId; 
        private String stackId; 
        private String status; 
        private String uniqueId; 

        private Builder() {
            super();
        } 

        private Builder(SignalResourceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.logicalResourceId = request.logicalResourceId;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.status = request.status;
            this.uniqueId = request.uniqueId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.
         * <p>
         * 
         * The token can be up to 64 characters in length and can contain letters, digits, hyphens (-) and underscores (\_).
         * 
         * For more information, see [How to ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The logical ID of the resource as defined in the template.
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

        /**
         * The status of the signal. Failure signals can cause stack creation or update to fail. If all signals are warnings, the stack cannot be created or updated. Valid values:
         * <p>
         * 
         * *   SUCCESS
         * *   FAILURE
         * *   WARNING
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The unique ID of the signal. The ID must be 1 to 64 characters in length. If multiple signals are sent to a single resource, each signal must have a unique ID.
         */
        public Builder uniqueId(String uniqueId) {
            this.putQueryParameter("UniqueId", uniqueId);
            this.uniqueId = uniqueId;
            return this;
        }

        @Override
        public SignalResourceRequest build() {
            return new SignalResourceRequest(this);
        } 

    } 

}
