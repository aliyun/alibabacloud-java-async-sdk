// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribeBackupGatewayListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupGatewayListResponseBody</p>
 */
public class DescribeBackupGatewayListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalElements")
    private Integer totalElements;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeBackupGatewayListResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalElements = builder.totalElements;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupGatewayListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalElements
     */
    public Integer getTotalElements() {
        return this.totalElements;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Items items; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalElements; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(DescribeBackupGatewayListResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalElements = model.totalElements;
            this.totalPages = model.totalPages;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * <p>The details of backup gateways.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>46361705-8531-492F-807E-A97E482DD4A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of backup gateways.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeBackupGatewayListResponseBody build() {
            return new DescribeBackupGatewayListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupGatewayListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupGatewayListResponseBody</p>
     */
    public static class BackupGateway extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupGatewayCreateTime")
        private Long backupGatewayCreateTime;

        @com.aliyun.core.annotation.NameInMap("BackupGatewayId")
        private String backupGatewayId;

        @com.aliyun.core.annotation.NameInMap("BackupGatewayStatus")
        private String backupGatewayStatus;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("LastHeartbeatTime")
        private Long lastHeartbeatTime;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointHostname")
        private String sourceEndpointHostname;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInternetIP")
        private String sourceEndpointInternetIP;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointIntranetIP")
        private String sourceEndpointIntranetIP;

        private BackupGateway(Builder builder) {
            this.backupGatewayCreateTime = builder.backupGatewayCreateTime;
            this.backupGatewayId = builder.backupGatewayId;
            this.backupGatewayStatus = builder.backupGatewayStatus;
            this.displayName = builder.displayName;
            this.identifier = builder.identifier;
            this.lastHeartbeatTime = builder.lastHeartbeatTime;
            this.region = builder.region;
            this.sourceEndpointHostname = builder.sourceEndpointHostname;
            this.sourceEndpointInternetIP = builder.sourceEndpointInternetIP;
            this.sourceEndpointIntranetIP = builder.sourceEndpointIntranetIP;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupGateway create() {
            return builder().build();
        }

        /**
         * @return backupGatewayCreateTime
         */
        public Long getBackupGatewayCreateTime() {
            return this.backupGatewayCreateTime;
        }

        /**
         * @return backupGatewayId
         */
        public String getBackupGatewayId() {
            return this.backupGatewayId;
        }

        /**
         * @return backupGatewayStatus
         */
        public String getBackupGatewayStatus() {
            return this.backupGatewayStatus;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return lastHeartbeatTime
         */
        public Long getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return sourceEndpointHostname
         */
        public String getSourceEndpointHostname() {
            return this.sourceEndpointHostname;
        }

        /**
         * @return sourceEndpointInternetIP
         */
        public String getSourceEndpointInternetIP() {
            return this.sourceEndpointInternetIP;
        }

        /**
         * @return sourceEndpointIntranetIP
         */
        public String getSourceEndpointIntranetIP() {
            return this.sourceEndpointIntranetIP;
        }

        public static final class Builder {
            private Long backupGatewayCreateTime; 
            private String backupGatewayId; 
            private String backupGatewayStatus; 
            private String displayName; 
            private String identifier; 
            private Long lastHeartbeatTime; 
            private String region; 
            private String sourceEndpointHostname; 
            private String sourceEndpointInternetIP; 
            private String sourceEndpointIntranetIP; 

            private Builder() {
            } 

            private Builder(BackupGateway model) {
                this.backupGatewayCreateTime = model.backupGatewayCreateTime;
                this.backupGatewayId = model.backupGatewayId;
                this.backupGatewayStatus = model.backupGatewayStatus;
                this.displayName = model.displayName;
                this.identifier = model.identifier;
                this.lastHeartbeatTime = model.lastHeartbeatTime;
                this.region = model.region;
                this.sourceEndpointHostname = model.sourceEndpointHostname;
                this.sourceEndpointInternetIP = model.sourceEndpointInternetIP;
                this.sourceEndpointIntranetIP = model.sourceEndpointIntranetIP;
            } 

            /**
             * <p>The time when the backup gateway was created, such as 1554560477000.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder backupGatewayCreateTime(Long backupGatewayCreateTime) {
                this.backupGatewayCreateTime = backupGatewayCreateTime;
                return this;
            }

            /**
             * <p>The ID of the backup gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>2321313123</p>
             */
            public Builder backupGatewayId(String backupGatewayId) {
                this.backupGatewayId = backupGatewayId;
                return this;
            }

            /**
             * <p>The status of the backup gateway. Valid values:</p>
             * <ul>
             * <li>ONLINE: The backup gateway is online.</li>
             * <li>OFFLINE: The backup gateway is offline.</li>
             * <li>STOPPED: The backup gateway is stopped.</li>
             * <li>UPGRADING: The backup gateway is being upgraded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder backupGatewayStatus(String backupGatewayStatus) {
                this.backupGatewayStatus = backupGatewayStatus;
                return this;
            }

            /**
             * <p>The display name of the backup gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The unique identifier of the backup gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>sgdsajhdgu</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The last time when a heartbeat message was sent, such as 1554560477000.</p>
             * 
             * <strong>example:</strong>
             * <p>1554560477000</p>
             */
            public Builder lastHeartbeatTime(Long lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The name of the host on which the backup gateway is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sourceEndpointHostname(String sourceEndpointHostname) {
                this.sourceEndpointHostname = sourceEndpointHostname;
                return this;
            }

            /**
             * <p>The public IP address of the host on which the backup gateway is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>XX.XX.XX.XX</p>
             */
            public Builder sourceEndpointInternetIP(String sourceEndpointInternetIP) {
                this.sourceEndpointInternetIP = sourceEndpointInternetIP;
                return this;
            }

            /**
             * <p>The private IP address of the host on which the backup gateway is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>XX.XX.XX.XX</p>
             */
            public Builder sourceEndpointIntranetIP(String sourceEndpointIntranetIP) {
                this.sourceEndpointIntranetIP = sourceEndpointIntranetIP;
                return this;
            }

            public BackupGateway build() {
                return new BackupGateway(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupGatewayListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupGatewayListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupGateway")
        private java.util.List<BackupGateway> backupGateway;

        private Items(Builder builder) {
            this.backupGateway = builder.backupGateway;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backupGateway
         */
        public java.util.List<BackupGateway> getBackupGateway() {
            return this.backupGateway;
        }

        public static final class Builder {
            private java.util.List<BackupGateway> backupGateway; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.backupGateway = model.backupGateway;
            } 

            /**
             * BackupGateway.
             */
            public Builder backupGateway(java.util.List<BackupGateway> backupGateway) {
                this.backupGateway = backupGateway;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
