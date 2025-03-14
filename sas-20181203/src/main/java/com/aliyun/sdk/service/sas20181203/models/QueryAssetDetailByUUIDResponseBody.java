// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link QueryAssetDetailByUUIDResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAssetDetailByUUIDResponseBody</p>
 */
public class QueryAssetDetailByUUIDResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TimeCost")
    private Long timeCost;

    private QueryAssetDetailByUUIDResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAssetDetailByUUIDResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return timeCost
     */
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long timeCost; 

        private Builder() {
        } 

        private Builder(QueryAssetDetailByUUIDResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.timeCost = model.timeCost;
        } 

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li><strong>200</strong>: The request was successful.</li>
         * <li><strong>Other codes</strong>: The request failed. For a list of error codes, see <a href="https://help.aliyun.com/document_detail/145071.html">Service error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The consumed time of the request. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public QueryAssetDetailByUUIDResponseBody build() {
            return new QueryAssetDetailByUUIDResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAssetDetailByUUIDResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAssetDetailByUUIDResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("AuthVersion")
        private Integer authVersion;

        @com.aliyun.core.annotation.NameInMap("Bid")
        private String bid;

        @com.aliyun.core.annotation.NameInMap("Bind")
        private Boolean bind;

        @com.aliyun.core.annotation.NameInMap("ClientStatus")
        private String clientStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Eip")
        private String eip;

        @com.aliyun.core.annotation.NameInMap("Flag")
        private Integer flag;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("MachineInstanceId")
        private String machineInstanceId;

        @com.aliyun.core.annotation.NameInMap("MachineIp")
        private String machineIp;

        @com.aliyun.core.annotation.NameInMap("MachineIpType")
        private String machineIpType;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("MachineRegion")
        private String machineRegion;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private String machineType;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsName")
        private String osName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.authVersion = builder.authVersion;
            this.bid = builder.bid;
            this.bind = builder.bind;
            this.clientStatus = builder.clientStatus;
            this.clusterId = builder.clusterId;
            this.eip = builder.eip;
            this.flag = builder.flag;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.machineInstanceId = builder.machineInstanceId;
            this.machineIp = builder.machineIp;
            this.machineIpType = builder.machineIpType;
            this.machineName = builder.machineName;
            this.machineRegion = builder.machineRegion;
            this.machineType = builder.machineType;
            this.online = builder.online;
            this.os = builder.os;
            this.osName = builder.osName;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return authVersion
         */
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return bind
         */
        public Boolean getBind() {
            return this.bind;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return eip
         */
        public String getEip() {
            return this.eip;
        }

        /**
         * @return flag
         */
        public Integer getFlag() {
            return this.flag;
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
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return machineInstanceId
         */
        public String getMachineInstanceId() {
            return this.machineInstanceId;
        }

        /**
         * @return machineIp
         */
        public String getMachineIp() {
            return this.machineIp;
        }

        /**
         * @return machineIpType
         */
        public String getMachineIpType() {
            return this.machineIpType;
        }

        /**
         * @return machineName
         */
        public String getMachineName() {
            return this.machineName;
        }

        /**
         * @return machineRegion
         */
        public String getMachineRegion() {
            return this.machineRegion;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osName
         */
        public String getOsName() {
            return this.osName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long aliUid; 
            private Integer authVersion; 
            private String bid; 
            private Boolean bind; 
            private String clientStatus; 
            private String clusterId; 
            private String eip; 
            private Integer flag; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long groupId; 
            private Long id; 
            private String internetIp; 
            private String intranetIp; 
            private String machineInstanceId; 
            private String machineIp; 
            private String machineIpType; 
            private String machineName; 
            private String machineRegion; 
            private String machineType; 
            private Boolean online; 
            private String os; 
            private String osName; 
            private String regionId; 
            private String status; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliUid = model.aliUid;
                this.authVersion = model.authVersion;
                this.bid = model.bid;
                this.bind = model.bind;
                this.clientStatus = model.clientStatus;
                this.clusterId = model.clusterId;
                this.eip = model.eip;
                this.flag = model.flag;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupId = model.groupId;
                this.id = model.id;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.machineInstanceId = model.machineInstanceId;
                this.machineIp = model.machineIp;
                this.machineIpType = model.machineIpType;
                this.machineName = model.machineName;
                this.machineRegion = model.machineRegion;
                this.machineType = model.machineType;
                this.online = model.online;
                this.os = model.os;
                this.osName = model.osName;
                this.regionId = model.regionId;
                this.status = model.status;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1766185894104***</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Basic.</li>
             * <li><strong>6</strong>: Anti-virus.</li>
             * <li><strong>5</strong>: Advanced.</li>
             * <li><strong>3</strong>: Enterprise.</li>
             * <li><strong>7</strong>: Ultimate.</li>
             * <li><strong>10</strong>: Value-added Plan.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder authVersion(Integer authVersion) {
                this.authVersion = authVersion;
                return this;
            }

            /**
             * <p>The virtual network operator (VNO).</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bind(Boolean bind) {
                this.bind = bind;
                return this;
            }

            /**
             * <p>The status of the Security Center agent. Valid values:</p>
             * <ul>
             * <li><strong>online</strong></li>
             * <li><strong>offline</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c8ca91e0907d94efaba7fb0827eb9****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The IP address of the elastic network interface (ENI).</p>
             * 
             * <strong>example:</strong>
             * <p>116.162.XX.XX</p>
             */
            public Builder eip(String eip) {
                this.eip = eip;
                return this;
            }

            /**
             * <p>Indicates whether the asset is provided by Alibaba Cloud. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: yes.</li>
             * <li><strong>1</strong>: no.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flag(Integer flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The time at which the asset was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-16 18:17:16</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time at which the asset was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-21 10:40:01</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the group to which the server belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>12208928</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>443496</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The public IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.42.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The instance ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>c8ca91e0907d94efaba7fb0827eb9</p>
             */
            public Builder machineInstanceId(String machineInstanceId) {
                this.machineInstanceId = machineInstanceId;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder machineIp(String machineIp) {
                this.machineIp = machineIp;
                return this;
            }

            /**
             * <p>The type of the IP address for the server. Valid values include the following values:</p>
             * <ul>
             * <li><strong>ecs</strong>: the IP address of the Elastic Compute Service (ECS) instance.</li>
             * <li><strong>slb</strong>: the IP address of the Server Load Balancer (SLB) instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SLB</p>
             */
            public Builder machineIpType(String machineIpType) {
                this.machineIpType = machineIpType;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>security</p>
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * <p>The region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder machineRegion(String machineRegion) {
                this.machineRegion = machineRegion;
                return this;
            }

            /**
             * <p>The instance type of the server. Valid values include the following values:</p>
             * <ul>
             * <li><strong>ecs</strong></li>
             * <li><strong>slb</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>Indicates whether the Security Center agent is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The operating system of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The name of the operating system for the server.</p>
             * 
             * <strong>example:</strong>
             * <p>Debian  10.3 64</p>
             */
            public Builder osName(String osName) {
                this.osName = osName;
                return this;
            }

            /**
             * <p>The ID of the region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the server. Valid values include the following values:</p>
             * <ul>
             * <li><strong>Running</strong></li>
             * <li><strong>Waiting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
