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
 * {@link QuerySessionByClientIdResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySessionByClientIdResponseBody</p>
 */
public class QuerySessionByClientIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnlineStatus")
    private Boolean onlineStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySessionByClientIdResponseBody(Builder builder) {
        this.onlineStatus = builder.onlineStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionByClientIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onlineStatus
     */
    public Boolean getOnlineStatus() {
        return this.onlineStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean onlineStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QuerySessionByClientIdResponseBody model) {
            this.onlineStatus = model.onlineStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the ApsaraMQ for MQTT client is connected to the ApsaraMQ for MQTT broker. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }

        /**
         * <p>The request ID. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>E4581CCF-62AF-44D9-B5B4-D1DBBC0E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySessionByClientIdResponseBody build() {
            return new QuerySessionByClientIdResponseBody(this);
        } 

    } 

}
