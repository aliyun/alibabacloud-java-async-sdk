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
 * {@link DescribeMachineCanRebootResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMachineCanRebootResponseBody</p>
 */
public class DescribeMachineCanRebootResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanReboot")
    private Boolean canReboot;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMachineCanRebootResponseBody(Builder builder) {
        this.canReboot = builder.canReboot;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMachineCanRebootResponseBody create() {
        return builder().build();
    }

    /**
     * @return canReboot
     */
    public Boolean getCanReboot() {
        return this.canReboot;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean canReboot; 
        private String requestId; 

        /**
         * <p>Indicates whether the server can be restarted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder canReboot(Boolean canReboot) {
            this.canReboot = canReboot;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>79CFF74D-E967-5407-8A78-EE03B925FDAA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMachineCanRebootResponseBody build() {
            return new DescribeMachineCanRebootResponseBody(this);
        } 

    } 

}
