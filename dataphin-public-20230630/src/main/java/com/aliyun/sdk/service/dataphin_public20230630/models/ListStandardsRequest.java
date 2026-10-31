// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListStandardsRequest} extends {@link RequestModel}
 *
 * <p>ListStandardsRequest</p>
 */
public class ListStandardsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListStandardsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStandardsRequest create() {
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
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListStandardsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListStandardsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The search conditions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the user who performs the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListStandardsRequest build() {
            return new ListStandardsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListStandardsRequest} extends {@link TeaModel}
     *
     * <p>ListStandardsRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("StandardSetIdList")
        private java.util.List<Long> standardSetIdList;

        @com.aliyun.core.annotation.NameInMap("StandardStage")
        @com.aliyun.core.annotation.Validation(required = true)
        private String standardStage;

        @com.aliyun.core.annotation.NameInMap("StandardStatusList")
        private java.util.List<String> standardStatusList;

        @com.aliyun.core.annotation.NameInMap("StandardTemplateIdList")
        private java.util.List<Long> standardTemplateIdList;

        @com.aliyun.core.annotation.NameInMap("StandardTypeList")
        private java.util.List<String> standardTypeList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ListQuery(Builder builder) {
            this.directory = builder.directory;
            this.keyword = builder.keyword;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.standardSetIdList = builder.standardSetIdList;
            this.standardStage = builder.standardStage;
            this.standardStatusList = builder.standardStatusList;
            this.standardTemplateIdList = builder.standardTemplateIdList;
            this.standardTypeList = builder.standardTypeList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
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
         * @return standardSetIdList
         */
        public java.util.List<Long> getStandardSetIdList() {
            return this.standardSetIdList;
        }

        /**
         * @return standardStage
         */
        public String getStandardStage() {
            return this.standardStage;
        }

        /**
         * @return standardStatusList
         */
        public java.util.List<String> getStandardStatusList() {
            return this.standardStatusList;
        }

        /**
         * @return standardTemplateIdList
         */
        public java.util.List<Long> getStandardTemplateIdList() {
            return this.standardTemplateIdList;
        }

        /**
         * @return standardTypeList
         */
        public java.util.List<String> getStandardTypeList() {
            return this.standardTypeList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String directory; 
            private String keyword; 
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<Long> standardSetIdList; 
            private String standardStage; 
            private java.util.List<String> standardStatusList; 
            private java.util.List<Long> standardTemplateIdList; 
            private java.util.List<String> standardTypeList; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ListQuery model) {
                this.directory = model.directory;
                this.keyword = model.keyword;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.standardSetIdList = model.standardSetIdList;
                this.standardStage = model.standardStage;
                this.standardStatusList = model.standardStatusList;
                this.standardTemplateIdList = model.standardTemplateIdList;
                this.standardTypeList = model.standardTypeList;
                this.userId = model.userId;
            } 

            /**
             * <p>The folder to which the standard belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>/dir1/dir2</p>
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The search keyword. Supports case-insensitive fuzzy search by standard name, English name, or code, and sorts results by relevance.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The IDs of the standard sets to which the standards belong.</p>
             */
            public Builder standardSetIdList(java.util.List<Long> standardSetIdList) {
                this.standardSetIdList = standardSetIdList;
                return this;
            }

            /**
             * <p>The stages of the standards. Valid values: DEV and PROD.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder standardStage(String standardStage) {
                this.standardStage = standardStage;
                return this;
            }

            /**
             * <p>The list of standard statuses. For the DEV stage, the standard statuses are: DRAFT (Draft), UNDER_REVISION (Under Revision), UNDER_REVIEW (Under Review), REVIEW_PASSED (Approved), and IN_PUBLISH (Publishing). For the PROD stage, the standard statuses are: NOT_ACTIVATED (Not Activated), ACTIVE (Active), and EXPIRED (Expired).</p>
             */
            public Builder standardStatusList(java.util.List<String> standardStatusList) {
                this.standardStatusList = standardStatusList;
                return this;
            }

            /**
             * <p>The IDs of the standard templates to which the standards belong.</p>
             */
            public Builder standardTemplateIdList(java.util.List<Long> standardTemplateIdList) {
                this.standardTemplateIdList = standardTemplateIdList;
                return this;
            }

            /**
             * <p>The list of standard types. Valid values: Basic, and EMPTY (the standard type is empty).</p>
             */
            public Builder standardTypeList(java.util.List<String> standardTypeList) {
                this.standardTypeList = standardTypeList;
                return this;
            }

            /**
             * <p>The user ID. If specified, only standards visible to this user are queried. If left empty, standards visible to the current user are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
