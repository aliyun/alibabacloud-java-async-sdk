// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeMobileAgentPackageRequest} extends {@link RequestModel}
 *
 * <p>DescribeMobileAgentPackageRequest</p>
 */
public class DescribeMobileAgentPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageIds")
    private java.util.List<String> packageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageSpec")
    private String packageSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageStatus")
    private String packageStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private DescribeMobileAgentPackageRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.packageIds = builder.packageIds;
        this.packageSpec = builder.packageSpec;
        this.packageStatus = builder.packageStatus;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMobileAgentPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return packageIds
     */
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

    /**
     * @return packageSpec
     */
    public String getPackageSpec() {
        return this.packageSpec;
    }

    /**
     * @return packageStatus
     */
    public String getPackageStatus() {
        return this.packageStatus;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeMobileAgentPackageRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private java.util.List<String> packageIds; 
        private String packageSpec; 
        private String packageStatus; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMobileAgentPackageRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.packageIds = request.packageIds;
            this.packageSpec = request.packageSpec;
            this.packageStatus = request.packageStatus;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * PackageIds.
         */
        public Builder packageIds(java.util.List<String> packageIds) {
            this.putQueryParameter("PackageIds", packageIds);
            this.packageIds = packageIds;
            return this;
        }

        /**
         * PackageSpec.
         */
        public Builder packageSpec(String packageSpec) {
            this.putQueryParameter("PackageSpec", packageSpec);
            this.packageSpec = packageSpec;
            return this;
        }

        /**
         * PackageStatus.
         */
        public Builder packageStatus(String packageStatus) {
            this.putQueryParameter("PackageStatus", packageStatus);
            this.packageStatus = packageStatus;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeMobileAgentPackageRequest build() {
            return new DescribeMobileAgentPackageRequest(this);
        } 

    } 

}
