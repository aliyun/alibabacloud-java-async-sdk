// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryThingModelResponseBody} extends {@link TeaModel}
 *
 * <p>QueryThingModelResponseBody</p>
 */
public class QueryThingModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryThingModelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.productKey = builder.productKey;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryThingModelResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String productKey; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryThingModelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.productKey = model.productKey;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryThingModelResponseBody build() {
            return new QueryThingModelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryThingModelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryThingModelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThingModelJson")
        private String thingModelJson;

        private Data(Builder builder) {
            this.thingModelJson = builder.thingModelJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return thingModelJson
         */
        public String getThingModelJson() {
            return this.thingModelJson;
        }

        public static final class Builder {
            private String thingModelJson; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.thingModelJson = model.thingModelJson;
            } 

            /**
             * <p>The features of the TSL model. The TSL data format of the default module is different from the TSL data format of a custom module.</p>
             * <p>For more information about the data format of the ThingModelJson parameter, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
             */
            public Builder thingModelJson(String thingModelJson) {
                this.thingModelJson = thingModelJson;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
