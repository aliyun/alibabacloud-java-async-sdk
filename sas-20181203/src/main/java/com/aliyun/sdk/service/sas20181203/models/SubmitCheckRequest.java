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
        private Long resourceDirectoryAccountId; 
        private String scanRange; 
        private String taskSource; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCheckRequest request) {
            super(request);
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.scanRange = request.scanRange;
            this.taskSource = request.taskSource;
        } 

        /**
         * <p>The Alibaba Cloud account ID of the member account in the resource directory.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
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
         * <li><strong>FULL</strong>: scans all check items</li>
         * <li><strong>POLICY</strong>: scans custom-configured check items</li>
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
         * <p>The task source. Valid values:</p>
         * <ul>
         * <li><strong>YAO_CHI</strong>: Alibaba Cloud ApsaraDB console.</li>
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
