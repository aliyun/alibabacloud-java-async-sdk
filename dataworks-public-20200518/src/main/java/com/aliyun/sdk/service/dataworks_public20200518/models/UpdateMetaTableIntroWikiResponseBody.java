// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link UpdateMetaTableIntroWikiResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMetaTableIntroWikiResponseBody</p>
 */
public class UpdateMetaTableIntroWikiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateResult")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateMetaTableIntroWikiResponseBody model) {
            this.requestId = model.requestId;
            this.updateResult = model.updateResult;
        } 

        /**
         * <p>The request ID. You can troubleshoot issues based on the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abcde</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the instructions on how to use the table are updated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
