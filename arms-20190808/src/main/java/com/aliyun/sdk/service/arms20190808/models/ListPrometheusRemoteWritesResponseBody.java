// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusRemoteWritesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusRemoteWritesResponseBody</p>
 */
public class ListPrometheusRemoteWritesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The queried remote write configurations.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values: true and false.
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
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("RemoteWriteName")
        private String remoteWriteName;

        @NameInMap("RemoteWriteYaml")
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
             * The name of the remote write configuration.
             */
            public Builder remoteWriteName(String remoteWriteName) {
                this.remoteWriteName = remoteWriteName;
                return this;
            }

            /**
             * The remote write configuration. The configuration is displayed in the YAML format.
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
