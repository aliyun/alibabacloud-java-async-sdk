// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemTimelineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProblemTimelineResponseBody</p>
 */
public class CreateProblemTimelineResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateProblemTimelineResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemTimelineResponseBody create() {
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
         * Object
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProblemTimelineResponseBody build() {
            return new CreateProblemTimelineResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("problemTimelineId")
        private Long problemTimelineId;

        private Data(Builder builder) {
            this.problemTimelineId = builder.problemTimelineId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return problemTimelineId
         */
        public Long getProblemTimelineId() {
            return this.problemTimelineId;
        }

        public static final class Builder {
            private Long problemTimelineId; 

            /**
             * 故障事件线id
             */
            public Builder problemTimelineId(Long problemTimelineId) {
                this.problemTimelineId = problemTimelineId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
