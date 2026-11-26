// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteRumSymbolFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRumSymbolFilesResponseBody</p>
 */
public class DeleteRumSymbolFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("deletedObjectCount")
    private Integer deletedObjectCount;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("requestedFileCount")
    private Integer requestedFileCount;

    @com.aliyun.core.annotation.NameInMap("requestedObjectCount")
    private Integer requestedObjectCount;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DeleteRumSymbolFilesResponseBody(Builder builder) {
        this.deletedObjectCount = builder.deletedObjectCount;
        this.requestId = builder.requestId;
        this.requestedFileCount = builder.requestedFileCount;
        this.requestedObjectCount = builder.requestedObjectCount;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRumSymbolFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletedObjectCount
     */
    public Integer getDeletedObjectCount() {
        return this.deletedObjectCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestedFileCount
     */
    public Integer getRequestedFileCount() {
        return this.requestedFileCount;
    }

    /**
     * @return requestedObjectCount
     */
    public Integer getRequestedObjectCount() {
        return this.requestedObjectCount;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer deletedObjectCount; 
        private String requestId; 
        private Integer requestedFileCount; 
        private Integer requestedObjectCount; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteRumSymbolFilesResponseBody model) {
            this.deletedObjectCount = model.deletedObjectCount;
            this.requestId = model.requestId;
            this.requestedFileCount = model.requestedFileCount;
            this.requestedObjectCount = model.requestedObjectCount;
            this.success = model.success;
        } 

        /**
         * <p>The actual number of objects that were successfully deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder deletedObjectCount(Integer deletedObjectCount) {
            this.deletedObjectCount = deletedObjectCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of file paths requested for deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder requestedFileCount(Integer requestedFileCount) {
            this.requestedFileCount = requestedFileCount;
            return this;
        }

        /**
         * <p>The total number of deduplicated objects to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder requestedObjectCount(Integer requestedObjectCount) {
            this.requestedObjectCount = requestedObjectCount;
            return this;
        }

        /**
         * <p>Indicates whether all delete operations succeeded. The value is true only if all deduplicated objects to be deleted are successfully deleted. If a partial deletion failure or exception occurs, the API directly returns an error.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteRumSymbolFilesResponseBody build() {
            return new DeleteRumSymbolFilesResponseBody(this);
        } 

    } 

}
