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
 * {@link ImportNumberV2Request} extends {@link RequestModel}
 *
 * <p>ImportNumberV2Request</p>
 */
public class ImportNumberV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Customers")
    private java.util.List<Customers> customers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FailReturn")
    private Long failReturn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private ImportNumberV2Request(Builder builder) {
        super(builder);
        this.customers = builder.customers;
        this.failReturn = builder.failReturn;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportNumberV2Request create() {
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
     * @return failReturn
     */
    public Long getFailReturn() {
        return this.failReturn;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
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

    public static final class Builder extends Request.Builder<ImportNumberV2Request, Builder> {
        private java.util.List<Customers> customers; 
        private Long failReturn; 
        private String outId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(ImportNumberV2Request request) {
            super(request);
            this.customers = request.customers;
            this.failReturn = request.failReturn;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.taskId = request.taskId;
        } 

        /**
         * Customers.
         */
        public Builder customers(java.util.List<Customers> customers) {
            String customersShrink = shrink(customers, "Customers", "json");
            this.putBodyParameter("Customers", customersShrink);
            this.customers = customers;
            return this;
        }

        /**
         * FailReturn.
         */
        public Builder failReturn(Long failReturn) {
            this.putBodyParameter("FailReturn", failReturn);
            this.failReturn = failReturn;
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
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ImportNumberV2Request build() {
            return new ImportNumberV2Request(this);
        } 

    } 

    /**
     * 
     * {@link ImportNumberV2Request} extends {@link TeaModel}
     *
     * <p>ImportNumberV2Request</p>
     */
    public static class Customers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientUrl")
        private String clientUrl;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberMD5")
        private String numberMD5;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Customers(Builder builder) {
            this.clientUrl = builder.clientUrl;
            this.number = builder.number;
            this.numberMD5 = builder.numberMD5;
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
         * @return clientUrl
         */
        public String getClientUrl() {
            return this.clientUrl;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return numberMD5
         */
        public String getNumberMD5() {
            return this.numberMD5;
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
            private String clientUrl; 
            private String number; 
            private String numberMD5; 
            private java.util.Map<String, ?> properties; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Customers model) {
                this.clientUrl = model.clientUrl;
                this.number = model.number;
                this.numberMD5 = model.numberMD5;
                this.properties = model.properties;
                this.tag = model.tag;
            } 

            /**
             * ClientUrl.
             */
            public Builder clientUrl(String clientUrl) {
                this.clientUrl = clientUrl;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * NumberMD5.
             */
            public Builder numberMD5(String numberMD5) {
                this.numberMD5 = numberMD5;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * Tag.
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
