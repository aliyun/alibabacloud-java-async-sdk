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
         * <p>The annotation mission ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8434a4b0-41fc-41b1-aa75-bbd1f2ab0c8d</p>
         */
        public Builder annotationMissionId(String annotationMissionId) {
            this.putQueryParameter("AnnotationMissionId", annotationMissionId);
            this.annotationMissionId = annotationMissionId;
            return this;
        }

        /**
         * <p>The annotation mission chat instance ID.</p>
         * <blockquote>
         * <p>Obtained by calling the SaveAnnotationMissionSessionList operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8434a4b0-41fc-41b1-aa75-bbd1f2ab0c8d</p>
         */
        public Builder annotationMissionSessionId(String annotationMissionSessionId) {
            this.putQueryParameter("AnnotationMissionSessionId", annotationMissionSessionId);
            this.annotationMissionSessionId = annotationMissionSessionId;
            return this;
        }

        /**
         * <p>The environment.</p>
         * <blockquote>
         * <p>Default value: 2.</p>
         * </blockquote>
         * <p><strong>Valid values:</strong></p>
         * <ul>
         * <li>0: NONE.</li>
         * <li>1: Private cloud.</li>
         * <li>2: Public cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder environment(Integer environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The list of included statuses.</p>
         * <blockquote>
         * <p>The format is [1]. Specify the actual enum values in the array.</p>
         * </blockquote>
         * <p><strong>Valid values:</strong></p>
         * <ul>
         * <li>1: Correct recognition.</li>
         * <li>2: Incorrect recognition.</li>
         * <li>8: Invalid data.</li>
         * <li>4: Uncovered intent.</li>
         * <li>16: Transcription misrecognition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[1]</p>
         */
        public Builder includeStatusListJsonString(String includeStatusListJsonString) {
            this.putQueryParameter("IncludeStatusListJsonString", includeStatusListJsonString);
            this.includeStatusListJsonString = includeStatusListJsonString;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
