// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCustomCallTaggingRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomCallTaggingRequest</p>
 */
public class ModifyCustomCallTaggingRequest extends Request {
    @Query
    @NameInMap("CallTagNameList")
    private String callTagNameList;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Number")
    @Validation(required = true)
    private String number;

    private ModifyCustomCallTaggingRequest(Builder builder) {
        super(builder);
        this.callTagNameList = builder.callTagNameList;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomCallTaggingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callTagNameList
     */
    public String getCallTagNameList() {
        return this.callTagNameList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<ModifyCustomCallTaggingRequest, Builder> {
        private String callTagNameList; 
        private String description; 
        private String instanceId; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomCallTaggingRequest request) {
            super(request);
            this.callTagNameList = request.callTagNameList;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.number = request.number;
        } 

        /**
         * CallTagNameList.
         */
        public Builder callTagNameList(String callTagNameList) {
            this.putQueryParameter("CallTagNameList", callTagNameList);
            this.callTagNameList = callTagNameList;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public ModifyCustomCallTaggingRequest build() {
            return new ModifyCustomCallTaggingRequest(this);
        } 

    } 

}
