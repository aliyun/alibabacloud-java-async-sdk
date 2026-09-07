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
 * {@link ListKnowledgeUploadUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListKnowledgeUploadUserResponseBody</p>
 */
public class ListKnowledgeUploadUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListKnowledgeUploadUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKnowledgeUploadUserResponseBody create() {
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

        private Builder(ListKnowledgeUploadUserResponseBody model) {
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

        public ListKnowledgeUploadUserResponseBody build() {
            return new ListKnowledgeUploadUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKnowledgeUploadUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListKnowledgeUploadUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileLocation")
        private String fileLocation;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List<String> users;

        private Data(Builder builder) {
            this.fileLocation = builder.fileLocation;
            this.message = builder.message;
            this.success = builder.success;
            this.users = builder.users;
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
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return users
         */
        public java.util.List<String> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private String fileLocation; 
            private String message; 
            private Boolean success; 
            private java.util.List<String> users; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fileLocation = model.fileLocation;
                this.message = model.message;
                this.success = model.success;
                this.users = model.users;
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
             * <p>The list of authorized users.</p>
             */
            public Builder users(java.util.List<String> users) {
                this.users = users;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
