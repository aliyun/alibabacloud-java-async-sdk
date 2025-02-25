// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCallDetailByCallIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallDetailByCallIdResponseBody</p>
 */
public class QueryCallDetailByCallIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryCallDetailByCallIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallDetailByCallIdResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the call, in the JSON format.</p>
         * <ul>
         * <li><strong>caller</strong>: the calling number.</li>
         * <li><strong>startDate</strong>: the time when the call was started.</li>
         * <li><strong>stateDesc</strong>: the description of the call state.</li>
         * <li><strong>duration</strong>: the call duration. Unit: seconds. The value <strong>0</strong> indicates that the user was not connected.</li>
         * <li><strong>callerShowNumber</strong>: the calling number displayed to the called party.</li>
         * <li><strong>gmtCreate</strong>: the time when the call request was received.</li>
         * <li><strong>state</strong>: the call state. The call state is returned by the Internet service provider (ISP) in real time. For more information about call states, see <a href="https://help.aliyun.com/document_detail/55085.html">ISP-returned error codes</a>.</li>
         * <li><strong>endDate</strong>: the time when the call was ended.</li>
         * <li><strong>calleeShowNumber</strong>: the number displayed to the called party.</li>
         * <li><strong>callee</strong>: the called number.</li>
         * <li><strong>aRingTime</strong>: the time when Line A started to ring, in the yyyy-MM-dd HH:mm:ss format.</li>
         * <li><strong>aEndTime</strong>: the time when ringing on Line A ended, in the yyyy-MM-dd HH:mm:ss format.</li>
         * <li><strong>bRingTime</strong>: the time when Line B started to ring, in the yyyy-MM-dd HH:mm:ss format.</li>
         * <li><strong>bEndTime</strong>: the time when ringing on Line B ended, in the yyyy-MM-dd HH:mm:ss format.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;caller&quot;:&quot;18767****&quot;,&quot;startDate&quot;:&quot;&quot;,&quot;stateDesc&quot;:&quot;502&quot;,&quot;duration&quot;:0,&quot;callerShowNumber&quot;:&quot;05344****&quot;,&quot;gmtCreate&quot;:&quot;2017-11-27 20:09:06&quot;,&quot;state&quot;:&quot;502&quot;,&quot;endDate&quot;:&quot;&quot;,&quot;calleeShowNumber&quot;:&quot;053447****&quot;,&quot;bRingTime&quot;:&quot;2022-01-01 12:02:00&quot;，&quot;bEndTime&quot;:&quot;2022-01-01 12:02:28&quot;，&quot;callee&quot;:&quot;1373546****&quot;}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCallDetailByCallIdResponseBody build() {
            return new QueryCallDetailByCallIdResponseBody(this);
        } 

    } 

}
