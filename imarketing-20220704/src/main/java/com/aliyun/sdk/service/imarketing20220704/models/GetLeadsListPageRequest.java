// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLeadsListPageRequest} extends {@link RequestModel}
 *
 * <p>GetLeadsListPageRequest</p>
 */
public class GetLeadsListPageRequest extends Request {
    @Query
    @NameInMap("ComponentId")
    private Long componentId;

    @Query
    @NameInMap("ContentId")
    private Long contentId;

    @Query
    @NameInMap("CreativeId")
    private Long creativeId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("MainId")
    @Validation(required = true, minimum = 1)
    private Long mainId;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true, maximum = 999999, minimum = 1)
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 2000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("TaskId")
    private Long taskId;

    private GetLeadsListPageRequest(Builder builder) {
        super(builder);
        this.componentId = builder.componentId;
        this.contentId = builder.contentId;
        this.creativeId = builder.creativeId;
        this.endTime = builder.endTime;
        this.mainId = builder.mainId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLeadsListPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentId
     */
    public Long getComponentId() {
        return this.componentId;
    }

    /**
     * @return contentId
     */
    public Long getContentId() {
        return this.contentId;
    }

    /**
     * @return creativeId
     */
    public Long getCreativeId() {
        return this.creativeId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return mainId
     */
    public Long getMainId() {
        return this.mainId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetLeadsListPageRequest, Builder> {
        private Long componentId; 
        private Long contentId; 
        private Long creativeId; 
        private Long endTime; 
        private Long mainId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long startTime; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetLeadsListPageRequest request) {
            super(request);
            this.componentId = request.componentId;
            this.contentId = request.contentId;
            this.creativeId = request.creativeId;
            this.endTime = request.endTime;
            this.mainId = request.mainId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.taskId = request.taskId;
        } 

        /**
         * ComponentId.
         */
        public Builder componentId(Long componentId) {
            this.putQueryParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * ContentId.
         */
        public Builder contentId(Long contentId) {
            this.putQueryParameter("ContentId", contentId);
            this.contentId = contentId;
            return this;
        }

        /**
         * CreativeId.
         */
        public Builder creativeId(Long creativeId) {
            this.putQueryParameter("CreativeId", creativeId);
            this.creativeId = creativeId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * MainId.
         */
        public Builder mainId(Long mainId) {
            this.putQueryParameter("MainId", mainId);
            this.mainId = mainId;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetLeadsListPageRequest build() {
            return new GetLeadsListPageRequest(this);
        } 

    } 

}
