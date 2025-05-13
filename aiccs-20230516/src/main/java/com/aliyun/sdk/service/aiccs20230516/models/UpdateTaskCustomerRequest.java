// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20230516.models;

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
 * {@link UpdateTaskCustomerRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskCustomerRequest</p>
 */
public class UpdateTaskCustomerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Customers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Customers> customers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private UpdateTaskCustomerRequest(Builder builder) {
        super(builder);
        this.customers = builder.customers;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskCustomerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customers
     */
    public java.util.List<Customers> getCustomers() {
        return this.customers;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateTaskCustomerRequest, Builder> {
        private java.util.List<Customers> customers; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskCustomerRequest request) {
            super(request);
            this.customers = request.customers;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>外呼客户</p>
         * <p>This parameter is required.</p>
         */
        public Builder customers(java.util.List<Customers> customers) {
            String customersShrink = shrink(customers, "Customers", "json");
            this.putQueryParameter("Customers", customersShrink);
            this.customers = customers;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>任务ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateTaskCustomerRequest build() {
            return new UpdateTaskCustomerRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTaskCustomerRequest} extends {@link TeaModel}
     *
     * <p>UpdateTaskCustomerRequest</p>
     */
    public static class Customers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cancel")
        private Long cancel;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Customers(Builder builder) {
            this.cancel = builder.cancel;
            this.number = builder.number;
            this.properties = builder.properties;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Customers create() {
            return builder().build();
        }

        /**
         * @return cancel
         */
        public Long getCancel() {
            return this.cancel;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Long cancel; 
            private String number; 
            private java.util.Map<String, ?> properties; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Customers model) {
                this.cancel = model.cancel;
                this.number = model.number;
                this.properties = model.properties;
                this.tag = model.tag;
            } 

            /**
             * <p>是否取消外呼 0否，1是</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cancel(Long cancel) {
                this.cancel = cancel;
                return this;
            }

            /**
             * <p>电话号码</p>
             * 
             * <strong>example:</strong>
             * <p>13661109390</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>需根据具体任务参数要求传输</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test&quot;:&quot;234&quot;}</p>
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>用户自定义标签</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Customers build() {
                return new Customers(this);
            } 

        } 

    }
}
