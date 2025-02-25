// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceStatusResponseBody</p>
 */
public class GetServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
        @com.aliyun.core.annotation.NameInMap("HasRamPermissions")
        private Boolean hasRamPermissions;

        @com.aliyun.core.annotation.NameInMap("IsDlfServiceOpen")
        private Boolean isDlfServiceOpen;

        @com.aliyun.core.annotation.NameInMap("IsOssOpen")
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
