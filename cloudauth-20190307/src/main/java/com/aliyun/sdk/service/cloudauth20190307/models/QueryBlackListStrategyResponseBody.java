// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QueryBlackListStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBlackListStrategyResponseBody</p>
 */
public class QueryBlackListStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    private QueryBlackListStrategyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBlackListStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(QueryBlackListStrategyResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The return code. <strong>200</strong> indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FC3D6AC-9FED-4311-8DA7-C4BF47D9F260</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public QueryBlackListStrategyResponseBody build() {
            return new QueryBlackListStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBlackListStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBlackListStrategyResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizContent")
        private String bizContent;

        @com.aliyun.core.annotation.NameInMap("BizKey")
        private String bizKey;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private ResultObject(Builder builder) {
            this.bizContent = builder.bizContent;
            this.bizKey = builder.bizKey;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.productName = builder.productName;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizContent
         */
        public String getBizContent() {
            return this.bizContent;
        }

        /**
         * @return bizKey
         */
        public String getBizKey() {
            return this.bizKey;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String bizContent; 
            private String bizKey; 
            private Long gmtModified; 
            private Long id; 
            private String productName; 
            private String status; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizContent = model.bizContent;
                this.bizKey = model.bizKey;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.productName = model.productName;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * <p>The blacklist string. Multiple blacklist entries are separated by <strong>commas</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1,127.0.0.2</p>
             */
            public Builder bizContent(String bizContent) {
                this.bizContent = bizContent;
                return this;
            }

            /**
             * <p>The blacklist type. Valid values:</p>
             * <ul>
             * <li>mobile: phone number blacklist</li>
             * <li>ip: IP blacklist</li>
             * <li>identifyNum: ID card blacklist</li>
             * <li>bankCard: bank card blacklist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>identifyNum</p>
             */
            public Builder bizKey(String bizKey) {
                this.bizKey = bizKey;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1711533786000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>234822</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The product name. Valid values:</p>
             * <ul>
             * <li>id2meta: ID card two-factor verification.</li>
             * <li>mobile3Meta: Phone number factor verification.</li>
             * <li>bankcardMeta: Bank card factor verification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>id2meta</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li><strong>disabled</strong>: Disabled.</li>
             * <li><strong>normal</strong>: Enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12600512xxxxxxxx</p>
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
