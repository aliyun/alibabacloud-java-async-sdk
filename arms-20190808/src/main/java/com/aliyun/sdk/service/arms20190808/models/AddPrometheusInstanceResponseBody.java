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
 * {@link AddPrometheusInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>AddPrometheusInstanceResponseBody</p>
 */
public class AddPrometheusInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddPrometheusInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusInstanceResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The struct returned. { &quot;RequestId&quot;: the request ID, &quot;Data&quot;: &quot;{ &quot;clusterType&quot;: the cluster type, &quot;remoteWriteUrl&quot;: the public URL for remote write, &quot;internetGrafanaUrl&quot;: the internal URL for Grafana, &quot;authToken&quot;: indicates whether authentication is enabled, &quot;internetPushGatewayUrl&quot;: the internal URL for Pushgateway, &quot;clusterId&quot;: the cluster ID, &quot;internetRemoteReadUrl&quot;: the internal URL for remote read, &quot;remoteReadUrl&quot;: the public URL for remote read, &quot;grafanaUrl&quot;: the public URL for Grafana, &quot;pushGatewayUrl&quot;: the public URL for Pushgateway, &quot;internetRemoteWriteUrl&quot;: the internal URL for remote write}&quot; }</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;RequestId&quot;: &quot;1293091C-54AD-50FE-B787-E314B94B35AB&quot;,
         *   &quot;Data&quot;: &quot;{
         *   &quot;clusterType&quot;:&quot;remote-write-prometheus&quot;,
         *   &quot;remoteWriteUrl&quot;:&quot;<a href="http://cn-hu/api/v3/write">http://cn-hu/api/v3/write</a>&quot;,
         *   &quot;internetGrafanaUrl&quot;:&quot;<a href="https://cn-hanga/cn-hangzhou">https://cn-hanga/cn-hangzhou</a>&quot;,
         *   &quot;authToken&quot;:false,
         *   &quot;internetPushGatewayUrl&quot;:&quot;<a href="https://cangzhou/api/v2">https://cangzhou/api/v2</a>&quot;,
         *   &quot;clusterId&quot;:&quot;vrju1lj3sa|123456&quot;,
         *   &quot;internetRemoteReadUrl&quot;:&quot;<a href="https://cn-hangzh67cn-hangzhou/api/v1/read">https://cn-hangzh67cn-hangzhou/api/v1/read</a>&quot;,
         *   &quot;remoteReadUrl&quot;:&quot;<a href="http://cn-hanou/api/v1/read">http://cn-hanou/api/v1/read</a>&quot;,
         *   &quot;grafanaUrl&quot;:&quot;<a href="http://cn-angzhou">http://cn-angzhou</a>&quot;,
         *   &quot;pushGatewayUrl&quot;:&quot;htt1lj3sa/cn-hangzhou/api/v2&quot;,
         *   &quot;internetRemoteWriteUrl&quot;:&quot;httpsngzhou/api/v3/write&quot;}&quot;
         * }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9319A57D-2D9E-472A-B69B-CF3CD16D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddPrometheusInstanceResponseBody build() {
            return new AddPrometheusInstanceResponseBody(this);
        } 

    } 

}
