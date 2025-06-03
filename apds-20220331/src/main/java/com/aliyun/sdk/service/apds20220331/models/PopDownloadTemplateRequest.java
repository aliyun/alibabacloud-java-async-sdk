// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link PopDownloadTemplateRequest} extends {@link RequestModel}
 *
 * <p>PopDownloadTemplateRequest</p>
 */
public class PopDownloadTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("targetDialect")
    private String targetDialect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private Long taskId;

    private PopDownloadTemplateRequest(Builder builder) {
        super(builder);
        this.targetDialect = builder.targetDialect;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopDownloadTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return targetDialect
     */
    public String getTargetDialect() {
        return this.targetDialect;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<PopDownloadTemplateRequest, Builder> {
        private String targetDialect; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(PopDownloadTemplateRequest request) {
            super(request);
            this.targetDialect = request.targetDialect;
            this.taskId = request.taskId;
        } 

        /**
         * targetDialect.
         */
        public Builder targetDialect(String targetDialect) {
            this.putQueryParameter("targetDialect", targetDialect);
            this.targetDialect = targetDialect;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public PopDownloadTemplateRequest build() {
            return new PopDownloadTemplateRequest(this);
        } 

    } 

}
