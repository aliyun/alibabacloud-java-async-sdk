// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link QueryAppTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAppTopologyResponseBody</p>
 */
public class QueryAppTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAppTopologyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppTopologyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Object getData() {
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
        private Long code; 
        private Object data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Data&quot;: {
         *     &quot;nodes&quot;: [
         *       {
         *         &quot;data&quot;: {
         *           &quot;duration&quot;: 0.2254335260115607,
         *           &quot;requests&quot;: 1211,
         *           &quot;type&quot;: &quot;MYSQL&quot;,
         *           &quot;errors&quot;: 0
         *         },
         *         &quot;id&quot;: &quot;ggxw4lnjuz@c0507xxxx##MYSQL&quot;,
         *         &quot;label&quot;: &quot;mysql-pod:3306(cart_db)&quot;
         *       }
         *     ],
         *     &quot;edges&quot;: [
         *       {
         *         &quot;data&quot;: {
         *           &quot;duration&quot;: 0.03333333333333333,
         *           &quot;requests&quot;: 600,
         *           &quot;type&quot;: &quot;UNKNOWN&quot;,
         *           &quot;errors&quot;: 0
         *         },
         *         &quot;id&quot;: &quot;1974097372&quot;,
         *         &quot;source&quot;: &quot;ggxw4lnjuz@456xxxxx&quot;,
         *         &quot;target&quot;: &quot;ggxw4lnjuz@c0507xxxx&quot;
         *       }
         *     ]
         *   }</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Internal error. Please try again. Contact the DingTalk service account if the issue                              persists after multiple retries.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>78901766-3806-4E96-8E47-CFEF59E4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAppTopologyResponseBody build() {
            return new QueryAppTopologyResponseBody(this);
        } 

    } 

}
