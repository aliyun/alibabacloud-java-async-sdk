// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkItemAllFieldsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkItemAllFieldsRequest</p>
 */
public class ListWorkItemAllFieldsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
    private String spaceIdentifier;

    @Query
    @NameInMap("spaceType")
    @Validation(required = true)
    private String spaceType;

    @Query
    @NameInMap("workitemTypeIdentifier")
    @Validation(required = true)
    private String workitemTypeIdentifier;

    private ListWorkItemAllFieldsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.spaceType = builder.spaceType;
        this.workitemTypeIdentifier = builder.workitemTypeIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkItemAllFieldsRequest create() {
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
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    /**
     * @return workitemTypeIdentifier
     */
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

    public static final class Builder extends Request.Builder<ListWorkItemAllFieldsRequest, Builder> {
        private String organizationId; 
        private String spaceIdentifier; 
        private String spaceType; 
        private String workitemTypeIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkItemAllFieldsRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.spaceIdentifier = response.spaceIdentifier;
            this.spaceType = response.spaceType;
            this.workitemTypeIdentifier = response.workitemTypeIdentifier;
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
         * 项目id
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putQueryParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        /**
         * 工作项类型id，工作项类型的列表和id可以从ListProjectWorkitemType中获取
         */
        public Builder workitemTypeIdentifier(String workitemTypeIdentifier) {
            this.putQueryParameter("workitemTypeIdentifier", workitemTypeIdentifier);
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }

        @Override
        public ListWorkItemAllFieldsRequest build() {
            return new ListWorkItemAllFieldsRequest(this);
        } 

    } 

}
