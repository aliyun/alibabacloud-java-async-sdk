// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySearchIndexResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySearchIndexResponseBody</p>
 */
public class QuerySearchIndexResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IndexStatus")
    private String indexStatus;

    @com.aliyun.core.annotation.NameInMap("IndexType")
    private String indexType;

    @com.aliyun.core.annotation.NameInMap("MediaTotal")
    private String mediaTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private QuerySearchIndexResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexStatus = builder.indexStatus;
        this.indexType = builder.indexType;
        this.mediaTotal = builder.mediaTotal;
        this.requestId = builder.requestId;
        this.searchLibName = builder.searchLibName;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySearchIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return indexStatus
     */
    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * @return indexType
     */
    public String getIndexType() {
        return this.indexType;
    }

    /**
     * @return mediaTotal
     */
    public String getMediaTotal() {
        return this.mediaTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String indexStatus; 
        private String indexType; 
        private String mediaTotal; 
        private String requestId; 
        private String searchLibName; 
        private String success; 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The state of the index. Valid values:</p>
         * <ul>
         * <li>active: the index is enabled.</li>
         * <li>Deactive: the index is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder indexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }

        /**
         * <p>The category of the index. Valid values:</p>
         * <ul>
         * <li>mm: large visual model.</li>
         * <li>face: face recognition.</li>
         * <li>aiLabel: smart tagging.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mm</p>
         */
        public Builder indexType(String indexType) {
            this.indexType = indexType;
            return this;
        }

        /**
         * <p>The total number of media assets.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder mediaTotal(String mediaTotal) {
            this.mediaTotal = mediaTotal;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the search library.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder searchLibName(String searchLibName) {
            this.searchLibName = searchLibName;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QuerySearchIndexResponseBody build() {
            return new QuerySearchIndexResponseBody(this);
        } 

    } 

}
