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
 * {@link DescribeBackupPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupPoliciesRequest</p>
 */
public class DescribeBackupPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineRemark")
    private String machineRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeBackupPoliciesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.machineRemark = builder.machineRemark;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return machineRemark
     */
    public String getMachineRemark() {
        return this.machineRemark;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeBackupPoliciesRequest, Builder> {
        private Integer currentPage; 
        private String machineRemark; 
        private String name; 
        private Integer pageSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupPoliciesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.machineRemark = request.machineRemark;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The information that you want to use to identify the servers protected by the anti-ransomware policy. You can enter the IP address or ID of a server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        public Builder machineRemark(String machineRemark) {
            this.putQueryParameter("MachineRemark", machineRemark);
            this.machineRemark = machineRemark;
            return this;
        }

        /**
         * <p>The name of the anti-ransomware policy that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>SecurityStrategy-20200303</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the anti-ransomware policy. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: The anti-ransomware policy is manually enabled.</li>
         * <li><strong>disabled</strong>: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.</li>
         * <li><strong>closed</strong>: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeBackupPoliciesRequest build() {
            return new DescribeBackupPoliciesRequest(this);
        } 

    } 

}
