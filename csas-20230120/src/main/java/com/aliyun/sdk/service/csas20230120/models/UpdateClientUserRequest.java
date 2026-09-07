// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateClientUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateClientUserRequest</p>
 */
public class UpdateClientUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    private String departmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MobileNumber")
    private String mobileNumber;

    private UpdateClientUserRequest(Builder builder) {
        super(builder);
        this.departmentId = builder.departmentId;
        this.description = builder.description;
        this.email = builder.email;
        this.id = builder.id;
        this.mobileNumber = builder.mobileNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClientUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departmentId
     */
    public String getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return mobileNumber
     */
    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public static final class Builder extends Request.Builder<UpdateClientUserRequest, Builder> {
        private String departmentId; 
        private String description; 
        private String email; 
        private String id; 
        private String mobileNumber; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClientUserRequest request) {
            super(request);
            this.departmentId = request.departmentId;
            this.description = request.description;
            this.email = request.email;
            this.id = request.id;
            this.mobileNumber = request.mobileNumber;
        } 

        /**
         * <p>Department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10701</p>
         */
        public Builder departmentId(String departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * <p>User description.</p>
         * 
         * <strong>example:</strong>
         * <p>示例用户</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:johndoe@example.com">johndoe@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>User ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20644</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Mobile phone number without country code.</p>
         * 
         * <strong>example:</strong>
         * <p>13641966835</p>
         */
        public Builder mobileNumber(String mobileNumber) {
            this.putQueryParameter("MobileNumber", mobileNumber);
            this.mobileNumber = mobileNumber;
            return this;
        }

        @Override
        public UpdateClientUserRequest build() {
            return new UpdateClientUserRequest(this);
        } 

    } 

}
