// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommonSwitchConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommonSwitchConfigResponseBody</p>
 */
public class GetCommonSwitchConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetCommonSwitchConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommonSwitchConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCommonSwitchConfigResponseBody build() {
            return new GetCommonSwitchConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TargetDefault")
        private String targetDefault;

        @NameInMap("TargetSyncStatus")
        private String targetSyncStatus;

        private Data(Builder builder) {
            this.targetDefault = builder.targetDefault;
            this.targetSyncStatus = builder.targetSyncStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return targetDefault
         */
        public String getTargetDefault() {
            return this.targetDefault;
        }

        /**
         * @return targetSyncStatus
         */
        public String getTargetSyncStatus() {
            return this.targetSyncStatus;
        }

        public static final class Builder {
            private String targetDefault; 
            private String targetSyncStatus; 

            /**
             * Specifies whether to turn on the switch for newly added servers. Valid values:
             * <p>
             * 
             * *   **add**: By default, the switch is turned on for newly added servers.
             * *   **del**: By default, the switch is turned off for newly added servers.
             */
            public Builder targetDefault(String targetDefault) {
                this.targetDefault = targetDefault;
                return this;
            }

            /**
             * The status of the synchronization. Valid values:
             * <p>
             * 
             * *   **sync**: The modifications are being synchronized.
             * *   **valid**: The modifications has taken effect.
             */
            public Builder targetSyncStatus(String targetSyncStatus) {
                this.targetSyncStatus = targetSyncStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
