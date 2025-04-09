// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListAnnotationMissionRequest} extends {@link RequestModel}
 *
 * <p>ListAnnotationMissionRequest</p>
 */
public class ListAnnotationMissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
    private String annotationMissionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionName")
    private String annotationMissionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationStatusListFilter")
    private java.util.List<Integer> annotationStatusListFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationStatusListStringFilter")
    private String annotationStatusListStringFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeEndFilter")
    private Long createTimeEndFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimeStartFilter")
    private Long createTimeStartFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListAnnotationMissionRequest(Builder builder) {
        super(builder);
        this.annotationMissionId = builder.annotationMissionId;
        this.annotationMissionName = builder.annotationMissionName;
        this.annotationStatusListFilter = builder.annotationStatusListFilter;
        this.annotationStatusListStringFilter = builder.annotationStatusListStringFilter;
        this.createTimeEndFilter = builder.createTimeEndFilter;
        this.createTimeStartFilter = builder.createTimeStartFilter;
        this.instanceId = builder.instanceId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationMissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotationMissionId
     */
    public String getAnnotationMissionId() {
        return this.annotationMissionId;
    }

    /**
     * @return annotationMissionName
     */
    public String getAnnotationMissionName() {
        return this.annotationMissionName;
    }

    /**
     * @return annotationStatusListFilter
     */
    public java.util.List<Integer> getAnnotationStatusListFilter() {
        return this.annotationStatusListFilter;
    }

    /**
     * @return annotationStatusListStringFilter
     */
    public String getAnnotationStatusListStringFilter() {
        return this.annotationStatusListStringFilter;
    }

    /**
     * @return createTimeEndFilter
     */
    public Long getCreateTimeEndFilter() {
        return this.createTimeEndFilter;
    }

    /**
     * @return createTimeStartFilter
     */
    public Long getCreateTimeStartFilter() {
        return this.createTimeStartFilter;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<ListAnnotationMissionRequest, Builder> {
        private String annotationMissionId; 
        private String annotationMissionName; 
        private java.util.List<Integer> annotationStatusListFilter; 
        private String annotationStatusListStringFilter; 
        private Long createTimeEndFilter; 
        private Long createTimeStartFilter; 
        private String instanceId; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAnnotationMissionRequest request) {
            super(request);
            this.annotationMissionId = request.annotationMissionId;
            this.annotationMissionName = request.annotationMissionName;
            this.annotationStatusListFilter = request.annotationStatusListFilter;
            this.annotationStatusListStringFilter = request.annotationStatusListStringFilter;
            this.createTimeEndFilter = request.createTimeEndFilter;
            this.createTimeStartFilter = request.createTimeStartFilter;
            this.instanceId = request.instanceId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
        } 

        /**
         * AnnotationMissionId.
         */
        public Builder annotationMissionId(String annotationMissionId) {
            this.putQueryParameter("AnnotationMissionId", annotationMissionId);
            this.annotationMissionId = annotationMissionId;
            return this;
        }

        /**
         * AnnotationMissionName.
         */
        public Builder annotationMissionName(String annotationMissionName) {
            this.putQueryParameter("AnnotationMissionName", annotationMissionName);
            this.annotationMissionName = annotationMissionName;
            return this;
        }

        /**
         * AnnotationStatusListFilter.
         */
        public Builder annotationStatusListFilter(java.util.List<Integer> annotationStatusListFilter) {
            this.putQueryParameter("AnnotationStatusListFilter", annotationStatusListFilter);
            this.annotationStatusListFilter = annotationStatusListFilter;
            return this;
        }

        /**
         * AnnotationStatusListStringFilter.
         */
        public Builder annotationStatusListStringFilter(String annotationStatusListStringFilter) {
            this.putQueryParameter("AnnotationStatusListStringFilter", annotationStatusListStringFilter);
            this.annotationStatusListStringFilter = annotationStatusListStringFilter;
            return this;
        }

        /**
         * CreateTimeEndFilter.
         */
        public Builder createTimeEndFilter(Long createTimeEndFilter) {
            this.putQueryParameter("CreateTimeEndFilter", createTimeEndFilter);
            this.createTimeEndFilter = createTimeEndFilter;
            return this;
        }

        /**
         * CreateTimeStartFilter.
         */
        public Builder createTimeStartFilter(Long createTimeStartFilter) {
            this.putQueryParameter("CreateTimeStartFilter", createTimeStartFilter);
            this.createTimeStartFilter = createTimeStartFilter;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        @Override
        public ListAnnotationMissionRequest build() {
            return new ListAnnotationMissionRequest(this);
        } 

    } 

}
