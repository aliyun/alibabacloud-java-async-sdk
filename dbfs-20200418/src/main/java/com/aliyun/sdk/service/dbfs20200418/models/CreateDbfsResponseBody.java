// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDbfsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDbfsResponseBody</p>
 */
public class CreateDbfsResponseBody extends TeaModel {
    @NameInMap("FsId")
    private String fsId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDbfsResponseBody(Builder builder) {
        this.fsId = builder.fsId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDbfsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fsId
     */
    public String getFsId() {
        return this.fsId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fsId; 
        private String requestId; 

        /**
         * FsId.
         */
        public Builder fsId(String fsId) {
            this.fsId = fsId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDbfsResponseBody build() {
            return new CreateDbfsResponseBody(this);
        } 

    } 

}
