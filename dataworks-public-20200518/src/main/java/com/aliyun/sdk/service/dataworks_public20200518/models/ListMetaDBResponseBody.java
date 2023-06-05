// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetaDBResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaDBResponseBody</p>
 */
public class ListMetaDBResponseBody extends TeaModel {
    @NameInMap("DatabaseInfo")
    private DatabaseInfo databaseInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListMetaDBResponseBody(Builder builder) {
        this.databaseInfo = builder.databaseInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaDBResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseInfo
     */
    public DatabaseInfo getDatabaseInfo() {
        return this.databaseInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DatabaseInfo databaseInfo; 
        private String requestId; 

        /**
         * The list of metadatabases.
         */
        public Builder databaseInfo(DatabaseInfo databaseInfo) {
            this.databaseInfo = databaseInfo;
            return this;
        }

        /**
         * The total number of the metadatabases.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMetaDBResponseBody build() {
            return new ListMetaDBResponseBody(this);
        } 

    } 

    public static class DbList extends TeaModel {
        @NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @NameInMap("Location")
        private String location;

        @NameInMap("ModifiedTimeStamp")
        private Long modifiedTimeStamp;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Type")
        private String type;

        @NameInMap("UUID")
        private String UUID;

        private DbList(Builder builder) {
            this.createTimeStamp = builder.createTimeStamp;
            this.location = builder.location;
            this.modifiedTimeStamp = builder.modifiedTimeStamp;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.type = builder.type;
            this.UUID = builder.UUID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbList create() {
            return builder().build();
        }

        /**
         * @return createTimeStamp
         */
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return modifiedTimeStamp
         */
        public Long getModifiedTimeStamp() {
            return this.modifiedTimeStamp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return UUID
         */
        public String getUUID() {
            return this.UUID;
        }

        public static final class Builder {
            private Long createTimeStamp; 
            private String location; 
            private Long modifiedTimeStamp; 
            private String name; 
            private String ownerId; 
            private String type; 
            private String UUID; 

            /**
             * The timestamp at which the metadatabase was updated.
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The ID of the metadatabase owner.
             */
            public Builder modifiedTimeStamp(Long modifiedTimeStamp) {
                this.modifiedTimeStamp = modifiedTimeStamp;
                return this;
            }

            /**
             * The URL of the metadatabase.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The universally unique identifier (UUID) of the metadatabase.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The name of the metadatabase.
             */
            public Builder UUID(String UUID) {
                this.UUID = UUID;
                return this;
            }

            public DbList build() {
                return new DbList(this);
            } 

        } 

    }
    public static class DatabaseInfo extends TeaModel {
        @NameInMap("DbList")
        private java.util.List < DbList> dbList;

        @NameInMap("TotalCount")
        private Long totalCount;

        private DatabaseInfo(Builder builder) {
            this.dbList = builder.dbList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseInfo create() {
            return builder().build();
        }

        /**
         * @return dbList
         */
        public java.util.List < DbList> getDbList() {
            return this.dbList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DbList> dbList; 
            private Long totalCount; 

            /**
             * The timestamp at which the metadatabase was created. You can convert the timestamp to the related date based on the time zone that you use.
             */
            public Builder dbList(java.util.List < DbList> dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * The type of the metadatabase.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DatabaseInfo build() {
                return new DatabaseInfo(this);
            } 

        } 

    }
}
