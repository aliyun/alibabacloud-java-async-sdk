// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateStoreRequest</p>
 */
public class UpdateStoreRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Groups")
    private String groups;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreName")
    private String storeName;

    private UpdateStoreRequest(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.comments = builder.comments;
        this.groups = builder.groups;
        this.outId = builder.outId;
        this.phone = builder.phone;
        this.storeId = builder.storeId;
        this.storeName = builder.storeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStoreRequest create() {
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
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return storeName
     */
    public String getStoreName() {
        return this.storeName;
    }

    public static final class Builder extends Request.Builder<UpdateStoreRequest, Builder> {
        private String brand; 
        private String comments; 
        private String groups; 
        private String outId; 
        private String phone; 
        private String storeId; 
        private String storeName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStoreRequest request) {
            super(request);
            this.brand = request.brand;
            this.comments = request.comments;
            this.groups = request.groups;
            this.outId = request.outId;
            this.phone = request.phone;
            this.storeId = request.storeId;
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
         * Phone.
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
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
        public UpdateStoreRequest build() {
            return new UpdateStoreRequest(this);
        } 

    } 

}
