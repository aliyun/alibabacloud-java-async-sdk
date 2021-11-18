// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceUsageResponseBody</p>
 */
public class GetInstanceUsageResponseBody extends TeaModel {
    @NameInMap("NamespaceUsage")
    private String namespaceUsage;

    @NameInMap("RepoQuota")
    private String repoQuota;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ChartNamespaceQuota")
    private String chartNamespaceQuota;

    @NameInMap("RepoUsage")
    private String repoUsage;

    @NameInMap("NamespaceQuota")
    private String namespaceQuota;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("ChartRepoUsage")
    private String chartRepoUsage;

    @NameInMap("ChartNamespaceUsage")
    private String chartNamespaceUsage;

    @NameInMap("ChartRepoQuota")
    private String chartRepoQuota;


    private GetInstanceUsageResponseBody(Builder builder) {
        this.namespaceUsage = builder.namespaceUsage;
        this.repoQuota = builder.repoQuota;
        this.requestId = builder.requestId;
        this.chartNamespaceQuota = builder.chartNamespaceQuota;
        this.repoUsage = builder.repoUsage;
        this.namespaceQuota = builder.namespaceQuota;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.chartRepoUsage = builder.chartRepoUsage;
        this.chartNamespaceUsage = builder.chartNamespaceUsage;
        this.chartRepoQuota = builder.chartRepoQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return namespaceUsage
     */
    public String getNamespaceUsage() {
        return this.namespaceUsage;
    }

    /**
     * @return repoQuota
     */
    public String getRepoQuota() {
        return this.repoQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return chartNamespaceQuota
     */
    public String getChartNamespaceQuota() {
        return this.chartNamespaceQuota;
    }

    /**
     * @return repoUsage
     */
    public String getRepoUsage() {
        return this.repoUsage;
    }

    /**
     * @return namespaceQuota
     */
    public String getNamespaceQuota() {
        return this.namespaceQuota;
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
     * @return chartRepoUsage
     */
    public String getChartRepoUsage() {
        return this.chartRepoUsage;
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

    public static final class Builder {
        private String namespaceUsage; 
        private String repoQuota; 
        private String requestId; 
        private String chartNamespaceQuota; 
        private String repoUsage; 
        private String namespaceQuota; 
        private String code; 
        private Boolean isSuccess; 
        private String chartRepoUsage; 
        private String chartNamespaceUsage; 
        private String chartRepoQuota; 

        /**
         * <p>Image namespace usage</p>
         */
        public Builder namespaceUsage(String namespaceUsage) {
            this.namespaceUsage = namespaceUsage;
            return this;
        }

        /**
         * <p>Image Repository quota</p>
         */
        public Builder repoQuota(String repoQuota) {
            this.repoQuota = repoQuota;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The quota of the Chart namespace.</p>
         */
        public Builder chartNamespaceQuota(String chartNamespaceQuota) {
            this.chartNamespaceQuota = chartNamespaceQuota;
            return this;
        }

        /**
         * <p>Image Repository usage</p>
         */
        public Builder repoUsage(String repoUsage) {
            this.repoUsage = repoUsage;
            return this;
        }

        /**
         * <p>Image namespace quota</p>
         */
        public Builder namespaceQuota(String namespaceQuota) {
            this.namespaceQuota = namespaceQuota;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Number of Chart repositories created</p>
         */
        public Builder chartRepoUsage(String chartRepoUsage) {
            this.chartRepoUsage = chartRepoUsage;
            return this;
        }

        /**
         * <p>Number of Chart namespaces created</p>
         */
        public Builder chartNamespaceUsage(String chartNamespaceUsage) {
            this.chartNamespaceUsage = chartNamespaceUsage;
            return this;
        }

        /**
         * <p>Chart Number of repositories</p>
         */
        public Builder chartRepoQuota(String chartRepoQuota) {
            this.chartRepoQuota = chartRepoQuota;
            return this;
        }

        public GetInstanceUsageResponseBody build() {
            return new GetInstanceUsageResponseBody(this);
        } 

    } 

}
