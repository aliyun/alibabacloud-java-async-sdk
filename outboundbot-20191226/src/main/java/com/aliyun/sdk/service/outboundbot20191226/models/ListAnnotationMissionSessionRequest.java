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
 * {@link ListAnnotationMissionSessionRequest} extends {@link RequestModel}
 *
 * <p>ListAnnotationMissionSessionRequest</p>
 */
public class ListAnnotationMissionSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
    private String annotationMissionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionSessionId")
    private String annotationMissionSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private Integer environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeStatusListJsonString")
    private String includeStatusListJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListAnnotationMissionSessionRequest(Builder builder) {
        super(builder);
        this.annotationMissionId = builder.annotationMissionId;
        this.annotationMissionSessionId = builder.annotationMissionSessionId;
        this.environment = builder.environment;
        this.includeStatusListJsonString = builder.includeStatusListJsonString;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnnotationMissionSessionRequest create() {
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
     * @return annotationMissionSessionId
     */
    public String getAnnotationMissionSessionId() {
        return this.annotationMissionSessionId;
    }

    /**
     * @return environment
     */
    public Integer getEnvironment() {
        return this.environment;
    }

    /**
     * @return includeStatusListJsonString
     */
    public String getIncludeStatusListJsonString() {
        return this.includeStatusListJsonString;
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

    public static final class Builder extends Request.Builder<ListAnnotationMissionSessionRequest, Builder> {
        private String annotationMissionId; 
        private String annotationMissionSessionId; 
        private Integer environment; 
        private String includeStatusListJsonString; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListAnnotationMissionSessionRequest request) {
            super(request);
            this.annotationMissionId = request.annotationMissionId;
            this.annotationMissionSessionId = request.annotationMissionSessionId;
            this.environment = request.environment;
            this.includeStatusListJsonString = request.includeStatusListJsonString;
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
         * AnnotationMissionSessionId.
         */
        public Builder annotationMissionSessionId(String annotationMissionSessionId) {
            this.putQueryParameter("AnnotationMissionSessionId", annotationMissionSessionId);
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(Integer environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * IncludeStatusListJsonString.
         */
        public Builder includeStatusListJsonString(String includeStatusListJsonString) {
            this.putQueryParameter("IncludeStatusListJsonString", includeStatusListJsonString);
            this.includeStatusListJsonString = includeStatusListJsonString;
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
        public ListAnnotationMissionSessionRequest build() {
            return new ListAnnotationMissionSessionRequest(this);
        } 

    } 

}
