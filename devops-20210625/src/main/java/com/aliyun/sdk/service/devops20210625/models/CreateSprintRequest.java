// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSprintRequest} extends {@link RequestModel}
 *
 * <p>CreateSprintRequest</p>
 */
public class CreateSprintRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("endDate")
    private String endDate;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
    private String spaceIdentifier;

    @Body
    @NameInMap("staffIds")
    @Validation(required = true)
    private java.util.List < String > staffIds;

    @Body
    @NameInMap("startDate")
    private String startDate;

    private CreateSprintRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.endDate = builder.endDate;
        this.name = builder.name;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.staffIds = builder.staffIds;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSprintRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return staffIds
     */
    public java.util.List < String > getStaffIds() {
        return this.staffIds;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<CreateSprintRequest, Builder> {
        private String organizationId; 
        private String endDate; 
        private String name; 
        private String spaceIdentifier; 
        private java.util.List < String > staffIds; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(CreateSprintRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.endDate = response.endDate;
            this.name = response.name;
            this.spaceIdentifier = response.spaceIdentifier;
            this.staffIds = response.staffIds;
            this.startDate = response.startDate;
        } 

        /**
         * 企业id
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 结束时间
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * 迭代名
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 项目id
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putBodyParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * 负责人列表
         */
        public Builder staffIds(java.util.List < String > staffIds) {
            this.putBodyParameter("staffIds", staffIds);
            this.staffIds = staffIds;
            return this;
        }

        /**
         * 开始时间
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public CreateSprintRequest build() {
            return new CreateSprintRequest(this);
        } 

    } 

}
