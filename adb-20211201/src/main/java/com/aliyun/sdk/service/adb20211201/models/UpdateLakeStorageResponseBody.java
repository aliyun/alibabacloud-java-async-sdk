// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link UpdateLakeStorageResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLakeStorageResponseBody</p>
 */
public class UpdateLakeStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateLakeStorageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLakeStorageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateLakeStorageResponseBody build() {
            return new UpdateLakeStorageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateLakeStorageResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateLakeStorageResponseBody</p>
     */
    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("Read")
        private Boolean read;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Write")
        private Boolean write;

        private Permissions(Builder builder) {
            this.account = builder.account;
            this.read = builder.read;
            this.type = builder.type;
            this.write = builder.write;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return read
         */
        public Boolean getRead() {
            return this.read;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return write
         */
        public Boolean getWrite() {
            return this.write;
        }

        public static final class Builder {
            private String account; 
            private Boolean read; 
            private String type; 
            private Boolean write; 

            /**
             * <p>具有该权限的账户或RAM用户ID</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * <p>表示是否允许读取湖存储的权限</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder read(Boolean read) {
                this.read = read;
                return this;
            }

            /**
             * <p>指定权限的账户类型</p>
             * 
             * <strong>example:</strong>
             * <p>SUB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>表示是否允许向湖存储写入数据的权限</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder write(Boolean write) {
                this.write = write;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateLakeStorageResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateLakeStorageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorUid")
        private String creatorUid;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("LakeStorageId")
        private String lakeStorageId;

        @com.aliyun.core.annotation.NameInMap("OperatorUid")
        private String operatorUid;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private String ownerUid;

        @com.aliyun.core.annotation.NameInMap("PartitionCount")
        private String partitionCount;

        @com.aliyun.core.annotation.NameInMap("Permissions")
        private java.util.List<Permissions> permissions;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        @com.aliyun.core.annotation.NameInMap("TableCount")
        private Integer tableCount;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorUid = builder.creatorUid;
            this.DBClusterId = builder.DBClusterId;
            this.description = builder.description;
            this.fileSize = builder.fileSize;
            this.lakeStorageId = builder.lakeStorageId;
            this.operatorUid = builder.operatorUid;
            this.ownerUid = builder.ownerUid;
            this.partitionCount = builder.partitionCount;
            this.permissions = builder.permissions;
            this.regionId = builder.regionId;
            this.rowCount = builder.rowCount;
            this.tableCount = builder.tableCount;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorUid
         */
        public String getCreatorUid() {
            return this.creatorUid;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return lakeStorageId
         */
        public String getLakeStorageId() {
            return this.lakeStorageId;
        }

        /**
         * @return operatorUid
         */
        public String getOperatorUid() {
            return this.operatorUid;
        }

        /**
         * @return ownerUid
         */
        public String getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return partitionCount
         */
        public String getPartitionCount() {
            return this.partitionCount;
        }

        /**
         * @return permissions
         */
        public java.util.List<Permissions> getPermissions() {
            return this.permissions;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
        }

        /**
         * @return tableCount
         */
        public Integer getTableCount() {
            return this.tableCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String creatorUid; 
            private String DBClusterId; 
            private String description; 
            private String fileSize; 
            private String lakeStorageId; 
            private String operatorUid; 
            private String ownerUid; 
            private String partitionCount; 
            private java.util.List<Permissions> permissions; 
            private String regionId; 
            private Long rowCount; 
            private Integer tableCount; 
            private String updateTime; 

            /**
             * <p>湖存储被创建的时间</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-15T07:24:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>创建湖存储的用户账号的唯一标识符</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder creatorUid(String creatorUid) {
                this.creatorUid = creatorUid;
                return this;
            }

            /**
             * <p>用于指定和挂载到特定ADB主实例的湖存储</p>
             * 
             * <strong>example:</strong>
             * <p>amv-23xxxx</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>对湖存储的描述信息</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>湖存储中数据的总存储量</p>
             * 
             * <strong>example:</strong>
             * <p>142</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>用于识别特定湖存储的唯一标识符</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder lakeStorageId(String lakeStorageId) {
                this.lakeStorageId = lakeStorageId;
                return this;
            }

            /**
             * <p>最后操作湖存储的用户账号的唯一标识符</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder operatorUid(String operatorUid) {
                this.operatorUid = operatorUid;
                return this;
            }

            /**
             * <p>拥有湖存储资源的用户账号的唯一标识符</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder ownerUid(String ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * PartitionCount.
             */
            public Builder partitionCount(String partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * <p>设置湖存储的读/写权限和账户级别权限的数组</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder permissions(java.util.List<Permissions> permissions) {
                this.permissions = permissions;
                return this;
            }

            /**
             * <p>指定要操作的湖存储所在区域的ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>湖存储中所有库表的总数据行数</p>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * <p>=</p>
             * </blockquote>
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * <p>湖存储中库表的总数量</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder tableCount(Integer tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * <p>湖存储最后一次更新的时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-01T09:22:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
