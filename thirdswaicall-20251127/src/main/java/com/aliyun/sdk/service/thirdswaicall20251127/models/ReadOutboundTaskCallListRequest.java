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
