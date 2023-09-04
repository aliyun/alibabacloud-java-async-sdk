// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTenantStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetTenantStatusResponseBody</p>
 */
public class GetTenantStatusResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetTenantStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTenantStatusResponseBody create() {
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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTenantStatusResponseBody build() {
            return new GetTenantStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("tenantStatus")
        private Integer tenantStatus;

        private Data(Builder builder) {
            this.tenantStatus = builder.tenantStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tenantStatus
         */
        public Integer getTenantStatus() {
            return this.tenantStatus;
        }

        public static final class Builder {
            private Integer tenantStatus; 

            /**
             * tenantStatus.
             */
            public Builder tenantStatus(Integer tenantStatus) {
                this.tenantStatus = tenantStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
