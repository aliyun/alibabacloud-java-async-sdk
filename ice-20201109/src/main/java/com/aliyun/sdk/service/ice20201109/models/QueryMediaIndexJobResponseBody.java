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
 * {@link QueryMediaIndexJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaIndexJobResponseBody</p>
 */
public class QueryMediaIndexJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IndexJobInfoList")
    private java.util.List<IndexJobInfoList> indexJobInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private QueryMediaIndexJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexJobInfoList = builder.indexJobInfoList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaIndexJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return indexJobInfoList
     */
    public java.util.List<IndexJobInfoList> getIndexJobInfoList() {
        return this.indexJobInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<IndexJobInfoList> indexJobInfoList; 
        private String requestId; 
        private String success; 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The indexing jobs enabled for the media asset.</p>
         */
        public Builder indexJobInfoList(java.util.List<IndexJobInfoList> indexJobInfoList) {
            this.indexJobInfoList = indexJobInfoList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E84BE44-58A7-<strong><strong>-</strong></strong>-FBEBEA16EF94</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public QueryMediaIndexJobResponseBody build() {
            return new QueryMediaIndexJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMediaIndexJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaIndexJobResponseBody</p>
     */
    public static class IndexJobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtFinish")
        private String gmtFinish;

        @com.aliyun.core.annotation.NameInMap("GmtSubmit")
        private String gmtSubmit;

        @com.aliyun.core.annotation.NameInMap("IndexType")
        private String indexType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IndexJobInfoList(Builder builder) {
            this.gmtFinish = builder.gmtFinish;
            this.gmtSubmit = builder.gmtSubmit;
            this.indexType = builder.indexType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexJobInfoList create() {
            return builder().build();
        }

        /**
         * @return gmtFinish
         */
        public String getGmtFinish() {
            return this.gmtFinish;
        }

        /**
         * @return gmtSubmit
         */
        public String getGmtSubmit() {
            return this.gmtSubmit;
        }

        /**
         * @return indexType
         */
        public String getIndexType() {
            return this.indexType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String gmtFinish; 
            private String gmtSubmit; 
            private String indexType; 
            private String status; 

            /**
             * <p>The end time of the indexing job.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21 11:33:51</p>
             */
            public Builder gmtFinish(String gmtFinish) {
                this.gmtFinish = gmtFinish;
                return this;
            }

            /**
             * <p>The time when the index job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-11-21 11:33:50</p>
             */
            public Builder gmtSubmit(String gmtSubmit) {
                this.gmtSubmit = gmtSubmit;
                return this;
            }

            /**
             * <p>The index type. Valid values:</p>
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
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li>Running</li>
             * <li>Success</li>
             * <li>Fail</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IndexJobInfoList build() {
                return new IndexJobInfoList(this);
            } 

        } 

    }
}
