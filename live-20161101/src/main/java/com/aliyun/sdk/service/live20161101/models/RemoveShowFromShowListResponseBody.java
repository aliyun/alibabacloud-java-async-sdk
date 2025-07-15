// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveShowFromShowListResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveShowFromShowListResponseBody</p>
 */
public class RemoveShowFromShowListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowId")
    private String showId;

    @com.aliyun.core.annotation.NameInMap("failedList")
    private String failedList;

    @com.aliyun.core.annotation.NameInMap("successfulShowIds")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RemoveShowFromShowListResponseBody model) {
            this.requestId = model.requestId;
            this.showId = model.showId;
            this.failedList = model.failedList;
            this.successfulShowIds = model.successfulShowIds;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the episode.</p>
         * 
         * <strong>example:</strong>
         * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
         */
        public Builder showId(String showId) {
            this.showId = showId;
            return this;
        }

        /**
         * <p>The IDs of episodes that failed to be removed and the relevant failure information.</p>
         * 
         * <strong>example:</strong>
         * <p>failedList[Show1, Show2...]</p>
         */
        public Builder failedList(String failedList) {
            this.failedList = failedList;
            return this;
        }

        /**
         * <p>The IDs of episodes that were removed.</p>
         * 
         * <strong>example:</strong>
         * <p>f1933f16-5467-4308-b3a9-e8d451a90999</p>
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
