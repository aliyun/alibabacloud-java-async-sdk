// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionObjectModifyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionObjectModifyStatusResponseBody</p>
 */
public class DescribeSubscriptionObjectModifyStatusResponseBody extends TeaModel {
    @NameInMap("Detail")
    private Detail detail;

    @NameInMap("Percent")
    private String percent;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeSubscriptionObjectModifyStatusResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.percent = builder.percent;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionObjectModifyStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return detail
     */
    public Detail getDetail() {
        return this.detail;
    }

    /**
     * @return percent
     */
    public String getPercent() {
        return this.percent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Detail detail; 
        private String percent; 
        private String requestId; 
        private String status; 

        /**
         * Detail.
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Percent.
         */
        public Builder percent(String percent) {
            this.percent = percent;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeSubscriptionObjectModifyStatusResponseBody build() {
            return new DescribeSubscriptionObjectModifyStatusResponseBody(this);
        } 

    } 

    public static class CheckItem extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("RepairMethod")
        private String repairMethod;

        private CheckItem(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.errorMessage = builder.errorMessage;
            this.itemName = builder.itemName;
            this.repairMethod = builder.repairMethod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItem create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return repairMethod
         */
        public String getRepairMethod() {
            return this.repairMethod;
        }

        public static final class Builder {
            private String checkStatus; 
            private String errorMessage; 
            private String itemName; 
            private String repairMethod; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
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
             * ItemName.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * RepairMethod.
             */
            public Builder repairMethod(String repairMethod) {
                this.repairMethod = repairMethod;
                return this;
            }

            public CheckItem build() {
                return new CheckItem(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("CheckItem")
        private java.util.List < CheckItem> checkItem;

        private Detail(Builder builder) {
            this.checkItem = builder.checkItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return checkItem
         */
        public java.util.List < CheckItem> getCheckItem() {
            return this.checkItem;
        }

        public static final class Builder {
            private java.util.List < CheckItem> checkItem; 

            /**
             * CheckItem.
             */
            public Builder checkItem(java.util.List < CheckItem> checkItem) {
                this.checkItem = checkItem;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
}
