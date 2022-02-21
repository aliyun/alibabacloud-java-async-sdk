// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceUsageResponseBody</p>
 */
public class GetInstanceUsageResponseBody extends TeaModel {
    @NameInMap("ChartNamespaceQuota")
    private String chartNamespaceQuota;

    @NameInMap("ChartNamespaceUsage")
    private String chartNamespaceUsage;

    @NameInMap("ChartRepoQuota")
    private String chartRepoQuota;

    @NameInMap("ChartRepoUsage")
    private String chartRepoUsage;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("NamespaceQuota")
    private String namespaceQuota;

    @NameInMap("NamespaceUsage")
    private String namespaceUsage;

    @NameInMap("RepoQuota")
    private String repoQuota;

    @NameInMap("RepoUsage")
    private String repoUsage;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceUsageResponseBody(Builder builder) {
        this.chartNamespaceQuota = builder.chartNamespaceQuota;
        this.chartNamespaceUsage = builder.chartNamespaceUsage;
        this.chartRepoQuota = builder.chartRepoQuota;
        this.chartRepoUsage = builder.chartRepoUsage;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.namespaceQuota = builder.namespaceQuota;
        this.namespaceUsage = builder.namespaceUsage;
        this.repoQuota = builder.repoQuota;
        this.repoUsage = builder.repoUsage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceUsageResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String chartNamespaceQuota; 
        private String chartNamespaceUsage; 
        private String chartRepoQuota; 
        private String chartRepoUsage; 
        private String code; 
        private Boolean isSuccess; 
        private String namespaceQuota; 
        private String namespaceUsage; 
        private String repoQuota; 
        private String repoUsage; 
        private String requestId; 

        /**
         * ChartNamespaceQuota.
         */
        public Builder chartNamespaceQuota(String chartNamespaceQuota) {
            this.chartNamespaceQuota = chartNamespaceQuota;
            return this;
        }

        /**
         * ChartNamespaceUsage.
         */
        public Builder chartNamespaceUsage(String chartNamespaceUsage) {
            this.chartNamespaceUsage = chartNamespaceUsage;
            return this;
        }

        /**
         * ChartRepoQuota.
         */
        public Builder chartRepoQuota(String chartRepoQuota) {
            this.chartRepoQuota = chartRepoQuota;
            return this;
        }

        /**
         * ChartRepoUsage.
         */
        public Builder chartRepoUsage(String chartRepoUsage) {
            this.chartRepoUsage = chartRepoUsage;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * NamespaceQuota.
         */
        public Builder namespaceQuota(String namespaceQuota) {
            this.namespaceQuota = namespaceQuota;
            return this;
        }

        /**
         * NamespaceUsage.
         */
        public Builder namespaceUsage(String namespaceUsage) {
            this.namespaceUsage = namespaceUsage;
            return this;
        }

        /**
         * RepoQuota.
         */
        public Builder repoQuota(String repoQuota) {
            this.repoQuota = repoQuota;
            return this;
        }

        /**
         * RepoUsage.
         */
        public Builder repoUsage(String repoUsage) {
            this.repoUsage = repoUsage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceUsageResponseBody build() {
            return new GetInstanceUsageResponseBody(this);
        } 

    } 

}
