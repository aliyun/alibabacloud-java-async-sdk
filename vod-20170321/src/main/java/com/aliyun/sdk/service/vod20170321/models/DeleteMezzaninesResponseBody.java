// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteMezzaninesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMezzaninesResponseBody</p>
 */
public class DeleteMezzaninesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistReferenceIds")
    private java.util.List<String> nonExistReferenceIds;

    @com.aliyun.core.annotation.NameInMap("NonExistVideoIds")
    private java.util.List<String> nonExistVideoIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnRemoveableVideoIds")
    private java.util.List<String> unRemoveableVideoIds;

    private DeleteMezzaninesResponseBody(Builder builder) {
        this.nonExistReferenceIds = builder.nonExistReferenceIds;
        this.nonExistVideoIds = builder.nonExistVideoIds;
        this.requestId = builder.requestId;
        this.unRemoveableVideoIds = builder.unRemoveableVideoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMezzaninesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nonExistReferenceIds
     */
    public java.util.List<String> getNonExistReferenceIds() {
        return this.nonExistReferenceIds;
    }

    /**
     * @return nonExistVideoIds
     */
    public java.util.List<String> getNonExistVideoIds() {
        return this.nonExistVideoIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unRemoveableVideoIds
     */
    public java.util.List<String> getUnRemoveableVideoIds() {
        return this.unRemoveableVideoIds;
    }

    public static final class Builder {
        private java.util.List<String> nonExistReferenceIds; 
        private java.util.List<String> nonExistVideoIds; 
        private String requestId; 
        private java.util.List<String> unRemoveableVideoIds; 

        private Builder() {
        } 

        private Builder(DeleteMezzaninesResponseBody model) {
            this.nonExistReferenceIds = model.nonExistReferenceIds;
            this.nonExistVideoIds = model.nonExistVideoIds;
            this.requestId = model.requestId;
            this.unRemoveableVideoIds = model.unRemoveableVideoIds;
        } 

        /**
         * <p>The list of custom IDs that do not exist.</p>
         */
        public Builder nonExistReferenceIds(java.util.List<String> nonExistReferenceIds) {
            this.nonExistReferenceIds = nonExistReferenceIds;
            return this;
        }

        /**
         * <p>The list of audio or video IDs that do not exist.</p>
         */
        public Builder nonExistVideoIds(java.util.List<String> nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of audio or video IDs that cannot be deleted.</p>
         * <blockquote>
         * <p>This is typically because the source file is used as the original stream (if the video transcoding pattern is no transcoding or asynchronous transcoding, the source file is used as the original stream for playback and cannot be deleted by default) or because of insufficient <a href="https://help.aliyun.com/document_detail/113600.html">permissions</a>.</p>
         * </blockquote>
         */
        public Builder unRemoveableVideoIds(java.util.List<String> unRemoveableVideoIds) {
            this.unRemoveableVideoIds = unRemoveableVideoIds;
            return this;
        }

        public DeleteMezzaninesResponseBody build() {
            return new DeleteMezzaninesResponseBody(this);
        } 

    } 

}
