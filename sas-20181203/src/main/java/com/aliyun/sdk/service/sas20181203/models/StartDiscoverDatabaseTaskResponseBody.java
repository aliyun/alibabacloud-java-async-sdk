// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDiscoverDatabaseTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StartDiscoverDatabaseTaskResponseBody</p>
 */
public class StartDiscoverDatabaseTaskResponseBody extends TeaModel {
    @NameInMap("CreateMark")
    private String createMark;

    @NameInMap("RequestId")
    private String requestId;

    private StartDiscoverDatabaseTaskResponseBody(Builder builder) {
        this.createMark = builder.createMark;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDiscoverDatabaseTaskResponseBody create() {
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
         * CreateMark.
         */
        public Builder createMark(String createMark) {
            this.createMark = createMark;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartDiscoverDatabaseTaskResponseBody build() {
            return new StartDiscoverDatabaseTaskResponseBody(this);
        } 

    } 

}
