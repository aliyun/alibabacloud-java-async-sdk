// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRumDataForPageResponseBody build() {
            return new GetRumDataForPageResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authentication")
        private String authentication;

        @com.aliyun.core.annotation.NameInMap("Completion")
        private String completion;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List < java.util.Map<String, ?>> items;

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
        public java.util.List < java.util.Map<String, ?>> getItems() {
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
            private java.util.List < java.util.Map<String, ?>> items; 
            private String page; 
            private String pageSize; 
            private String preference; 
            private String total; 

            /**
             * Authentication.
             */
            public Builder authentication(String authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * Completion.
             */
            public Builder completion(String completion) {
                this.completion = completion;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.List < java.util.Map<String, ?>> items) {
                this.items = items;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(String page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Preference.
             */
            public Builder preference(String preference) {
                this.preference = preference;
                return this;
            }

            /**
             * Total.
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
