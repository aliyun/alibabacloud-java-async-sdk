// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemMeasureResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProblemMeasureResponseBody</p>
 */
public class CreateProblemMeasureResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateProblemMeasureResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemMeasureResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProblemMeasureResponseBody build() {
            return new CreateProblemMeasureResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("measureId")
        private Long measureId;

        private Data(Builder builder) {
            this.measureId = builder.measureId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return measureId
         */
        public Long getMeasureId() {
            return this.measureId;
        }

        public static final class Builder {
            private Long measureId; 

            /**
             * 故障措施Id
             */
            public Builder measureId(Long measureId) {
                this.measureId = measureId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
