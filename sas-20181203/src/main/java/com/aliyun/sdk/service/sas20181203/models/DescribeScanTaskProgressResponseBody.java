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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <li><strong>init</strong>: The task is being initialized.</li>
         * <li><strong>Processing</strong>: The task is running.</li>
         * <li><strong>Success</strong>: The task is complete.</li>
         * <li><strong>Failed</strong>: The task fails.</li>
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
         * <p>The information about the asset on which the virus scan task runs. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the asset on which you want to perform a virus scan task. Valid values:</p>
         * <ul>
         * <li><strong>groupId</strong>: server group.</li>
         * <li><strong>uuid</strong>: server.</li>
         * </ul>
         * </li>
         * <li><p><strong>name</strong>: the name of the server group or server.</p>
         * </li>
         * <li><p><strong>target</strong>: the asset on which the virus scan task runs. The value of this field varies based on the value of the type field.</p>
         * <ul>
         * <li>If the <strong>type</strong> field is set to <strong>groupId</strong>, the value of this field is the ID of the server group.</li>
         * <li>If the <strong>type</strong> field is set to <strong>uuid</strong>, the value of this field is the universally unique identifier (UUID) of the server.</li>
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
