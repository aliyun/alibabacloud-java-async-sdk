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
 * {@link GetAppApiByPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppApiByPageResponseBody</p>
 */
public class GetAppApiByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAppApiByPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppApiByPageResponseBody create() {
        return builder().build();
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned for the request. Valid values:</p>
         * <ul>
         * <li>2XX: The request was successful.</li>
         * <li>3XX: A redirection message was returned.</li>
         * <li>4XX: The request was invalid.</li>
         * <li>5XX: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The struct returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B6A00968-82A8-4F14-9D1B-B53827DB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The call was successful.</li>
         * <li><code>false</code>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAppApiByPageResponseBody build() {
            return new GetAppApiByPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppApiByPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppApiByPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private Boolean completed;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<java.util.Map<String, ?>> items;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private String total;

        private Data(Builder builder) {
            this.completed = builder.completed;
            this.items = builder.items;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completed
         */
        public Boolean getCompleted() {
            return this.completed;
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
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public String getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Boolean completed; 
            private java.util.List<java.util.Map<String, ?>> items; 
            private Integer page; 
            private Integer pageSize; 
            private String total; 

            /**
             * <p>Is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder completed(Boolean completed) {
                this.completed = completed;
                return this;
            }

            /**
             * <p>The data entries.</p>
             */
            public Builder items(java.util.List<java.util.Map<String, ?>> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
