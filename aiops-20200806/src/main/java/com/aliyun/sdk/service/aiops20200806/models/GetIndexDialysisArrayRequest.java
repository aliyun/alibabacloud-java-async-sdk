// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexDialysisArrayRequest} extends {@link RequestModel}
 *
 * <p>GetIndexDialysisArrayRequest</p>
 */
public class GetIndexDialysisArrayRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("CloudResourceId")
    private String cloudResourceId;

    @Query
    @NameInMap("CloudTypeName")
    private String cloudTypeName;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("IndexCode")
    private String indexCode;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private GetIndexDialysisArrayRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.cloudResourceId = builder.cloudResourceId;
        this.cloudTypeName = builder.cloudTypeName;
        this.currentPage = builder.currentPage;
        this.indexCode = builder.indexCode;
        this.operaUid = builder.operaUid;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexDialysisArrayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return cloudResourceId
     */
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    /**
     * @return cloudTypeName
     */
    public String getCloudTypeName() {
        return this.cloudTypeName;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return indexCode
     */
    public String getIndexCode() {
        return this.indexCode;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<GetIndexDialysisArrayRequest, Builder> {
        private String businessGroupId; 
        private String cloudResourceId; 
        private String cloudTypeName; 
        private Integer currentPage; 
        private String indexCode; 
        private String operaUid; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetIndexDialysisArrayRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.cloudResourceId = request.cloudResourceId;
            this.cloudTypeName = request.cloudTypeName;
            this.currentPage = request.currentPage;
            this.indexCode = request.indexCode;
            this.operaUid = request.operaUid;
            this.pageSize = request.pageSize;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * CloudResourceId.
         */
        public Builder cloudResourceId(String cloudResourceId) {
            this.putQueryParameter("CloudResourceId", cloudResourceId);
            this.cloudResourceId = cloudResourceId;
            return this;
        }

        /**
         * CloudTypeName.
         */
        public Builder cloudTypeName(String cloudTypeName) {
            this.putQueryParameter("CloudTypeName", cloudTypeName);
            this.cloudTypeName = cloudTypeName;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IndexCode.
         */
        public Builder indexCode(String indexCode) {
            this.putQueryParameter("IndexCode", indexCode);
            this.indexCode = indexCode;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
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
        public GetIndexDialysisArrayRequest build() {
            return new GetIndexDialysisArrayRequest(this);
        } 

    } 

}
