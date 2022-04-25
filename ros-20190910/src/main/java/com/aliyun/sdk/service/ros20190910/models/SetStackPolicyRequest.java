// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetStackPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetStackPolicyRequest</p>
 */
public class SetStackPolicyRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackId")
    @Validation(required = true)
    private String stackId;

    @Query
    @NameInMap("StackPolicyBody")
    private String stackPolicyBody;

    @Query
    @NameInMap("StackPolicyURL")
    private String stackPolicyURL;

    private SetStackPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.stackPolicyBody = builder.stackPolicyBody;
        this.stackPolicyURL = builder.stackPolicyURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetStackPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return stackPolicyBody
     */
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    /**
     * @return stackPolicyURL
     */
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public static final class Builder extends Request.Builder<SetStackPolicyRequest, Builder> {
        private String regionId; 
        private String stackId; 
        private String stackPolicyBody; 
        private String stackPolicyURL; 

        private Builder() {
            super();
        } 

        private Builder(SetStackPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.stackPolicyBody = request.stackPolicyBody;
            this.stackPolicyURL = request.stackPolicyURL;
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
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * StackPolicyBody.
         */
        public Builder stackPolicyBody(String stackPolicyBody) {
            this.putQueryParameter("StackPolicyBody", stackPolicyBody);
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }

        /**
         * StackPolicyURL.
         */
        public Builder stackPolicyURL(String stackPolicyURL) {
            this.putQueryParameter("StackPolicyURL", stackPolicyURL);
            this.stackPolicyURL = stackPolicyURL;
            return this;
        }

        @Override
        public SetStackPolicyRequest build() {
            return new SetStackPolicyRequest(this);
        } 

    } 

}
