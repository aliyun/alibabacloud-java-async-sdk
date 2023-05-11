// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataLevelPermissionStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataLevelPermissionStatusRequest</p>
 */
public class UpdateDataLevelPermissionStatusRequest extends Request {
    @Query
    @NameInMap("CubeId")
    @Validation(required = true)
    private String cubeId;

    @Query
    @NameInMap("IsOpen")
    @Validation(required = true, maximum = 10)
    private Integer isOpen;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private String ruleType;

    private UpdateDataLevelPermissionStatusRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.isOpen = builder.isOpen;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataLevelPermissionStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
    }

    /**
     * @return isOpen
     */
    public Integer getIsOpen() {
        return this.isOpen;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<UpdateDataLevelPermissionStatusRequest, Builder> {
        private String cubeId; 
        private Integer isOpen; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataLevelPermissionStatusRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.isOpen = request.isOpen;
            this.ruleType = request.ruleType;
        } 

        /**
         * The ID of the training dataset that you want to remove from the specified custom linguistic model.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * IsOpen.
         */
        public Builder isOpen(Integer isOpen) {
            this.putQueryParameter("IsOpen", isOpen);
            this.isOpen = isOpen;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public UpdateDataLevelPermissionStatusRequest build() {
            return new UpdateDataLevelPermissionStatusRequest(this);
        } 

    } 

}
