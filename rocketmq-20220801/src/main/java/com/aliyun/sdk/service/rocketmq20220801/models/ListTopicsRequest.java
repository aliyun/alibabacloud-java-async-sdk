// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListTopicsRequest} extends {@link RequestModel}
 *
 * <p>ListTopicsRequest</p>
 */
public class ListTopicsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("messageTypes")
    private java.util.List<String> messageTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 100000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 10)
    private Integer pageSize;

    private ListTopicsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.filter = builder.filter;
        this.messageTypes = builder.messageTypes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTopicsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return messageTypes
     */
    public java.util.List<String> getMessageTypes() {
        return this.messageTypes;
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

    public static final class Builder extends Request.Builder<ListTopicsRequest, Builder> {
        private String instanceId; 
        private String filter; 
        private java.util.List<String> messageTypes; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListTopicsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.filter = request.filter;
            this.messageTypes = request.messageTypes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>Specifies which instance&quot;s topic list to retrieve.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The filter condition for the query. If not provided, all topics under the instance will be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_test</p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The message type of the topic.</p>
         */
        public Builder messageTypes(java.util.List<String> messageTypes) {
            String messageTypesShrink = shrink(messageTypes, "messageTypes", "simple");
            this.putQueryParameter("messageTypes", messageTypesShrink);
            this.messageTypes = messageTypes;
            return this;
        }

        /**
         * <p>Page number, indicating which page of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size, the maximum number of results to display per page.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListTopicsRequest build() {
            return new ListTopicsRequest(this);
        } 

    } 

}
