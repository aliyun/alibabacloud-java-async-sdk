// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link GetProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectResponseBody</p>
 */
public class GetProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Storage")
    private Long storage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("VpcWhitelist")
    private String vpcWhitelist;

    private GetProjectResponseBody(Builder builder) {
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.storage = builder.storage;
        this.success = builder.success;
        this.updateTime = builder.updateTime;
        this.vpcWhitelist = builder.vpcWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return storage
     */
    public Long getStorage() {
        return this.storage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return vpcWhitelist
     */
    public String getVpcWhitelist() {
        return this.vpcWhitelist;
    }

    public static final class Builder {
        private String comment; 
        private String createTime; 
        private String creator; 
        private String projectName; 
        private String requestId; 
        private Long storage; 
        private Boolean success; 
        private String updateTime; 
        private String vpcWhitelist; 

        private Builder() {
        } 

        private Builder(GetProjectResponseBody model) {
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.storage = model.storage;
            this.success = model.success;
            this.updateTime = model.updateTime;
            this.vpcWhitelist = model.vpcWhitelist;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Storage.
         */
        public Builder storage(Long storage) {
            this.storage = storage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * VpcWhitelist.
         */
        public Builder vpcWhitelist(String vpcWhitelist) {
            this.vpcWhitelist = vpcWhitelist;
            return this;
        }

        public GetProjectResponseBody build() {
            return new GetProjectResponseBody(this);
        } 

    } 

}
