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
 * {@link ListScheduleTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListScheduleTemplatesRequest</p>
 */
public class ListScheduleTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListScheduleTemplatesCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListScheduleTemplatesCommand listScheduleTemplatesCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListScheduleTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.listScheduleTemplatesCommand = builder.listScheduleTemplatesCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduleTemplatesRequest create() {
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
     * @return listScheduleTemplatesCommand
     */
    public ListScheduleTemplatesCommand getListScheduleTemplatesCommand() {
        return this.listScheduleTemplatesCommand;
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

    public static final class Builder extends Request.Builder<ListScheduleTemplatesRequest, Builder> {
        private String regionId; 
        private ListScheduleTemplatesCommand listScheduleTemplatesCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListScheduleTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.listScheduleTemplatesCommand = request.listScheduleTemplatesCommand;
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
         * <p>This parameter is required.</p>
         */
        public Builder listScheduleTemplatesCommand(ListScheduleTemplatesCommand listScheduleTemplatesCommand) {
            String listScheduleTemplatesCommandShrink = shrink(listScheduleTemplatesCommand, "ListScheduleTemplatesCommand", "json");
            this.putBodyParameter("ListScheduleTemplatesCommand", listScheduleTemplatesCommandShrink);
            this.listScheduleTemplatesCommand = listScheduleTemplatesCommand;
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

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListScheduleTemplatesRequest build() {
            return new ListScheduleTemplatesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduleTemplatesRequest} extends {@link TeaModel}
     *
     * <p>ListScheduleTemplatesRequest</p>
     */
    public static class ListScheduleTemplatesCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ScheduleTemplateType")
        private String scheduleTemplateType;

        private ListScheduleTemplatesCommand(Builder builder) {
            this.keyword = builder.keyword;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.scheduleTemplateType = builder.scheduleTemplateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListScheduleTemplatesCommand create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return scheduleTemplateType
         */
        public String getScheduleTemplateType() {
            return this.scheduleTemplateType;
        }

        public static final class Builder {
            private String keyword; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private String scheduleTemplateType; 

            private Builder() {
            } 

            private Builder(ListScheduleTemplatesCommand model) {
                this.keyword = model.keyword;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.scheduleTemplateType = model.scheduleTemplateType;
            } 

            /**
             * Keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * ScheduleTemplateType.
             */
            public Builder scheduleTemplateType(String scheduleTemplateType) {
                this.scheduleTemplateType = scheduleTemplateType;
                return this;
            }

            public ListScheduleTemplatesCommand build() {
                return new ListScheduleTemplatesCommand(this);
            } 

        } 

    }
}
