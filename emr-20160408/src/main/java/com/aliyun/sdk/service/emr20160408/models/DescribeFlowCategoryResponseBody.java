// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowCategoryResponseBody</p>
 */
public class DescribeFlowCategoryResponseBody extends TeaModel {
    @NameInMap("CategoryType")
    private String categoryType;

    @NameInMap("GmtCreate")
    private Long gmtCreate;

    @NameInMap("GmtModified")
    private Long gmtModified;

    @NameInMap("Id")
    private String id;

    @NameInMap("Name")
    private String name;

    @NameInMap("ObjectId")
    private String objectId;

    @NameInMap("ObjectType")
    private String objectType;

    @NameInMap("ParentId")
    private String parentId;

    @NameInMap("ProjectId")
    private String projectId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Type")
    private String type;

    private DescribeFlowCategoryResponseBody(Builder builder) {
        this.categoryType = builder.categoryType;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.name = builder.name;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.parentId = builder.parentId;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return gmtCreate
     */
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String categoryType; 
        private Long gmtCreate; 
        private Long gmtModified; 
        private String id; 
        private String name; 
        private String objectId; 
        private String objectType; 
        private String parentId; 
        private String projectId; 
        private String requestId; 
        private String type; 

        /**
         * CategoryType.
         */
        public Builder categoryType(String categoryType) {
            this.categoryType = categoryType;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeFlowCategoryResponseBody build() {
            return new DescribeFlowCategoryResponseBody(this);
        } 

    } 

}
