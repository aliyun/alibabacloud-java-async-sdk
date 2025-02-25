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
    @com.aliyun.core.annotation.NameInMap("NonExistVideoIds")
    private java.util.List<String> nonExistVideoIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnRemoveableVideoIds")
    private java.util.List<String> unRemoveableVideoIds;

    private DeleteMezzaninesResponseBody(Builder builder) {
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
        private java.util.List<String> nonExistVideoIds; 
        private String requestId; 
        private java.util.List<String> unRemoveableVideoIds; 

        /**
         * <p>The IDs of the audio or video files that do not exist.</p>
         */
        public Builder nonExistVideoIds(java.util.List<String> nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IDs of the audio or video files whose source files cannot be deleted.</p>
         * <blockquote>
         * <p> In most cases, source files cannot be deleted if they are used for original-quality playback or you do not have required permissions to delete them. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
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
