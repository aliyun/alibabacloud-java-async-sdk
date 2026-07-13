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
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerNameOrPhone")
    private String customerNameOrPhone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayStatusList")
    private java.util.List<String> displayStatusList;

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
        this.current = builder.current;
        this.customerNameOrPhone = builder.customerNameOrPhone;
        this.displayStatusList = builder.displayStatusList;
        this.labelTags = builder.labelTags;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.size = builder.size;
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
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
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
        private Integer current; 
        private String customerNameOrPhone; 
        private java.util.List<String> displayStatusList; 
        private java.util.List<String> labelTags; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer size; 
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
            this.current = request.current;
            this.customerNameOrPhone = request.customerNameOrPhone;
            this.displayStatusList = request.displayStatusList;
            this.labelTags = request.labelTags;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.size = request.size;
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
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
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
         * <p>nextToken</p>
         * 
         * <strong>example:</strong>
         * <p>51CC272E-D879-1B23-B98E-FCFB072D362B</p>
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

}
