// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    @NameInMap("OutputOption")
    private String outputOption;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowResourceProgress")
    private String showResourceProgress;

    @Query
    @NameInMap("StackId")
    private String stackId;


    private GetStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
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

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<Builder> {
        private String clientToken; 
        private String outputOption; 
        private String regionId; 
        private String showResourceProgress; 
        private String stackId; 

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>OutputOption.</p>
         */
        public Builder outputOption(String outputOption) {
            this.putQueryParameter("OutputOption", outputOption);
            this.outputOption = outputOption;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>ShowResourceProgress.</p>
         */
        public Builder showResourceProgress(String showResourceProgress) {
            this.putQueryParameter("ShowResourceProgress", showResourceProgress);
            this.showResourceProgress = showResourceProgress;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        public GetStackRequest build() {
            return new GetStackRequest(this);
        } 

    } 

}
