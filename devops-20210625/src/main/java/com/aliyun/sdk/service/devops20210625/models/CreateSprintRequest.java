// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSprintRequest} extends {@link RequestModel}
 *
 * <p>CreateSprintRequest</p>
 */
public class CreateSprintRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("staffIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > staffIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
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

        private Builder(CreateSprintRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.endDate = request.endDate;
            this.name = request.name;
            this.spaceIdentifier = request.spaceIdentifier;
            this.staffIds = request.staffIds;
            this.startDate = request.startDate;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * spaceIdentifier.
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putBodyParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * staffIds.
         */
        public Builder staffIds(java.util.List < String > staffIds) {
            this.putBodyParameter("staffIds", staffIds);
            this.staffIds = staffIds;
            return this;
        }

        /**
         * startDate.
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
