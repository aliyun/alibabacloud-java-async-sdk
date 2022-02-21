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

        private Builder(DetectStackGroupDriftRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.operationPreferences = response.operationPreferences;
            this.regionId = response.regionId;
            this.stackGroupName = response.stackGroupName;
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
         * OperationPreferences.
         */
        public Builder operationPreferences(java.util.Map < String, ? > operationPreferences) {
            this.putQueryParameter("OperationPreferences", operationPreferences);
            this.operationPreferences = operationPreferences;
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
         * StackGroupName.
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
