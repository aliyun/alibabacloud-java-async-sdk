// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataTrackOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateDataTrackOrderRequest</p>
 */
public class CreateDataTrackOrderRequest extends Request {
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
    private java.util.List < String > relatedUserList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateDataTrackOrderRequest(Builder builder) {
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

    public static CreateDataTrackOrderRequest create() {
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
    public java.util.List < String > getRelatedUserList() {
        return this.relatedUserList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateDataTrackOrderRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Param param; 
        private java.util.List < String > relatedUserList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataTrackOrderRequest request) {
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
         * The purpose or objective of the data tracking ticket. This parameter is used to help reduce unnecessary communication.
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
         * The IDs of the operators that are related to the ticket.
         */
        public Builder relatedUserList(java.util.List < String > relatedUserList) {
            String relatedUserListShrink = shrink(relatedUserList, "RelatedUserList", "json");
            this.putQueryParameter("RelatedUserList", relatedUserListShrink);
            this.relatedUserList = relatedUserList;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateDataTrackOrderRequest build() {
            return new CreateDataTrackOrderRequest(this);
        } 

    } 

    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dbId;

        @com.aliyun.core.annotation.NameInMap("JobEndTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String jobEndTime;

        @com.aliyun.core.annotation.NameInMap("JobStartTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String jobStartTime;

        @com.aliyun.core.annotation.NameInMap("TableNames")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > tableNames;

        @com.aliyun.core.annotation.NameInMap("TrackTypes")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > trackTypes;

        private Param(Builder builder) {
            this.dbId = builder.dbId;
            this.jobEndTime = builder.jobEndTime;
            this.jobStartTime = builder.jobStartTime;
            this.tableNames = builder.tableNames;
            this.trackTypes = builder.trackTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public String getDbId() {
            return this.dbId;
        }

        /**
         * @return jobEndTime
         */
        public String getJobEndTime() {
            return this.jobEndTime;
        }

        /**
         * @return jobStartTime
         */
        public String getJobStartTime() {
            return this.jobStartTime;
        }

        /**
         * @return tableNames
         */
        public java.util.List < String > getTableNames() {
            return this.tableNames;
        }

        /**
         * @return trackTypes
         */
        public java.util.List < String > getTrackTypes() {
            return this.trackTypes;
        }

        public static final class Builder {
            private String dbId; 
            private String jobEndTime; 
            private String jobStartTime; 
            private java.util.List < String > tableNames; 
            private java.util.List < String > trackTypes; 

            /**
             * The ID of the database. You can call the [SearchDatabases](~~141876~~) operation to query the ID of the database.
             * <p>
             * 
             * > You can call this operation to create a data tracking ticket for only physical databases. This operation is not applicable to logical databases.
             */
            public Builder dbId(String dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The end time of the time range in which you want to track data operations. The time must be in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder jobEndTime(String jobEndTime) {
                this.jobEndTime = jobEndTime;
                return this;
            }

            /**
             * The start time of the time range in which you want to track data operations. The time must be in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder jobStartTime(String jobStartTime) {
                this.jobStartTime = jobStartTime;
                return this;
            }

            /**
             * The names of the tables for which you want to track data operations.
             */
            public Builder tableNames(java.util.List < String > tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            /**
             * The types of data operations that you want to track.
             */
            public Builder trackTypes(java.util.List < String > trackTypes) {
                this.trackTypes = trackTypes;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
}
