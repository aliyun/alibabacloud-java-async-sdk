// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CreateApiDestinationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiDestinationResponseBody</p>
 */
public class CreateApiDestinationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Date")
    private Date date;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApiDestinationResponseBody(Builder builder) {
        this.code = builder.code;
        this.date = builder.date;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiDestinationResponseBody create() {
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
     * @return date
     */
    public Date getDate() {
        return this.date;
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
        private Date date; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateApiDestinationResponseBody model) {
            this.code = model.code;
            this.date = model.date;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned response code. The value Success indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned if the API destination is created.</p>
         */
        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5DAF96FB-A4B6-548C-B999-0BFDCB2261B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApiDestinationResponseBody build() {
            return new CreateApiDestinationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateApiDestinationResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApiDestinationResponseBody</p>
     */
    public static class Date extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiDestinationName")
        private String apiDestinationName;

        private Date(Builder builder) {
            this.apiDestinationName = builder.apiDestinationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Date create() {
            return builder().build();
        }

        /**
         * @return apiDestinationName
         */
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

        public static final class Builder {
            private String apiDestinationName; 

            private Builder() {
            } 

            private Builder(Date model) {
                this.apiDestinationName = model.apiDestinationName;
            } 

            /**
             * <p>The name of the API destination.</p>
             * 
             * <strong>example:</strong>
             * <p>ApiDestinationName</p>
             */
            public Builder apiDestinationName(String apiDestinationName) {
                this.apiDestinationName = apiDestinationName;
                return this;
            }

            public Date build() {
                return new Date(this);
            } 

        } 

    }
}
