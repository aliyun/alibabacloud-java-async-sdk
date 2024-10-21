// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartInstanceRefreshResponseBody} extends {@link TeaModel}
 *
 * <p>StartInstanceRefreshResponseBody</p>
 */
public class StartInstanceRefreshResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceRefreshTaskId")
    private String instanceRefreshTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartInstanceRefreshResponseBody(Builder builder) {
        this.instanceRefreshTaskId = builder.instanceRefreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstanceRefreshResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceRefreshTaskId
     */
    public String getInstanceRefreshTaskId() {
        return this.instanceRefreshTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceRefreshTaskId; 
        private String requestId; 

        /**
         * <p>The ID of the instance refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>ir-a12ds234fasd*****</p>
         */
        public Builder instanceRefreshTaskId(String instanceRefreshTaskId) {
            this.instanceRefreshTaskId = instanceRefreshTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartInstanceRefreshResponseBody build() {
            return new StartInstanceRefreshResponseBody(this);
        } 

    } 

}
