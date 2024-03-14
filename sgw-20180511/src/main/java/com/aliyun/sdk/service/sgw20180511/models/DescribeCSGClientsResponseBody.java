// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCSGClientsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCSGClientsResponseBody</p>
 */
public class DescribeCSGClientsResponseBody extends TeaModel {
    @NameInMap("Clients")
    private java.util.List < Clients> clients;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCSGClientsResponseBody(Builder builder) {
        this.clients = builder.clients;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCSGClientsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clients
     */
    public java.util.List < Clients> getClients() {
        return this.clients;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Clients> clients; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Clients.
         */
        public Builder clients(java.util.List < Clients> clients) {
            this.clients = clients;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCSGClientsResponseBody build() {
            return new DescribeCSGClientsResponseBody(this);
        } 

    } 

    public static class Clients extends TeaModel {
        @NameInMap("ClientDeletionCommand")
        private String clientDeletionCommand;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("ClientInstallationCommand")
        private String clientInstallationCommand;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("HostInstanceId")
        private String hostInstanceId;

        @NameInMap("LastHeartbeatTime")
        private Long lastHeartbeatTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("WorkDirectory")
        private String workDirectory;

        private Clients(Builder builder) {
            this.clientDeletionCommand = builder.clientDeletionCommand;
            this.clientId = builder.clientId;
            this.clientInstallationCommand = builder.clientInstallationCommand;
            this.clientVersion = builder.clientVersion;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.hostInstanceId = builder.hostInstanceId;
            this.lastHeartbeatTime = builder.lastHeartbeatTime;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.workDirectory = builder.workDirectory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clients create() {
            return builder().build();
        }

        /**
         * @return clientDeletionCommand
         */
        public String getClientDeletionCommand() {
            return this.clientDeletionCommand;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return clientInstallationCommand
         */
        public String getClientInstallationCommand() {
            return this.clientInstallationCommand;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return hostInstanceId
         */
        public String getHostInstanceId() {
            return this.hostInstanceId;
        }

        /**
         * @return lastHeartbeatTime
         */
        public Long getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return workDirectory
         */
        public String getWorkDirectory() {
            return this.workDirectory;
        }

        public static final class Builder {
            private String clientDeletionCommand; 
            private String clientId; 
            private String clientInstallationCommand; 
            private String clientVersion; 
            private String ecsInstanceId; 
            private String hostInstanceId; 
            private Long lastHeartbeatTime; 
            private String status; 
            private String vpcId; 
            private String workDirectory; 

            /**
             * ClientDeletionCommand.
             */
            public Builder clientDeletionCommand(String clientDeletionCommand) {
                this.clientDeletionCommand = clientDeletionCommand;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * ClientInstallationCommand.
             */
            public Builder clientInstallationCommand(String clientInstallationCommand) {
                this.clientInstallationCommand = clientInstallationCommand;
                return this;
            }

            /**
             * ClientVersion.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * EcsInstanceId.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * HostInstanceId.
             */
            public Builder hostInstanceId(String hostInstanceId) {
                this.hostInstanceId = hostInstanceId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WorkDirectory.
             */
            public Builder workDirectory(String workDirectory) {
                this.workDirectory = workDirectory;
                return this;
            }

            public Clients build() {
                return new Clients(this);
            } 

        } 

    }
}
