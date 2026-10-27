// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeOpenBackupSetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenBackupSetResponseBody</p>
 */
public class DescribeOpenBackupSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOpenBackupSetResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenBackupSetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOpenBackupSetResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The struct that contains instance topology information and backup set download links.</p>
         * <blockquote>
         * <p>The canBinlogRecoverToTimeUTC field indicates the point in time to which the backup set can be restored. This point in time is close to the RestoreTime input parameter. Because the latest local binlog of a DN may not have been uploaded, restoration to the desired point in time is not guaranteed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;gmsBackupSet&quot;: {&quot;pubFullDownloadUrl&quot;: &quot;<a href="https://xxxxx%22,%22dnName">https://xxxxx&quot;,&quot;dnName</a>&quot;: &quot;pxc-xdb-m-xxxxxx&quot;,&quot;hostInstanceId&quot;: 0001,&quot;binlogs&quot;: [],&quot;backupEndTime&quot;: &quot;2024-10-21T10:11:56Z&quot;,&quot;backupLinkExpiredTime&quot;: &quot;2024-10-23T06:13:54Z&quot;,&quot;dnBackupSetId&quot;: &quot;00088&quot;,&quot;notCompletedBinlogs&quot;: [],&quot;commitIndex&quot;: &quot;15249275&quot;,&quot;innerFullDownloadUrl&quot;: &quot;<a href="http://xxxxx%22,%22backupStartTime">http://xxxxx&quot;,&quot;backupStartTime</a>&quot;: &quot;2024-10-21T10:09:20Z&quot;,&quot;backupSetSize&quot;: 526118912},&quot;dnBackupSets&quot;: [],&quot;insName&quot;: &quot;pxc-xxxxx&quot;,&quot;backupSetId&quot;: &quot;cb-xxxxx&quot;,&quot;canBinlogRecoverToTime&quot;: 1729567925000,&quot;backupEndTime&quot;: &quot;2024-10-21T10:12:16Z&quot;,&quot;canBinlogRecoverToTimeUTC&quot;: &quot;2024-10-22T03:32:05Z&quot;,&quot;canBackupMinRecoverToTimeUTC&quot;: &quot;2024-10-21T10:11:56Z&quot;,&quot;pitrInvalid&quot;: false,&quot;backupStartTime&quot;: &quot;2024-10-21T10:09:16Z&quot;,&quot;canBackupMinRecoverToTime&quot;: 1729505516000}</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenBackupSetResponseBody build() {
            return new DescribeOpenBackupSetResponseBody(this);
        } 

    } 

}
