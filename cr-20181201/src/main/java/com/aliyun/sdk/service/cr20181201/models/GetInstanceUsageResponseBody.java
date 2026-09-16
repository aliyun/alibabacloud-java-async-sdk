// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetInstanceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceUsageResponseBody</p>
 */
public class GetInstanceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChartNamespaceQuota")
    private String chartNamespaceQuota;

    @com.aliyun.core.annotation.NameInMap("ChartNamespaceUsage")
    private String chartNamespaceUsage;

    @com.aliyun.core.annotation.NameInMap("ChartRepoQuota")
    private String chartRepoQuota;

    @com.aliyun.core.annotation.NameInMap("ChartRepoUsage")
    private String chartRepoUsage;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("NamespaceQuota")
    private String namespaceQuota;

    @com.aliyun.core.annotation.NameInMap("NamespaceUsage")
    private String namespaceUsage;

    @com.aliyun.core.annotation.NameInMap("PerformanceUnits")
    private Integer performanceUnits;

    @com.aliyun.core.annotation.NameInMap("RepoQuota")
    private String repoQuota;

    @com.aliyun.core.annotation.NameInMap("RepoUsage")
    private String repoUsage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcQuota")
    private String vpcQuota;

    @com.aliyun.core.annotation.NameInMap("VpcUsage")
    private String vpcUsage;

    private GetInstanceUsageResponseBody(Builder builder) {
        this.chartNamespaceQuota = builder.chartNamespaceQuota;
        this.chartNamespaceUsage = builder.chartNamespaceUsage;
        this.chartRepoQuota = builder.chartRepoQuota;
        this.chartRepoUsage = builder.chartRepoUsage;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.namespaceQuota = builder.namespaceQuota;
        this.namespaceUsage = builder.namespaceUsage;
        this.performanceUnits = builder.performanceUnits;
        this.repoQuota = builder.repoQuota;
        this.repoUsage = builder.repoUsage;
        this.requestId = builder.requestId;
        this.vpcQuota = builder.vpcQuota;
        this.vpcUsage = builder.vpcUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chartNamespaceQuota
     */
    public String getChartNamespaceQuota() {
        return this.chartNamespaceQuota;
    }

    /**
     * @return chartNamespaceUsage
     */
    public String getChartNamespaceUsage() {
        return this.chartNamespaceUsage;
    }

    /**
     * @return chartRepoQuota
     */
    public String getChartRepoQuota() {
        return this.chartRepoQuota;
    }

    /**
     * @return chartRepoUsage
     */
    public String getChartRepoUsage() {
        return this.chartRepoUsage;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return namespaceQuota
     */
    public String getNamespaceQuota() {
        return this.namespaceQuota;
    }

    /**
     * @return namespaceUsage
     */
    public String getNamespaceUsage() {
        return this.namespaceUsage;
    }

    /**
     * @return performanceUnits
     */
    public Integer getPerformanceUnits() {
        return this.performanceUnits;
    }

    /**
     * @return repoQuota
     */
    public String getRepoQuota() {
        return this.repoQuota;
    }

    /**
     * @return repoUsage
     */
    public String getRepoUsage() {
        return this.repoUsage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcQuota
     */
    public String getVpcQuota() {
        return this.vpcQuota;
    }

    /**
     * @return vpcUsage
     */
    public String getVpcUsage() {
        return this.vpcUsage;
    }

    public static final class Builder {
        private String chartNamespaceQuota; 
        private String chartNamespaceUsage; 
        private String chartRepoQuota; 
        private String chartRepoUsage; 
        private String code; 
        private Boolean isSuccess; 
        private String namespaceQuota; 
        private String namespaceUsage; 
        private Integer performanceUnits; 
        private String repoQuota; 
        private String repoUsage; 
        private String requestId; 
        private String vpcQuota; 
        private String vpcUsage; 

        private Builder() {
        } 

        private Builder(GetInstanceUsageResponseBody model) {
            this.chartNamespaceQuota = model.chartNamespaceQuota;
            this.chartNamespaceUsage = model.chartNamespaceUsage;
            this.chartRepoQuota = model.chartRepoQuota;
            this.chartRepoUsage = model.chartRepoUsage;
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.namespaceQuota = model.namespaceQuota;
            this.namespaceUsage = model.namespaceUsage;
            this.performanceUnits = model.performanceUnits;
            this.repoQuota = model.repoQuota;
            this.repoUsage = model.repoUsage;
            this.requestId = model.requestId;
            this.vpcQuota = model.vpcQuota;
            this.vpcUsage = model.vpcUsage;
        } 

        /**
         * <p>The quota of Chart namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder chartNamespaceQuota(String chartNamespaceQuota) {
            this.chartNamespaceQuota = chartNamespaceQuota;
            return this;
        }

        /**
         * <p>The number of Chart namespaces created.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder chartNamespaceUsage(String chartNamespaceUsage) {
            this.chartNamespaceUsage = chartNamespaceUsage;
            return this;
        }

        /**
         * <p>The quota of Chart repositories.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder chartRepoQuota(String chartRepoQuota) {
            this.chartRepoQuota = chartRepoQuota;
            return this;
        }

        /**
         * <p>The number of Chart repositories created.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder chartRepoUsage(String chartRepoUsage) {
            this.chartRepoUsage = chartRepoUsage;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The call was successful.</p>
         * </li>
         * <li><p><code>false</code>: The call failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The quota of image namespaces.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder namespaceQuota(String namespaceQuota) {
            this.namespaceQuota = namespaceQuota;
            return this;
        }

        /**
         * <p>The number of image namespaces used.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder namespaceUsage(String namespaceUsage) {
            this.namespaceUsage = namespaceUsage;
            return this;
        }

        /**
         * <p>The number of performance units, which indicates the additional instance capacity purchased on top of the Advanced Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder performanceUnits(Integer performanceUnits) {
            this.performanceUnits = performanceUnits;
            return this;
        }

        /**
         * <p>The quota of image repositories.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder repoQuota(String repoQuota) {
            this.repoQuota = repoQuota;
            return this;
        }

        /**
         * <p>The number of image repositories used.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder repoUsage(String repoUsage) {
            this.repoUsage = repoUsage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A726E801-7FCF-43F9-AF1C-51B3E65D3E7A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The VPC quota.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder vpcQuota(String vpcQuota) {
            this.vpcQuota = vpcQuota;
            return this;
        }

        /**
         * <p>The number of bound VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder vpcUsage(String vpcUsage) {
            this.vpcUsage = vpcUsage;
            return this;
        }

        public GetInstanceUsageResponseBody build() {
            return new GetInstanceUsageResponseBody(this);
        } 

    } 

}
