// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAgentlessScanTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentlessScanTaskRequest</p>
 */
public class CreateAgentlessScanTaskRequest extends Request {
    @Query
    @NameInMap("AutoDeleteDays")
    private Integer autoDeleteDays;

    @Query
    @NameInMap("TargetType")
    private Integer targetType;

    @Query
    @NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private CreateAgentlessScanTaskRequest(Builder builder) {
        super(builder);
        this.autoDeleteDays = builder.autoDeleteDays;
        this.targetType = builder.targetType;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentlessScanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDeleteDays
     */
    public Integer getAutoDeleteDays() {
        return this.autoDeleteDays;
    }

    /**
     * @return targetType
     */
    public Integer getTargetType() {
        return this.targetType;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<CreateAgentlessScanTaskRequest, Builder> {
        private Integer autoDeleteDays; 
        private Integer targetType; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentlessScanTaskRequest request) {
            super(request);
            this.autoDeleteDays = request.autoDeleteDays;
            this.targetType = request.targetType;
            this.uuidList = request.uuidList;
        } 

        /**
         * AutoDeleteDays.
         */
        public Builder autoDeleteDays(Integer autoDeleteDays) {
            this.putQueryParameter("AutoDeleteDays", autoDeleteDays);
            this.autoDeleteDays = autoDeleteDays;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * UuidList.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public CreateAgentlessScanTaskRequest build() {
            return new CreateAgentlessScanTaskRequest(this);
        } 

    } 

}
