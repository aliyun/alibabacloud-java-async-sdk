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
 * {@link AddKnowledgeTagsResponseBody} extends {@link TeaModel}
 *
 * <p>AddKnowledgeTagsResponseBody</p>
 */
public class AddKnowledgeTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddKnowledgeTagsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKnowledgeTagsResponseBody create() {
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

        private Builder(AddKnowledgeTagsResponseBody model) {
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

        public AddKnowledgeTagsResponseBody build() {
            return new AddKnowledgeTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddKnowledgeTagsResponseBody} extends {@link TeaModel}
     *
     * <p>AddKnowledgeTagsResponseBody</p>
     */
    public static class Skipped extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Skipped(Builder builder) {
            this.reason = builder.reason;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skipped create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String reason; 
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Skipped model) {
                this.reason = model.reason;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The reason why the tag was skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>conflict</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>skipKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>skipValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Skipped build() {
                return new Skipped(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddKnowledgeTagsResponseBody} extends {@link TeaModel}
     *
     * <p>AddKnowledgeTagsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileLocation")
        private String fileLocation;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Replaced")
        private Integer replaced;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private java.util.List<Skipped> skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Written")
        private Integer written;

        private Data(Builder builder) {
            this.fileLocation = builder.fileLocation;
            this.message = builder.message;
            this.replaced = builder.replaced;
            this.skipped = builder.skipped;
            this.success = builder.success;
            this.written = builder.written;
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
         * @return replaced
         */
        public Integer getReplaced() {
            return this.replaced;
        }

        /**
         * @return skipped
         */
        public java.util.List<Skipped> getSkipped() {
            return this.skipped;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return written
         */
        public Integer getWritten() {
            return this.written;
        }

        public static final class Builder {
            private String fileLocation; 
            private String message; 
            private Integer replaced; 
            private java.util.List<Skipped> skipped; 
            private Boolean success; 
            private Integer written; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileLocation = model.fileLocation;
                this.message = model.message;
                this.replaced = model.replaced;
                this.skipped = model.skipped;
                this.success = model.success;
                this.written = model.written;
            } 

            /**
             * <p>The location of the knowledge base file.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucketName/path/to/file.pdf</p>
             */
            public Builder fileLocation(String fileLocation) {
                this.fileLocation = fileLocation;
                return this;
            }

            /**
             * <p>The message.</p>
             * 
             * <strong>example:</strong>
             * <p>1 tag skipped</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The number of tags that were successfully updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replaced(Integer replaced) {
                this.replaced = replaced;
                return this;
            }

            /**
             * <p>The list of skipped tags.</p>
             */
            public Builder skipped(java.util.List<Skipped> skipped) {
                this.skipped = skipped;
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

            /**
             * <p>The number of tags that were successfully added.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder written(Integer written) {
                this.written = written;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
