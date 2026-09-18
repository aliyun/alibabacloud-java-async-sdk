// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link GetQualityProjectDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityProjectDetailResponseBody</p>
 */
public class GetQualityProjectDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetQualityProjectDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityProjectDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetQualityProjectDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A return value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Quality inspection job information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetQualityProjectDetailResponseBody build() {
            return new GetQualityProjectDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityProjectDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityProjectDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckFreqType")
        private Integer checkFreqType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DepList")
        private java.util.List<Long> depList;

        @com.aliyun.core.annotation.NameInMap("GroupList")
        private java.util.List<Long> groupList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("QualityRuleIds")
        private java.util.List<Long> qualityRuleIds;

        @com.aliyun.core.annotation.NameInMap("QualityType")
        private Integer qualityType;

        @com.aliyun.core.annotation.NameInMap("ServicerList")
        private java.util.List<Long> servicerList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Data(Builder builder) {
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

        public static Data create() {
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
        public java.util.List<Long> getDepList() {
            return this.depList;
        }

        /**
         * @return groupList
         */
        public java.util.List<Long> getGroupList() {
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
        public java.util.List<Long> getQualityRuleIds() {
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
        public java.util.List<Long> getServicerList() {
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
            private java.util.List<Long> depList; 
            private java.util.List<Long> groupList; 
            private Long id; 
            private String modifyTime; 
            private String projectName; 
            private java.util.List<Long> qualityRuleIds; 
            private Integer qualityType; 
            private java.util.List<Long> servicerList; 
            private Integer status; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkFreqType = model.checkFreqType;
                this.createTime = model.createTime;
                this.depList = model.depList;
                this.groupList = model.groupList;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.projectName = model.projectName;
                this.qualityRuleIds = model.qualityRuleIds;
                this.qualityType = model.qualityType;
                this.servicerList = model.servicerList;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>Inspection frequency type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Periodic quality inspection</li>
             * <li><strong>4</strong>: Ad hoc quality inspection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder checkFreqType(Integer checkFreqType) {
                this.checkFreqType = checkFreqType;
                return this;
            }

            /**
             * <p>Creation Time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-07 18:07:18</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Quality inspection sampling scope.</p>
             */
            public Builder depList(java.util.List<Long> depList) {
                this.depList = depList;
                return this;
            }

            /**
             * <p>Quality inspection sampling scope.</p>
             */
            public Builder groupList(java.util.List<Long> groupList) {
                this.groupList = groupList;
                return this;
            }

            /**
             * <p>Quality inspection job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>15977801</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Updated At.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-04-07 18:07:19</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>Quality inspection job name</p>
             * 
             * <strong>example:</strong>
             * <p>自动化质检任务</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Quality inspection rule IDs.</p>
             */
            public Builder qualityRuleIds(java.util.List<Long> qualityRuleIds) {
                this.qualityRuleIds = qualityRuleIds;
                return this;
            }

            /**
             * <p>Quality inspection type. Fixed value: <strong>1</strong> (Consultation).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder qualityType(Integer qualityType) {
                this.qualityType = qualityType;
                return this;
            }

            /**
             * <p>Quality inspection sampling scope.</p>
             */
            public Builder servicerList(java.util.List<Long> servicerList) {
                this.servicerList = servicerList;
                return this;
            }

            /**
             * <p>Quality inspection job status. Valid values:  </p>
             * <ul>
             * <li><strong>0</strong>: Start  </li>
             * <li><strong>1</strong>: Shutdown</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Quality inspection job version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
