// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaIndexJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaIndexJobResponseBody</p>
 */
public class QueryMediaIndexJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IndexJobInfoList")
    private java.util.List < IndexJobInfoList> indexJobInfoList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public java.util.List < IndexJobInfoList> getIndexJobInfoList() {
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
        private java.util.List < IndexJobInfoList> indexJobInfoList; 
        private String requestId; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IndexJobInfoList.
         */
        public Builder indexJobInfoList(java.util.List < IndexJobInfoList> indexJobInfoList) {
            this.indexJobInfoList = indexJobInfoList;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QueryMediaIndexJobResponseBody build() {
            return new QueryMediaIndexJobResponseBody(this);
        } 

    } 

    public static class IndexJobInfoList extends TeaModel {
        @NameInMap("GmtFinish")
        private String gmtFinish;

        @NameInMap("GmtSubmit")
        private String gmtSubmit;

        @NameInMap("IndexType")
        private String indexType;

        @NameInMap("Status")
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
             * GmtFinish.
             */
            public Builder gmtFinish(String gmtFinish) {
                this.gmtFinish = gmtFinish;
                return this;
            }

            /**
             * GmtSubmit.
             */
            public Builder gmtSubmit(String gmtSubmit) {
                this.gmtSubmit = gmtSubmit;
                return this;
            }

            /**
             * IndexType.
             */
            public Builder indexType(String indexType) {
                this.indexType = indexType;
                return this;
            }

            /**
             * Status.
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
