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

    @com.aliyun.core.annotation.NameInMap("SearchLibConfig")
    private String searchLibConfig;

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
        this.searchLibConfig = builder.searchLibConfig;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return searchLibConfig
     */
    public String getSearchLibConfig() {
        return this.searchLibConfig;
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
        private String searchLibConfig; 
        private String searchLibName; 
        private String status; 
        private String success; 

        private Builder() {
        } 

        private Builder(QuerySearchLibResponseBody model) {
            this.code = model.code;
            this.indexInfo = model.indexInfo;
            this.requestId = model.requestId;
            this.searchLibConfig = model.searchLibConfig;
            this.searchLibName = model.searchLibName;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The index information.</p>
         */
        public Builder indexInfo(java.util.List<IndexInfo> indexInfo) {
            this.indexInfo = indexInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The search library configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;faceGroupIds&quot;:&quot;xxx1,xxx2,xx3&quot;}</p>
         */
        public Builder searchLibConfig(String searchLibConfig) {
            this.searchLibConfig = searchLibConfig;
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
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><p><strong>true</strong>: The call was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The call failed.</p>
         * </li>
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

            private Builder() {
            } 

            private Builder(IndexInfo model) {
                this.indexReadiness = model.indexReadiness;
                this.indexStatus = model.indexStatus;
                this.indexType = model.indexType;
            } 

            /**
             * <p>The readiness status of the index. Valid values:</p>
             * <ul>
             * <li><p>Initializing: The index is being initialized.</p>
             * </li>
             * <li><p>Normal: The index is ready.</p>
             * </li>
             * <li><p>Fail: The index failed to be created.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder indexReadiness(String indexReadiness) {
                this.indexReadiness = indexReadiness;
                return this;
            }

            /**
             * <p>The status of the index. Valid values:</p>
             * <ul>
             * <li><p>Active: The index is active.</p>
             * </li>
             * <li><p>Deactive: The index is inactive.</p>
             * </li>
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
             * <p>The index type. Valid values:</p>
             * <ul>
             * <li><p>mm: Large language model (LLM).</p>
             * </li>
             * <li><p>face: Face recognition.</p>
             * </li>
             * <li><p>aiLabel: Smart tagging.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>face</p>
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
