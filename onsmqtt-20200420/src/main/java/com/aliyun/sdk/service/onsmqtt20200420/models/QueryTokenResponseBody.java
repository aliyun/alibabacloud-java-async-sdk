// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link QueryTokenResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTokenResponseBody</p>
 */
public class QueryTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TokenStatus")
    private Boolean tokenStatus;

    private QueryTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tokenStatus = builder.tokenStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tokenStatus
     */
    public Boolean getTokenStatus() {
        return this.tokenStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean tokenStatus; 

        private Builder() {
        } 

        private Builder(QueryTokenResponseBody model) {
            this.requestId = model.requestId;
            this.tokenStatus = model.tokenStatus;
        } 

        /**
         * <p>The unique ID that the system generates for the request. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5C8AADD0-6A95-436D-AFA0-3405CCE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the queried token. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates the token is valid.</li>
         * <li><strong>false</strong>: indicates the token is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder tokenStatus(Boolean tokenStatus) {
            this.tokenStatus = tokenStatus;
            return this;
        }

        public QueryTokenResponseBody build() {
            return new QueryTokenResponseBody(this);
        } 

    } 

}
