// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > resourceAttributes;

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
    public java.util.List < String > getResourceAttributes() {
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
        private java.util.List < String > resourceAttributes; 
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
         * Specifies whether to query the resource properties. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The name of resource property N that you want to query.
         * <p>
         * 
         * >  Maximum value of N: 20.
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * The logical ID of the resource defined in the template.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The status of the resource. Valid values:
         * <p>
         * 
         * *   CREATE_COMPLETE
         * *   CREATE_FAILED
         * *   CREATE_IN_PROGRESS
         * *   UPDATE_IN_PROGRESS
         * *   UPDATE_FAILED
         * *   UPDATE_COMPLETE
         * *   DELETE_IN_PROGRESS
         * *   DELETE_FAILED
         * *   CHECK_IN_PROGRESS
         * *   CHECK_FAILED
         * *   CHECK_COMPLETE
         * *   IMPORT_IN_PROGRESS
         * *   IMPORT_FAILED
         * *   IMPORT_COMPLETE
         */
        public Builder resourceAttributes(java.util.List < String > resourceAttributes) {
            this.putQueryParameter("ResourceAttributes", resourceAttributes);
            this.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * The name of resource property N that you want to query.
         */
        public Builder showResourceAttributes(Boolean showResourceAttributes) {
            this.putQueryParameter("ShowResourceAttributes", showResourceAttributes);
            this.showResourceAttributes = showResourceAttributes;
            return this;
        }

        /**
         * The ID of the region to which the stack belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
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
