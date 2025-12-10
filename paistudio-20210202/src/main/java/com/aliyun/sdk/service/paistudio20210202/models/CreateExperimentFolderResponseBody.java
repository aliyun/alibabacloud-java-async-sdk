// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link CreateExperimentFolderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExperimentFolderResponseBody</p>
 */
public class CreateExperimentFolderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExperimentFolderResponseBody(Builder builder) {
        this.folderId = builder.folderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExperimentFolderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String folderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateExperimentFolderResponseBody model) {
            this.folderId = model.folderId;
            this.requestId = model.requestId;
        } 

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExperimentFolderResponseBody build() {
            return new CreateExperimentFolderResponseBody(this);
        } 

    } 

}
