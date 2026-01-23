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

    private ListStandardsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
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

    public static final class Builder extends Request.Builder<ListStandardsRequest, Builder> {
        private String regionId; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListStandardsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
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
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
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
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * StandardSetIdList.
             */
            public Builder standardSetIdList(java.util.List<Long> standardSetIdList) {
                this.standardSetIdList = standardSetIdList;
                return this;
            }

            /**
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
             * StandardStatusList.
             */
            public Builder standardStatusList(java.util.List<String> standardStatusList) {
                this.standardStatusList = standardStatusList;
                return this;
            }

            /**
             * StandardTemplateIdList.
             */
            public Builder standardTemplateIdList(java.util.List<Long> standardTemplateIdList) {
                this.standardTemplateIdList = standardTemplateIdList;
                return this;
            }

            /**
             * StandardTypeList.
             */
            public Builder standardTypeList(java.util.List<String> standardTypeList) {
                this.standardTypeList = standardTypeList;
                return this;
            }

            /**
             * UserId.
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
