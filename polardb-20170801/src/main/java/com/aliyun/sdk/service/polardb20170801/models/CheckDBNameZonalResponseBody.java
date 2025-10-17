// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CheckDBNameZonalResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDBNameZonalResponseBody</p>
 */
public class CheckDBNameZonalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBName")
    private String DBName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckDBNameZonalResponseBody(Builder builder) {
        this.DBName = builder.DBName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDBNameZonalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CheckDBNameZonalResponseBody model) {
            this.DBName = model.DBName;
            this.requestId = model.requestId;
        } 

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.DBName = DBName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDBNameZonalResponseBody build() {
            return new CheckDBNameZonalResponseBody(this);
        } 

    } 

}
