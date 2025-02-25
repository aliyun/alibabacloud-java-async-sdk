// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetUserPropertyValueRequest} extends {@link RequestModel}
 *
 * <p>SetUserPropertyValueRequest</p>
 */
public class SetUserPropertyValueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyValueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyValueId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The property ID. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to query the property ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>390</p>
         */
        public Builder propertyId(Long propertyId) {
            this.putBodyParameter("PropertyId", propertyId);
            this.propertyId = propertyId;
            return this;
        }

        /**
         * <p>The ID of the property value. You can call the <a href="~~ListProperty~~">ListProperty</a> operation to query the ID of the property value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>978</p>
         */
        public Builder propertyValueId(Long propertyValueId) {
            this.putBodyParameter("PropertyValueId", propertyValueId);
            this.propertyValueId = propertyValueId;
            return this;
        }

        /**
         * <p>The ID of the convenience user. You can call the <a href="~~DescribeUsers~~">DescribeUsers</a> operation to query the user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The username of the convenience user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
