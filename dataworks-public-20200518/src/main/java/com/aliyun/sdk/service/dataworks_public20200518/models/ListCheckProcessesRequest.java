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
 * {@link ListCheckProcessesRequest} extends {@link RequestModel}
 *
 * <p>ListCheckProcessesRequest</p>
 */
public class ListCheckProcessesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListCheckProcessesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.eventCode = builder.eventCode;
        this.messageId = builder.messageId;
        this.operator = builder.operator;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckProcessesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCheckProcessesRequest, Builder> {
        private String regionId; 
        private String eventCode; 
        private String messageId; 
        private String operator; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListCheckProcessesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.eventCode = request.eventCode;
            this.messageId = request.messageId;
            this.operator = request.operator;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Extension point event encoding.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>commit-file</p>
         */
        public Builder eventCode(String eventCode) {
            this.putBodyParameter("EventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>The message ID in DataWorks OpenEvent. You can obtain the ID from a received message when an extension point event is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>03400b03-b721-4c34-8727-2****1</p>
         */
        public Builder messageId(String messageId) {
            this.putBodyParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>The operator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123333232</p>
         */
        public Builder operator(String operator) {
            this.putBodyParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>123465</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The check status of the extension. Valid values:</p>
         * <ul>
         * <li>CHECKING</li>
         * <li>PASSED</li>
         * <li>BLOCKED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCheckProcessesRequest build() {
            return new ListCheckProcessesRequest(this);
        } 

    } 

}
