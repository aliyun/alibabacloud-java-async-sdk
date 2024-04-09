// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserPropertyValueRequest} extends {@link RequestModel}
 *
 * <p>SetUserPropertyValueRequest</p>
 */
public class SetUserPropertyValueRequest extends Request {
    @Body
    @NameInMap("PropertyId")
    @Validation(required = true)
    private Long propertyId;

    @Body
    @NameInMap("PropertyValueId")
    @Validation(required = true)
    private Long propertyValueId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private Long userId;

    @Body
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private SetUserPropertyValueRequest(Builder builder) {
        super(builder);
        this.propertyId = builder.propertyId;
        this.propertyValueId = builder.propertyValueId;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserPropertyValueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return propertyId
     */
    public Long getPropertyId() {
        return this.propertyId;
    }

    /**
     * @return propertyValueId
     */
    public Long getPropertyValueId() {
        return this.propertyValueId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<SetUserPropertyValueRequest, Builder> {
        private Long propertyId; 
        private Long propertyValueId; 
        private Long userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(SetUserPropertyValueRequest request) {
            super(request);
            this.propertyId = request.propertyId;
            this.propertyValueId = request.propertyValueId;
            this.userId = request.userId;
            this.userName = request.userName;
        } 

        /**
         * The property ID. You can call the [ListProperty](~~ListProperty~~) operation to query the property ID.
         */
        public Builder propertyId(Long propertyId) {
            this.putBodyParameter("PropertyId", propertyId);
            this.propertyId = propertyId;
            return this;
        }

        /**
         * The ID of the property value. You can call the [ListProperty](~~ListProperty~~) operation to query the ID of the property value.
         */
        public Builder propertyValueId(Long propertyValueId) {
            this.putBodyParameter("PropertyValueId", propertyValueId);
            this.propertyValueId = propertyValueId;
            return this;
        }

        /**
         * The ID of the convenience user. You can call the [DescribeUsers](~~DescribeUsers~~) operation to query the user ID.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The username of the convenience user.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public SetUserPropertyValueRequest build() {
            return new SetUserPropertyValueRequest(this);
        } 

    } 

}
