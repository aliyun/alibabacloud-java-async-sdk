// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataCorrectPreCheckDBResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataCorrectPreCheckDBResponseBody</p>
 */
public class ListDataCorrectPreCheckDBResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PreCheckDBList")
    private java.util.List < PreCheckDBList> preCheckDBList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public java.util.List < PreCheckDBList> getPreCheckDBList() {
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
        private java.util.List < PreCheckDBList> preCheckDBList; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The information about the databases that are involved in the precheck.
         */
        public Builder preCheckDBList(java.util.List < PreCheckDBList> preCheckDBList) {
            this.preCheckDBList = preCheckDBList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataCorrectPreCheckDBResponseBody build() {
            return new ListDataCorrectPreCheckDBResponseBody(this);
        } 

    } 

    public static class PreCheckDBList extends TeaModel {
        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("SqlNum")
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

            /**
             * The ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The number of SQL statements.
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
