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
 * {@link AddPrometheusGlobalViewResponseBody} extends {@link TeaModel}
 *
 * <p>AddPrometheusGlobalViewResponseBody</p>
 */
public class AddPrometheusGlobalViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddPrometheusGlobalViewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusGlobalViewResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>状态码。说明 200表示成功。</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the array object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>返回结果的提示信息。</p>
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
         * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPrometheusGlobalViewResponseBody build() {
            return new AddPrometheusGlobalViewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddPrometheusGlobalViewResponseBody} extends {@link TeaModel}
     *
     * <p>AddPrometheusGlobalViewResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedInstances")
        private String failedInstances;

        @com.aliyun.core.annotation.NameInMap("GlobalViewClusterId")
        private String globalViewClusterId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Info(Builder builder) {
            this.failedInstances = builder.failedInstances;
            this.globalViewClusterId = builder.globalViewClusterId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return failedInstances
         */
        public String getFailedInstances() {
            return this.failedInstances;
        }

        /**
         * @return globalViewClusterId
         */
        public String getGlobalViewClusterId() {
            return this.globalViewClusterId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String failedInstances; 
            private String globalViewClusterId; 
            private String regionId; 

            /**
             * <p>The list of instances that failed to be added.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;sourceName&quot;: &quot;Data source name- ArmsPrometheus&quot;,&quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,&quot;userId&quot;:&quot;UserID&quot;,&quot;clusterId&quot;:&quot;ClusterId&quot;,}]</p>
             */
            public Builder failedInstances(String failedInstances) {
                this.failedInstances = failedInstances;
                return this;
            }

            /**
             * <p>The ID of the global aggregation instance.</p>
             * 
             * <strong>example:</strong>
             * <p>global-v2-cn-1483223059272121-jmjjfznz</p>
             */
            public Builder globalViewClusterId(String globalViewClusterId) {
                this.globalViewClusterId = globalViewClusterId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddPrometheusGlobalViewResponseBody} extends {@link TeaModel}
     *
     * <p>AddPrometheusGlobalViewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.info = builder.info;
            this.msg = builder.msg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Info info; 
            private String msg; 
            private Boolean success; 

            /**
             * <p>The Info-level information.</p>
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
