// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemTimelinesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProblemTimelinesResponseBody</p>
 */
public class CreateProblemTimelinesResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateProblemTimelinesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProblemTimelinesResponseBody create() {
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
         * data
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

        public CreateProblemTimelinesResponseBody build() {
            return new CreateProblemTimelinesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("problemTimelineIds")
        private java.util.List < Long > problemTimelineIds;

        private Data(Builder builder) {
            this.problemTimelineIds = builder.problemTimelineIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return problemTimelineIds
         */
        public java.util.List < Long > getProblemTimelineIds() {
            return this.problemTimelineIds;
        }

        public static final class Builder {
            private java.util.List < Long > problemTimelineIds; 

            /**
             * problemTimelineIds.
             */
            public Builder problemTimelineIds(java.util.List < Long > problemTimelineIds) {
                this.problemTimelineIds = problemTimelineIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
