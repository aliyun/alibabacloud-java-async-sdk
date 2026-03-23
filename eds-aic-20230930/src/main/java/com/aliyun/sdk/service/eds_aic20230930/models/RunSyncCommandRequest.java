// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link RunSyncCommandRequest} extends {@link RequestModel}
 *
 * <p>RunSyncCommandRequest</p>
 */
public class RunSyncCommandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandContent")
    private String commandContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentEncoding")
    private String contentEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitTime")
    @com.aliyun.core.annotation.Validation(maximum = 3000, minimum = 500)
    private Long waitTime;

    private RunSyncCommandRequest(Builder builder) {
        super(builder);
        this.commandContent = builder.commandContent;
        this.contentEncoding = builder.contentEncoding;
        this.instanceIds = builder.instanceIds;
        this.waitTime = builder.waitTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSyncCommandRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandContent
     */
    public String getCommandContent() {
        return this.commandContent;
    }

    /**
     * @return contentEncoding
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return waitTime
     */
    public Long getWaitTime() {
        return this.waitTime;
    }

    public static final class Builder extends Request.Builder<RunSyncCommandRequest, Builder> {
        private String commandContent; 
        private String contentEncoding; 
        private java.util.List<String> instanceIds; 
        private Long waitTime; 

        private Builder() {
            super();
        } 

        private Builder(RunSyncCommandRequest request) {
            super(request);
            this.commandContent = request.commandContent;
            this.contentEncoding = request.contentEncoding;
            this.instanceIds = request.instanceIds;
            this.waitTime = request.waitTime;
        } 

        /**
         * CommandContent.
         */
        public Builder commandContent(String commandContent) {
            this.putQueryParameter("CommandContent", commandContent);
            this.commandContent = commandContent;
            return this;
        }

        /**
         * ContentEncoding.
         */
        public Builder contentEncoding(String contentEncoding) {
            this.putQueryParameter("ContentEncoding", contentEncoding);
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * WaitTime.
         */
        public Builder waitTime(Long waitTime) {
            this.putQueryParameter("WaitTime", waitTime);
            this.waitTime = waitTime;
            return this;
        }

        @Override
        public RunSyncCommandRequest build() {
            return new RunSyncCommandRequest(this);
        } 

    } 

}
