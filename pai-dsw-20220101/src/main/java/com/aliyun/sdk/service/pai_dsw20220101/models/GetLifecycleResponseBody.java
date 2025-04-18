// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetLifecycleResponseBody} extends {@link TeaModel}
 *
 * <p>GetLifecycleResponseBody</p>
 */
public class GetLifecycleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Lifecycle")
    private java.util.List<java.util.List<Lifecycle>> lifecycle;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetLifecycleResponseBody(Builder builder) {
        this.code = builder.code;
        this.lifecycle = builder.lifecycle;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLifecycleResponseBody create() {
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
     * @return lifecycle
     */
    public java.util.List<java.util.List<Lifecycle>> getLifecycle() {
        return this.lifecycle;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<java.util.List<Lifecycle>> lifecycle; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetLifecycleResponseBody model) {
            this.code = model.code;
            this.lifecycle = model.lifecycle;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The status code. Valid values:</p>
         * <ul>
         * <li>InternalError: All errors, except for parameter validation errors, are internal errors.</li>
         * <li>ValidationError: A parameter validation error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The lifecycle details.</p>
         * 
         * <strong>example:</strong>
         * <p>[[{&quot;Status&quot;:&quot;Creating&quot;,&quot;GmtCreateTime&quot;:&quot;2022-09-19T22:38:00Z&quot;,&quot;Reason&quot;:&quot;&quot;,&quot;ReasonCode&quot;:&quot;&quot;}]]</p>
         */
        public Builder lifecycle(java.util.List<java.util.List<Lifecycle>> lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;XXX&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of queried sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetLifecycleResponseBody build() {
            return new GetLifecycleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLifecycleResponseBody} extends {@link TeaModel}
     *
     * <p>GetLifecycleResponseBody</p>
     */
    public static class Lifecycle extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ReasonCode")
        private String reasonCode;

        @com.aliyun.core.annotation.NameInMap("ReasonMessage")
        private String reasonMessage;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        private Lifecycle(Builder builder) {
            this.status = builder.status;
            this.reasonCode = builder.reasonCode;
            this.reasonMessage = builder.reasonMessage;
            this.gmtCreateTime = builder.gmtCreateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Lifecycle create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return reasonCode
         */
        public String getReasonCode() {
            return this.reasonCode;
        }

        /**
         * @return reasonMessage
         */
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public static final class Builder {
            private String status; 
            private String reasonCode; 
            private String reasonMessage; 
            private String gmtCreateTime; 

            private Builder() {
            } 

            private Builder(Lifecycle model) {
                this.status = model.status;
                this.reasonCode = model.reasonCode;
                this.reasonMessage = model.reasonMessage;
                this.gmtCreateTime = model.gmtCreateTime;
            } 

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>Creating</li>
             * <li>SaveFailed: The instance image failed to be saved.</li>
             * <li>Stopped</li>
             * <li>Failed</li>
             * <li>ResourceAllocating</li>
             * <li>Stopping</li>
             * <li>Updating</li>
             * <li>Saving</li>
             * <li>Starting</li>
             * <li>Running</li>
             * <li>Saved</li>
             * <li>EnvPreparing: Preparing environment.</li>
             * <li>ArrearStopping: The service is being stopped due to overdue payments.</li>
             * <li>Arrearge: The service is stopped due to overdue payments.</li>
             * <li>Queuing</li>
             * <li>Recovering</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Starting</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason code that corresponds to an event.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder reasonCode(String reasonCode) {
                this.reasonCode = reasonCode;
                return this;
            }

            /**
             * <p>The reason message that corresponds to an event.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder reasonMessage(String reasonMessage) {
                this.reasonMessage = reasonMessage;
                return this;
            }

            /**
             * <p>The time the status was created, specifically the time the instance transitioned to this status (in GMT).</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-21T07:27:44Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            public Lifecycle build() {
                return new Lifecycle(this);
            } 

        } 

    }
}
