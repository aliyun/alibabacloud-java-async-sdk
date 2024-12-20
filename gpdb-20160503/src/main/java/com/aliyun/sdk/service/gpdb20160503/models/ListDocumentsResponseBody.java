// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The queried documents.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>fail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListDocumentsResponseBody build() {
            return new ListDocumentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDocumentsResponseBody</p>
     */
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
             * <p>The name of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>music.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The source of the document.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss.xxx/music.txt">http://oss.xxx/music.txt</a></p>
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
    /**
     * 
     * {@link ListDocumentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDocumentsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocumentList")
        private java.util.List<DocumentList> documentList;

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
        public java.util.List<DocumentList> getDocumentList() {
            return this.documentList;
        }

        public static final class Builder {
            private java.util.List<DocumentList> documentList; 

            /**
             * DocumentList.
             */
            public Builder documentList(java.util.List<DocumentList> documentList) {
                this.documentList = documentList;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
