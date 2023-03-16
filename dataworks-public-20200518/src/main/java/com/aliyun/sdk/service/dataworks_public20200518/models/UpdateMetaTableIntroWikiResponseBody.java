// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaTableIntroWikiResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMetaTableIntroWikiResponseBody</p>
 */
public class UpdateMetaTableIntroWikiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpdateResult")
    private Boolean updateResult;

    private UpdateMetaTableIntroWikiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.updateResult = builder.updateResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaTableIntroWikiResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateResult
     */
    public Boolean getUpdateResult() {
        return this.updateResult;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean updateResult; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The updated instructions.
         */
        public Builder updateResult(Boolean updateResult) {
            this.updateResult = updateResult;
            return this;
        }

        public UpdateMetaTableIntroWikiResponseBody build() {
            return new UpdateMetaTableIntroWikiResponseBody(this);
        } 

    } 

}
