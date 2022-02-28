// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackResourceRequest} extends {@link RequestModel}
 *
 * <p>GetStackResourceRequest</p>
 */
public class GetStackResourceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("LogicalResourceId")
    private String logicalResourceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowResourceAttributes")
    private Boolean showResourceAttributes;

    @Query
    @NameInMap("StackId")
    private String stackId;

    private GetStackResourceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logicalResourceId = builder.logicalResourceId;
        this.regionId = builder.regionId;
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
        private Boolean showResourceAttributes; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(GetStackResourceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.logicalResourceId = response.logicalResourceId;
            this.regionId = response.regionId;
            this.showResourceAttributes = response.showResourceAttributes;
            this.stackId = response.stackId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * LogicalResourceId.
         */
        public Builder logicalResourceId(String logicalResourceId) {
            this.putQueryParameter("LogicalResourceId", logicalResourceId);
            this.logicalResourceId = logicalResourceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ShowResourceAttributes.
         */
        public Builder showResourceAttributes(Boolean showResourceAttributes) {
            this.putQueryParameter("ShowResourceAttributes", showResourceAttributes);
            this.showResourceAttributes = showResourceAttributes;
            return this;
        }

        /**
         * StackId.
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
