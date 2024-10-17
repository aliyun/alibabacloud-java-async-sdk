// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMediaMarksResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaMarksResponseBody</p>
 */
public class GetMediaMarksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("MediaMarks")
    private String mediaMarks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaMarksResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.mediaMarks = builder.mediaMarks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaMarksResponseBody create() {
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
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The queried marks.</p>
         * <ul>
         * <li>The value is in the JSONArray format.</li>
         * </ul>
         */
        public Builder mediaMarks(String mediaMarks) {
            this.mediaMarks = mediaMarks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaMarksResponseBody build() {
            return new GetMediaMarksResponseBody(this);
        } 

    } 

}
