// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIssueCategoryReportRelationRequest} extends {@link RequestModel}
 *
 * <p>CreateIssueCategoryReportRelationRequest</p>
 */
public class CreateIssueCategoryReportRelationRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RelationModelList")
    private java.util.List < RelationModelList> relationModelList;

    private CreateIssueCategoryReportRelationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.relationModelList = builder.relationModelList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIssueCategoryReportRelationRequest create() {
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
     * @return relationModelList
     */
    public java.util.List < RelationModelList> getRelationModelList() {
        return this.relationModelList;
    }

    public static final class Builder extends Request.Builder<CreateIssueCategoryReportRelationRequest, Builder> {
        private String regionId; 
        private java.util.List < RelationModelList> relationModelList; 

        private Builder() {
            super();
        } 

        private Builder(CreateIssueCategoryReportRelationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.relationModelList = request.relationModelList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RelationModelList.
         */
        public Builder relationModelList(java.util.List < RelationModelList> relationModelList) {
            this.putQueryParameter("RelationModelList", relationModelList);
            this.relationModelList = relationModelList;
            return this;
        }

        @Override
        public CreateIssueCategoryReportRelationRequest build() {
            return new CreateIssueCategoryReportRelationRequest(this);
        } 

    } 

    public static class RelationModelList extends TeaModel {
        @NameInMap("CustomerInputContent")
        private String customerInputContent;

        @NameInMap("IssueCategoryId")
        private Long issueCategoryId;

        @NameInMap("IssueCategoryName")
        private String issueCategoryName;

        @NameInMap("MappingTools")
        private String mappingTools;

        @NameInMap("ReportId")
        private String reportId;

        private RelationModelList(Builder builder) {
            this.customerInputContent = builder.customerInputContent;
            this.issueCategoryId = builder.issueCategoryId;
            this.issueCategoryName = builder.issueCategoryName;
            this.mappingTools = builder.mappingTools;
            this.reportId = builder.reportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationModelList create() {
            return builder().build();
        }

        /**
         * @return customerInputContent
         */
        public String getCustomerInputContent() {
            return this.customerInputContent;
        }

        /**
         * @return issueCategoryId
         */
        public Long getIssueCategoryId() {
            return this.issueCategoryId;
        }

        /**
         * @return issueCategoryName
         */
        public String getIssueCategoryName() {
            return this.issueCategoryName;
        }

        /**
         * @return mappingTools
         */
        public String getMappingTools() {
            return this.mappingTools;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        public static final class Builder {
            private String customerInputContent; 
            private Long issueCategoryId; 
            private String issueCategoryName; 
            private String mappingTools; 
            private String reportId; 

            /**
             * CustomerInputContent.
             */
            public Builder customerInputContent(String customerInputContent) {
                this.customerInputContent = customerInputContent;
                return this;
            }

            /**
             * IssueCategoryId.
             */
            public Builder issueCategoryId(Long issueCategoryId) {
                this.issueCategoryId = issueCategoryId;
                return this;
            }

            /**
             * IssueCategoryName.
             */
            public Builder issueCategoryName(String issueCategoryName) {
                this.issueCategoryName = issueCategoryName;
                return this;
            }

            /**
             * MappingTools.
             */
            public Builder mappingTools(String mappingTools) {
                this.mappingTools = mappingTools;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            public RelationModelList build() {
                return new RelationModelList(this);
            } 

        } 

    }
}
