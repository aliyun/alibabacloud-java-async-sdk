// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaMarksResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMediaMarksResponseBody</p>
 */
public class UpdateMediaMarksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("MediaMarkIds")
    private String mediaMarkIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateMediaMarksResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.mediaMarkIds = builder.mediaMarkIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaMarksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return mediaMarkIds
     */
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mediaId; 
        private String mediaMarkIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateMediaMarksResponseBody model) {
            this.mediaId = model.mediaId;
            this.mediaMarkIds = model.mediaMarkIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>53afdf003a******6a16b5feac6402</p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The IDs of the successfully modified marks.</p>
         * 
         * <strong>example:</strong>
         * <p>mark-f82d<em><strong><strong>4994b0915948ef7e16,mark-3d56d</strong></strong></em>4c8fa9ae2a1f9e5d2d60</p>
         */
        public Builder mediaMarkIds(String mediaMarkIds) {
            this.mediaMarkIds = mediaMarkIds;
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

        public UpdateMediaMarksResponseBody build() {
            return new UpdateMediaMarksResponseBody(this);
        } 

    } 

}
