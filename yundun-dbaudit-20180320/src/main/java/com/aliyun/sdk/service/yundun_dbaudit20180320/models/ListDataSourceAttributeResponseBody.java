// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link ListDataSourceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceAttributeResponseBody</p>
 */
public class ListDataSourceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbList")
    private java.util.List<DbList> dbList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataSourceAttributeResponseBody(Builder builder) {
        this.dbList = builder.dbList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbList
     */
    public java.util.List<DbList> getDbList() {
        return this.dbList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DbList> dbList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataSourceAttributeResponseBody model) {
            this.dbList = model.dbList;
            this.requestId = model.requestId;
        } 

        /**
         * DbList.
         */
        public Builder dbList(java.util.List<DbList> dbList) {
            this.dbList = dbList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataSourceAttributeResponseBody build() {
            return new ListDataSourceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceAttributeResponseBody</p>
     */
    public static class DbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditMode")
        private String auditMode;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("FreqAuditMode")
        private String freqAuditMode;

        @com.aliyun.core.annotation.NameInMap("ResultAuditMaxLine")
        private Integer resultAuditMaxLine;

        @com.aliyun.core.annotation.NameInMap("ResultAuditMaxSize")
        private Integer resultAuditMaxSize;

        @com.aliyun.core.annotation.NameInMap("ResultAuditMode")
        private String resultAuditMode;

        private DbList(Builder builder) {
            this.auditMode = builder.auditMode;
            this.dbId = builder.dbId;
            this.freqAuditMode = builder.freqAuditMode;
            this.resultAuditMaxLine = builder.resultAuditMaxLine;
            this.resultAuditMaxSize = builder.resultAuditMaxSize;
            this.resultAuditMode = builder.resultAuditMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbList create() {
            return builder().build();
        }

        /**
         * @return auditMode
         */
        public String getAuditMode() {
            return this.auditMode;
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return freqAuditMode
         */
        public String getFreqAuditMode() {
            return this.freqAuditMode;
        }

        /**
         * @return resultAuditMaxLine
         */
        public Integer getResultAuditMaxLine() {
            return this.resultAuditMaxLine;
        }

        /**
         * @return resultAuditMaxSize
         */
        public Integer getResultAuditMaxSize() {
            return this.resultAuditMaxSize;
        }

        /**
         * @return resultAuditMode
         */
        public String getResultAuditMode() {
            return this.resultAuditMode;
        }

        public static final class Builder {
            private String auditMode; 
            private Integer dbId; 
            private String freqAuditMode; 
            private Integer resultAuditMaxLine; 
            private Integer resultAuditMaxSize; 
            private String resultAuditMode; 

            private Builder() {
            } 

            private Builder(DbList model) {
                this.auditMode = model.auditMode;
                this.dbId = model.dbId;
                this.freqAuditMode = model.freqAuditMode;
                this.resultAuditMaxLine = model.resultAuditMaxLine;
                this.resultAuditMaxSize = model.resultAuditMaxSize;
                this.resultAuditMode = model.resultAuditMode;
            } 

            /**
             * AuditMode.
             */
            public Builder auditMode(String auditMode) {
                this.auditMode = auditMode;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * FreqAuditMode.
             */
            public Builder freqAuditMode(String freqAuditMode) {
                this.freqAuditMode = freqAuditMode;
                return this;
            }

            /**
             * ResultAuditMaxLine.
             */
            public Builder resultAuditMaxLine(Integer resultAuditMaxLine) {
                this.resultAuditMaxLine = resultAuditMaxLine;
                return this;
            }

            /**
             * ResultAuditMaxSize.
             */
            public Builder resultAuditMaxSize(Integer resultAuditMaxSize) {
                this.resultAuditMaxSize = resultAuditMaxSize;
                return this;
            }

            /**
             * ResultAuditMode.
             */
            public Builder resultAuditMode(String resultAuditMode) {
                this.resultAuditMode = resultAuditMode;
                return this;
            }

            public DbList build() {
                return new DbList(this);
            } 

        } 

    }
}
