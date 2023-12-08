// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckModifyConfigNeedRestartResponseBody} extends {@link TeaModel}
 *
 * <p>CheckModifyConfigNeedRestartResponseBody</p>
 */
public class CheckModifyConfigNeedRestartResponseBody extends TeaModel {
    @NameInMap("NeedRestart")
    private Boolean needRestart;

    @NameInMap("RequestId")
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
         * NeedRestart.
         */
        public Builder needRestart(Boolean needRestart) {
            this.needRestart = needRestart;
            return this;
        }

        /**
         * RequestId.
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
