// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStoreByTemplateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStoreByTemplateVersionResponseBody</p>
 */
public class DescribeStoreByTemplateVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stores")
    private java.util.List < Stores> stores;

    @NameInMap("Success")
    private Boolean success;

    private DescribeStoreByTemplateVersionResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.stores = builder.stores;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStoreByTemplateVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stores
     */
    public java.util.List < Stores> getStores() {
        return this.stores;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private String message; 
        private String requestId; 
        private java.util.List < Stores> stores; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Stores.
         */
        public Builder stores(java.util.List < Stores> stores) {
            this.stores = stores;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeStoreByTemplateVersionResponseBody build() {
            return new DescribeStoreByTemplateVersionResponseBody(this);
        } 

    } 

    public static class Stores extends TeaModel {
        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Level")
        private String level;

        @NameInMap("ParentId")
        private String parentId;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("StoreId")
        private String storeId;

        @NameInMap("StoreName")
        private String storeName;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("TimeZone")
        private String timeZone;

        @NameInMap("UserStoreCode")
        private String userStoreCode;

        private Stores(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.level = builder.level;
            this.parentId = builder.parentId;
            this.phone = builder.phone;
            this.storeId = builder.storeId;
            this.storeName = builder.storeName;
            this.templateVersion = builder.templateVersion;
            this.timeZone = builder.timeZone;
            this.userStoreCode = builder.userStoreCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stores create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
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

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        /**
         * @return userStoreCode
         */
        public String getUserStoreCode() {
            return this.userStoreCode;
        }

        public static final class Builder {
            private String gmtModified; 
            private String level; 
            private String parentId; 
            private String phone; 
            private String storeId; 
            private String storeName; 
            private String templateVersion; 
            private String timeZone; 
            private String userStoreCode; 

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            /**
             * StoreName.
             */
            public Builder storeName(String storeName) {
                this.storeName = storeName;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            /**
             * UserStoreCode.
             */
            public Builder userStoreCode(String userStoreCode) {
                this.userStoreCode = userStoreCode;
                return this;
            }

            public Stores build() {
                return new Stores(this);
            } 

        } 

    }
}
