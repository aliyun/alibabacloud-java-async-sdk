// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusRemoteWritesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusRemoteWritesResponseBody</p>
 */
public class ListPrometheusRemoteWritesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPrometheusRemoteWritesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusRemoteWritesResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code that is returned. The HTTP status code 200 indicates that the call was successful. Otherwise, the call fails.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The remote write configuration items returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPrometheusRemoteWritesResponseBody build() {
            return new ListPrometheusRemoteWritesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("RemoteWriteName")
        private String remoteWriteName;

        @com.aliyun.core.annotation.NameInMap("RemoteWriteYaml")
        private String remoteWriteYaml;

        private Data(Builder builder) {
            this.clusterId = builder.clusterId;
            this.remoteWriteName = builder.remoteWriteName;
            this.remoteWriteYaml = builder.remoteWriteYaml;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return remoteWriteName
         */
        public String getRemoteWriteName() {
            return this.remoteWriteName;
        }

        /**
         * @return remoteWriteYaml
         */
        public String getRemoteWriteYaml() {
            return this.remoteWriteYaml;
        }

        public static final class Builder {
            private String clusterId; 
            private String remoteWriteName; 
            private String remoteWriteYaml; 

            /**
             * The ID of the Prometheus instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the remote write configuration item.
             */
            public Builder remoteWriteName(String remoteWriteName) {
                this.remoteWriteName = remoteWriteName;
                return this;
            }

            /**
             * The information about the queried remote write configuration item of the Prometheus instance. The information is displayed in the YAML format.
             */
            public Builder remoteWriteYaml(String remoteWriteYaml) {
                this.remoteWriteYaml = remoteWriteYaml;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
