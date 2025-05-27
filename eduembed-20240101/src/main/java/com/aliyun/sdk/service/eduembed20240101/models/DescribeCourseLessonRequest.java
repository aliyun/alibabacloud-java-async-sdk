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
 * {@link DescribeCourseLessonRequest} extends {@link RequestModel}
 *
 * <p>DescribeCourseLessonRequest</p>
 */
public class DescribeCourseLessonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LessonId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long lessonId;

    private DescribeCourseLessonRequest(Builder builder) {
        super(builder);
        this.lessonId = builder.lessonId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCourseLessonRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lessonId
     */
    public Long getLessonId() {
        return this.lessonId;
    }

    public static final class Builder extends Request.Builder<DescribeCourseLessonRequest, Builder> {
        private Long lessonId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCourseLessonRequest request) {
            super(request);
            this.lessonId = request.lessonId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder lessonId(Long lessonId) {
            this.putQueryParameter("LessonId", lessonId);
            this.lessonId = lessonId;
            return this;
        }

        @Override
        public DescribeCourseLessonRequest build() {
            return new DescribeCourseLessonRequest(this);
        } 

    } 

}
