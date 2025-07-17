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
 * {@link ListDashboardsByNameResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardsByNameResponseBody</p>
 */
public class ListDashboardsByNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDashboardsByNameResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardsByNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDashboardsByNameResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code. The HTTP 200 status code indicates a successful request, while others indicate error conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;Edas Ingress Url Analysis&quot;,&quot;type&quot;:&quot;edas-ingress-url-analysis&quot;,&quot;url&quot;:&quot;<a href="https://g.console.aliyun.com/d/1036052989950239-11040375-66-3/edas-ingress-url-analysis?var-clusterId=29ksa&var-regionId=cn-hangzhou%22%7D%5D">https://g.console.aliyun.com/d/1036052989950239-11040375-66-3/edas-ingress-url-analysis?var-clusterId=29ksa&amp;var-regionId=cn-hangzhou&quot;}]</a></p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>2983BEF7-4A0D-47A2-94A2-8E9C5E63****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDashboardsByNameResponseBody build() {
            return new ListDashboardsByNameResponseBody(this);
        } 

    } 

}
