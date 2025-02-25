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
 * {@link GetAutonomousNotifyEventContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutonomousNotifyEventContentResponseBody</p>
 */
public class GetAutonomousNotifyEventContentResponseBody extends TeaModel {
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

    private GetAutonomousNotifyEventContentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutonomousNotifyEventContentResponseBody create() {
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the notification events.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;taskId&quot;:&quot;7e1ba595-0889-48ff-a6ff-010f54991d****&quot;,&quot;taskType&quot;:&quot;SQL_OPTIMIZE&quot;,&quot;advisorId&quot;:&quot;636dc5f34664dd56ff0****&quot;,&quot;sqlId&quot;:&quot;e2b1d6c1ee1bb29555a828b59f16****&quot;,&quot;indexAdviceCount&quot;:1,&quot;indexAdvices&quot;:[{&quot;schemaName&quot;:&quot;das&quot;,&quot;tableName&quot;:&quot;students&quot;,&quot;indexName&quot;:&quot;idx_name&quot;,&quot;columns&quot;:[&quot;name&quot;],&quot;unique&quot;:false,&quot;ddlAddIndex&quot;:&quot;ALTER TABLE <code>das</code>.<code>students</code> ADD INDEX <code>idx_name</code> (<code>name</code>)&quot;,&quot;priority&quot;:0,&quot;optimizeId&quot;:&quot;96232794517277511&quot;}],&quot;tuningAdvices&quot;:[],&quot;improvement&quot;:8127.25,&quot;supportLevel&quot;:3,&quot;priority&quot;:&quot;HIGH&quot;}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, Successful is returned. If the request failed, an error message such as an error code is returned.</p>
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
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetAutonomousNotifyEventContentResponseBody build() {
            return new GetAutonomousNotifyEventContentResponseBody(this);
        } 

    } 

}
