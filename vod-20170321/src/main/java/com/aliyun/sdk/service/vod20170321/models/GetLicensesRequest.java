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
 * {@link GetLicensesRequest} extends {@link RequestModel}
 *
 * <p>GetLicensesRequest</p>
 */
public class GetLicensesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppItemId")
    private String appItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PkgName")
    private String pkgName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlatformType")
    private Long platformType;

    private GetLicensesRequest(Builder builder) {
        super(builder);
        this.appItemId = builder.appItemId;
        this.appName = builder.appName;
        this.businessType = builder.businessType;
        this.needTotalCount = builder.needTotalCount;
        this.offset = builder.offset;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.pkgName = builder.pkgName;
        this.platformType = builder.platformType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLicensesRequest create() {
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
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
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
     * @return platformType
     */
    public Long getPlatformType() {
        return this.platformType;
    }

    public static final class Builder extends Request.Builder<GetLicensesRequest, Builder> {
        private String appItemId; 
        private String appName; 
        private String businessType; 
        private Boolean needTotalCount; 
        private Long offset; 
        private Long pageNo; 
        private Long pageSize; 
        private String pkgName; 
        private Long platformType; 

        private Builder() {
            super();
        } 

        private Builder(GetLicensesRequest request) {
            super(request);
            this.appItemId = request.appItemId;
            this.appName = request.appName;
            this.businessType = request.businessType;
            this.needTotalCount = request.needTotalCount;
            this.offset = request.offset;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.pkgName = request.pkgName;
            this.platformType = request.platformType;
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
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * NeedTotalCount.
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putBodyParameter("NeedTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Long offset) {
            this.putBodyParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putBodyParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PkgName.
         */
        public Builder pkgName(String pkgName) {
            this.putBodyParameter("PkgName", pkgName);
            this.pkgName = pkgName;
            return this;
        }

        /**
         * PlatformType.
         */
        public Builder platformType(Long platformType) {
            this.putBodyParameter("PlatformType", platformType);
            this.platformType = platformType;
            return this;
        }

        @Override
        public GetLicensesRequest build() {
            return new GetLicensesRequest(this);
        } 

    } 

}
