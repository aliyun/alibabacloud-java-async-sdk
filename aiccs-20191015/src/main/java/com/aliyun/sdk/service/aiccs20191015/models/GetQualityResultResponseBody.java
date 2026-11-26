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
 * {@link GetQualityResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityResultResponseBody</p>
 */
public class GetQualityResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelTypeName")
    private String channelTypeName;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityResultResponseBody(Builder builder) {
        this.channelTypeName = builder.channelTypeName;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelTypeName
     */
    public String getChannelTypeName() {
        return this.channelTypeName;
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
        private String channelTypeName; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityResultResponseBody model) {
            this.channelTypeName = model.channelTypeName;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The name of the channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        public Builder channelTypeName(String channelTypeName) {
            this.channelTypeName = channelTypeName;
            return this;
        }

        /**
         * <p>The status code. A value of 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The quality inspection task data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityResultResponseBody build() {
            return new GetQualityResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityResultResponseBody</p>
     */
    public static class QualityResultResponseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("ChannelTypeName")
        private String channelTypeName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HitDetail")
        private String hitDetail;

        @com.aliyun.core.annotation.NameInMap("HitStatus")
        private Boolean hitStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ServicerId")
        private String servicerId;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("TouchId")
        private String touchId;

        @com.aliyun.core.annotation.NameInMap("TouchStartTime")
        private String touchStartTime;

        private QualityResultResponseList(Builder builder) {
            this.channelType = builder.channelType;
            this.channelTypeName = builder.channelTypeName;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.hitDetail = builder.hitDetail;
            this.hitStatus = builder.hitStatus;
            this.instanceName = builder.instanceName;
            this.memberName = builder.memberName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.servicerId = builder.servicerId;
            this.servicerName = builder.servicerName;
            this.touchId = builder.touchId;
            this.touchStartTime = builder.touchStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityResultResponseList create() {
            return builder().build();
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return channelTypeName
         */
        public String getChannelTypeName() {
            return this.channelTypeName;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return hitDetail
         */
        public String getHitDetail() {
            return this.hitDetail;
        }

        /**
         * @return hitStatus
         */
        public Boolean getHitStatus() {
            return this.hitStatus;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return servicerId
         */
        public String getServicerId() {
            return this.servicerId;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return touchId
         */
        public String getTouchId() {
            return this.touchId;
        }

        /**
         * @return touchStartTime
         */
        public String getTouchStartTime() {
            return this.touchStartTime;
        }

        public static final class Builder {
            private String channelType; 
            private String channelTypeName; 
            private String groupId; 
            private String groupName; 
            private String hitDetail; 
            private Boolean hitStatus; 
            private String instanceName; 
            private String memberName; 
            private String projectId; 
            private String projectName; 
            private String ruleId; 
            private String ruleName; 
            private String servicerId; 
            private String servicerName; 
            private String touchId; 
            private String touchStartTime; 

            private Builder() {
            } 

            private Builder(QualityResultResponseList model) {
                this.channelType = model.channelType;
                this.channelTypeName = model.channelTypeName;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.hitDetail = model.hitDetail;
                this.hitStatus = model.hitStatus;
                this.instanceName = model.instanceName;
                this.memberName = model.memberName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.servicerId = model.servicerId;
                this.servicerName = model.servicerName;
                this.touchId = model.touchId;
                this.touchStartTime = model.touchStartTime;
            } 

            /**
             * <p>The channel type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: Hotline.</li>
             * <li><strong>2</strong>: Online.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The name of the channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder channelTypeName(String channelTypeName) {
                this.channelTypeName = channelTypeName;
                return this;
            }

            /**
             * <p>The ID of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>Automated skill group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The details of the quality inspection result, including the hit keywords and context chat information.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder hitDetail(String hitDetail) {
                this.hitDetail = hitDetail;
                return this;
            }

            /**
             * <p>Indicates whether the rule is hit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hitStatus(Boolean hitStatus) {
                this.hitStatus = hitStatus;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>xspace commercial service</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>Anonymous member</p>
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * <p>The ID of the quality inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>15977801</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the quality inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>Automated quality inspection task</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The ID of the quality inspection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>5369</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the quality inspection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Automated quality inspection rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The ID of the customer service representative.</p>
             * 
             * <strong>example:</strong>
             * <p>555555</p>
             */
            public Builder servicerId(String servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * <p>The name of the customer service representative.</p>
             * 
             * <strong>example:</strong>
             * <p>Liu Test</p>
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * <p>The session ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20928756</p>
             */
            public Builder touchId(String touchId) {
                this.touchId = touchId;
                return this;
            }

            /**
             * <p>The start time of the session.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-26 12:11:06</p>
             */
            public Builder touchStartTime(String touchStartTime) {
                this.touchStartTime = touchStartTime;
                return this;
            }

            public QualityResultResponseList build() {
                return new QualityResultResponseList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("QualityResultResponseList")
        private java.util.List<QualityResultResponseList> qualityResultResponseList;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.qualityResultResponseList = builder.qualityResultResponseList;
            this.totalNum = builder.totalNum;
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
         * @return qualityResultResponseList
         */
        public java.util.List<QualityResultResponseList> getQualityResultResponseList() {
            return this.qualityResultResponseList;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private Integer pageNo; 
            private Integer pageSize; 
            private java.util.List<QualityResultResponseList> qualityResultResponseList; 
            private Integer totalNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.qualityResultResponseList = model.qualityResultResponseList;
                this.totalNum = model.totalNum;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of data details.</p>
             */
            public Builder qualityResultResponseList(java.util.List<QualityResultResponseList> qualityResultResponseList) {
                this.qualityResultResponseList = qualityResultResponseList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>84</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
