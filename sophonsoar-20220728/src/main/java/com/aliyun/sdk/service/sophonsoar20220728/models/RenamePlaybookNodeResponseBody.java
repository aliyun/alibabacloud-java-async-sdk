// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenamePlaybookNodeResponseBody} extends {@link TeaModel}
 *
 * <p>RenamePlaybookNodeResponseBody</p>
 */
public class RenamePlaybookNodeResponseBody extends TeaModel {
    @NameInMap("RenameResult")
    private String renameResult;

    @NameInMap("RequestId")
    private String requestId;

    private RenamePlaybookNodeResponseBody(Builder builder) {
        this.renameResult = builder.renameResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenamePlaybookNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return renameResult
     */
    public String getRenameResult() {
        return this.renameResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String renameResult; 
        private String requestId; 

        /**
         * RenameResult.
         */
        public Builder renameResult(String renameResult) {
            this.renameResult = renameResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenamePlaybookNodeResponseBody build() {
            return new RenamePlaybookNodeResponseBody(this);
        } 

    } 

}
