// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAppServerResponseBody} extends {@link TeaModel}
 *
 * <p>StopAppServerResponseBody</p>
 */
public class StopAppServerResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private StopAppServerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAppServerResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StopAppServerResponseBody build() {
            return new StopAppServerResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppServerStatus")
        private String appServerStatus;

        @NameInMap("EnvId")
        private String envId;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appServerStatus = builder.appServerStatus;
            this.envId = builder.envId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appServerStatus
         */
        public String getAppServerStatus() {
            return this.appServerStatus;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        public static final class Builder {
            private String appId; 
            private String appServerStatus; 
            private String envId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppServerStatus.
             */
            public Builder appServerStatus(String appServerStatus) {
                this.appServerStatus = appServerStatus;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
