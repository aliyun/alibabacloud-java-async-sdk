// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetDeadLockHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeadLockHistoryResponseBody</p>
 */
public class GetDeadLockHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private String synchro;

    private GetDeadLockHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeadLockHistoryResponseBody create() {
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
    public String getData() {
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
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchro
     */
    public String getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private String success; 
        private String synchro; 

        private Builder() {
        } 

        private Builder(GetDeadLockHistoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned as a JSON string.</p>
         * <ul>
         * <li><p>total: The total number of deadlocks.</p>
         * </li>
         * <li><p>list: The list of deadlocks.</p>
         * <ul>
         * <li><p>accountId: The user ID.</p>
         * </li>
         * <li><p>textId: The text ID of the deadlock.</p>
         * </li>
         * <li><p>gmtModified: The time when the diagnostics were generated.</p>
         * </li>
         * <li><p>lockTime: The time when the deadlock occurred.</p>
         * </li>
         * <li><p>gmtCreate: The time when the diagnostics were created.</p>
         * </li>
         * <li><p>nodeId: The node ID.</p>
         * </li>
         * <li><p>uuid: The instance ID.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;total&quot;: 2,
         *     &quot;list&quot;: [
         *         {
         *             &quot;accountId&quot;: &quot;108************&quot;,
         *             &quot;textId&quot;: &quot;35303d12d52d29ba73bb85fa2d5b****&quot;,
         *             &quot;gmtModified&quot;: 1732712680000,
         *             &quot;lockTime&quot;: 1732687047000,
         *             &quot;gmtCreate&quot;: 1732712680000,
         *             &quot;nodeId&quot;: &quot;pi-8****************&quot;,
         *             &quot;uuid&quot;: &quot;pc-8v**************&quot;
         *         },
         *         {
         *             &quot;accountId&quot;: &quot;108************&quot;,
         *             &quot;textId&quot;: &quot;50a24bdcc5fe7e03f92a55ae7574****&quot;,
         *             &quot;gmtModified&quot;: 1732626448000,
         *             &quot;lockTime&quot;: 1722500305000,
         *             &quot;gmtCreate&quot;: 1732626448000,
         *             &quot;nodeId&quot;: &quot;pi-8****************&quot;,
         *             &quot;uuid&quot;: &quot;pc-8v**************&quot;
         *         }
         *     ]
         * }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder synchro(String synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetDeadLockHistoryResponseBody build() {
            return new GetDeadLockHistoryResponseBody(this);
        } 

    } 

}
