// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseRoleQueryAccountForRoleGrantByPageRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseRoleQueryAccountForRoleGrantByPageRequest</p>
 */
public class EnterpriseRoleQueryAccountForRoleGrantByPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRoleCode")
    private String bizRoleCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrgId")
    private String orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowCompleteInfo")
    private Boolean showCompleteInfo;

    private EnterpriseRoleQueryAccountForRoleGrantByPageRequest(Builder builder) {
        super(builder);
        this.bizRoleCode = builder.bizRoleCode;
        this.encryptTicket = builder.encryptTicket;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orgId = builder.orgId;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.showCompleteInfo = builder.showCompleteInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleQueryAccountForRoleGrantByPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRoleCode
     */
    public String getBizRoleCode() {
        return this.bizRoleCode;
    }

    /**
     * @return encryptTicket
     */
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return showCompleteInfo
     */
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public static final class Builder extends Request.Builder<EnterpriseRoleQueryAccountForRoleGrantByPageRequest, Builder> {
        private String bizRoleCode; 
        private String encryptTicket; 
        private Integer maxResults; 
        private String nextToken; 
        private String orgId; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String query; 
        private Boolean showCompleteInfo; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseRoleQueryAccountForRoleGrantByPageRequest request) {
            super(request);
            this.bizRoleCode = request.bizRoleCode;
            this.encryptTicket = request.encryptTicket;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orgId = request.orgId;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.showCompleteInfo = request.showCompleteInfo;
        } 

        /**
         * BizRoleCode.
         */
        public Builder bizRoleCode(String bizRoleCode) {
            this.putQueryParameter("BizRoleCode", bizRoleCode);
            this.bizRoleCode = bizRoleCode;
            return this;
        }

        /**
         * EncryptTicket.
         */
        public Builder encryptTicket(String encryptTicket) {
            this.putQueryParameter("EncryptTicket", encryptTicket);
            this.encryptTicket = encryptTicket;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * ShowCompleteInfo.
         */
        public Builder showCompleteInfo(Boolean showCompleteInfo) {
            this.putQueryParameter("ShowCompleteInfo", showCompleteInfo);
            this.showCompleteInfo = showCompleteInfo;
            return this;
        }

        @Override
        public EnterpriseRoleQueryAccountForRoleGrantByPageRequest build() {
            return new EnterpriseRoleQueryAccountForRoleGrantByPageRequest(this);
        } 

    } 

}
