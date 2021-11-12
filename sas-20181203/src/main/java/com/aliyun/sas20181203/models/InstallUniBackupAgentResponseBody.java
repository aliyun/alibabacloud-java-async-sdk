// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link InstallUniBackupAgentResponseBody} extends {@link TeaModel}
 *
 * <p>InstallUniBackupAgentResponseBody</p>
 */
public class InstallUniBackupAgentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private InstallUniBackupAgentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallUniBackupAgentResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallUniBackupAgentResponseBody build() {
            return new InstallUniBackupAgentResponseBody(this);
        } 

    } 

}
