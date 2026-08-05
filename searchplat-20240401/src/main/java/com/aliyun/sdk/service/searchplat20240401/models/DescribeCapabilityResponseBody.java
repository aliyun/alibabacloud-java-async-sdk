// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link DescribeCapabilityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapabilityResponseBody</p>
 */
public class DescribeCapabilityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Long httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DescribeCapabilityResponseBody(Builder builder) {
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapabilityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long httpCode; 
        private String requestId; 
        private Result result; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeCapabilityResponseBody model) {
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
        } 

        /**
         * httpCode.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeCapabilityResponseBody build() {
            return new DescribeCapabilityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCapabilityResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCapabilityResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("itemCategory")
        private String itemCategory;

        @com.aliyun.core.annotation.NameInMap("itemDesc")
        private String itemDesc;

        @com.aliyun.core.annotation.NameInMap("itemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("itemValue")
        private java.util.Map<String, ?> itemValue;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Long updated;

        private Result(Builder builder) {
            this.created = builder.created;
            this.isDefault = builder.isDefault;
            this.itemCategory = builder.itemCategory;
            this.itemDesc = builder.itemDesc;
            this.itemName = builder.itemName;
            this.itemValue = builder.itemValue;
            this.status = builder.status;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return itemCategory
         */
        public String getItemCategory() {
            return this.itemCategory;
        }

        /**
         * @return itemDesc
         */
        public String getItemDesc() {
            return this.itemDesc;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return itemValue
         */
        public java.util.Map<String, ?> getItemValue() {
            return this.itemValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updated
         */
        public Long getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Long created; 
            private Boolean isDefault; 
            private String itemCategory; 
            private String itemDesc; 
            private String itemName; 
            private java.util.Map<String, ?> itemValue; 
            private String status; 
            private Long updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.created = model.created;
                this.isDefault = model.isDefault;
                this.itemCategory = model.itemCategory;
                this.itemDesc = model.itemDesc;
                this.itemName = model.itemName;
                this.itemValue = model.itemValue;
                this.status = model.status;
                this.updated = model.updated;
            } 

            /**
             * created.
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * isDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * itemCategory.
             */
            public Builder itemCategory(String itemCategory) {
                this.itemCategory = itemCategory;
                return this;
            }

            /**
             * itemDesc.
             */
            public Builder itemDesc(String itemDesc) {
                this.itemDesc = itemDesc;
                return this;
            }

            /**
             * itemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * itemValue.
             */
            public Builder itemValue(java.util.Map<String, ?> itemValue) {
                this.itemValue = itemValue;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Long updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
