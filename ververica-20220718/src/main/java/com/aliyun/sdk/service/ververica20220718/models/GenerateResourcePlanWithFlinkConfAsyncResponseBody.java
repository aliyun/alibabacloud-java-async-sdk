// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link GenerateResourcePlanWithFlinkConfAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateResourcePlanWithFlinkConfAsyncResponseBody</p>
 */
public class GenerateResourcePlanWithFlinkConfAsyncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GenerateResourcePlanWithFlinkConfAsyncResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateResourcePlanWithFlinkConfAsyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <ul>
         * <li>If the value of success was true, the asynchronous generation result was returned.</li>
         * <li>If the value of success was false, a null value was returned.</li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error code was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <ul>
         * <li>If the value of success was false, an error message was returned.</li>
         * <li>If the value of success was true, a null value was returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The value was fixed to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateResourcePlanWithFlinkConfAsyncResponseBody build() {
            return new GenerateResourcePlanWithFlinkConfAsyncResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateResourcePlanWithFlinkConfAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateResourcePlanWithFlinkConfAsyncResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ticketId")
        private String ticketId;

        private Data(Builder builder) {
            this.ticketId = builder.ticketId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        public static final class Builder {
            private String ticketId; 

            /**
             * <p>The ID of the ticket for you to query the asynchronous generation result.</p>
             * 
             * <strong>example:</strong>
             * <p>b3dcdb25-bf36-457d-92ba-a36077e8****</p>
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
