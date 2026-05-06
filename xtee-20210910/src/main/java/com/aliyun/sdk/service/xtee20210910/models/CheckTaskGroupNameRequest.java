// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link CheckTaskGroupNameRequest} extends {@link RequestModel}
 *
 * <p>CheckTaskGroupNameRequest</p>
 */
public class CheckTaskGroupNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskGroupName")
    private String taskGroupName;

    private CheckTaskGroupNameRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.taskGroupName = builder.taskGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTaskGroupNameRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return taskGroupName
     */
    public String getTaskGroupName() {
        return this.taskGroupName;
    }

    public static final class Builder extends Request.Builder<CheckTaskGroupNameRequest, Builder> {
        private String lang; 
        private String regId; 
        private String taskGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CheckTaskGroupNameRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.taskGroupName = request.taskGroupName;
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
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * TaskGroupName.
         */
        public Builder taskGroupName(String taskGroupName) {
            this.putQueryParameter("TaskGroupName", taskGroupName);
            this.taskGroupName = taskGroupName;
            return this;
        }

        @Override
        public CheckTaskGroupNameRequest build() {
            return new CheckTaskGroupNameRequest(this);
        } 

    } 

}
