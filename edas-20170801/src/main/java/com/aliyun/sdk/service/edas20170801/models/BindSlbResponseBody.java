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
 * {@link BindSlbResponseBody} extends {@link TeaModel}
 *
 * <p>BindSlbResponseBody</p>
 */
public class BindSlbResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(BindSlbResponseBody model) {
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
         * <p>The data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>bind slb success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>23DR4FDXXXXXXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BindSlbResponseBody build() {
            return new BindSlbResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindSlbResponseBody} extends {@link TeaModel}
     *
     * <p>BindSlbResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtSlbId")
        private String extSlbId;

        @com.aliyun.core.annotation.NameInMap("ExtSlbIp")
        private String extSlbIp;

        @com.aliyun.core.annotation.NameInMap("ExtSlbName")
        private String extSlbName;

        @com.aliyun.core.annotation.NameInMap("ExtVServerGroupId")
        private String extVServerGroupId;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbIp")
        private String slbIp;

        @com.aliyun.core.annotation.NameInMap("SlbName")
        private String slbName;

        @com.aliyun.core.annotation.NameInMap("SlbPort")
        private Integer slbPort;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.extSlbId = model.extSlbId;
                this.extSlbIp = model.extSlbIp;
                this.extSlbName = model.extSlbName;
                this.extVServerGroupId = model.extVServerGroupId;
                this.slbId = model.slbId;
                this.slbIp = model.slbIp;
                this.slbName = model.slbName;
                this.slbPort = model.slbPort;
                this.vServerGroupId = model.vServerGroupId;
            } 

            /**
             * <p>The ID of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder extSlbId(String extSlbId) {
                this.extSlbId = extSlbId;
                return this;
            }

            /**
             * <p>The IP address of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder extSlbIp(String extSlbIp) {
                this.extSlbIp = extSlbIp;
                return this;
            }

            /**
             * <p>The name of the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder extSlbName(String extSlbName) {
                this.extSlbName = extSlbName;
                return this;
            }

            /**
             * <p>The ID of the vServer group for the Internet-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder extVServerGroupId(String extVServerGroupId) {
                this.extVServerGroupId = extVServerGroupId;
                return this;
            }

            /**
             * <p>The ID of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-wz96ph63r************</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The IP address of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.16*.<em>.</em></p>
             */
            public Builder slbIp(String slbIp) {
                this.slbIp = slbIp;
                return this;
            }

            /**
             * <p>The name of the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test**********</p>
             */
            public Builder slbName(String slbName) {
                this.slbName = slbName;
                return this;
            }

            /**
             * <p>The listener port for the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder slbPort(Integer slbPort) {
                this.slbPort = slbPort;
                return this;
            }

            /**
             * <p>The ID of the vServer group for the internal-facing SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
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
