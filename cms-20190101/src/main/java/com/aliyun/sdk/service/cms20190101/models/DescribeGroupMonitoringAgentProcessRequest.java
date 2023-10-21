// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupMonitoringAgentProcessRequest</p>
 */
public class DescribeGroupMonitoringAgentProcessRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProcessName")
    private String processName;

    private DescribeGroupMonitoringAgentProcessRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.processName = builder.processName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupMonitoringAgentProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    public static final class Builder extends Request.Builder<DescribeGroupMonitoringAgentProcessRequest, Builder> {
        private String groupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String processName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupMonitoringAgentProcessRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.processName = request.processName;
        } 

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the process monitoring task.
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        @Override
        public DescribeGroupMonitoringAgentProcessRequest build() {
            return new DescribeGroupMonitoringAgentProcessRequest(this);
        } 

    } 

}
