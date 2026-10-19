// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListDeploymentJobRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentJobRequest</p>
 */
public class ListDeploymentJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    private Long certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDeploymentJobRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.currentPage = builder.currentPage;
        this.instanceId = builder.instanceId;
        this.jobType = builder.jobType;
        this.showSize = builder.showSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public Long getCertId() {
        return this.certId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListDeploymentJobRequest, Builder> {
        private Long certId; 
        private Integer currentPage; 
        private String instanceId; 
        private String jobType; 
        private Integer showSize; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentJobRequest request) {
            super(request);
            this.certId = request.certId;
            this.currentPage = request.currentPage;
            this.instanceId = request.instanceId;
            this.jobType = request.jobType;
            this.showSize = request.showSize;
            this.status = request.status;
        } 

        /**
         * <p>The certificate ID.</p>
         * <blockquote>
         * <p>You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/455804.html">ListUserCertificateOrder</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23982365</p>
         */
        public Builder certId(Long certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-ivauto-hqito6</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The paging Settings for the number of certificates to return on each page during a paged query. Default value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder showSize(Integer showSize) {
            this.putQueryParameter("ShowSize", showSize);
            this.showSize = showSize;
            return this;
        }

        /**
         * <p>The deployment task status.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDeploymentJobRequest build() {
            return new ListDeploymentJobRequest(this);
        } 

    } 

}
