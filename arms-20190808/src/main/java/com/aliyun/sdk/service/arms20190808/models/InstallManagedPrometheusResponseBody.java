// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallManagedPrometheusResponseBody} extends {@link TeaModel}
 *
 * <p>InstallManagedPrometheusResponseBody</p>
 */
public class InstallManagedPrometheusResponseBody extends TeaModel {
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

    private InstallManagedPrometheusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallManagedPrometheusResponseBody create() {
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
         * The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The response content. In most cases, the installation status of the Prometheus agent is returned.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned if the Prometheus agent failed to be installed.
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
         * Indicates whether the Prometheus agent was installed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InstallManagedPrometheusResponseBody build() {
            return new InstallManagedPrometheusResponseBody(this);
        } 

    } 

}
