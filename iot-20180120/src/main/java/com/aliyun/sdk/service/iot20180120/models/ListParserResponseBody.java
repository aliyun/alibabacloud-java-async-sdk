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
 * {@link ListParserResponseBody} extends {@link TeaModel}
 *
 * <p>ListParserResponseBody</p>
 */
public class ListParserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListParserResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParserResponseBody create() {
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListParserResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListParserResponseBody build() {
            return new ListParserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListParserResponseBody} extends {@link TeaModel}
     *
     * <p>ListParserResponseBody</p>
     */
    public static class ParserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParserId")
        private Long parserId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UtcCreated")
        private String utcCreated;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        private ParserList(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.parserId = builder.parserId;
            this.status = builder.status;
            this.utcCreated = builder.utcCreated;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParserList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parserId
         */
        public Long getParserId() {
            return this.parserId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return utcCreated
         */
        public String getUtcCreated() {
            return this.utcCreated;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Long parserId; 
            private String status; 
            private String utcCreated; 
            private String utcModified; 

            private Builder() {
            } 

            private Builder(ParserList model) {
                this.description = model.description;
                this.name = model.name;
                this.parserId = model.parserId;
                this.status = model.status;
                this.utcCreated = model.utcCreated;
                this.utcModified = model.utcModified;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParserId.
             */
            public Builder parserId(Long parserId) {
                this.parserId = parserId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UtcCreated.
             */
            public Builder utcCreated(String utcCreated) {
                this.utcCreated = utcCreated;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public ParserList build() {
                return new ParserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListParserResponseBody} extends {@link TeaModel}
     *
     * <p>ListParserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParserList")
        private java.util.List<ParserList> parserList;

        private Data(Builder builder) {
            this.parserList = builder.parserList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return parserList
         */
        public java.util.List<ParserList> getParserList() {
            return this.parserList;
        }

        public static final class Builder {
            private java.util.List<ParserList> parserList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.parserList = model.parserList;
            } 

            /**
             * ParserList.
             */
            public Builder parserList(java.util.List<ParserList> parserList) {
                this.parserList = parserList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
