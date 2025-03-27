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
 * {@link GetEdgeContainerAppLogRiverResponseBody} extends {@link TeaModel}
 *
 * <p>GetEdgeContainerAppLogRiverResponseBody</p>
 */
public class GetEdgeContainerAppLogRiverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Stdout")
    private Boolean stdout;

    private GetEdgeContainerAppLogRiverResponseBody(Builder builder) {
        this.path = builder.path;
        this.requestId = builder.requestId;
        this.stdout = builder.stdout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEdgeContainerAppLogRiverResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetEdgeContainerAppLogRiverResponseBody model) {
            this.path = model.path;
            this.requestId = model.requestId;
            this.stdout = model.stdout;
        } 

        /**
         * <p>The log path of the container. It must be an absolute path that starts with a forward slash (/). You can use asterisks (*) and question marks (?) as wildcards.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/hello.log</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the standard output of the container is collected.</p>
         */
        public Builder stdout(Boolean stdout) {
            this.stdout = stdout;
            return this;
        }

        public GetEdgeContainerAppLogRiverResponseBody build() {
            return new GetEdgeContainerAppLogRiverResponseBody(this);
        } 

    } 

}
