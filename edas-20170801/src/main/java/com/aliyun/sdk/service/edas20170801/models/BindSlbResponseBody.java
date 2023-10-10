// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindSlbResponseBody} extends {@link TeaModel}
 *
 * <p>BindSlbResponseBody</p>
 */
public class BindSlbResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private BindSlbResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindSlbResponseBody create() {
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
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The additional information that is returned.
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

        public BindSlbResponseBody build() {
            return new BindSlbResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ExtSlbId")
        private String extSlbId;

        @NameInMap("ExtSlbIp")
        private String extSlbIp;

        @NameInMap("ExtSlbName")
        private String extSlbName;

        @NameInMap("ExtVServerGroupId")
        private String extVServerGroupId;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbIp")
        private String slbIp;

        @NameInMap("SlbName")
        private String slbName;

        @NameInMap("SlbPort")
        private Integer slbPort;

        @NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Data(Builder builder) {
            this.extSlbId = builder.extSlbId;
            this.extSlbIp = builder.extSlbIp;
            this.extSlbName = builder.extSlbName;
            this.extVServerGroupId = builder.extVServerGroupId;
            this.slbId = builder.slbId;
            this.slbIp = builder.slbIp;
            this.slbName = builder.slbName;
            this.slbPort = builder.slbPort;
            this.vServerGroupId = builder.vServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return extSlbId
         */
        public String getExtSlbId() {
            return this.extSlbId;
        }

        /**
         * @return extSlbIp
         */
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        /**
         * @return extSlbName
         */
        public String getExtSlbName() {
            return this.extSlbName;
        }

        /**
         * @return extVServerGroupId
         */
        public String getExtVServerGroupId() {
            return this.extVServerGroupId;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbIp
         */
        public String getSlbIp() {
            return this.slbIp;
        }

        /**
         * @return slbName
         */
        public String getSlbName() {
            return this.slbName;
        }

        /**
         * @return slbPort
         */
        public Integer getSlbPort() {
            return this.slbPort;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private String extSlbId; 
            private String extSlbIp; 
            private String extSlbName; 
            private String extVServerGroupId; 
            private String slbId; 
            private String slbIp; 
            private String slbName; 
            private Integer slbPort; 
            private String vServerGroupId; 

            /**
             * The ID of the Internet-facing SLB instance.
             */
            public Builder extSlbId(String extSlbId) {
                this.extSlbId = extSlbId;
                return this;
            }

            /**
             * The IP address of the Internet-facing SLB instance.
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * The name of the Internet-facing SLB instance.
             */
            public Builder extSlbName(String extSlbName) {
                this.extSlbName = extSlbName;
                return this;
            }

            /**
             * The ID of the vServer group for the Internet-facing SLB instance.
             */
            public Builder extVServerGroupId(String extVServerGroupId) {
                this.extVServerGroupId = extVServerGroupId;
                return this;
            }

            /**
             * The ID of the internal-facing SLB instance.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * The IP address of the internal-facing SLB instance.
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * The name of the internal-facing SLB instance.
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * The listener port for the SLB instance.
             */
            public Builder slbPort(Integer slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * The ID of the vServer group for the internal-facing SLB instance.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
