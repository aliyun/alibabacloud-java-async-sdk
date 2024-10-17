// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPrometheusInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusInstancesResponseBody</p>
 */
public class ListPrometheusInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrometheusInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusInstancesResponseBody create() {
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

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The Prometheus instances in the region in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;agentStatus&quot;:&quot;0&quot;,&quot;clusterId&quot;:&quot;global-v2-cn-1672753017899-dmjnwtzz&quot;,&quot;clusterName&quot;:&quot;test-GlobalView&quot;,&quot;clusterType&quot;:&quot;GlobalViewV2&quot;,&quot;commercialConfig&quot;:{},&quot;createTime&quot;:1656579981000,&quot;id&quot;:13785300,&quot;isAdvancedClusterInstalled&quot;:false,&quot;isClusterRunning&quot;:true,&quot;isControllerInstalled&quot;:true,&quot;isIntegrationCenter&quot;:false,&quot;regionId&quot;:&quot;cn-hongkong&quot;,&quot;updateTime&quot;:1657616273000,&quot;userId&quot;:&quot;1672753017899&quot;},{&quot;agentStatus&quot;:&quot;0&quot;,&quot;clusterId&quot;:&quot;51a123a61a8f31f0&quot;,&quot;clusterName&quot;:&quot;cloud-product-prometheus_cn-qingdao&quot;,&quot;clusterType&quot;:&quot;cloud-product-prometheus&quot;,&quot;commercialConfig&quot;:{},&quot;controllerId&quot;:&quot;51a123a61a8f31f0&quot;,&quot;createTime&quot;:1653532488000,&quot;id&quot;:13746658,&quot;isAdvancedClusterInstalled&quot;:false,&quot;isClusterRunning&quot;:true,&quot;isControllerInstalled&quot;:true,&quot;isIntegrationCenter&quot;:false,&quot;regionId&quot;:&quot;cn-qingdao&quot;,&quot;updateTime&quot;:1653532518000,&quot;userId&quot;:&quot;1672753017899&quot;}]</p>
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
         * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrometheusInstancesResponseBody build() {
            return new ListPrometheusInstancesResponseBody(this);
        } 

    } 

}
