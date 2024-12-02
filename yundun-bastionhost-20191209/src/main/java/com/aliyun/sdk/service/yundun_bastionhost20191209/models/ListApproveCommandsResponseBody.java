// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListApproveCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListApproveCommandsResponseBody</p>
 */
public class ListApproveCommandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApproveCommands")
    private java.util.List < ApproveCommands> approveCommands;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The commands to be reviewed.</p>
         */
        public Builder approveCommands(java.util.List < ApproveCommands> approveCommands) {
            this.approveCommands = approveCommands;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E3EF7711-766D-5888-997B-EFBA76809229</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of commands to be reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApproveCommandsResponseBody build() {
            return new ListApproveCommandsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApproveCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>ListApproveCommandsResponseBody</p>
     */
    public static class ApproveCommands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveCommandId")
        private String approveCommandId;

        @com.aliyun.core.annotation.NameInMap("AssetAccountName")
        private String assetAccountName;

        @com.aliyun.core.annotation.NameInMap("AssetIp")
        private String assetIp;

        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("ClientUser")
        private String clientUser;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ProtocolName")
        private String protocolName;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The ID of the command to be reviewed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder approveCommandId(String approveCommandId) {
                this.approveCommandId = approveCommandId;
                return this;
            }

            /**
             * <p>The username of the asset account that is used for O&amp;M.</p>
             * 
             * <strong>example:</strong>
             * <p>root</p>
             */
            public Builder assetAccountName(String assetAccountName) {
                this.assetAccountName = assetAccountName;
                return this;
            }

            /**
             * <p>The IP address of the asset for O&amp;M.</p>
             * 
             * <strong>example:</strong>
             * <p>10.167.XX.XX</p>
             */
            public Builder assetIp(String assetIp) {
                this.assetIp = assetIp;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>poros-test</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The source IP address from which the application is submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>172.18.XX.XX</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>The Bastionhost user who submitted the O&amp;M application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clientUser(String clientUser) {
                this.clientUser = clientUser;
                return this;
            }

            /**
             * <p>The command to be reviewed.</p>
             * 
             * <strong>example:</strong>
             * <p>/bin/bash</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The time when the O&amp;M application was submitted. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1679393152</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The O&amp;M protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>SSH</p>
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            /**
             * <p>The ID of the O&amp;M session that triggered the review.</p>
             * 
             * <strong>example:</strong>
             * <p>95f873ab64a76d5b0000000000004d5e</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The status of the review. Valid values: <strong>Wait</strong>: The command is pending review.</p>
             * 
             * <strong>example:</strong>
             * <p>Wait</p>
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
