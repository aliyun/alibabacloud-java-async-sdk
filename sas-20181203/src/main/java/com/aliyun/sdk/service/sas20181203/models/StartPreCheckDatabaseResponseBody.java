// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPreCheckDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>StartPreCheckDatabaseResponseBody</p>
 */
public class StartPreCheckDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateMark")
    private String createMark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartPreCheckDatabaseResponseBody(Builder builder) {
        this.createMark = builder.createMark;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPreCheckDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return createMark
     */
    public String getCreateMark() {
        return this.createMark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createMark; 
        private String requestId; 

        /**
         * The ID of the database precheck task.
         */
        public Builder createMark(String createMark) {
            this.createMark = createMark;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartPreCheckDatabaseResponseBody build() {
            return new StartPreCheckDatabaseResponseBody(this);
        } 

    } 

}
