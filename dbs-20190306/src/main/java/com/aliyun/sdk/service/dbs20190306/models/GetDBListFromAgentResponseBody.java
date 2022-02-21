// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBListFromAgentResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBListFromAgentResponseBody</p>
 */
public class GetDBListFromAgentResponseBody extends TeaModel {
    @NameInMap("DbList")
    private DbList dbList;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * DbList.
         */
        public Builder dbList(DbList dbList) {
            this.dbList = dbList;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDBListFromAgentResponseBody build() {
            return new GetDBListFromAgentResponseBody(this);
        } 

    } 

    public static class DbList extends TeaModel {
        @NameInMap("dbName")
        private java.util.List < String > dbName;

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
        public java.util.List < String > getDbName() {
            return this.dbName;
        }

        public static final class Builder {
            private java.util.List < String > dbName; 

            /**
             * dbName.
             */
            public Builder dbName(java.util.List < String > dbName) {
                this.dbName = dbName;
                return this;
            }

            public DbList build() {
                return new DbList(this);
            } 

        } 

    }
}
