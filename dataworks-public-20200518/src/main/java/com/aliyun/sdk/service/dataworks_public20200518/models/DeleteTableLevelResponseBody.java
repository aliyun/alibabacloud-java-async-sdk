// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTableLevelResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTableLevelResponseBody</p>
 */
public class DeleteTableLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeleteResult")
    private Boolean deleteResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteTableLevelResponseBody(Builder builder) {
        this.deleteResult = builder.deleteResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableLevelResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleteResult
     */
    public Boolean getDeleteResult() {
        return this.deleteResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean deleteResult; 
        private String requestId; 

        /**
         * <p>Indicates whether the table level was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteResult(Boolean deleteResult) {
            this.deleteResult = deleteResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abcde</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTableLevelResponseBody build() {
            return new DeleteTableLevelResponseBody(this);
        } 

    } 

}
