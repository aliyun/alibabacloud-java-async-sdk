// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddUserBusinessFormRequest} extends {@link RequestModel}
 *
 * <p>AddUserBusinessFormRequest</p>
 */
public class AddUserBusinessFormRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Company")
    @com.aliyun.core.annotation.Validation(required = true)
    private String company;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Position")
    @com.aliyun.core.annotation.Validation(required = true)
    private String position;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Website")
    private String website;

    private AddUserBusinessFormRequest(Builder builder) {
        super(builder);
        this.company = builder.company;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.position = builder.position;
        this.remark = builder.remark;
        this.userName = builder.userName;
        this.website = builder.website;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserBusinessFormRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return company
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return website
     */
    public String getWebsite() {
        return this.website;
    }

    public static final class Builder extends Request.Builder<AddUserBusinessFormRequest, Builder> {
        private String company; 
        private String email; 
        private String phoneNumber; 
        private String position; 
        private String remark; 
        private String userName; 
        private String website; 

        private Builder() {
            super();
        } 

        private Builder(AddUserBusinessFormRequest request) {
            super(request);
            this.company = request.company;
            this.email = request.email;
            this.phoneNumber = request.phoneNumber;
            this.position = request.position;
            this.remark = request.remark;
            this.userName = request.userName;
            this.website = request.website;
        } 

        /**
         * Company.
         */
        public Builder company(String company) {
            this.putQueryParameter("Company", company);
            this.company = company;
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
         * <p>记录名称</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>记录类型</p>
         */
        public Builder position(String position) {
            this.putQueryParameter("Position", position);
            this.position = position;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>业务场景</p>
         */
        public Builder website(String website) {
            this.putQueryParameter("Website", website);
            this.website = website;
            return this;
        }

        @Override
        public AddUserBusinessFormRequest build() {
            return new AddUserBusinessFormRequest(this);
        } 

    } 

}
