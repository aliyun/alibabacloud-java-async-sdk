// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemEffectionServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProblemEffectionServiceResponseBody</p>
 */
public class CreateProblemEffectionServiceResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateProblemEffectionServiceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemEffectionServiceResponseBody create() {
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

        public CreateProblemEffectionServiceResponseBody build() {
            return new CreateProblemEffectionServiceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("effectionServiceId")
        private Long effectionServiceId;

        private Data(Builder builder) {
            this.effectionServiceId = builder.effectionServiceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return effectionServiceId
         */
        public Long getEffectionServiceId() {
            return this.effectionServiceId;
        }

        public static final class Builder {
            private Long effectionServiceId; 

            /**
             * 影响服务id
             */
            public Builder effectionServiceId(Long effectionServiceId) {
                this.effectionServiceId = effectionServiceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
