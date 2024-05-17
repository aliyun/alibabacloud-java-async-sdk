// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDBNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDBNameResponseBody</p>
 */
public class CheckDBNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckDBNameResponseBody(Builder builder) {
        this.DBName = builder.DBName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDBNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBName; 
        private String requestId; 

        /**
         * The name of the database.
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDBNameResponseBody build() {
            return new CheckDBNameResponseBody(this);
        } 

    } 

}
