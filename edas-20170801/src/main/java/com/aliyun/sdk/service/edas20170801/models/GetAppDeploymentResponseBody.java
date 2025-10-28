// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetAppDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppDeploymentResponseBody</p>
 */
public class GetAppDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAppDeploymentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppDeploymentResponseBody create() {
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

        private Builder(GetAppDeploymentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the Deployment of the application. The value is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;metadata&quot;:{&quot;name&quot;:&quot;oambuild-group*&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;selfLink&quot;:&quot;/apis/apps/v1/namespaces/default/deployments/oambuil*&quot;,&quot;uid&quot;:&quot;<em>-afc0-436e-9949-fb01994a9b63&quot;,&quot;resourceVersion&quot;:&quot;969614832&quot;,&quot;generation&quot;:2,&quot;creationTimestamp&quot;:&quot;2021-04-06T11:38:46Z&quot;,&quot;labels&quot;:{&quot;edas-domain&quot;:&quot;edas-admin&quot;,&quot;edas.aliyun.oam.com/rollout-name&quot;:&quot;oambuild-group-1&quot;,&quot;edas.aliyun.oam.com/rollout-namespace&quot;:&quot;default&quot;,&quot;edas.aliyun.oam.com/rollout-revision&quot;:&quot;3&quot;,&quot;edas.appid&quot;:&quot;fc5e0f54-</em>-4cab-91a0-b7becb1f6174&quot;,&quot;edas.controlplane&quot;:&quot;edas-oam&quot;,&quot;edas.oam.acname&quot;:&quot;oambuild&quot;...</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>03FD1520-0FD6-436A-<strong><strong>-265318D7</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAppDeploymentResponseBody build() {
            return new GetAppDeploymentResponseBody(this);
        } 

    } 

}
