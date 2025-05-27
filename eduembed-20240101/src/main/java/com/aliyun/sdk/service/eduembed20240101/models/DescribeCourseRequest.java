// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

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
 * {@link DescribeCourseRequest} extends {@link RequestModel}
 *
 * <p>DescribeCourseRequest</p>
 */
public class DescribeCourseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CourseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long courseId;

    private DescribeCourseRequest(Builder builder) {
        super(builder);
        this.courseId = builder.courseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCourseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return courseId
     */
    public Long getCourseId() {
        return this.courseId;
    }

    public static final class Builder extends Request.Builder<DescribeCourseRequest, Builder> {
        private Long courseId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCourseRequest request) {
            super(request);
            this.courseId = request.courseId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder courseId(Long courseId) {
            this.putQueryParameter("CourseId", courseId);
            this.courseId = courseId;
            return this;
        }

        @Override
        public DescribeCourseRequest build() {
            return new DescribeCourseRequest(this);
        } 

    } 

}
