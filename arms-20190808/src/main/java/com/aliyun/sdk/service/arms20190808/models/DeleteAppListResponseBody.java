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
 * {@link DeleteAppListResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAppListResponseBody</p>
 */
public class DeleteAppListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteAppListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppListResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. 2XX indicates that the request was successful. 3XX indicates that the request was redirected. 4XX indicates that a request error occurred. 5XX indicates that a server error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{&quot;code&quot;:200,&quot;data&quot;:&quot;{\&quot;code\&quot;:200,\&quot;data\&quot;:true,\&quot;errorCode\ &quot;:\&quot;Deletion of application successful\&quot;,\&quot;Message\&quot;:\&quot;Deletion of application successful\&quot;,\&quot;Successful\&quot;:true,\ \&quot;traceId\&quot;:\&quot;0bc1667516940677164677396d0088\&quot;}&quot;,&quot;errorCode&quot;:&quot;Batch deletion of applications successful&quot;,&quot;message&quot;:&quot;Batch deletion of applications successful\ &quot;,&quot;Success&quot;:true,&quot;traceId&quot;:&quot;210f470416940677161213505e0e7a&quot;}&quot;</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the request parameters are invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;Deletion of application successful&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4B446DF2-3DDD-4B5B-8E3F-D5225120****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the specified applications are deleted. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The applications are deleted.</li>
         * <li><code>false</code>: The applications failed to be deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteAppListResponseBody build() {
            return new DeleteAppListResponseBody(this);
        } 

    } 

}
