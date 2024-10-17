// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDataServiceFolderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataServiceFolderResponseBody</p>
 */
public class CreateDataServiceFolderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private Long folderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataServiceFolderResponseBody(Builder builder) {
        this.folderId = builder.folderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceFolderResponseBody create() {
        return builder().build();
    }

    /**
     * @return folderId
     */
    public Long getFolderId() {
        return this.folderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long folderId; 
        private String requestId; 

        /**
         * <p>The ID of the created folder.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder folderId(Long folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataServiceFolderResponseBody build() {
            return new CreateDataServiceFolderResponseBody(this);
        } 

    } 

}
