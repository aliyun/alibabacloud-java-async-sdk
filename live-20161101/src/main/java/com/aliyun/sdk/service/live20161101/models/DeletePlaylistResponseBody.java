// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePlaylistResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePlaylistResponseBody</p>
 */
public class DeletePlaylistResponseBody extends TeaModel {
    @NameInMap("ProgramId")
    private String programId;

    @NameInMap("RequestId")
    private String requestId;

    private DeletePlaylistResponseBody(Builder builder) {
        this.programId = builder.programId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePlaylistResponseBody create() {
        return builder().build();
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

        /**
         * ProgramId.
         */
        public Builder programId(String programId) {
            this.programId = programId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePlaylistResponseBody build() {
            return new DeletePlaylistResponseBody(this);
        } 

    } 

}
