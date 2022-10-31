// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveShowFromShowListResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveShowFromShowListResponseBody</p>
 */
public class RemoveShowFromShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ShowId")
    private String showId;

    @NameInMap("failedList")
    private String failedList;

    @NameInMap("successfulShowIds")
    private String successfulShowIds;

    private RemoveShowFromShowListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.showId = builder.showId;
        this.failedList = builder.failedList;
        this.successfulShowIds = builder.successfulShowIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveShowFromShowListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showId
     */
    public String getShowId() {
        return this.showId;
    }

    /**
     * @return failedList
     */
    public String getFailedList() {
        return this.failedList;
    }

    /**
     * @return successfulShowIds
     */
    public String getSuccessfulShowIds() {
        return this.successfulShowIds;
    }

    public static final class Builder {
        private String requestId; 
        private String showId; 
        private String failedList; 
        private String successfulShowIds; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowId.
         */
        public Builder showId(String showId) {
            this.showId = showId;
            return this;
        }

        /**
         * failedList.
         */
        public Builder failedList(String failedList) {
            this.failedList = failedList;
            return this;
        }

        /**
         * successfulShowIds.
         */
        public Builder successfulShowIds(String successfulShowIds) {
            this.successfulShowIds = successfulShowIds;
            return this;
        }

        public RemoveShowFromShowListResponseBody build() {
            return new RemoveShowFromShowListResponseBody(this);
        } 

    } 

}
