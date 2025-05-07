// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetRulesCountListResponseBody} extends {@link TeaModel}
 *
 * <p>GetRulesCountListResponseBody</p>
 */
public class GetRulesCountListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private Integer businessType;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private Messages messages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetRulesCountListResponseBody(Builder builder) {
        this.businessType = builder.businessType;
        this.code = builder.code;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.messages = builder.messages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRulesCountListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public Integer getBusinessType() {
        return this.businessType;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return messages
     */
    public Messages getMessages() {
        return this.messages;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer businessType; 
        private String code; 
        private Integer count; 
        private Integer currentPage; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private Messages messages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetRulesCountListResponseBody model) {
            this.businessType = model.businessType;
            this.code = model.code;
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.messages = model.messages;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(Integer businessType) {
            this.businessType = businessType;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(Messages messages) {
            this.messages = messages;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetRulesCountListResponseBody build() {
            return new GetRulesCountListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRulesCountListResponseBody} extends {@link TeaModel}
     *
     * <p>GetRulesCountListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<String> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<String> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<String> data; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRulesCountListResponseBody} extends {@link TeaModel}
     *
     * <p>GetRulesCountListResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private java.util.List<String> message;

        private Messages(Builder builder) {
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public java.util.List<String> getMessage() {
            return this.message;
        }

        public static final class Builder {
            private java.util.List<String> message; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.message = model.message;
            } 

            /**
             * Message.
             */
            public Builder message(java.util.List<String> message) {
                this.message = message;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
