// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link QuerySearchLibResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySearchLibResponseBody</p>
 */
public class QuerySearchLibResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IndexInfo")
    private java.util.List<IndexInfo> indexInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private QuerySearchLibResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexInfo = builder.indexInfo;
        this.requestId = builder.requestId;
        this.searchLibName = builder.searchLibName;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySearchLibResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return indexInfo
     */
    public java.util.List<IndexInfo> getIndexInfo() {
        return this.indexInfo;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<IndexInfo> indexInfo; 
        private String requestId; 
        private String searchLibName; 
        private String status; 
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
         * IndexInfo.
         */
        public Builder indexInfo(java.util.List<IndexInfo> indexInfo) {
            this.indexInfo = indexInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
         * <p>The status of the search library.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>normal</li>
         * <li>deleting</li>
         * <li>deleteFail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
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

        public QuerySearchLibResponseBody build() {
            return new QuerySearchLibResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySearchLibResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySearchLibResponseBody</p>
     */
    public static class IndexInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndexReadiness")
        private String indexReadiness;

        @com.aliyun.core.annotation.NameInMap("IndexStatus")
        private String indexStatus;

        @com.aliyun.core.annotation.NameInMap("IndexType")
        private String indexType;

        private IndexInfo(Builder builder) {
            this.indexReadiness = builder.indexReadiness;
            this.indexStatus = builder.indexStatus;
            this.indexType = builder.indexType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexInfo create() {
            return builder().build();
        }

        /**
         * @return indexReadiness
         */
        public String getIndexReadiness() {
            return this.indexReadiness;
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

        public static final class Builder {
            private String indexReadiness; 
            private String indexStatus; 
            private String indexType; 

            /**
             * IndexReadiness.
             */
            public Builder indexReadiness(String indexReadiness) {
                this.indexReadiness = indexReadiness;
                return this;
            }

            /**
             * IndexStatus.
             */
            public Builder indexStatus(String indexStatus) {
                this.indexStatus = indexStatus;
                return this;
            }

            /**
             * IndexType.
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            public IndexInfo build() {
                return new IndexInfo(this);
            } 

        } 

    }
}
