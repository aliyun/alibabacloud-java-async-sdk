// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSQLReviewOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateSQLReviewOrderRequest</p>
 */
public class CreateSQLReviewOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    @com.aliyun.core.annotation.Validation(required = true)
    private Param param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateSQLReviewOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.param = builder.param;
        this.relatedUserList = builder.relatedUserList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSQLReviewOrderRequest create() {
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return param
     */
    public Param getParam() {
        return this.param;
    }

    /**
     * @return relatedUserList
     */
    public java.util.List < Long > getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateSQLReviewOrderRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Param param; 
        private java.util.List < Long > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateSQLReviewOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.param = request.param;
            this.relatedUserList = request.relatedUserList;
            this.tid = request.tid;
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
         * The purpose or objective of the SQL review. This reduces unnecessary communication.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The parameters of the ticket.
         */
        public Builder param(Param param) {
            String paramShrink = shrink(param, "Param", "json");
            this.putQueryParameter("Param", paramShrink);
            this.param = param;
            return this;
        }

        /**
         * The stakeholders involved in this operation. All the specified stakeholders can view the ticket details and take part in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateSQLReviewOrderRequest build() {
            return new CreateSQLReviewOrderRequest(this);
        } 

    } 

    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentKeyList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > attachmentKeyList;

        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String projectName;

        private Param(Builder builder) {
            this.attachmentKeyList = builder.attachmentKeyList;
            this.dbId = builder.dbId;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return attachmentKeyList
         */
        public java.util.List < String > getAttachmentKeyList() {
            return this.attachmentKeyList;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private java.util.List < String > attachmentKeyList; 
            private Long dbId; 
            private String projectName; 

            /**
             * The files to be reviewed. Multiple files can be reviewed at a time.
             */
            public Builder attachmentKeyList(java.util.List < String > attachmentKeyList) {
                this.attachmentKeyList = attachmentKeyList;
                return this;
            }

            /**
             * The ID of the database. You can call the [SearchDatabases](~~141876~~) operation to query the ID of the database.
             * <p>
             * 
             * >  You can call this operation to query only physical databases. This operation is unavailable to query logical databases.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The name of the project.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
