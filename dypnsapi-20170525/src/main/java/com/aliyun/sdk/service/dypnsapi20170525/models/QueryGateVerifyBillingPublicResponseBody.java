// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGateVerifyBillingPublicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGateVerifyBillingPublicResponseBody</p>
 */
public class QueryGateVerifyBillingPublicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>If OK is returned, the request is successful.</li>
         * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The billing information about each verification service.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8906582E-6722</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryGateVerifyBillingPublicResponseBody build() {
            return new QueryGateVerifyBillingPublicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGateVerifyBillingPublicResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGateVerifyBillingPublicResponseBody</p>
     */
    public static class SceneBillingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Add")
        private String add;

        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("SceneCode")
        private String sceneCode;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("SinglePrice")
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
             * <p>The billable items.</p>
             * 
             * <strong>example:</strong>
             * <p>74</p>
             */
            public Builder add(String add) {
                this.add = add;
                return this;
            }

            /**
             * <p>The fees generated for the verification service. Unitrogen: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>1.48</p>
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The verification method.</p>
             * 
             * <strong>example:</strong>
             * <p>Verification of local phone number</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>FC100000038194004</p>
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Communications</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The unit price. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>0.02</p>
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
    /**
     * 
     * {@link QueryGateVerifyBillingPublicResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGateVerifyBillingPublicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AmountSum")
        private String amountSum;

        @com.aliyun.core.annotation.NameInMap("SceneBillingList")
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
             * <p>The fees generated for all verification services. Unitrogen: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder amountSum(String amountSum) {
                this.amountSum = amountSum;
                return this;
            }

            /**
             * <p>The details of fees.</p>
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
