// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLinksResponseBody} extends {@link TeaModel}
 *
 * <p>ListLinksResponseBody</p>
 */
public class ListLinksResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.List < Content> content;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListLinksResponseBody(Builder builder) {
        this.content = builder.content;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLinksResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
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
        private java.util.List < Content> content; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Content.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLinksResponseBody build() {
            return new ListLinksResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("DeviceNameA")
        private String deviceNameA;

        @NameInMap("DeviceNameB")
        private String deviceNameB;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("IdxA")
        private String idxA;

        @NameInMap("IdxB")
        private String idxB;

        @NameInMap("IpA")
        private String ipA;

        @NameInMap("IpB")
        private String ipB;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("LinkName")
        private String linkName;

        @NameInMap("LinkNo")
        private String linkNo;

        @NameInMap("LinkStatus")
        private String linkStatus;

        @NameInMap("LinkType")
        private String linkType;

        @NameInMap("Message")
        private String message;

        @NameInMap("PortA")
        private String portA;

        @NameInMap("PortB")
        private String portB;

        @NameInMap("PortDescA")
        private String portDescA;

        @NameInMap("PortDescB")
        private String portDescB;

        @NameInMap("PortStatusA")
        private String portStatusA;

        @NameInMap("PortStatusB")
        private String portStatusB;

        @NameInMap("PortTypeA")
        private String portTypeA;

        @NameInMap("PortTypeB")
        private String portTypeB;

        @NameInMap("RegionId")
        private String regionId;

        private Content(Builder builder) {
            this.deviceNameA = builder.deviceNameA;
            this.deviceNameB = builder.deviceNameB;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.idxA = builder.idxA;
            this.idxB = builder.idxB;
            this.ipA = builder.ipA;
            this.ipB = builder.ipB;
            this.jobId = builder.jobId;
            this.linkName = builder.linkName;
            this.linkNo = builder.linkNo;
            this.linkStatus = builder.linkStatus;
            this.linkType = builder.linkType;
            this.message = builder.message;
            this.portA = builder.portA;
            this.portB = builder.portB;
            this.portDescA = builder.portDescA;
            this.portDescB = builder.portDescB;
            this.portStatusA = builder.portStatusA;
            this.portStatusB = builder.portStatusB;
            this.portTypeA = builder.portTypeA;
            this.portTypeB = builder.portTypeB;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return deviceNameA
         */
        public String getDeviceNameA() {
            return this.deviceNameA;
        }

        /**
         * @return deviceNameB
         */
        public String getDeviceNameB() {
            return this.deviceNameB;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return idxA
         */
        public String getIdxA() {
            return this.idxA;
        }

        /**
         * @return idxB
         */
        public String getIdxB() {
            return this.idxB;
        }

        /**
         * @return ipA
         */
        public String getIpA() {
            return this.ipA;
        }

        /**
         * @return ipB
         */
        public String getIpB() {
            return this.ipB;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return linkName
         */
        public String getLinkName() {
            return this.linkName;
        }

        /**
         * @return linkNo
         */
        public String getLinkNo() {
            return this.linkNo;
        }

        /**
         * @return linkStatus
         */
        public String getLinkStatus() {
            return this.linkStatus;
        }

        /**
         * @return linkType
         */
        public String getLinkType() {
            return this.linkType;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return portA
         */
        public String getPortA() {
            return this.portA;
        }

        /**
         * @return portB
         */
        public String getPortB() {
            return this.portB;
        }

        /**
         * @return portDescA
         */
        public String getPortDescA() {
            return this.portDescA;
        }

        /**
         * @return portDescB
         */
        public String getPortDescB() {
            return this.portDescB;
        }

        /**
         * @return portStatusA
         */
        public String getPortStatusA() {
            return this.portStatusA;
        }

        /**
         * @return portStatusB
         */
        public String getPortStatusB() {
            return this.portStatusB;
        }

        /**
         * @return portTypeA
         */
        public String getPortTypeA() {
            return this.portTypeA;
        }

        /**
         * @return portTypeB
         */
        public String getPortTypeB() {
            return this.portTypeB;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String deviceNameA; 
            private String deviceNameB; 
            private String gmtCreate; 
            private String gmtModified; 
            private String idxA; 
            private String idxB; 
            private String ipA; 
            private String ipB; 
            private String jobId; 
            private String linkName; 
            private String linkNo; 
            private String linkStatus; 
            private String linkType; 
            private String message; 
            private String portA; 
            private String portB; 
            private String portDescA; 
            private String portDescB; 
            private String portStatusA; 
            private String portStatusB; 
            private String portTypeA; 
            private String portTypeB; 
            private String regionId; 

            /**
             * A端设备名
             */
            public Builder deviceNameA(String deviceNameA) {
                this.deviceNameA = deviceNameA;
                return this;
            }

            /**
             * B端设备名
             */
            public Builder deviceNameB(String deviceNameB) {
                this.deviceNameB = deviceNameB;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * A端端口索引
             */
            public Builder idxA(String idxA) {
                this.idxA = idxA;
                return this;
            }

            /**
             * B端端口索引
             */
            public Builder idxB(String idxB) {
                this.idxB = idxB;
                return this;
            }

            /**
             * A端IP
             */
            public Builder ipA(String ipA) {
                this.ipA = ipA;
                return this;
            }

            /**
             * B端IP
             */
            public Builder ipB(String ipB) {
                this.ipB = ipB;
                return this;
            }

            /**
             * 链路发现任务
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * 链路名称
             */
            public Builder linkName(String linkName) {
                this.linkName = linkName;
                return this;
            }

            /**
             * 链路编号
             */
            public Builder linkNo(String linkNo) {
                this.linkNo = linkNo;
                return this;
            }

            /**
             * 链路状态
             */
            public Builder linkStatus(String linkStatus) {
                this.linkStatus = linkStatus;
                return this;
            }

            /**
             * 链路类型（单端、双端）
             */
            public Builder linkType(String linkType) {
                this.linkType = linkType;
                return this;
            }

            /**
             * 报错信息或者日志
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * A端端口名
             */
            public Builder portA(String portA) {
                this.portA = portA;
                return this;
            }

            /**
             * B端端口名
             */
            public Builder portB(String portB) {
                this.portB = portB;
                return this;
            }

            /**
             * PortDescA.
             */
            public Builder portDescA(String portDescA) {
                this.portDescA = portDescA;
                return this;
            }

            /**
             * PortDescB.
             */
            public Builder portDescB(String portDescB) {
                this.portDescB = portDescB;
                return this;
            }

            /**
             * A端端口状态
             */
            public Builder portStatusA(String portStatusA) {
                this.portStatusA = portStatusA;
                return this;
            }

            /**
             * B端端口状态
             */
            public Builder portStatusB(String portStatusB) {
                this.portStatusB = portStatusB;
                return this;
            }

            /**
             * A端端口类型
             */
            public Builder portTypeA(String portTypeA) {
                this.portTypeA = portTypeA;
                return this;
            }

            /**
             * B端端口类型
             */
            public Builder portTypeB(String portTypeB) {
                this.portTypeB = portTypeB;
                return this;
            }

            /**
             * 代表region的资源属性字段
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
