// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link CreateDNADBResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDNADBResponseBody</p>
 */
public class CreateDNADBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBId")
    private String DBId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDNADBResponseBody(Builder builder) {
        this.DBId = builder.DBId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDNADBResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBId
     */
    public String getDBId() {
        return this.DBId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDNADBResponseBody model) {
            this.DBId = model.DBId;
            this.requestId = model.requestId;
        } 

        /**
         * DBId.
         */
        public Builder DBId(String DBId) {
            this.DBId = DBId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDNADBResponseBody build() {
            return new CreateDNADBResponseBody(this);
        } 

    } 

}
