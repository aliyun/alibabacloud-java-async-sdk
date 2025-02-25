// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link ImportAppAlertRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ImportAppAlertRulesResponseBody</p>
 */
public class ImportAppAlertRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImportAppAlertRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportAppAlertRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * <p>The ID of the alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[12174**]</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImportAppAlertRulesResponseBody build() {
            return new ImportAppAlertRulesResponseBody(this);
        } 

    } 

}
