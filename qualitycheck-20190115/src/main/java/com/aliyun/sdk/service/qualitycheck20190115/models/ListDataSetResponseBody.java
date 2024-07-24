// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSetResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSetResponseBody</p>
 */
public class ListDataSetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private Messages messages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataSetResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.messages = builder.messages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return messages
     */
    public Messages getMessages() {
        return this.messages;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private Integer count; 
        private Integer currentPage; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private Messages messages; 
        private Integer pageNumber; 
        private Integer pageSize; 
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
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * Messages.
         */
        public Builder messages(Messages messages) {
            this.messages = messages;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public ListDataSetResponseBody build() {
            return new ListDataSetResponseBody(this);
        } 

    } 

    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoTranscoding")
        private Integer autoTranscoding;

        @com.aliyun.core.annotation.NameInMap("ChannelId0")
        private Integer channelId0;

        @com.aliyun.core.annotation.NameInMap("ChannelId1")
        private Integer channelId1;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private Integer channelType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateType")
        private Integer createType;

        @com.aliyun.core.annotation.NameInMap("DataSetType")
        private Integer dataSetType;

        @com.aliyun.core.annotation.NameInMap("IsDelete")
        private Integer isDelete;

        @com.aliyun.core.annotation.NameInMap("RoleConfigProp")
        private String roleConfigProp;

        @com.aliyun.core.annotation.NameInMap("RoleConfigStatus")
        private Integer roleConfigStatus;

        @com.aliyun.core.annotation.NameInMap("RoleConfigTask")
        private String roleConfigTask;

        @com.aliyun.core.annotation.NameInMap("SetBucketName")
        private String setBucketName;

        @com.aliyun.core.annotation.NameInMap("SetDomain")
        private String setDomain;

        @com.aliyun.core.annotation.NameInMap("SetFolderName")
        private String setFolderName;

        @com.aliyun.core.annotation.NameInMap("SetId")
        private Long setId;

        @com.aliyun.core.annotation.NameInMap("SetName")
        private String setName;

        @com.aliyun.core.annotation.NameInMap("SetNumber")
        private Integer setNumber;

        @com.aliyun.core.annotation.NameInMap("SetRoleArn")
        private String setRoleArn;

        @com.aliyun.core.annotation.NameInMap("SetType")
        private Integer setType;

        @com.aliyun.core.annotation.NameInMap("SourceDataType")
        private Integer sourceDataType;

        @com.aliyun.core.annotation.NameInMap("SubDir")
        private String subDir;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserGroup")
        private String userGroup;

        private DataData(Builder builder) {
            this.autoTranscoding = builder.autoTranscoding;
            this.channelId0 = builder.channelId0;
            this.channelId1 = builder.channelId1;
            this.channelType = builder.channelType;
            this.createTime = builder.createTime;
            this.createType = builder.createType;
            this.dataSetType = builder.dataSetType;
            this.isDelete = builder.isDelete;
            this.roleConfigProp = builder.roleConfigProp;
            this.roleConfigStatus = builder.roleConfigStatus;
            this.roleConfigTask = builder.roleConfigTask;
            this.setBucketName = builder.setBucketName;
            this.setDomain = builder.setDomain;
            this.setFolderName = builder.setFolderName;
            this.setId = builder.setId;
            this.setName = builder.setName;
            this.setNumber = builder.setNumber;
            this.setRoleArn = builder.setRoleArn;
            this.setType = builder.setType;
            this.sourceDataType = builder.sourceDataType;
            this.subDir = builder.subDir;
            this.updateTime = builder.updateTime;
            this.userGroup = builder.userGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return autoTranscoding
         */
        public Integer getAutoTranscoding() {
            return this.autoTranscoding;
        }

        /**
         * @return channelId0
         */
        public Integer getChannelId0() {
            return this.channelId0;
        }

        /**
         * @return channelId1
         */
        public Integer getChannelId1() {
            return this.channelId1;
        }

        /**
         * @return channelType
         */
        public Integer getChannelType() {
            return this.channelType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createType
         */
        public Integer getCreateType() {
            return this.createType;
        }

        /**
         * @return dataSetType
         */
        public Integer getDataSetType() {
            return this.dataSetType;
        }

        /**
         * @return isDelete
         */
        public Integer getIsDelete() {
            return this.isDelete;
        }

        /**
         * @return roleConfigProp
         */
        public String getRoleConfigProp() {
            return this.roleConfigProp;
        }

        /**
         * @return roleConfigStatus
         */
        public Integer getRoleConfigStatus() {
            return this.roleConfigStatus;
        }

        /**
         * @return roleConfigTask
         */
        public String getRoleConfigTask() {
            return this.roleConfigTask;
        }

        /**
         * @return setBucketName
         */
        public String getSetBucketName() {
            return this.setBucketName;
        }

        /**
         * @return setDomain
         */
        public String getSetDomain() {
            return this.setDomain;
        }

        /**
         * @return setFolderName
         */
        public String getSetFolderName() {
            return this.setFolderName;
        }

        /**
         * @return setId
         */
        public Long getSetId() {
            return this.setId;
        }

        /**
         * @return setName
         */
        public String getSetName() {
            return this.setName;
        }

        /**
         * @return setNumber
         */
        public Integer getSetNumber() {
            return this.setNumber;
        }

        /**
         * @return setRoleArn
         */
        public String getSetRoleArn() {
            return this.setRoleArn;
        }

        /**
         * @return setType
         */
        public Integer getSetType() {
            return this.setType;
        }

        /**
         * @return sourceDataType
         */
        public Integer getSourceDataType() {
            return this.sourceDataType;
        }

        /**
         * @return subDir
         */
        public String getSubDir() {
            return this.subDir;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userGroup
         */
        public String getUserGroup() {
            return this.userGroup;
        }

        public static final class Builder {
            private Integer autoTranscoding; 
            private Integer channelId0; 
            private Integer channelId1; 
            private Integer channelType; 
            private String createTime; 
            private Integer createType; 
            private Integer dataSetType; 
            private Integer isDelete; 
            private String roleConfigProp; 
            private Integer roleConfigStatus; 
            private String roleConfigTask; 
            private String setBucketName; 
            private String setDomain; 
            private String setFolderName; 
            private Long setId; 
            private String setName; 
            private Integer setNumber; 
            private String setRoleArn; 
            private Integer setType; 
            private Integer sourceDataType; 
            private String subDir; 
            private String updateTime; 
            private String userGroup; 

            /**
             * AutoTranscoding.
             */
            public Builder autoTranscoding(Integer autoTranscoding) {
                this.autoTranscoding = autoTranscoding;
                return this;
            }

            /**
             * ChannelId0.
             */
            public Builder channelId0(Integer channelId0) {
                this.channelId0 = channelId0;
                return this;
            }

            /**
             * ChannelId1.
             */
            public Builder channelId1(Integer channelId1) {
                this.channelId1 = channelId1;
                return this;
            }

            /**
             * ChannelType.
             */
            public Builder channelType(Integer channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateType.
             */
            public Builder createType(Integer createType) {
                this.createType = createType;
                return this;
            }

            /**
             * DataSetType.
             */
            public Builder dataSetType(Integer dataSetType) {
                this.dataSetType = dataSetType;
                return this;
            }

            /**
             * IsDelete.
             */
            public Builder isDelete(Integer isDelete) {
                this.isDelete = isDelete;
                return this;
            }

            /**
             * RoleConfigProp.
             */
            public Builder roleConfigProp(String roleConfigProp) {
                this.roleConfigProp = roleConfigProp;
                return this;
            }

            /**
             * RoleConfigStatus.
             */
            public Builder roleConfigStatus(Integer roleConfigStatus) {
                this.roleConfigStatus = roleConfigStatus;
                return this;
            }

            /**
             * RoleConfigTask.
             */
            public Builder roleConfigTask(String roleConfigTask) {
                this.roleConfigTask = roleConfigTask;
                return this;
            }

            /**
             * SetBucketName.
             */
            public Builder setBucketName(String setBucketName) {
                this.setBucketName = setBucketName;
                return this;
            }

            /**
             * SetDomain.
             */
            public Builder setDomain(String setDomain) {
                this.setDomain = setDomain;
                return this;
            }

            /**
             * SetFolderName.
             */
            public Builder setFolderName(String setFolderName) {
                this.setFolderName = setFolderName;
                return this;
            }

            /**
             * SetId.
             */
            public Builder setId(Long setId) {
                this.setId = setId;
                return this;
            }

            /**
             * SetName.
             */
            public Builder setName(String setName) {
                this.setName = setName;
                return this;
            }

            /**
             * SetNumber.
             */
            public Builder setNumber(Integer setNumber) {
                this.setNumber = setNumber;
                return this;
            }

            /**
             * SetRoleArn.
             */
            public Builder setRoleArn(String setRoleArn) {
                this.setRoleArn = setRoleArn;
                return this;
            }

            /**
             * SetType.
             */
            public Builder setType(Integer setType) {
                this.setType = setType;
                return this;
            }

            /**
             * SourceDataType.
             */
            public Builder sourceDataType(Integer sourceDataType) {
                this.sourceDataType = sourceDataType;
                return this;
            }

            /**
             * SubDir.
             */
            public Builder subDir(String subDir) {
                this.subDir = subDir;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserGroup.
             */
            public Builder userGroup(String userGroup) {
                this.userGroup = userGroup;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List < DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < DataData> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private java.util.List < String > message;

        private Messages(Builder builder) {
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public java.util.List < String > getMessage() {
            return this.message;
        }

        public static final class Builder {
            private java.util.List < String > message; 

            /**
             * Message.
             */
            public Builder message(java.util.List < String > message) {
                this.message = message;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
