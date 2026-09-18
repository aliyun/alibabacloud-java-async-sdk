// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetHotlineRuntimeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotlineRuntimeInfoResponseBody</p>
 */
public class GetHotlineRuntimeInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetHotlineRuntimeInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotlineRuntimeInfoResponseBody create() {
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
    public java.util.Map<String, ?> getData() {
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
        private String code; 
        private java.util.Map<String, ?> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetHotlineRuntimeInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A return value of &quot;Success&quot; indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Hotline runtime information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;buId&quot;:905,&quot;phoneToken&quot;:&quot;roESVzzgD1ytmG0W6nMkWinI6fbpKovm14fBhA0NsYPyi/srX/G0SvNB2z96AYiqy1vxQHiaFOdZSxtsAubdgr2kjs2yas7COO5dukQpsOLq9iNI4U6sKlcvaBi8xsyUr/hyqCdTVZDcYCOq0lH6eeNIQK/f7/gWqIw****=&quot;,&quot;isNeedWorkShift&quot;:false,&quot;servicerId&quot;:741018,&quot;accConfigUrl&quot;:&quot;pre-acc-cs-public.alibaba-inc.com&quot;,&quot;agentBasicCode&quot;:&quot;AgentCheckout&quot;,&quot;startWorkToReady&quot;:true,&quot;servicerDn&quot;:&quot;2000000001904123&quot;,&quot;isMaster&quot;:&quot;1&quot;,&quot;tenantId&quot;:2001,&quot;depId&quot;:1139139,&quot;accTenantId&quot;:2001,&quot;phoneData&quot;:&quot;{\&quot;timeStamp\&quot;:164240****,\&quot;expireTime\&quot;:164257****,\&quot;dn\&quot;:\&quot;200000000190****\&quot;,\&quot;source\&quot;:\&quot;xspace\&quot;,\&quot;serviceId\&quot;:741018}&quot;,&quot;agentBasicDesc&quot;:&quot;坐席签出状态&quot;}</p>
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
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
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHotlineRuntimeInfoResponseBody build() {
            return new GetHotlineRuntimeInfoResponseBody(this);
        } 

    } 

}
