// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link DeleteErAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteErAttachmentResponseBody</p>
 */
public class DeleteErAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Object content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteErAttachmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteErAttachmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Object getContent() {
        return this.content;
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
        private Integer code; 
        private Object content; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response content. If a resource has dependent resources, the existing dependent resources are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ER_RMAP&quot;: [
         *         {
         *             &quot;erId&quot;: &quot;er-opy1wrfv&quot;,
         *             &quot;destinationCidrBlock&quot;: &quot;0.0.0.0/0&quot;,
         *             &quot;regionId&quot;: &quot;cn-wulanchabu&quot;,
         *             &quot;routeMapNum&quot;: 3000,
         *             &quot;erRouteMapId&quot;: &quot;er-rmap-v5lfhmvm&quot;,
         *             &quot;action&quot;: &quot;permit&quot;,
         *             &quot;status&quot;: &quot;Available&quot;
         *         },
         *         {
         *             &quot;erId&quot;: &quot;er-opy1wrfv&quot;,
         *             &quot;destinationCidrBlock&quot;: &quot;0.0.0.0/0&quot;,
         *             &quot;regionId&quot;: &quot;cn-wulanchabu&quot;,
         *             &quot;routeMapNum&quot;: 3000,
         *             &quot;erRouteMapId&quot;: &quot;er-rmap-of3r0ndh&quot;,
         *             &quot;action&quot;: &quot;permit&quot;,
         *             &quot;status&quot;: &quot;Available&quot;
         *         }
         *     ]
         * }</p>
         */
        public Builder content(Object content) {
            this.content = content;
            return this;
        }

        /**
         * <p>response message, if the success request is</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteErAttachmentResponseBody build() {
            return new DeleteErAttachmentResponseBody(this);
        } 

    } 

}
