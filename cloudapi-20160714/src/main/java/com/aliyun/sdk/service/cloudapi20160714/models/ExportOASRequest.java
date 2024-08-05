// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportOASRequest} extends {@link RequestModel}
 *
 * <p>ExportOASRequest</p>
 */
public class ExportOASRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiIdList")
    private java.util.List < String > apiIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFormat")
    private String dataFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OasVersion")
    private String oasVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    private String stageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithXExtensions")
    private Boolean withXExtensions;

    private ExportOASRequest(Builder builder) {
        super(builder);
        this.apiIdList = builder.apiIdList;
        this.dataFormat = builder.dataFormat;
        this.groupId = builder.groupId;
        this.oasVersion = builder.oasVersion;
        this.pageNumber = builder.pageNumber;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
        this.withXExtensions = builder.withXExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportOASRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiIdList
     */
    public java.util.List < String > getApiIdList() {
        return this.apiIdList;
    }

    /**
     * @return dataFormat
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return oasVersion
     */
    public String getOasVersion() {
        return this.oasVersion;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    /**
     * @return withXExtensions
     */
    public Boolean getWithXExtensions() {
        return this.withXExtensions;
    }

    public static final class Builder extends Request.Builder<ExportOASRequest, Builder> {
        private java.util.List < String > apiIdList; 
        private String dataFormat; 
        private String groupId; 
        private String oasVersion; 
        private Integer pageNumber; 
        private String securityToken; 
        private String stageName; 
        private Boolean withXExtensions; 

        private Builder() {
            super();
        } 

        private Builder(ExportOASRequest request) {
            super(request);
            this.apiIdList = request.apiIdList;
            this.dataFormat = request.dataFormat;
            this.groupId = request.groupId;
            this.oasVersion = request.oasVersion;
            this.pageNumber = request.pageNumber;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
            this.withXExtensions = request.withXExtensions;
        } 

        /**
         * ApiIdList.
         */
        public Builder apiIdList(java.util.List < String > apiIdList) {
            String apiIdListShrink = shrink(apiIdList, "ApiIdList", "json");
            this.putQueryParameter("ApiIdList", apiIdListShrink);
            this.apiIdList = apiIdList;
            return this;
        }

        /**
         * DataFormat.
         */
        public Builder dataFormat(String dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * OasVersion.
         */
        public Builder oasVersion(String oasVersion) {
            this.putQueryParameter("OasVersion", oasVersion);
            this.oasVersion = oasVersion;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        /**
         * WithXExtensions.
         */
        public Builder withXExtensions(Boolean withXExtensions) {
            this.putQueryParameter("WithXExtensions", withXExtensions);
            this.withXExtensions = withXExtensions;
            return this;
        }

        @Override
        public ExportOASRequest build() {
            return new ExportOASRequest(this);
        } 

    } 

}
