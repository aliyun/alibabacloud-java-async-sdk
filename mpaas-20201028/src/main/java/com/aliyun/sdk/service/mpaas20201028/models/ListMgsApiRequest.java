// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMgsApiRequest} extends {@link RequestModel}
 *
 * <p>ListMgsApiRequest</p>
 */
public class ListMgsApiRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ApiStatus")
    private String apiStatus;

    @Body
    @NameInMap("ApiType")
    private String apiType;

    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("Format")
    private String format;

    @Body
    @NameInMap("Host")
    private String host;

    @Body
    @NameInMap("NeedEncrypt")
    private String needEncrypt;

    @Body
    @NameInMap("NeedEtag")
    private String needEtag;

    @Body
    @NameInMap("NeedSign")
    private String needSign;

    @Body
    @NameInMap("OperationType")
    private String operationType;

    @Body
    @NameInMap("OptFuzzy")
    private String optFuzzy;

    @Body
    @NameInMap("PageIndex")
    private Long pageIndex;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("SysId")
    private Long sysId;

    @Body
    @NameInMap("SysName")
    private String sysName;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListMgsApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiStatus = builder.apiStatus;
        this.apiType = builder.apiType;
        this.appId = builder.appId;
        this.format = builder.format;
        this.host = builder.host;
        this.needEncrypt = builder.needEncrypt;
        this.needEtag = builder.needEtag;
        this.needSign = builder.needSign;
        this.operationType = builder.operationType;
        this.optFuzzy = builder.optFuzzy;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.sysId = builder.sysId;
        this.sysName = builder.sysName;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMgsApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return apiStatus
     */
    public String getApiStatus() {
        return this.apiStatus;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return needEncrypt
     */
    public String getNeedEncrypt() {
        return this.needEncrypt;
    }

    /**
     * @return needEtag
     */
    public String getNeedEtag() {
        return this.needEtag;
    }

    /**
     * @return needSign
     */
    public String getNeedSign() {
        return this.needSign;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return optFuzzy
     */
    public String getOptFuzzy() {
        return this.optFuzzy;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sysId
     */
    public Long getSysId() {
        return this.sysId;
    }

    /**
     * @return sysName
     */
    public String getSysName() {
        return this.sysName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListMgsApiRequest, Builder> {
        private String regionId; 
        private String apiStatus; 
        private String apiType; 
        private String appId; 
        private String format; 
        private String host; 
        private String needEncrypt; 
        private String needEtag; 
        private String needSign; 
        private String operationType; 
        private String optFuzzy; 
        private Long pageIndex; 
        private Long pageSize; 
        private Long sysId; 
        private String sysName; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListMgsApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiStatus = request.apiStatus;
            this.apiType = request.apiType;
            this.appId = request.appId;
            this.format = request.format;
            this.host = request.host;
            this.needEncrypt = request.needEncrypt;
            this.needEtag = request.needEtag;
            this.needSign = request.needSign;
            this.operationType = request.operationType;
            this.optFuzzy = request.optFuzzy;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.sysId = request.sysId;
            this.sysName = request.sysName;
            this.tenantId = request.tenantId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ApiStatus.
         */
        public Builder apiStatus(String apiStatus) {
            this.putBodyParameter("ApiStatus", apiStatus);
            this.apiStatus = apiStatus;
            return this;
        }

        /**
         * ApiType.
         */
        public Builder apiType(String apiType) {
            this.putBodyParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(String format) {
            this.putBodyParameter("Format", format);
            this.format = format;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putBodyParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * NeedEncrypt.
         */
        public Builder needEncrypt(String needEncrypt) {
            this.putBodyParameter("NeedEncrypt", needEncrypt);
            this.needEncrypt = needEncrypt;
            return this;
        }

        /**
         * NeedEtag.
         */
        public Builder needEtag(String needEtag) {
            this.putBodyParameter("NeedEtag", needEtag);
            this.needEtag = needEtag;
            return this;
        }

        /**
         * NeedSign.
         */
        public Builder needSign(String needSign) {
            this.putBodyParameter("NeedSign", needSign);
            this.needSign = needSign;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(String operationType) {
            this.putBodyParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * OptFuzzy.
         */
        public Builder optFuzzy(String optFuzzy) {
            this.putBodyParameter("OptFuzzy", optFuzzy);
            this.optFuzzy = optFuzzy;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Long pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
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
         * SysId.
         */
        public Builder sysId(Long sysId) {
            this.putBodyParameter("SysId", sysId);
            this.sysId = sysId;
            return this;
        }

        /**
         * SysName.
         */
        public Builder sysName(String sysName) {
            this.putBodyParameter("SysName", sysName);
            this.sysName = sysName;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListMgsApiRequest build() {
            return new ListMgsApiRequest(this);
        } 

    } 

}
