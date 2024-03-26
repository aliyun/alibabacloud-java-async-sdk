// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMezzaninesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMezzaninesResponseBody</p>
 */
public class DeleteMezzaninesResponseBody extends TeaModel {
    @NameInMap("NonExistVideoIds")
    private java.util.List < String > nonExistVideoIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UnRemoveableVideoIds")
    private java.util.List < String > unRemoveableVideoIds;

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
    public java.util.List < String > getNonExistVideoIds() {
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
    public java.util.List < String > getUnRemoveableVideoIds() {
        return this.unRemoveableVideoIds;
    }

    public static final class Builder {
        private java.util.List < String > nonExistVideoIds; 
        private String requestId; 
        private java.util.List < String > unRemoveableVideoIds; 

        /**
         * The IDs of the audio or video files that do not exist.
         */
        public Builder nonExistVideoIds(java.util.List < String > nonExistVideoIds) {
            this.nonExistVideoIds = nonExistVideoIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The IDs of the audio or video files whose source files cannot be deleted.
         * <p>
         * 
         * >  In most cases, source files cannot be deleted if they are used for original-quality playback or you do not have required permissions to delete them. For more information, see [Overview](~~113600~~).
         */
        public Builder unRemoveableVideoIds(java.util.List < String > unRemoveableVideoIds) {
            this.unRemoveableVideoIds = unRemoveableVideoIds;
            return this;
        }

        public DeleteMezzaninesResponseBody build() {
            return new DeleteMezzaninesResponseBody(this);
        } 

    } 

}
