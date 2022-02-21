// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceStatusResponseBody</p>
 */
public class GetServiceStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetServiceStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceStatusResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceStatusResponseBody build() {
            return new GetServiceStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HasRamPermissions")
        private Boolean hasRamPermissions;

        @NameInMap("IsDlfServiceOpen")
        private Boolean isDlfServiceOpen;

        @NameInMap("IsOssOpen")
        private Boolean isOssOpen;

        private Data(Builder builder) {
            this.hasRamPermissions = builder.hasRamPermissions;
            this.isDlfServiceOpen = builder.isDlfServiceOpen;
            this.isOssOpen = builder.isOssOpen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hasRamPermissions
         */
        public Boolean getHasRamPermissions() {
            return this.hasRamPermissions;
        }

        /**
         * @return isDlfServiceOpen
         */
        public Boolean getIsDlfServiceOpen() {
            return this.isDlfServiceOpen;
        }

        /**
         * @return isOssOpen
         */
        public Boolean getIsOssOpen() {
            return this.isOssOpen;
        }

        public static final class Builder {
            private Boolean hasRamPermissions; 
            private Boolean isDlfServiceOpen; 
            private Boolean isOssOpen; 

            /**
             * HasRamPermissions.
             */
            public Builder hasRamPermissions(Boolean hasRamPermissions) {
                this.hasRamPermissions = hasRamPermissions;
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
             * IsOssOpen.
             */
            public Builder isOssOpen(Boolean isOssOpen) {
                this.isOssOpen = isOssOpen;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
