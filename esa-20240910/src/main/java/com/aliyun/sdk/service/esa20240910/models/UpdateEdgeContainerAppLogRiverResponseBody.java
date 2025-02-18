// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateEdgeContainerAppLogRiverResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEdgeContainerAppLogRiverResponseBody</p>
 */
public class UpdateEdgeContainerAppLogRiverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Stdout")
    private Boolean stdout;

    private UpdateEdgeContainerAppLogRiverResponseBody(Builder builder) {
        this.path = builder.path;
        this.requestId = builder.requestId;
        this.stdout = builder.stdout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeContainerAppLogRiverResponseBody create() {
        return builder().build();
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stdout
     */
    public Boolean getStdout() {
        return this.stdout;
    }

    public static final class Builder {
        private String path; 
        private String requestId; 
        private Boolean stdout; 

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
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
         * Stdout.
         */
        public Builder stdout(Boolean stdout) {
            this.stdout = stdout;
            return this;
        }

        public UpdateEdgeContainerAppLogRiverResponseBody build() {
            return new UpdateEdgeContainerAppLogRiverResponseBody(this);
        } 

    } 

}
