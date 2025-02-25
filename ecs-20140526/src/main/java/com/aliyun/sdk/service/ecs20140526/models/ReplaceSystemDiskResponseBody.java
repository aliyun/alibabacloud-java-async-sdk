// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ReplaceSystemDiskResponseBody} extends {@link TeaModel}
 *
 * <p>ReplaceSystemDiskResponseBody</p>
 */
public class ReplaceSystemDiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private String diskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReplaceSystemDiskResponseBody(Builder builder) {
        this.diskId = builder.diskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceSystemDiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String diskId; 
        private String requestId; 

        /**
         * <p>The ID of the new system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4ph****</p>
         */
        public Builder diskId(String diskId) {
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReplaceSystemDiskResponseBody build() {
            return new ReplaceSystemDiskResponseBody(this);
        } 

    } 

}
