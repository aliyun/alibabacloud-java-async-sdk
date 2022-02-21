// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIspFlushCacheTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeIspFlushCacheTaskRequest</p>
 */
public class DescribeIspFlushCacheTaskRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DescribeIspFlushCacheTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIspFlushCacheTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeIspFlushCacheTaskRequest, Builder> {
        private String lang; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIspFlushCacheTaskRequest response) {
            super(response);
            this.lang = response.lang;
            this.taskId = response.taskId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeIspFlushCacheTaskRequest build() {
            return new DescribeIspFlushCacheTaskRequest(this);
        } 

    } 

}
