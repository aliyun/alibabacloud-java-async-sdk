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
 * {@link AddKnowledgeUploadUserResponseBody} extends {@link TeaModel}
 *
 * <p>AddKnowledgeUploadUserResponseBody</p>
 */
public class AddKnowledgeUploadUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddKnowledgeUploadUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKnowledgeUploadUserResponseBody create() {
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

        private Builder(AddKnowledgeUploadUserResponseBody model) {
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

        public AddKnowledgeUploadUserResponseBody build() {
            return new AddKnowledgeUploadUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddKnowledgeUploadUserResponseBody} extends {@link TeaModel}
     *
     * <p>AddKnowledgeUploadUserResponseBody</p>
     */
    public static class Skipped extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("User")
        private String user;

        private Skipped(Builder builder) {
            this.reason = builder.reason;
            this.user = builder.user;
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
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String reason; 
            private String user; 

            private Builder() {
            } 

            private Builder(Skipped model) {
                this.reason = model.reason;
                this.user = model.user;
            } 

            /**
             * <p>The reason why the user was skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>conflicts error</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The username of the authorized user.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public Skipped build() {
                return new Skipped(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddKnowledgeUploadUserResponseBody} extends {@link TeaModel}
     *
     * <p>AddKnowledgeUploadUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileLocation")
        private String fileLocation;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Skipped")
        private java.util.List<Skipped> skipped;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Written")
        private Integer written;

        private Data(Builder builder) {
            this.fileLocation = builder.fileLocation;
            this.message = builder.message;
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
            private java.util.List<Skipped> skipped; 
            private Boolean success; 
            private Integer written; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileLocation = model.fileLocation;
                this.message = model.message;
                this.skipped = model.skipped;
                this.success = model.success;
                this.written = model.written;
            } 

            /**
             * <p>The location of the knowledge base file.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucketName/path/to/file.pfg</p>
             */
            public Builder fileLocation(String fileLocation) {
                this.fileLocation = fileLocation;
                return this;
            }

            /**
             * <p>The prompt message.</p>
             * 
             * <strong>example:</strong>
             * <p>Successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The list of skipped users.</p>
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
             * <p>The number of users that were successfully added.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
