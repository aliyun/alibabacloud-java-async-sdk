// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

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
 * {@link QueryQwenConferenceSgTicketSearchPopResponseBody} extends {@link TeaModel}
 *
 * <p>QueryQwenConferenceSgTicketSearchPopResponseBody</p>
 */
public class QueryQwenConferenceSgTicketSearchPopResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryQwenConferenceSgTicketSearchPopResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQwenConferenceSgTicketSearchPopResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryQwenConferenceSgTicketSearchPopResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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

        public QueryQwenConferenceSgTicketSearchPopResponseBody build() {
            return new QueryQwenConferenceSgTicketSearchPopResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryQwenConferenceSgTicketSearchPopResponseBody} extends {@link TeaModel}
     *
     * <p>QueryQwenConferenceSgTicketSearchPopResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("ExtFields")
        private String extFields;

        @com.aliyun.core.annotation.NameInMap("FirstName")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("SubmitId")
        private Long submitId;

        @com.aliyun.core.annotation.NameInMap("TicketToken")
        private String ticketToken;

        private Data(Builder builder) {
            this.companyName = builder.companyName;
            this.extFields = builder.extFields;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.submitId = builder.submitId;
            this.ticketToken = builder.ticketToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return extFields
         */
        public String getExtFields() {
            return this.extFields;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return submitId
         */
        public Long getSubmitId() {
            return this.submitId;
        }

        /**
         * @return ticketToken
         */
        public String getTicketToken() {
            return this.ticketToken;
        }

        public static final class Builder {
            private String companyName; 
            private String extFields; 
            private String firstName; 
            private String lastName; 
            private Long submitId; 
            private String ticketToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.companyName = model.companyName;
                this.extFields = model.extFields;
                this.firstName = model.firstName;
                this.lastName = model.lastName;
                this.submitId = model.submitId;
                this.ticketToken = model.ticketToken;
            } 

            /**
             * CompanyName.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * ExtFields.
             */
            public Builder extFields(String extFields) {
                this.extFields = extFields;
                return this;
            }

            /**
             * FirstName.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * LastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * SubmitId.
             */
            public Builder submitId(Long submitId) {
                this.submitId = submitId;
                return this;
            }

            /**
             * TicketToken.
             */
            public Builder ticketToken(String ticketToken) {
                this.ticketToken = ticketToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
