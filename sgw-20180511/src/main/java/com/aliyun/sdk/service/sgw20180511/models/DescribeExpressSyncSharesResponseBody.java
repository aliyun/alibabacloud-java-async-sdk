// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressSyncSharesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressSyncSharesResponseBody</p>
 */
public class DescribeExpressSyncSharesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Shares")
    private Shares shares;

    @NameInMap("Success")
    private Boolean success;

    private DescribeExpressSyncSharesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.shares = builder.shares;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressSyncSharesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shares
     */
    public Shares getShares() {
        return this.shares;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Shares shares; 
        private Boolean success; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Shares.
         */
        public Builder shares(Shares shares) {
            this.shares = shares;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeExpressSyncSharesResponseBody build() {
            return new DescribeExpressSyncSharesResponseBody(this);
        } 

    } 

    public static class Share extends TeaModel {
        @NameInMap("ExpressSyncId")
        private String expressSyncId;

        @NameInMap("ExpressSyncState")
        private String expressSyncState;

        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("GatewayName")
        private String gatewayName;

        @NameInMap("GatewayRegion")
        private String gatewayRegion;

        @NameInMap("MnsQueue")
        private String mnsQueue;

        @NameInMap("ShareName")
        private String shareName;

        @NameInMap("StorageBundleId")
        private String storageBundleId;

        @NameInMap("SyncProgress")
        private Integer syncProgress;

        private Share(Builder builder) {
            this.expressSyncId = builder.expressSyncId;
            this.expressSyncState = builder.expressSyncState;
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.gatewayRegion = builder.gatewayRegion;
            this.mnsQueue = builder.mnsQueue;
            this.shareName = builder.shareName;
            this.storageBundleId = builder.storageBundleId;
            this.syncProgress = builder.syncProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Share create() {
            return builder().build();
        }

        /**
         * @return expressSyncId
         */
        public String getExpressSyncId() {
            return this.expressSyncId;
        }

        /**
         * @return expressSyncState
         */
        public String getExpressSyncState() {
            return this.expressSyncState;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return gatewayRegion
         */
        public String getGatewayRegion() {
            return this.gatewayRegion;
        }

        /**
         * @return mnsQueue
         */
        public String getMnsQueue() {
            return this.mnsQueue;
        }

        /**
         * @return shareName
         */
        public String getShareName() {
            return this.shareName;
        }

        /**
         * @return storageBundleId
         */
        public String getStorageBundleId() {
            return this.storageBundleId;
        }

        /**
         * @return syncProgress
         */
        public Integer getSyncProgress() {
            return this.syncProgress;
        }

        public static final class Builder {
            private String expressSyncId; 
            private String expressSyncState; 
            private String gatewayId; 
            private String gatewayName; 
            private String gatewayRegion; 
            private String mnsQueue; 
            private String shareName; 
            private String storageBundleId; 
            private Integer syncProgress; 

            /**
             * ExpressSyncId.
             */
            public Builder expressSyncId(String expressSyncId) {
                this.expressSyncId = expressSyncId;
                return this;
            }

            /**
             * ExpressSyncState.
             */
            public Builder expressSyncState(String expressSyncState) {
                this.expressSyncState = expressSyncState;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayName.
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * GatewayRegion.
             */
            public Builder gatewayRegion(String gatewayRegion) {
                this.gatewayRegion = gatewayRegion;
                return this;
            }

            /**
             * MnsQueue.
             */
            public Builder mnsQueue(String mnsQueue) {
                this.mnsQueue = mnsQueue;
                return this;
            }

            /**
             * ShareName.
             */
            public Builder shareName(String shareName) {
                this.shareName = shareName;
                return this;
            }

            /**
             * StorageBundleId.
             */
            public Builder storageBundleId(String storageBundleId) {
                this.storageBundleId = storageBundleId;
                return this;
            }

            /**
             * SyncProgress.
             */
            public Builder syncProgress(Integer syncProgress) {
                this.syncProgress = syncProgress;
                return this;
            }

            public Share build() {
                return new Share(this);
            } 

        } 

    }
    public static class Shares extends TeaModel {
        @NameInMap("Share")
        private java.util.List < Share> share;

        private Shares(Builder builder) {
            this.share = builder.share;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Shares create() {
            return builder().build();
        }

        /**
         * @return share
         */
        public java.util.List < Share> getShare() {
            return this.share;
        }

        public static final class Builder {
            private java.util.List < Share> share; 

            /**
             * Share.
             */
            public Builder share(java.util.List < Share> share) {
                this.share = share;
                return this;
            }

            public Shares build() {
                return new Shares(this);
            } 

        } 

    }
}
