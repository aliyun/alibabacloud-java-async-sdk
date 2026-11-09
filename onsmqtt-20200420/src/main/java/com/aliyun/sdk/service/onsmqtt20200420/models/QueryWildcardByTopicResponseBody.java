// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link QueryWildcardByTopicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWildcardByTopicResponseBody</p>
 */
public class QueryWildcardByTopicResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryWildcardByTopicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWildcardByTopicResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryWildcardByTopicResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The dataset of parent topic information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8CC04203-679B-4DED-89D9-E7C2E979****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryWildcardByTopicResponseBody build() {
            return new QueryWildcardByTopicResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWildcardByTopicResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWildcardByTopicResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Limit")
        private String limit;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        @com.aliyun.core.annotation.NameInMap("WildcardList")
        private java.util.List<String> wildcardList;

        private Data(Builder builder) {
            this.limit = builder.limit;
            this.total = builder.total;
            this.wildcardList = builder.wildcardList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public String getLimit() {
            return this.limit;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        /**
         * @return wildcardList
         */
        public java.util.List<String> getWildcardList() {
            return this.wildcardList;
        }

        public static final class Builder {
            private String limit; 
            private String total; 
            private java.util.List<String> wildcardList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.limit = model.limit;
                this.total = model.total;
                this.wildcardList = model.wildcardList;
            } 

            /**
             * <p>The maximum number of results returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder limit(String limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The total number of query results.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The wildcard list.</p>
             */
            public Builder wildcardList(java.util.List<String> wildcardList) {
                this.wildcardList = wildcardList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
