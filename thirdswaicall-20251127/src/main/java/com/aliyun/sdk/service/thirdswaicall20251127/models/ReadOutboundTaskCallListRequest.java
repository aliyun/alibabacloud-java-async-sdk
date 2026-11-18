// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.thirdswaicall20251127.models;

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
 * {@link ReadOutboundTaskCallListRequest} extends {@link RequestModel}
 *
 * <p>ReadOutboundTaskCallListRequest</p>
 */
public class ReadOutboundTaskCallListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallEndTimeBegin")
    private Long callEndTimeBegin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallEndTimeEnd")
    private Long callEndTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallStartTimeBegin")
    private Long callStartTimeBegin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallStartTimeEnd")
    private Long callStartTimeEnd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerUacAccountId")
    private String callerUacAccountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentWorkspaceCode")
    private String currentWorkspaceCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentWorkspaceId")
    private String currentWorkspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerNameOrPhone")
    private String customerNameOrPhone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayStatusList")
    private java.util.List<String> displayStatusList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DurationRangeList")
    private java.util.List<String> durationRangeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelTags")
    private java.util.List<String> labelTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StructuredLabelTags")
    private java.util.List<StructuredLabelTags> structuredLabelTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ReadOutboundTaskCallListRequest(Builder builder) {
        super(builder);
        this.callEndTimeBegin = builder.callEndTimeBegin;
        this.callEndTimeEnd = builder.callEndTimeEnd;
        this.callStartTimeBegin = builder.callStartTimeBegin;
        this.callStartTimeEnd = builder.callStartTimeEnd;
        this.callerUacAccountId = builder.callerUacAccountId;
        this.current = builder.current;
        this.currentWorkspaceCode = builder.currentWorkspaceCode;
        this.currentWorkspaceId = builder.currentWorkspaceId;
        this.customerNameOrPhone = builder.customerNameOrPhone;
        this.displayStatusList = builder.displayStatusList;
        this.durationRangeList = builder.durationRangeList;
        this.labelTags = builder.labelTags;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.size = builder.size;
        this.structuredLabelTags = builder.structuredLabelTags;
        this.taskId = builder.taskId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadOutboundTaskCallListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callEndTimeBegin
     */
    public Long getCallEndTimeBegin() {
        return this.callEndTimeBegin;
    }

    /**
     * @return callEndTimeEnd
     */
    public Long getCallEndTimeEnd() {
        return this.callEndTimeEnd;
    }

    /**
     * @return callStartTimeBegin
     */
    public Long getCallStartTimeBegin() {
        return this.callStartTimeBegin;
    }

    /**
     * @return callStartTimeEnd
     */
    public Long getCallStartTimeEnd() {
        return this.callStartTimeEnd;
    }

    /**
     * @return callerUacAccountId
     */
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return currentWorkspaceCode
     */
    public String getCurrentWorkspaceCode() {
        return this.currentWorkspaceCode;
    }

    /**
     * @return currentWorkspaceId
     */
    public String getCurrentWorkspaceId() {
        return this.currentWorkspaceId;
    }

    /**
     * @return customerNameOrPhone
     */
    public String getCustomerNameOrPhone() {
        return this.customerNameOrPhone;
    }

    /**
     * @return displayStatusList
     */
    public java.util.List<String> getDisplayStatusList() {
        return this.displayStatusList;
    }

    /**
     * @return durationRangeList
     */
    public java.util.List<String> getDurationRangeList() {
        return this.durationRangeList;
    }

    /**
     * @return labelTags
     */
    public java.util.List<String> getLabelTags() {
        return this.labelTags;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return structuredLabelTags
     */
    public java.util.List<StructuredLabelTags> getStructuredLabelTags() {
        return this.structuredLabelTags;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ReadOutboundTaskCallListRequest, Builder> {
        private Long callEndTimeBegin; 
        private Long callEndTimeEnd; 
        private Long callStartTimeBegin; 
        private Long callStartTimeEnd; 
        private String callerUacAccountId; 
        private Integer current; 
        private String currentWorkspaceCode; 
        private String currentWorkspaceId; 
        private String customerNameOrPhone; 
        private java.util.List<String> displayStatusList; 
        private java.util.List<String> durationRangeList; 
        private java.util.List<String> labelTags; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer size; 
        private java.util.List<StructuredLabelTags> structuredLabelTags; 
        private String taskId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ReadOutboundTaskCallListRequest request) {
            super(request);
            this.callEndTimeBegin = request.callEndTimeBegin;
            this.callEndTimeEnd = request.callEndTimeEnd;
            this.callStartTimeBegin = request.callStartTimeBegin;
            this.callStartTimeEnd = request.callStartTimeEnd;
            this.callerUacAccountId = request.callerUacAccountId;
            this.current = request.current;
            this.currentWorkspaceCode = request.currentWorkspaceCode;
            this.currentWorkspaceId = request.currentWorkspaceId;
            this.customerNameOrPhone = request.customerNameOrPhone;
            this.displayStatusList = request.displayStatusList;
            this.durationRangeList = request.durationRangeList;
            this.labelTags = request.labelTags;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.size = request.size;
            this.structuredLabelTags = request.structuredLabelTags;
            this.taskId = request.taskId;
            this.userId = request.userId;
        } 

        /**
         * CallEndTimeBegin.
         */
        public Builder callEndTimeBegin(Long callEndTimeBegin) {
            this.putBodyParameter("CallEndTimeBegin", callEndTimeBegin);
            this.callEndTimeBegin = callEndTimeBegin;
            return this;
        }

        /**
         * CallEndTimeEnd.
         */
        public Builder callEndTimeEnd(Long callEndTimeEnd) {
            this.putBodyParameter("CallEndTimeEnd", callEndTimeEnd);
            this.callEndTimeEnd = callEndTimeEnd;
            return this;
        }

        /**
         * CallStartTimeBegin.
         */
        public Builder callStartTimeBegin(Long callStartTimeBegin) {
            this.putBodyParameter("CallStartTimeBegin", callStartTimeBegin);
            this.callStartTimeBegin = callStartTimeBegin;
            return this;
        }

        /**
         * CallStartTimeEnd.
         */
        public Builder callStartTimeEnd(Long callStartTimeEnd) {
            this.putBodyParameter("CallStartTimeEnd", callStartTimeEnd);
            this.callStartTimeEnd = callStartTimeEnd;
            return this;
        }

        /**
         * CallerUacAccountId.
         */
        public Builder callerUacAccountId(String callerUacAccountId) {
            this.putBodyParameter("CallerUacAccountId", callerUacAccountId);
            this.callerUacAccountId = callerUacAccountId;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * CurrentWorkspaceCode.
         */
        public Builder currentWorkspaceCode(String currentWorkspaceCode) {
            this.putBodyParameter("CurrentWorkspaceCode", currentWorkspaceCode);
            this.currentWorkspaceCode = currentWorkspaceCode;
            return this;
        }

        /**
         * CurrentWorkspaceId.
         */
        public Builder currentWorkspaceId(String currentWorkspaceId) {
            this.putBodyParameter("CurrentWorkspaceId", currentWorkspaceId);
            this.currentWorkspaceId = currentWorkspaceId;
            return this;
        }

        /**
         * CustomerNameOrPhone.
         */
        public Builder customerNameOrPhone(String customerNameOrPhone) {
            this.putBodyParameter("CustomerNameOrPhone", customerNameOrPhone);
            this.customerNameOrPhone = customerNameOrPhone;
            return this;
        }

        /**
         * DisplayStatusList.
         */
        public Builder displayStatusList(java.util.List<String> displayStatusList) {
            String displayStatusListShrink = shrink(displayStatusList, "DisplayStatusList", "json");
            this.putBodyParameter("DisplayStatusList", displayStatusListShrink);
            this.displayStatusList = displayStatusList;
            return this;
        }

        /**
         * DurationRangeList.
         */
        public Builder durationRangeList(java.util.List<String> durationRangeList) {
            String durationRangeListShrink = shrink(durationRangeList, "DurationRangeList", "json");
            this.putBodyParameter("DurationRangeList", durationRangeListShrink);
            this.durationRangeList = durationRangeList;
            return this;
        }

        /**
         * LabelTags.
         */
        public Builder labelTags(java.util.List<String> labelTags) {
            String labelTagsShrink = shrink(labelTags, "LabelTags", "json");
            this.putBodyParameter("LabelTags", labelTagsShrink);
            this.labelTags = labelTags;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * StructuredLabelTags.
         */
        public Builder structuredLabelTags(java.util.List<StructuredLabelTags> structuredLabelTags) {
            String structuredLabelTagsShrink = shrink(structuredLabelTags, "StructuredLabelTags", "json");
            this.putBodyParameter("StructuredLabelTags", structuredLabelTagsShrink);
            this.structuredLabelTags = structuredLabelTags;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ReadOutboundTaskCallListRequest build() {
            return new ReadOutboundTaskCallListRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReadOutboundTaskCallListRequest} extends {@link TeaModel}
     *
     * <p>ReadOutboundTaskCallListRequest</p>
     */
    public static class StructuredLabelTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private StructuredLabelTags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructuredLabelTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(StructuredLabelTags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public StructuredLabelTags build() {
                return new StructuredLabelTags(this);
            } 

        } 

    }
}
