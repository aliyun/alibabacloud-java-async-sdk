// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateStoreRequest</p>
 */
public class CreateStoreRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String companyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Groups")
    private String groups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentId")
    private String parentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeName;

    private CreateStoreRequest(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.comments = builder.comments;
        this.companyId = builder.companyId;
        this.groups = builder.groups;
        this.outId = builder.outId;
        this.parentId = builder.parentId;
        this.phone = builder.phone;
        this.storeName = builder.storeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return companyId
     */
    public String getCompanyId() {
        return this.companyId;
    }

    /**
     * @return groups
     */
    public String getGroups() {
        return this.groups;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    public static final class Builder extends Request.Builder<CreateStoreRequest, Builder> {
        private String brand; 
        private String comments; 
        private String companyId; 
        private String groups; 
        private String outId; 
        private String parentId; 
        private String phone; 
        private String storeName; 

        private Builder() {
            super();
        } 

        private Builder(CreateStoreRequest request) {
            super(request);
            this.brand = request.brand;
            this.comments = request.comments;
            this.companyId = request.companyId;
            this.groups = request.groups;
            this.outId = request.outId;
            this.parentId = request.parentId;
            this.phone = request.phone;
            this.storeName = request.storeName;
        } 

        /**
         * Brand.
         */
        public Builder brand(String brand) {
            this.putBodyParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * Comments.
         */
        public Builder comments(String comments) {
            this.putBodyParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * CompanyId.
         */
        public Builder companyId(String companyId) {
            this.putBodyParameter("CompanyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * Groups.
         */
        public Builder groups(String groups) {
            this.putBodyParameter("Groups", groups);
            this.groups = groups;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putBodyParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putBodyParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * StoreName.
         */
        public Builder storeName(String storeName) {
            this.putBodyParameter("StoreName", storeName);
            this.storeName = storeName;
            return this;
        }

        @Override
        public CreateStoreRequest build() {
            return new CreateStoreRequest(this);
        } 

    } 

}
