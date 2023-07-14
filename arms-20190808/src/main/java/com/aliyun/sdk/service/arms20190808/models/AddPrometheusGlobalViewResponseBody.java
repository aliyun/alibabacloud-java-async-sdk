// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusGlobalViewResponseBody} extends {@link TeaModel}
 *
 * <p>AddPrometheusGlobalViewResponseBody</p>
 */
public class AddPrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the array object.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPrometheusGlobalViewResponseBody build() {
            return new AddPrometheusGlobalViewResponseBody(this);
        } 

    } 

    public static class Info extends TeaModel {
        @NameInMap("FailedInstances")
        private String failedInstances;

        @NameInMap("GlobalViewClusterId")
        private String globalViewClusterId;

        @NameInMap("RegionId")
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
             * The list of instances that failed to be added.
             */
            public Builder failedInstances(String failedInstances) {
                this.failedInstances = failedInstances;
                return this;
            }

            /**
             * The ID of the global aggregation instance.
             */
            public Builder globalViewClusterId(String globalViewClusterId) {
                this.globalViewClusterId = globalViewClusterId;
                return this;
            }

            /**
             * The region ID.
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
    public static class Data extends TeaModel {
        @NameInMap("Info")
        private Info info;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("Success")
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
             * The Info-level information.
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * The additional information.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Indicates whether the request was successful. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
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
