// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskOrderRequest</p>
 */
public class CreateTaskOrderRequest extends Request {
    @Query
    @NameInMap("CustomerRealName")
    private String customerRealName;

    @Query
    @NameInMap("CustomerUserId")
    private String customerUserId;

    @Query
    @NameInMap("ImportantDescription")
    private String importantDescription;

    @Query
    @NameInMap("IsImportant")
    @Validation(required = true)
    private String isImportant;

    @Query
    @NameInMap("OpenGroupId")
    @Validation(required = true)
    private String openGroupId;

    @Query
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Query
    @NameInMap("ProductTypeName")
    private String productTypeName;

    @Query
    @NameInMap("TaskTitle")
    @Validation(required = true)
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

        private Builder(CreateTaskOrderRequest response) {
            super(response);
            this.customerRealName = response.customerRealName;
            this.customerUserId = response.customerUserId;
            this.importantDescription = response.importantDescription;
            this.isImportant = response.isImportant;
            this.openGroupId = response.openGroupId;
            this.productType = response.productType;
            this.productTypeName = response.productTypeName;
            this.taskTitle = response.taskTitle;
        } 

        /**
         * 建单人姓名：快手客户
         */
        public Builder customerRealName(String customerRealName) {
            this.putQueryParameter("CustomerRealName", customerRealName);
            this.customerRealName = customerRealName;
            return this;
        }

        /**
         * 建单人：固定值
         */
        public Builder customerUserId(String customerUserId) {
            this.putQueryParameter("CustomerUserId", customerUserId);
            this.customerUserId = customerUserId;
            return this;
        }

        /**
         * 重要性描述
         */
        public Builder importantDescription(String importantDescription) {
            this.putQueryParameter("ImportantDescription", importantDescription);
            this.importantDescription = importantDescription;
            return this;
        }

        /**
         * 是否紧急
         */
        public Builder isImportant(String isImportant) {
            this.putQueryParameter("IsImportant", isImportant);
            this.isImportant = isImportant;
            return this;
        }

        /**
         * 主群关联Id
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
         * 问题分类名称
         */
        public Builder productTypeName(String productTypeName) {
            this.putQueryParameter("ProductTypeName", productTypeName);
            this.productTypeName = productTypeName;
            return this;
        }

        /**
         * 任务单标题
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
