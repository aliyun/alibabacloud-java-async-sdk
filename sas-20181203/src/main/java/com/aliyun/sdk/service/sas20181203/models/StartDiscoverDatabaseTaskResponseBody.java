// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link StartDiscoverDatabaseTaskResponseBody} extends {@link TeaModel}
 *
 * <p>StartDiscoverDatabaseTaskResponseBody</p>
 */
public class StartDiscoverDatabaseTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateMark")
    private String createMark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartDiscoverDatabaseTaskResponseBody model) {
            this.createMark = model.createMark;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>48bced6d-2aee-4fa2-9aba-b846b77b****</p>
         */
        public Builder createMark(String createMark) {
            this.createMark = createMark;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F46921AF-CC55-5971-92C9-7E09E160****</p>
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
