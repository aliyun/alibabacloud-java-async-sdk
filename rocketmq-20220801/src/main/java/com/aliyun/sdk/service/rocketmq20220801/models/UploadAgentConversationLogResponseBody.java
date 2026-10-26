// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link UploadAgentConversationLogResponseBody} extends {@link TeaModel}
 *
 * <p>UploadAgentConversationLogResponseBody</p>
 */
public class UploadAgentConversationLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("sandboxPath")
    private String sandboxPath;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private UploadAgentConversationLogResponseBody(Builder builder) {
        this.fileName = builder.fileName;
        this.id = builder.id;
        this.sandboxPath = builder.sandboxPath;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadAgentConversationLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return sandboxPath
     */
    public String getSandboxPath() {
        return this.sandboxPath;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder {
        private String fileName; 
        private String id; 
        private String sandboxPath; 
        private Long size; 

        private Builder() {
        } 

        private Builder(UploadAgentConversationLogResponseBody model) {
            this.fileName = model.fileName;
            this.id = model.id;
            this.sandboxPath = model.sandboxPath;
            this.size = model.size;
        } 

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * sandboxPath.
         */
        public Builder sandboxPath(String sandboxPath) {
            this.sandboxPath = sandboxPath;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        public UploadAgentConversationLogResponseBody build() {
            return new UploadAgentConversationLogResponseBody(this);
        } 

    } 

}
