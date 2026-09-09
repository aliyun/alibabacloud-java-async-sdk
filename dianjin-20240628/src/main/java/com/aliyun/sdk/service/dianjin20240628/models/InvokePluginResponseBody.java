// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link InvokePluginResponseBody} extends {@link TeaModel}
 *
 * <p>InvokePluginResponseBody</p>
 */
public class InvokePluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.Map<String, ?> data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private InvokePluginResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokePluginResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private java.util.Map<String, ?> data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(InvokePluginResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * <p>Response time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>Response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;jobWaiting\&quot;: [0, 0], \&quot;timestamps\&quot;: [1713383820, 1713383880], \&quot;jobUsage\&quot;: [0, 0], \&quot;quotaUsage\&quot;: [123, 32]}</p>
         */
        public Builder data(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Data type.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>915AAAB9-4908-5224-9E53-9E9D7D0AA94B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Timestamp in YYYY-MM-DD HH:MM:SS format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public InvokePluginResponseBody build() {
            return new InvokePluginResponseBody(this);
        } 

    } 

}
