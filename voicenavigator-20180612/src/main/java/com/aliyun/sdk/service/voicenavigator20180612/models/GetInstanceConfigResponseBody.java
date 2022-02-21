// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceConfigResponseBody</p>
 */
public class GetInstanceConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetInstanceConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private Data data; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceConfigResponseBody build() {
            return new GetInstanceConfigResponseBody(this);
        } 

    } 

    public static class InstanceConfig extends TeaModel {
        @NameInMap("MiniPlaybackSystemSwitch")
        private Boolean miniPlaybackSystemSwitch;

        @NameInMap("NewBargeInSystemSwitch")
        private Boolean newBargeInSystemSwitch;

        private InstanceConfig(Builder builder) {
            this.miniPlaybackSystemSwitch = builder.miniPlaybackSystemSwitch;
            this.newBargeInSystemSwitch = builder.newBargeInSystemSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceConfig create() {
            return builder().build();
        }

        /**
         * @return miniPlaybackSystemSwitch
         */
        public Boolean getMiniPlaybackSystemSwitch() {
            return this.miniPlaybackSystemSwitch;
        }

        /**
         * @return newBargeInSystemSwitch
         */
        public Boolean getNewBargeInSystemSwitch() {
            return this.newBargeInSystemSwitch;
        }

        public static final class Builder {
            private Boolean miniPlaybackSystemSwitch; 
            private Boolean newBargeInSystemSwitch; 

            /**
             * MiniPlaybackSystemSwitch.
             */
            public Builder miniPlaybackSystemSwitch(Boolean miniPlaybackSystemSwitch) {
                this.miniPlaybackSystemSwitch = miniPlaybackSystemSwitch;
                return this;
            }

            /**
             * NewBargeInSystemSwitch.
             */
            public Builder newBargeInSystemSwitch(Boolean newBargeInSystemSwitch) {
                this.newBargeInSystemSwitch = newBargeInSystemSwitch;
                return this;
            }

            public InstanceConfig build() {
                return new InstanceConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("InstanceConfig")
        private InstanceConfig instanceConfig;

        private Data(Builder builder) {
            this.instanceConfig = builder.instanceConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceConfig
         */
        public InstanceConfig getInstanceConfig() {
            return this.instanceConfig;
        }

        public static final class Builder {
            private InstanceConfig instanceConfig; 

            /**
             * InstanceConfig.
             */
            public Builder instanceConfig(InstanceConfig instanceConfig) {
                this.instanceConfig = instanceConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
