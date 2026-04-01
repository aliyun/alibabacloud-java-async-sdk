// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeClusterAttachScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterAttachScriptsResponseBody</p>
 */
public class DescribeClusterAttachScriptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Script")
    private String script;

    private DescribeClusterAttachScriptsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.script = builder.script;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAttachScriptsResponseBody create() {
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
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    public static final class Builder {
        private String requestId; 
        private String script; 

        private Builder() {
        } 

        private Builder(DescribeClusterAttachScriptsResponseBody model) {
            this.requestId = model.requestId;
            this.script = model.script;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.script = script;
            return this;
        }

        public DescribeClusterAttachScriptsResponseBody build() {
            return new DescribeClusterAttachScriptsResponseBody(this);
        } 

    } 

}
