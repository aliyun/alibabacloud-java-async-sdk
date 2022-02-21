// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupGatewayListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupGatewayListResponseBody</p>
 */
public class DescribeBackupGatewayListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalElements")
    private Integer totalElements;

    @NameInMap("TotalPages")
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

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalElements.
         */
        public Builder totalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeBackupGatewayListResponseBody build() {
            return new DescribeBackupGatewayListResponseBody(this);
        } 

    } 

    public static class BackupGateway extends TeaModel {
        @NameInMap("BackupGatewayCreateTime")
        private Long backupGatewayCreateTime;

        @NameInMap("BackupGatewayId")
        private String backupGatewayId;

        @NameInMap("BackupGatewayStatus")
        private String backupGatewayStatus;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("LastHeartbeatTime")
        private Long lastHeartbeatTime;

        @NameInMap("Region")
        private String region;

        @NameInMap("SourceEndpointHostname")
        private String sourceEndpointHostname;

        @NameInMap("SourceEndpointInternetIP")
        private String sourceEndpointInternetIP;

        @NameInMap("SourceEndpointIntranetIP")
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

            /**
             * BackupGatewayCreateTime.
             */
            public Builder backupGatewayCreateTime(Long backupGatewayCreateTime) {
                this.backupGatewayCreateTime = backupGatewayCreateTime;
                return this;
            }

            /**
             * BackupGatewayId.
             */
            public Builder backupGatewayId(String backupGatewayId) {
                this.backupGatewayId = backupGatewayId;
                return this;
            }

            /**
             * BackupGatewayStatus.
             */
            public Builder backupGatewayStatus(String backupGatewayStatus) {
                this.backupGatewayStatus = backupGatewayStatus;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * LastHeartbeatTime.
             */
            public Builder lastHeartbeatTime(Long lastHeartbeatTime) {
                this.lastHeartbeatTime = lastHeartbeatTime;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * SourceEndpointHostname.
             */
            public Builder sourceEndpointHostname(String sourceEndpointHostname) {
                this.sourceEndpointHostname = sourceEndpointHostname;
                return this;
            }

            /**
             * SourceEndpointInternetIP.
             */
            public Builder sourceEndpointInternetIP(String sourceEndpointInternetIP) {
                this.sourceEndpointInternetIP = sourceEndpointInternetIP;
                return this;
            }

            /**
             * SourceEndpointIntranetIP.
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
    public static class Items extends TeaModel {
        @NameInMap("BackupGateway")
        private java.util.List < BackupGateway> backupGateway;

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
        public java.util.List < BackupGateway> getBackupGateway() {
            return this.backupGateway;
        }

        public static final class Builder {
            private java.util.List < BackupGateway> backupGateway; 

            /**
             * BackupGateway.
             */
            public Builder backupGateway(java.util.List < BackupGateway> backupGateway) {
                this.backupGateway = backupGateway;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
