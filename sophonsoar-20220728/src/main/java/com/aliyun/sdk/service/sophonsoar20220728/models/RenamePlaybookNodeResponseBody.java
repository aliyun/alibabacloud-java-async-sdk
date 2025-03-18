// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link RenamePlaybookNodeResponseBody} extends {@link TeaModel}
 *
 * <p>RenamePlaybookNodeResponseBody</p>
 */
public class RenamePlaybookNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RenameResult")
    private String renameResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RenamePlaybookNodeResponseBody model) {
            this.renameResult = model.renameResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned new name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_process</p>
         */
        public Builder renameResult(String renameResult) {
            this.renameResult = renameResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E1EC464-3BD7-518F-9937-BCC12E6855FE</p>
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
