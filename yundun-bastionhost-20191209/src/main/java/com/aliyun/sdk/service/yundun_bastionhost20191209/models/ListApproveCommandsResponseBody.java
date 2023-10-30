// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApproveCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApproveCommandsResponseBody</p>
 */
public class ListApproveCommandsResponseBody extends TeaModel {
    @NameInMap("ApproveCommands")
    private java.util.List < ApproveCommands> approveCommands;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListApproveCommandsResponseBody(Builder builder) {
        this.approveCommands = builder.approveCommands;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApproveCommandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return approveCommands
     */
    public java.util.List < ApproveCommands> getApproveCommands() {
        return this.approveCommands;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ApproveCommands> approveCommands; 
        private String requestId; 
        private Long totalCount; 

        /**
         * ApproveCommands.
         */
        public Builder approveCommands(java.util.List < ApproveCommands> approveCommands) {
            this.approveCommands = approveCommands;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApproveCommandsResponseBody build() {
            return new ListApproveCommandsResponseBody(this);
        } 

    } 

    public static class ApproveCommands extends TeaModel {
        @NameInMap("ApproveCommandId")
        private String approveCommandId;

        @NameInMap("AssetAccountName")
        private String assetAccountName;

        @NameInMap("AssetIp")
        private String assetIp;

        @NameInMap("AssetName")
        private String assetName;

        @NameInMap("ClientIp")
        private String clientIp;

        @NameInMap("ClientUser")
        private String clientUser;

        @NameInMap("Command")
        private String command;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ProtocolName")
        private String protocolName;

        @NameInMap("SessionId")
        private String sessionId;

        @NameInMap("State")
        private String state;

        private ApproveCommands(Builder builder) {
            this.approveCommandId = builder.approveCommandId;
            this.assetAccountName = builder.assetAccountName;
            this.assetIp = builder.assetIp;
            this.assetName = builder.assetName;
            this.clientIp = builder.clientIp;
            this.clientUser = builder.clientUser;
            this.command = builder.command;
            this.createTime = builder.createTime;
            this.protocolName = builder.protocolName;
            this.sessionId = builder.sessionId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproveCommands create() {
            return builder().build();
        }

        /**
         * @return approveCommandId
         */
        public String getApproveCommandId() {
            return this.approveCommandId;
        }

        /**
         * @return assetAccountName
         */
        public String getAssetAccountName() {
            return this.assetAccountName;
        }

        /**
         * @return assetIp
         */
        public String getAssetIp() {
            return this.assetIp;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return clientUser
         */
        public String getClientUser() {
            return this.clientUser;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String approveCommandId; 
            private String assetAccountName; 
            private String assetIp; 
            private String assetName; 
            private String clientIp; 
            private String clientUser; 
            private String command; 
            private String createTime; 
            private String protocolName; 
            private String sessionId; 
            private String state; 

            /**
             * ApproveCommandId.
             */
            public Builder approveCommandId(String approveCommandId) {
                this.approveCommandId = approveCommandId;
                return this;
            }

            /**
             * AssetAccountName.
             */
            public Builder assetAccountName(String assetAccountName) {
                this.assetAccountName = assetAccountName;
                return this;
            }

            /**
             * AssetIp.
             */
            public Builder assetIp(String assetIp) {
                this.assetIp = assetIp;
                return this;
            }

            /**
             * AssetName.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * ClientUser.
             */
            public Builder clientUser(String clientUser) {
                this.clientUser = clientUser;
                return this;
            }

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ProtocolName.
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public ApproveCommands build() {
                return new ApproveCommands(this);
            } 

        } 

    }
}
