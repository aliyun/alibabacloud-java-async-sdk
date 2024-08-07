// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDocumentsResponseBody</p>
 */
public class ListDocumentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDocumentsResponseBody(Builder builder) {
        this.count = builder.count;
        this.items = builder.items;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer count; 
        private Items items; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private String status; 

        /**
         * The total number of entries returned.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The queried documents.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListDocumentsResponseBody build() {
            return new ListDocumentsResponseBody(this);
        } 

    } 

    public static class DocumentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private DocumentList(Builder builder) {
            this.fileName = builder.fileName;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocumentList create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String fileName; 
            private String source; 

            /**
             * The name of the document.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The source of the document.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public DocumentList build() {
                return new DocumentList(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocumentList")
        private java.util.List < DocumentList> documentList;

        private Items(Builder builder) {
            this.documentList = builder.documentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return documentList
         */
        public java.util.List < DocumentList> getDocumentList() {
            return this.documentList;
        }

        public static final class Builder {
            private java.util.List < DocumentList> documentList; 

            /**
             * DocumentList.
             */
            public Builder documentList(java.util.List < DocumentList> documentList) {
                this.documentList = documentList;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
