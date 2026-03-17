// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListProbeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListProbeTaskResponseBody</p>
 */
public class ListProbeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListProbeTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProbeTaskResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListProbeTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the probe task.</p>
         * 
         * <strong>example:</strong>
         * <p>probe-xxx</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>324223F3-93D3-4CE4-B26F-66C0C3809922</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListProbeTaskResponseBody build() {
            return new ListProbeTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProbeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListProbeTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("PacketNumber")
        private Integer packetNumber;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ProbeTaskId")
        private String probeTaskId;

        @com.aliyun.core.annotation.NameInMap("ProbeTaskSourceAddress")
        private String probeTaskSourceAddress;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SagId")
        private String sagId;

        @com.aliyun.core.annotation.NameInMap("Sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.domain = builder.domain;
            this.enable = builder.enable;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.packetNumber = builder.packetNumber;
            this.port = builder.port;
            this.probeTaskId = builder.probeTaskId;
            this.probeTaskSourceAddress = builder.probeTaskSourceAddress;
            this.protocol = builder.protocol;
            this.sagId = builder.sagId;
            this.sn = builder.sn;
            this.taskName = builder.taskName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return packetNumber
         */
        public Integer getPacketNumber() {
            return this.packetNumber;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return probeTaskId
         */
        public String getProbeTaskId() {
            return this.probeTaskId;
        }

        /**
         * @return probeTaskSourceAddress
         */
        public String getProbeTaskSourceAddress() {
            return this.probeTaskSourceAddress;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return sagId
         */
        public String getSagId() {
            return this.sagId;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String domain; 
            private Boolean enable; 
            private String gmtCreate; 
            private String gmtModify; 
            private Integer packetNumber; 
            private Integer port; 
            private String probeTaskId; 
            private String probeTaskSourceAddress; 
            private String protocol; 
            private String sagId; 
            private String sn; 
            private String taskName; 
            private String type; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.domain = model.domain;
                this.enable = model.enable;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.packetNumber = model.packetNumber;
                this.port = model.port;
                this.probeTaskId = model.probeTaskId;
                this.probeTaskSourceAddress = model.probeTaskSourceAddress;
                this.protocol = model.protocol;
                this.sagId = model.sagId;
                this.sn = model.sn;
                this.taskName = model.taskName;
                this.type = model.type;
            } 

            /**
             * <p>The domain name that is probed by the task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether the probe task is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The time when the probe task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-23 14:09</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the probe task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-23 14:09</p>
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * <p>The number of probe packets transmitted by the probe task per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder packetNumber(Integer packetNumber) {
                this.packetNumber = packetNumber;
                return this;
            }

            /**
             * <p>The port that is probed by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the probe task.</p>
             * 
             * <strong>example:</strong>
             * <p>probe-****</p>
             */
            public Builder probeTaskId(String probeTaskId) {
                this.probeTaskId = probeTaskId;
                return this;
            }

            /**
             * <p>The source address of the probe task.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder probeTaskSourceAddress(String probeTaskSourceAddress) {
                this.probeTaskSourceAddress = probeTaskSourceAddress;
                return this;
            }

            /**
             * <p>The protocol of the probe task. Valid values:</p>
             * <ul>
             * <li><strong>ICMP</strong></li>
             * <li><strong>TCP</strong></li>
             * <li><strong>HTTP</strong></li>
             * </ul>
             * <blockquote>
             * <p>Tasks that probe private networks support only ICMP and TCP.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ICMP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-asdfz6ac74oj5v****</p>
             */
            public Builder sagId(String sagId) {
                this.sagId = sagId;
                return this;
            }

            /**
             * <p>The serial number of the SAG device.</p>
             * 
             * <strong>example:</strong>
             * <p>sag****</p>
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * <p>The name of the probe task.</p>
             * 
             * <strong>example:</strong>
             * <p>test-ping</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the probe task. Valid values:</p>
             * <ul>
             * <li><strong>Internet</strong>: probes a public network.</li>
             * <li><strong>Intranet</strong>: probes a private network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
