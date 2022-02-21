// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteVideoResponseBody</p>
 */
public class DeleteVideoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetId")
    private String setId;

    @NameInMap("VideoUri")
    private String videoUri;

    private DeleteVideoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.setId = builder.setId;
        this.videoUri = builder.videoUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    /**
     * @return videoUri
     */
    public String getVideoUri() {
        return this.videoUri;
    }

    public static final class Builder {
        private String requestId; 
        private String setId; 
        private String videoUri; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.setId = setId;
            return this;
        }

        /**
         * VideoUri.
         */
        public Builder videoUri(String videoUri) {
            this.videoUri = videoUri;
            return this;
        }

        public DeleteVideoResponseBody build() {
            return new DeleteVideoResponseBody(this);
        } 

    } 

}
