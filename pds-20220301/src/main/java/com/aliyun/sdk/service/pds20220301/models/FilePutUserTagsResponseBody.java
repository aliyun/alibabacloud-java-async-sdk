// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link FilePutUserTagsResponseBody} extends {@link TeaModel}
 *
 * <p>FilePutUserTagsResponseBody</p>
 */
public class FilePutUserTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    private FilePutUserTagsResponseBody(Builder builder) {
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilePutUserTagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    public static final class Builder {
        private String fileId; 

        /**
         * <p>The file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9520943DC264</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public FilePutUserTagsResponseBody build() {
            return new FilePutUserTagsResponseBody(this);
        } 

    } 

}
