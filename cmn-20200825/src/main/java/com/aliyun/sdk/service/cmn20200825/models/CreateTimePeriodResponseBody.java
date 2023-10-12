// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTimePeriodResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTimePeriodResponseBody</p>
 */
public class CreateTimePeriodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimePeriodId")
    private String timePeriodId;

    private CreateTimePeriodResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timePeriodId = builder.timePeriodId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTimePeriodResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timePeriodId
     */
    public String getTimePeriodId() {
        return this.timePeriodId;
    }

    public static final class Builder {
        private String requestId; 
        private String timePeriodId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimePeriodId.
         */
        public Builder timePeriodId(String timePeriodId) {
            this.timePeriodId = timePeriodId;
            return this;
        }

        public CreateTimePeriodResponseBody build() {
            return new CreateTimePeriodResponseBody(this);
        } 

    } 

}
