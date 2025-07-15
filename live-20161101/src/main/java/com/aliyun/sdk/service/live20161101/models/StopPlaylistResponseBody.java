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
 * {@link StopPlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>StopPlaylistResponseBody</p>
 */
public class StopPlaylistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProgramId")
    private String programId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StopPlaylistResponseBody(Builder builder) {
        this.programId = builder.programId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPlaylistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String programId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(StopPlaylistResponseBody model) {
            this.programId = model.programId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the episode list.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder programId(String programId) {
            this.programId = programId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0d-f228-4a64-af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StopPlaylistResponseBody build() {
            return new StopPlaylistResponseBody(this);
        } 

    } 

}
