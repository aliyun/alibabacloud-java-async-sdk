// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckModifyConfigNeedRestartResponseBody} extends {@link TeaModel}
 *
 * <p>CheckModifyConfigNeedRestartResponseBody</p>
 */
public class CheckModifyConfigNeedRestartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NeedRestart")
    private Boolean needRestart;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckModifyConfigNeedRestartResponseBody(Builder builder) {
        this.needRestart = builder.needRestart;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckModifyConfigNeedRestartResponseBody create() {
        return builder().build();
    }

    /**
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return this.needRestart;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean needRestart; 
        private String requestId; 

        /**
         * Indicates whether the cluster was restarted after you modified the configuration parameters. Valid values:
         * <p>
         * 
         * *   **true**: The cluster was restarted.
         * *   **false**: The cluster was not restarted.
         */
        public Builder needRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckModifyConfigNeedRestartResponseBody build() {
            return new CheckModifyConfigNeedRestartResponseBody(this);
        } 

    } 

}
