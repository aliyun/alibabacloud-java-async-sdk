// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListSipTrunksResponseBody} extends {@link TeaModel}
 *
 * <p>ListSipTrunksResponseBody</p>
 */
public class ListSipTrunksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSipTrunksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.list = builder.list;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSipTrunksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
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
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<List> list; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSipTrunksResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.list = model.list;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The list of SIP trunks.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSipTrunksResponseBody build() {
            return new ListSipTrunksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSipTrunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSipTrunksResponseBody</p>
     */
    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private Ips(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String ip; 

            private Builder() {
            } 

            private Builder(Ips model) {
                this.ip = model.ip;
            } 

            /**
             * <p>The IP address of the SIP trunk.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.1</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSipTrunksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSipTrunksResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List<Ips> ips;

        @com.aliyun.core.annotation.NameInMap("TrunkId")
        private String trunkId;

        @com.aliyun.core.annotation.NameInMap("TrunkName")
        private String trunkName;

        private List(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.ips = builder.ips;
            this.trunkId = builder.trunkId;
            this.trunkName = builder.trunkName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return ips
         */
        public java.util.List<Ips> getIps() {
            return this.ips;
        }

        /**
         * @return trunkId
         */
        public String getTrunkId() {
            return this.trunkId;
        }

        /**
         * @return trunkName
         */
        public String getTrunkName() {
            return this.trunkName;
        }

        public static final class Builder {
            private String description; 
            private Long gmtCreate; 
            private java.util.List<Ips> ips; 
            private String trunkId; 
            private String trunkName; 

            private Builder() {
            } 

            private Builder(List model) {
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.ips = model.ips;
                this.trunkId = model.trunkId;
                this.trunkName = model.trunkName;
            } 

            /**
             * <p>The description of the SIP trunk.</p>
             * 
             * <strong>example:</strong>
             * <p>Test environment SIP trunk</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The creation timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1727654400000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The list of IP addresses of the SIP trunk.</p>
             */
            public Builder ips(java.util.List<Ips> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The unique identifier of the SIP trunk.</p>
             * 
             * <strong>example:</strong>
             * <p>6bf8a1d2-3c4e-4f5a-9b8c-7d6e5f4a3b2c</p>
             */
            public Builder trunkId(String trunkId) {
                this.trunkId = trunkId;
                return this;
            }

            /**
             * <p>The name of the SIP trunk.</p>
             * 
             * <strong>example:</strong>
             * <p>sip-trunk-demo</p>
             */
            public Builder trunkName(String trunkName) {
                this.trunkName = trunkName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
