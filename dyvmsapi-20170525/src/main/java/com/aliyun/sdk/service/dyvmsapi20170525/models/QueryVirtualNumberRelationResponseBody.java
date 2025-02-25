// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryVirtualNumberRelationResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVirtualNumberRelationResponseBody</p>
 */
public class QueryVirtualNumberRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryVirtualNumberRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVirtualNumberRelationResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String requestId; 

        /**
         * <p>The response code.</p>
         * <ul>
         * <li>The value 200 indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of associations between virtual numbers and real numbers. The following fields are returned:</p>
         * <ul>
         * <li><strong>relatedNum</strong>: the real number.</li>
         * <li><strong>createTime</strong>: the time when the number was activated.</li>
         * <li><strong>pageNo</strong>: the page number.</li>
         * <li><strong>pageSize</strong>: the number of entries per page.</li>
         * <li><strong>total</strong>: the total number of entries returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;data&quot;:[{&quot;relatedNum&quot;:&quot;1705559****&quot;,&quot;createTime&quot;:&quot;2021-03-26 12:34:08&quot;}],&quot;pageSize&quot;:20,&quot;total&quot;:1,&quot;pageNo&quot;:1}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FAD5988-B483-48A4-B251-6E8470A67371</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryVirtualNumberRelationResponseBody build() {
            return new QueryVirtualNumberRelationResponseBody(this);
        } 

    } 

}
