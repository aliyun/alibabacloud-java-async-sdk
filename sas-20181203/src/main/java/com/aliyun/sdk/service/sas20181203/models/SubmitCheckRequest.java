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
 * {@link SubmitCheckRequest} extends {@link RequestModel}
 *
 * <p>SubmitCheckRequest</p>
 */
public class SubmitCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private String scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskSource")
    private String taskSource;

    private SubmitCheckRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.scanRange = builder.scanRange;
        this.taskSource = builder.taskSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return scanRange
     */
    public String getScanRange() {
        return this.scanRange;
    }

    /**
     * @return taskSource
     */
    public String getTaskSource() {
        return this.taskSource;
    }

    public static final class Builder extends Request.Builder<SubmitCheckRequest, Builder> {
        private String configId; 
        private Long resourceDirectoryAccountId; 
        private String scanRange; 
        private String taskSource; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCheckRequest request) {
            super(request);
            this.configId = request.configId;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.scanRange = request.scanRange;
            this.taskSource = request.taskSource;
        } 

        /**
         * <p>The policy ID. This parameter takes effect only when ScanRange is set to POLICY. You can obtain the value by calling the ListCheckConfigs operation. If this parameter is not specified or is set to default, the scan is triggered based on the system default policy. If the default policy does not exist, NoDefaultStrategy is returned. If another value is specified, the scan is triggered based on the check items of the specified policy. If the policy does not exist or does not belong to the current account, IllegalParam is returned. This parameter is ignored when ScanRange is set to FULL or FREE.</p>
         * 
         * <strong>example:</strong>
         * <p>22222f91-57af-4907-87f1-f9046da****</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the member accounts of the resource folder belong.</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The check scope. Valid values:</p>
         * <ul>
         * <li><strong>FULL</strong>: Scans all check items.</li>
         * <li><strong>POLICY</strong>: Scans check items of custom configurations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POLICY</p>
         */
        public Builder scanRange(String scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * <p>The source of the task. Valid values:</p>
         * <ul>
         * <li><strong>YAO_CHI</strong>: ApsaraDB console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YAO_CHI</p>
         */
        public Builder taskSource(String taskSource) {
            this.putQueryParameter("TaskSource", taskSource);
            this.taskSource = taskSource;
            return this;
        }

        @Override
        public SubmitCheckRequest build() {
            return new SubmitCheckRequest(this);
        } 

    } 

}
