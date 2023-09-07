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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
             * TargetDefault.
             */
            public Builder targetDefault(String targetDefault) {
                this.targetDefault = targetDefault;
                return this;
            }

            /**
             * TargetSyncStatus.
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
