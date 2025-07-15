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
 * {@link DeleteLiveStreamBlockResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveStreamBlockResponseBody</p>
 */
public class DeleteLiveStreamBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DeleteLiveStreamBlockResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveStreamBlockResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteLiveStreamBlockResponseBody model) {
            this.description = model.description;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The result description. If the request was successful, ok is returned. If the request failed, the failure detail is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B908FF89-B03C-4831-B55B-48D2A7DA0A68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>ok: The request was successful.</li>
         * <li>fail: The request failed.</li>
         * </ul>
         * <blockquote>
         * <p> If any parameter failed to be configured, the request failed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteLiveStreamBlockResponseBody build() {
            return new DeleteLiveStreamBlockResponseBody(this);
        } 

    } 

}
