// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncRCKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>SyncRCKeyPairResponseBody</p>
 */
public class SyncRCKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SyncRCKeyPairResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncRCKeyPairResponseBody create() {
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

        public SyncRCKeyPairResponseBody build() {
            return new SyncRCKeyPairResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsSyncInfo")
        private Boolean isSyncInfo;

        private Data(Builder builder) {
            this.isSyncInfo = builder.isSyncInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return isSyncInfo
         */
        public Boolean getIsSyncInfo() {
            return this.isSyncInfo;
        }

        public static final class Builder {
            private Boolean isSyncInfo; 

            /**
             * IsSyncInfo.
             */
            public Builder isSyncInfo(Boolean isSyncInfo) {
                this.isSyncInfo = isSyncInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
