// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDocumentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDocumentsResponseBody</p>
 */
public class ListDocumentsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private ListDocumentsResponseBody(Builder builder) {
        this.items = builder.items;
        this.message = builder.message;
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
        private Items items; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * Items.
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
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
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Source")
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
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Source.
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
        @NameInMap("DocumentList")
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
