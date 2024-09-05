// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskOrderRequest</p>
 */
public class CreateTaskOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerRealName")
    private String customerRealName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerUserId")
    private String customerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportantDescription")
    private String importantDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsImportant")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isImportant;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductTypeName")
    private String productTypeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTitle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskTitle;

    private CreateTaskOrderRequest(Builder builder) {
        super(builder);
        this.customerRealName = builder.customerRealName;
        this.customerUserId = builder.customerUserId;
        this.importantDescription = builder.importantDescription;
        this.isImportant = builder.isImportant;
        this.openGroupId = builder.openGroupId;
        this.productType = builder.productType;
        this.productTypeName = builder.productTypeName;
        this.taskTitle = builder.taskTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerRealName
     */
    public String getCustomerRealName() {
        return this.customerRealName;
    }

    /**
     * @return customerUserId
     */
    public String getCustomerUserId() {
        return this.customerUserId;
    }

    /**
     * @return importantDescription
     */
    public String getImportantDescription() {
        return this.importantDescription;
    }

    /**
     * @return isImportant
     */
    public String getIsImportant() {
        return this.isImportant;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return productTypeName
     */
    public String getProductTypeName() {
        return this.productTypeName;
    }

    /**
     * @return taskTitle
     */
    public String getTaskTitle() {
        return this.taskTitle;
    }

    public static final class Builder extends Request.Builder<CreateTaskOrderRequest, Builder> {
        private String customerRealName; 
        private String customerUserId; 
        private String importantDescription; 
        private String isImportant; 
        private String openGroupId; 
        private String productType; 
        private String productTypeName; 
        private String taskTitle; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskOrderRequest request) {
            super(request);
            this.customerRealName = request.customerRealName;
            this.customerUserId = request.customerUserId;
            this.importantDescription = request.importantDescription;
            this.isImportant = request.isImportant;
            this.openGroupId = request.openGroupId;
            this.productType = request.productType;
            this.productTypeName = request.productTypeName;
            this.taskTitle = request.taskTitle;
        } 

        /**
         * CustomerRealName.
         */
        public Builder customerRealName(String customerRealName) {
            this.putQueryParameter("CustomerRealName", customerRealName);
            this.customerRealName = customerRealName;
            return this;
        }

        /**
         * CustomerUserId.
         */
        public Builder customerUserId(String customerUserId) {
            this.putQueryParameter("CustomerUserId", customerUserId);
            this.customerUserId = customerUserId;
            return this;
        }

        /**
         * ImportantDescription.
         */
        public Builder importantDescription(String importantDescription) {
            this.putQueryParameter("ImportantDescription", importantDescription);
            this.importantDescription = importantDescription;
            return this;
        }

        /**
         * IsImportant.
         */
        public Builder isImportant(String isImportant) {
            this.putQueryParameter("IsImportant", isImportant);
            this.isImportant = isImportant;
            return this;
        }

        /**
         * OpenGroupId.
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * productType
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * ProductTypeName.
         */
        public Builder productTypeName(String productTypeName) {
            this.putQueryParameter("ProductTypeName", productTypeName);
            this.productTypeName = productTypeName;
            return this;
        }

        /**
         * taskTitle
         */
        public Builder taskTitle(String taskTitle) {
            this.putQueryParameter("TaskTitle", taskTitle);
            this.taskTitle = taskTitle;
            return this;
        }

        @Override
        public CreateTaskOrderRequest build() {
            return new CreateTaskOrderRequest(this);
        } 

    } 

}
