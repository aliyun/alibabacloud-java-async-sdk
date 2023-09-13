// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaMarksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaMarksResponseBody</p>
 */
public class ListMediaMarksResponseBody extends TeaModel {
    @NameInMap("MediaId")
    private String mediaId;

    @NameInMap("MediaMarks")
    private String mediaMarks;

    @NameInMap("RequestId")
    private String requestId;

    private ListMediaMarksResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.mediaMarks = builder.mediaMarks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaMarksResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaMarks
     */
    public String getMediaMarks() {
        return this.mediaMarks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mediaId; 
        private String mediaMarks; 
        private String requestId; 

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * MediaMarks.
         */
        public Builder mediaMarks(String mediaMarks) {
            this.mediaMarks = mediaMarks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaMarksResponseBody build() {
            return new ListMediaMarksResponseBody(this);
        } 

    } 

}
