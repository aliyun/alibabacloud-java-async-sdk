// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityProjectListResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityProjectListResponseBody</p>
 */
public class GetQualityProjectListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetQualityProjectListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityProjectListResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityProjectListResponseBody build() {
            return new GetQualityProjectListResponseBody(this);
        } 

    } 

    public static class QualityProjectList extends TeaModel {
        @NameInMap("CheckFreqType")
        private Integer checkFreqType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DepList")
        private java.util.List < Long > depList;

        @NameInMap("GroupList")
        private java.util.List < Long > groupList;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("QualityRuleIds")
        private java.util.List < Long > qualityRuleIds;

        @NameInMap("QualityType")
        private Integer qualityType;

        @NameInMap("ServicerList")
        private java.util.List < Long > servicerList;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Version")
        private Integer version;

        private QualityProjectList(Builder builder) {
            this.checkFreqType = builder.checkFreqType;
            this.createTime = builder.createTime;
            this.depList = builder.depList;
            this.groupList = builder.groupList;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.projectName = builder.projectName;
            this.qualityRuleIds = builder.qualityRuleIds;
            this.qualityType = builder.qualityType;
            this.servicerList = builder.servicerList;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityProjectList create() {
            return builder().build();
        }

        /**
         * @return checkFreqType
         */
        public Integer getCheckFreqType() {
            return this.checkFreqType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return depList
         */
        public java.util.List < Long > getDepList() {
            return this.depList;
        }

        /**
         * @return groupList
         */
        public java.util.List < Long > getGroupList() {
            return this.groupList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return qualityRuleIds
         */
        public java.util.List < Long > getQualityRuleIds() {
            return this.qualityRuleIds;
        }

        /**
         * @return qualityType
         */
        public Integer getQualityType() {
            return this.qualityType;
        }

        /**
         * @return servicerList
         */
        public java.util.List < Long > getServicerList() {
            return this.servicerList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer checkFreqType; 
            private String createTime; 
            private java.util.List < Long > depList; 
            private java.util.List < Long > groupList; 
            private Long id; 
            private String modifyTime; 
            private String projectName; 
            private java.util.List < Long > qualityRuleIds; 
            private Integer qualityType; 
            private java.util.List < Long > servicerList; 
            private Integer status; 
            private Integer version; 

            /**
             * 质检任务频率
             */
            public Builder checkFreqType(Integer checkFreqType) {
                this.checkFreqType = checkFreqType;
                return this;
            }

            /**
             * CreateTime
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 技能组分组列表
             */
            public Builder depList(java.util.List < Long > depList) {
                this.depList = depList;
                return this;
            }

            /**
             * 技能组列表
             */
            public Builder groupList(java.util.List < Long > groupList) {
                this.groupList = groupList;
                return this;
            }

            /**
             * 质检任务Id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 修改时间
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 质检任务名称
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * 质检规则列表
             */
            public Builder qualityRuleIds(java.util.List < Long > qualityRuleIds) {
                this.qualityRuleIds = qualityRuleIds;
                return this;
            }

            /**
             * 质检任务类型
             */
            public Builder qualityType(Integer qualityType) {
                this.qualityType = qualityType;
                return this;
            }

            /**
             * 坐席列表
             */
            public Builder servicerList(java.util.List < Long > servicerList) {
                this.servicerList = servicerList;
                return this;
            }

            /**
             * 质检任务状态
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 版本
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public QualityProjectList build() {
                return new QualityProjectList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("QualityProjectList")
        private java.util.List < QualityProjectList> qualityProjectList;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.qualityProjectList = builder.qualityProjectList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return qualityProjectList
         */
        public java.util.List < QualityProjectList> getQualityProjectList() {
            return this.qualityProjectList;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List < QualityProjectList> qualityProjectList; 
            private Long total; 

            /**
             * PageNo
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 质检项列表
             */
            public Builder qualityProjectList(java.util.List < QualityProjectList> qualityProjectList) {
                this.qualityProjectList = qualityProjectList;
                return this;
            }

            /**
             * Total
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
