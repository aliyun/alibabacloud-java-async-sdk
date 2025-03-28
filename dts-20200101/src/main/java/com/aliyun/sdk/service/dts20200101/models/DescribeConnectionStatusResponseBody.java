// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeConnectionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConnectionStatusResponseBody</p>
 */
public class DescribeConnectionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DestinationConnectionStatus")
    private java.util.Map<String, ?> destinationConnectionStatus;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceConnectionStatus")
    private java.util.Map<String, ?> sourceConnectionStatus;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeConnectionStatusResponseBody(Builder builder) {
        this.destinationConnectionStatus = builder.destinationConnectionStatus;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.sourceConnectionStatus = builder.sourceConnectionStatus;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConnectionStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationConnectionStatus
     */
    public java.util.Map<String, ?> getDestinationConnectionStatus() {
        return this.destinationConnectionStatus;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceConnectionStatus
     */
    public java.util.Map<String, ?> getSourceConnectionStatus() {
        return this.sourceConnectionStatus;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.Map<String, ?> destinationConnectionStatus; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private java.util.Map<String, ?> sourceConnectionStatus; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeConnectionStatusResponseBody model) {
            this.destinationConnectionStatus = model.destinationConnectionStatus;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.sourceConnectionStatus = model.sourceConnectionStatus;
            this.success = model.success;
        } 

        /**
         * <p>The connectivity of DTS servers to the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;connectDetail&quot;: [       {         &quot;testName&quot;: &quot;PolarDB_o JDBC Connect&quot;,         &quot;testSuccess&quot;: true       },       {         &quot;testName&quot;: &quot;Ping &quot;,         &quot;testSuccess&quot;: true       },       {         &quot;testName&quot;: &quot;Telnet &quot;,         &quot;testSuccess&quot;: true       }     ],     &quot;connectRes&quot;: true,     &quot;connectAdvice&quot;: &quot;&quot;   }</p>
         */
        public Builder destinationConnectionStatus(java.util.Map<String, ?> destinationConnectionStatus) {
            this.destinationConnectionStatus = destinationConnectionStatus;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0A47C784-70EF-4111-8677-369CAA00****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The connectivity of DTS servers to the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;connectDetail&quot;: [       {         &quot;testName&quot;: &quot;Oracle JDBC Connect&quot;,         &quot;testSuccess&quot;: true       },       {         &quot;testName&quot;: &quot;Ping &quot;,         &quot;testSuccess&quot;: false       },       {         &quot;testName&quot;: &quot;Telnet &quot;,         &quot;testSuccess&quot;: true       }     ],     &quot;connectRes&quot;: true,     &quot;connectAdvice&quot;: &quot;&quot;   }</p>
         */
        public Builder sourceConnectionStatus(java.util.Map<String, ?> sourceConnectionStatus) {
            this.sourceConnectionStatus = sourceConnectionStatus;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeConnectionStatusResponseBody build() {
            return new DescribeConnectionStatusResponseBody(this);
        } 

    } 

}
