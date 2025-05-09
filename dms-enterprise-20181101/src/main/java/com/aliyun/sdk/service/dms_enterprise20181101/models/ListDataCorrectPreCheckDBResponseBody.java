// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListDataCorrectPreCheckDBResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCorrectPreCheckDBResponseBody</p>
 */
public class ListDataCorrectPreCheckDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PreCheckDBList")
    private java.util.List<PreCheckDBList> preCheckDBList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataCorrectPreCheckDBResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.preCheckDBList = builder.preCheckDBList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataCorrectPreCheckDBResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return preCheckDBList
     */
    public java.util.List<PreCheckDBList> getPreCheckDBList() {
        return this.preCheckDBList;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List<PreCheckDBList> preCheckDBList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataCorrectPreCheckDBResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.preCheckDBList = model.preCheckDBList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The information about the databases that are involved in the precheck.</p>
         */
        public Builder preCheckDBList(java.util.List<PreCheckDBList> preCheckDBList) {
            this.preCheckDBList = preCheckDBList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>95A972AF-FAED-4768-9360-7C0DF5D594D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataCorrectPreCheckDBResponseBody build() {
            return new ListDataCorrectPreCheckDBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataCorrectPreCheckDBResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataCorrectPreCheckDBResponseBody</p>
     */
    public static class PreCheckDBList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("SearchName")
        private String searchName;

        @com.aliyun.core.annotation.NameInMap("SqlNum")
        private Long sqlNum;

        private PreCheckDBList(Builder builder) {
            this.dbId = builder.dbId;
            this.searchName = builder.searchName;
            this.sqlNum = builder.sqlNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckDBList create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return sqlNum
         */
        public Long getSqlNum() {
            return this.sqlNum;
        }

        public static final class Builder {
            private Long dbId; 
            private String searchName; 
            private Long sqlNum; 

            private Builder() {
            } 

            private Builder(PreCheckDBList model) {
                this.dbId = model.dbId;
                this.searchName = model.searchName;
                this.sqlNum = model.sqlNum;
            } 

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>43***</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test@localhost:3306</p>
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * <p>The number of SQL statements.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sqlNum(Long sqlNum) {
                this.sqlNum = sqlNum;
                return this;
            }

            public PreCheckDBList build() {
                return new PreCheckDBList(this);
            } 

        } 

    }
}
