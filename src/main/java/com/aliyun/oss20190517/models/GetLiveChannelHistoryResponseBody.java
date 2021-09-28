// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLiveChannelHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveChannelHistoryResponseBody</p>
 */
public class GetLiveChannelHistoryResponseBody extends TeaModel {
    @ParentIgnore("LiveChannelHistory")
    @NameInMap("LiveRecord")
    private java.util.List < LiveRecord > liveRecords;


    private GetLiveChannelHistoryResponseBody(Builder builder) {
        this.liveRecords = builder.liveRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveChannelHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveRecords
     */
    public java.util.List < LiveRecord > liveRecords() {
        return this.liveRecords;
    }

    public static final class Builder {
        private java.util.List < LiveRecord > liveRecords; 

        /**
         * <p>LiveRecord.</p>
         */
        public Builder liveRecords(java.util.List < LiveRecord > liveRecords) {
            this.liveRecords = liveRecords;
            return this;
        }

        public GetLiveChannelHistoryResponseBody build() {
            return new GetLiveChannelHistoryResponseBody(this);
        } 

    } 

}
