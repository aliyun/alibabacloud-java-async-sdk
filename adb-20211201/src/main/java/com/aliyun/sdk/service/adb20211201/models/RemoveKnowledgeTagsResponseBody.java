// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link RemoveKnowledgeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveKnowledgeTagsResponseBody</p>
 */
public class RemoveKnowledgeTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveKnowledgeTagsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveKnowledgeTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RemoveKnowledgeTagsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveKnowledgeTagsResponseBody build() {
            return new RemoveKnowledgeTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveKnowledgeTagsResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveKnowledgeTagsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileLocation")
        private String fileLocation;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Removed")
        private Integer removed;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.fileLocation = builder.fileLocation;
            this.message = builder.message;
            this.removed = builder.removed;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileLocation
         */
        public String getFileLocation() {
            return this.fileLocation;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return removed
         */
        public Integer getRemoved() {
            return this.removed;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String fileLocation; 
            private String message; 
            private Integer removed; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileLocation = model.fileLocation;
                this.message = model.message;
                this.removed = model.removed;
                this.success = model.success;
            } 

            /**
             * <p>The location of the knowledge base file.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/doc.pdf</p>
             */
            public Builder fileLocation(String fileLocation) {
                this.fileLocation = fileLocation;
                return this;
            }

            /**
             * <p>The message returned by the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The number of tags that were successfully deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder removed(Integer removed) {
                this.removed = removed;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The request was successful.</li>
             * <li><strong>false</strong>: The request failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
