// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSQLReviewOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateSQLReviewOrderRequest</p>
 */
public class CreateSQLReviewOrderRequest extends Request {
    @Query
    @NameInMap("Comment")
    @Validation(required = true)
    private String comment;

    @Query
    @NameInMap("Param")
    @Validation(required = true)
    private Param param;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RelatedUserList")
    private java.util.List < Long > relatedUserList;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private CreateSQLReviewOrderRequest(Builder builder) {
        super(builder);
        this.comment = builder.comment;
        this.param = builder.param;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String comment; 
        private Param param; 
        private String regionId; 
        private java.util.List < Long > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateSQLReviewOrderRequest response) {
            super(response);
            this.comment = response.comment;
            this.param = response.param;
            this.regionId = response.regionId;
            this.relatedUserList = response.relatedUserList;
            this.tid = response.tid;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * Param.
         */
        public Builder param(Param param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
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
         * RelatedUserList.
         */
        public Builder relatedUserList(java.util.List < Long > relatedUserList) {
            this.putQueryParameter("RelatedUserList", relatedUserList);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * Tid.
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
        @NameInMap("AttachmentKeyList")
        @Validation(required = true)
        private java.util.List < String > attachmentKeyList;

        @NameInMap("DbId")
        @Validation(required = true)
        private Long dbId;

        @NameInMap("ProjectName")
        @Validation(required = true)
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
             * AttachmentKeyList.
             */
            public Builder attachmentKeyList(java.util.List < String > attachmentKeyList) {
                this.attachmentKeyList = attachmentKeyList;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * ProjectName.
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
