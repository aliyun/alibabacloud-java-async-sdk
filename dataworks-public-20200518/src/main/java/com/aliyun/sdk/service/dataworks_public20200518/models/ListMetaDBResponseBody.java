// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListMetaDBResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaDBResponseBody</p>
 */
public class ListMetaDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseInfo")
    private DatabaseInfo databaseInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListMetaDBResponseBody model) {
            this.databaseInfo = model.databaseInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the metadatabases.</p>
         */
        public Builder databaseInfo(DatabaseInfo databaseInfo) {
            this.databaseInfo = databaseInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMetaDBResponseBody build() {
            return new ListMetaDBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaDBResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaDBResponseBody</p>
     */
    public static class DbList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
        private Long createTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimeStamp")
        private Long modifiedTimeStamp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UUID")
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

            private Builder() {
            } 

            private Builder(DbList model) {
                this.createTimeStamp = model.createTimeStamp;
                this.location = model.location;
                this.modifiedTimeStamp = model.modifiedTimeStamp;
                this.name = model.name;
                this.ownerId = model.ownerId;
                this.type = model.type;
                this.UUID = model.UUID;
            } 

            /**
             * <p>The timestamp at which the metadatabase was created. You can convert the timestamp to the date based on the time zone that you use.</p>
             * 
             * <strong>example:</strong>
             * <p>1388776825</p>
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * <p>The URL of the metadatabase.</p>
             * 
             * <strong>example:</strong>
             * <p>hdfs://localhost:777/user/hadoop/test.txt</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The timestamp at which the metadatabase was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1388776837</p>
             */
            public Builder modifiedTimeStamp(Long modifiedTimeStamp) {
                this.modifiedTimeStamp = modifiedTimeStamp;
                return this;
            }

            /**
             * <p>The name of the metadatabase.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1232</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The type of the metadatabase.</p>
             * 
             * <strong>example:</strong>
             * <p>HIVE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The UUID of the metadatabase.</p>
             * 
             * <strong>example:</strong>
             * <p>32342</p>
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
    /**
     * 
     * {@link ListMetaDBResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaDBResponseBody</p>
     */
    public static class DatabaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbList")
        private java.util.List<DbList> dbList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<DbList> getDbList() {
            return this.dbList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DbList> dbList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(DatabaseInfo model) {
                this.dbList = model.dbList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The metadatabases.</p>
             */
            public Builder dbList(java.util.List<DbList> dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * <p>The total number of the metadatabases returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
