// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link GetDBListFromAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBListFromAgentResponseBody</p>
 */
public class GetDBListFromAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbList")
    private DbList dbList;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDBListFromAgentResponseBody(Builder builder) {
        this.dbList = builder.dbList;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBListFromAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbList
     */
    public DbList getDbList() {
        return this.dbList;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private DbList dbList; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDBListFromAgentResponseBody model) {
            this.dbList = model.dbList;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the databases.</p>
         */
        public Builder dbList(DbList dbList) {
            this.dbList = dbList;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This backupPlan can&quot;t support this action</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EB4DFD5E-3618-498D-BE35-4DBEA0072122</p>
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

        public GetDBListFromAgentResponseBody build() {
            return new GetDBListFromAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDBListFromAgentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBListFromAgentResponseBody</p>
     */
    public static class DbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dbName")
        private java.util.List<String> dbName;

        private DbList(Builder builder) {
            this.dbName = builder.dbName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbList create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public java.util.List<String> getDbName() {
            return this.dbName;
        }

        public static final class Builder {
            private java.util.List<String> dbName; 

            private Builder() {
            } 

            private Builder(DbList model) {
                this.dbName = model.dbName;
            } 

            /**
             * dbName.
             */
            public Builder dbName(java.util.List<String> dbName) {
                this.dbName = dbName;
                return this;
            }

            public DbList build() {
                return new DbList(this);
            } 

        } 

    }
}
