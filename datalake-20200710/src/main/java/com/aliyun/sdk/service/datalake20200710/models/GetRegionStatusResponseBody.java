// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegionStatusResponseBody</p>
 */
public class GetRegionStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private GetRegionStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionStatusResponseBody create() {
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private String success; 

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

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetRegionStatusResponseBody build() {
            return new GetRegionStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccountStatus")
        private String accountStatus;

        @NameInMap("IsDependencyReady")
        private Boolean isDependencyReady;

        @NameInMap("IsDlfServiceOpen")
        private Boolean isDlfServiceOpen;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionStatus")
        private String regionStatus;

        private Data(Builder builder) {
            this.accountStatus = builder.accountStatus;
            this.isDependencyReady = builder.isDependencyReady;
            this.isDlfServiceOpen = builder.isDlfServiceOpen;
            this.regionId = builder.regionId;
            this.regionStatus = builder.regionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return isDependencyReady
         */
        public Boolean getIsDependencyReady() {
            return this.isDependencyReady;
        }

        /**
         * @return isDlfServiceOpen
         */
        public Boolean getIsDlfServiceOpen() {
            return this.isDlfServiceOpen;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionStatus
         */
        public String getRegionStatus() {
            return this.regionStatus;
        }

        public static final class Builder {
            private String accountStatus; 
            private Boolean isDependencyReady; 
            private Boolean isDlfServiceOpen; 
            private String regionId; 
            private String regionStatus; 

            /**
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * IsDependencyReady.
             */
            public Builder isDependencyReady(Boolean isDependencyReady) {
                this.isDependencyReady = isDependencyReady;
                return this;
            }

            /**
             * IsDlfServiceOpen.
             */
            public Builder isDlfServiceOpen(Boolean isDlfServiceOpen) {
                this.isDlfServiceOpen = isDlfServiceOpen;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionStatus.
             */
            public Builder regionStatus(String regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
