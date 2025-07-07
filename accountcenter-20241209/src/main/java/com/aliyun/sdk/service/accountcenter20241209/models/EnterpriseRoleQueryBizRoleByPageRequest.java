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
 * {@link EnterpriseRoleQueryBizRoleByPageRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseRoleQueryBizRoleByPageRequest</p>
 */
public class EnterpriseRoleQueryBizRoleByPageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Query
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
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcType")
    private String srcType;

    private EnterpriseRoleQueryBizRoleByPageRequest(Builder builder) {
        super(builder);
        this.encryptTicket = builder.encryptTicket;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.resourceType = builder.resourceType;
        this.srcType = builder.srcType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleQueryBizRoleByPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return srcType
     */
    public String getSrcType() {
        return this.srcType;
    }

    public static final class Builder extends Request.Builder<EnterpriseRoleQueryBizRoleByPageRequest, Builder> {
        private String encryptTicket; 
        private Integer maxResults; 
        private String nextToken; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String query; 
        private String resourceType; 
        private String srcType; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseRoleQueryBizRoleByPageRequest request) {
            super(request);
            this.encryptTicket = request.encryptTicket;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.resourceType = request.resourceType;
            this.srcType = request.srcType;
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
            this.putQueryParameter("OrientedLeId", orientedLeId);
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SrcType.
         */
        public Builder srcType(String srcType) {
            this.putQueryParameter("SrcType", srcType);
            this.srcType = srcType;
            return this;
        }

        @Override
        public EnterpriseRoleQueryBizRoleByPageRequest build() {
            return new EnterpriseRoleQueryBizRoleByPageRequest(this);
        } 

    } 

}
