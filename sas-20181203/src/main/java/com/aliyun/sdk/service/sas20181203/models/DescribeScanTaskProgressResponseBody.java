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
 * {@link DescribeScanTaskProgressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScanTaskProgressResponseBody</p>
 */
public class DescribeScanTaskProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanTaskProgress")
    private String scanTaskProgress;

    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    private String targetInfo;

    private DescribeScanTaskProgressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scanTaskProgress = builder.scanTaskProgress;
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScanTaskProgressResponseBody create() {
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
     * @return scanTaskProgress
     */
    public String getScanTaskProgress() {
        return this.scanTaskProgress;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder {
        private String requestId; 
        private String scanTaskProgress; 
        private String targetInfo; 

        private Builder() {
        } 

        private Builder(DescribeScanTaskProgressResponseBody model) {
            this.requestId = model.requestId;
            this.scanTaskProgress = model.scanTaskProgress;
            this.targetInfo = model.targetInfo;
        } 

        /**
         * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EA15BA8A-D631-4375-8D40-CB7C769B0279</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The progress of the virus scan task. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The scan task is being initialized.</li>
         * <li><strong>Processing</strong>: The scan task is in progress.</li>
         * <li><strong>Success</strong>: The scan task is complete.</li>
         * <li><strong>Failed</strong>: The scan task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder scanTaskProgress(String scanTaskProgress) {
            this.scanTaskProgress = scanTaskProgress;
            return this;
        }

        /**
         * <p>The asset information scanned by the virus scan node. This parameter is a string converted from a JSON array in character format. The following fields are included:</p>
         * <ul>
         * <li><strong>type</strong>: The Asset Type on which the virus scan is executed. Valid values:<ul>
         * <li><strong>groupId</strong>: server group.</li>
         * <li><strong>uuid</strong>: server.</li>
         * </ul>
         * </li>
         * <li><strong>name</strong>: The name of the server group or server.</li>
         * <li><strong>target</strong>: The asset on which the virus scan is executed. The following describes the values of this field:<ul>
         * <li>If <strong>type</strong> is set to <strong>groupId</strong>, this field specifies the server group ID.</li>
         * <li>If <strong>type</strong> is set to <strong>uuid</strong>, this field specifies the UUID of the server.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;type&quot;:&quot;uuid&quot;,&quot;name&quot;:&quot;host001&quot;,&quot;target&quot;:&quot;503201a7-14c6-4280-801b-1169ed42****&quot;}]</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.targetInfo = targetInfo;
            return this;
        }

        public DescribeScanTaskProgressResponseBody build() {
            return new DescribeScanTaskProgressResponseBody(this);
        } 

    } 

}
