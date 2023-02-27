// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPersonalNumbersToUserRequest} extends {@link RequestModel}
 *
 * <p>AddPersonalNumbersToUserRequest</p>
 */
public class AddPersonalNumbersToUserRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NumberList")
    @Validation(required = true)
    private String numberList;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private AddPersonalNumbersToUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPersonalNumbersToUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddPersonalNumbersToUserRequest, Builder> {
        private String instanceId; 
        private String numberList; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddPersonalNumbersToUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
            this.userId = request.userId;
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
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddPersonalNumbersToUserRequest build() {
            return new AddPersonalNumbersToUserRequest(this);
        } 

    } 

}
