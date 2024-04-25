// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClientUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateClientUserRequest</p>
 */
public class UpdateClientUserRequest extends Request {
    @Query
    @NameInMap("DepartmentId")
    private String departmentId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("MobileNumber")
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
         * DepartmentId.
         */
        public Builder departmentId(String departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
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
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MobileNumber.
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
