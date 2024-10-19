// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The APIs that you want to export.</p>
         */
        public Builder apiIdList(java.util.List < String > apiIdList) {
            String apiIdListShrink = shrink(apiIdList, "ApiIdList", "json");
            this.putQueryParameter("ApiIdList", apiIdListShrink);
            this.apiIdList = apiIdList;
            return this;
        }

        /**
         * <p>The exported format:</p>
         * <ul>
         * <li>json</li>
         * <li>yaml</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yaml</p>
         */
        public Builder dataFormat(String dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * <p>The API group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>42925e7f5209438186d5560239af5xxx</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The OAS version. Valid values:</p>
         * <ul>
         * <li><strong>oas2</strong></li>
         * <li><strong>oas3</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oas2</p>
         */
        public Builder oasVersion(String oasVersion) {
            this.putQueryParameter("OasVersion", oasVersion);
            this.oasVersion = oasVersion;
            return this;
        }

        /**
         * <p>The number of pages in which you want to export the APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The environment to which the API is published. Valid values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: the production environment</li>
         * <li><strong>PRE</strong>: the pre-release environment</li>
         * <li><strong>TEST</strong>: the test environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        /**
         * <p>Specifies whether to export API Gateway extensions at the same time.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
