// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetRumDataForPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetRumDataForPageResponseBody</p>
 */
public class GetRumDataForPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetRumDataForPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumDataForPageResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The responses code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>StartTime is mandatory for this action.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRumDataForPageResponseBody build() {
            return new GetRumDataForPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRumDataForPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetRumDataForPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authentication")
        private String authentication;

        @com.aliyun.core.annotation.NameInMap("Completion")
        private String completion;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<java.util.Map<String, ?>> items;

        @com.aliyun.core.annotation.NameInMap("Page")
        private String page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("Preference")
        private String preference;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private Data(Builder builder) {
            this.authentication = builder.authentication;
            this.completion = builder.completion;
            this.items = builder.items;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.preference = builder.preference;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authentication
         */
        public String getAuthentication() {
            return this.authentication;
        }

        /**
         * @return completion
         */
        public String getCompletion() {
            return this.completion;
        }

        /**
         * @return items
         */
        public java.util.List<java.util.Map<String, ?>> getItems() {
            return this.items;
        }

        /**
         * @return page
         */
        public String getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return preference
         */
        public String getPreference() {
            return this.preference;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String authentication; 
            private String completion; 
            private java.util.List<java.util.Map<String, ?>> items; 
            private String page; 
            private String pageSize; 
            private String preference; 
            private String total; 

            /**
             * <p>A reserved parameter. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder authentication(String authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * <p>Indicates whether the query ends. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder completion(String completion) {
                this.completion = completion;
                return this;
            }

            /**
             * <p>The queried data.</p>
             */
            public Builder items(java.util.List<java.util.Map<String, ?>> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(String page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>A reserved parameter. Ignore this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder preference(String preference) {
                this.preference = preference;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder total(String total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
