// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetAllInstanceIdListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllInstanceIdListResponseBody</p>
 */
public class GetAllInstanceIdListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.Map<String, ?> instanceIds;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAllInstanceIdListResponseBody(Builder builder) {
        this.code = builder.code;
        this.instanceIds = builder.instanceIds;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllInstanceIdListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return instanceIds
     */
    public java.util.Map<String, ?> getInstanceIds() {
        return this.instanceIds;
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
        private Integer code; 
        private java.util.Map<String, ?> instanceIds; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The IDs of instances that are managed by the Alibaba Cloud account in all the regions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cn-shenzhen&quot;: [&quot;alikafka_post-cn-7pp2btvo****&quot;],&quot;us-west-1&quot;: [&quot;alikafka_pre-cn-i7m2lxid****&quot;],&quot;cn-hangzhou&quot;: [&quot;alikafka_pre-cn-i7m2hflj****&quot;,&quot;alikafka_pre-cn-zvp2hsje****&quot;,&quot;alikafka_pre-cn-zvp2kvc9****&quot;]}]</p>
         */
        public Builder instanceIds(java.util.Map<String, ?> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABA4A7FD-E10F-45C7-9774-A5236015****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAllInstanceIdListResponseBody build() {
            return new GetAllInstanceIdListResponseBody(this);
        } 

    } 

}
