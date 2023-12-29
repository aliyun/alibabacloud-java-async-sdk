// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGateVerifyBillingPublicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGateVerifyBillingPublicResponseBody</p>
 */
public class QueryGateVerifyBillingPublicResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryGateVerifyBillingPublicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGateVerifyBillingPublicResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code. Valid values:
         * <p>
         * 
         * *   If OK is returned, the request is successful.
         * *   For more information about other error codes, see [API response codes](~~85198~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The billing information about each verification service.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryGateVerifyBillingPublicResponseBody build() {
            return new QueryGateVerifyBillingPublicResponseBody(this);
        } 

    } 

    public static class SceneBillingList extends TeaModel {
        @NameInMap("Add")
        private String add;

        @NameInMap("Amount")
        private String amount;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("SceneCode")
        private String sceneCode;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("SinglePrice")
        private String singlePrice;

        private SceneBillingList(Builder builder) {
            this.add = builder.add;
            this.amount = builder.amount;
            this.appName = builder.appName;
            this.itemName = builder.itemName;
            this.sceneCode = builder.sceneCode;
            this.sceneName = builder.sceneName;
            this.singlePrice = builder.singlePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneBillingList create() {
            return builder().build();
        }

        /**
         * @return add
         */
        public String getAdd() {
            return this.add;
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return sceneCode
         */
        public String getSceneCode() {
            return this.sceneCode;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return singlePrice
         */
        public String getSinglePrice() {
            return this.singlePrice;
        }

        public static final class Builder {
            private String add; 
            private String amount; 
            private String appName; 
            private String itemName; 
            private String sceneCode; 
            private String sceneName; 
            private String singlePrice; 

            /**
             * The billable items.
             */
            public Builder add(String add) {
                this.add = add;
                return this;
            }

            /**
             * The fees generated for the verification service. Unitrogen: CNY.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * The application name.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The verification method.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * The service code.
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * The service name.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * The unit price. Unit: CNY.
             */
            public Builder singlePrice(String singlePrice) {
                this.singlePrice = singlePrice;
                return this;
            }

            public SceneBillingList build() {
                return new SceneBillingList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AmountSum")
        private String amountSum;

        @NameInMap("SceneBillingList")
        private java.util.List < SceneBillingList> sceneBillingList;

        private Data(Builder builder) {
            this.amountSum = builder.amountSum;
            this.sceneBillingList = builder.sceneBillingList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return amountSum
         */
        public String getAmountSum() {
            return this.amountSum;
        }

        /**
         * @return sceneBillingList
         */
        public java.util.List < SceneBillingList> getSceneBillingList() {
            return this.sceneBillingList;
        }

        public static final class Builder {
            private String amountSum; 
            private java.util.List < SceneBillingList> sceneBillingList; 

            /**
             * The fees generated for all verification services. Unitrogen: CNY.
             */
            public Builder amountSum(String amountSum) {
                this.amountSum = amountSum;
                return this;
            }

            /**
             * The details of fees.
             */
            public Builder sceneBillingList(java.util.List < SceneBillingList> sceneBillingList) {
                this.sceneBillingList = sceneBillingList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
