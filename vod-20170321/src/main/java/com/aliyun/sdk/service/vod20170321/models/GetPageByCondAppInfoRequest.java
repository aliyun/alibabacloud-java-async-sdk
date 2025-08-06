// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetPageByCondAppInfoRequest} extends {@link RequestModel}
 *
 * <p>GetPageByCondAppInfoRequest</p>
 */
public class GetPageByCondAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    private String appItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgName")
    private String pkgName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PkgSignature")
    private String pkgSignature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformType")
    private Long platformType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private GetPageByCondAppInfoRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.businessType = builder.businessType;
        this.needTotalCount = builder.needTotalCount;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.pkgName = builder.pkgName;
        this.pkgSignature = builder.pkgSignature;
        this.platformType = builder.platformType;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPageByCondAppInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appItemId
     */
    public String getAppItemId() {
        return this.appItemId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public Integer getAppType() {
        return this.appType;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pkgName
     */
    public String getPkgName() {
        return this.pkgName;
    }

    /**
     * @return pkgSignature
     */
    public String getPkgSignature() {
        return this.pkgSignature;
    }

    /**
     * @return platformType
     */
    public Long getPlatformType() {
        return this.platformType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<GetPageByCondAppInfoRequest, Builder> {
        private String appItemId; 
        private String appName; 
        private Integer appType; 
        private String businessType; 
        private Boolean needTotalCount; 
        private Long pageNo; 
        private Long pageSize; 
        private String pkgName; 
        private String pkgSignature; 
        private Long platformType; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(GetPageByCondAppInfoRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.appName = request.appName;
            this.appType = request.appType;
            this.businessType = request.businessType;
            this.needTotalCount = request.needTotalCount;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.pkgName = request.pkgName;
            this.pkgSignature = request.pkgSignature;
            this.platformType = request.platformType;
            this.sortBy = request.sortBy;
        } 

        /**
         * AppItemId.
         */
        public Builder appItemId(String appItemId) {
            this.putQueryParameter("AppItemId", appItemId);
            this.appItemId = appItemId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(Integer appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * NeedTotalCount.
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putQueryParameter("NeedTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PkgName.
         */
        public Builder pkgName(String pkgName) {
            this.putQueryParameter("PkgName", pkgName);
            this.pkgName = pkgName;
            return this;
        }

        /**
         * PkgSignature.
         */
        public Builder pkgSignature(String pkgSignature) {
            this.putQueryParameter("PkgSignature", pkgSignature);
            this.pkgSignature = pkgSignature;
            return this;
        }

        /**
         * PlatformType.
         */
        public Builder platformType(Long platformType) {
            this.putQueryParameter("PlatformType", platformType);
            this.platformType = platformType;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public GetPageByCondAppInfoRequest build() {
            return new GetPageByCondAppInfoRequest(this);
        } 

    } 

}
