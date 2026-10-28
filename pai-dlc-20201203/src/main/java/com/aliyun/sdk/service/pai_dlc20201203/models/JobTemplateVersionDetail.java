// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link JobTemplateVersionDetail} extends {@link TeaModel}
 *
 * <p>JobTemplateVersionDetail</p>
 */
public class JobTemplateVersionDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Constraints")
    private java.util.Map<String, String> constraints;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    private JobTemplateVersionDetail(Builder builder) {
        this.constraints = builder.constraints;
        this.content = builder.content;
        this.createdBy = builder.createdBy;
        this.gmtCreated = builder.gmtCreated;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobTemplateVersionDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return constraints
     */
    public java.util.Map<String, String> getConstraints() {
        return this.constraints;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private java.util.Map<String, String> constraints; 
        private String content; 
        private String createdBy; 
        private String gmtCreated; 
        private Integer version; 

        private Builder() {
        } 

        private Builder(JobTemplateVersionDetail model) {
            this.constraints = model.constraints;
            this.content = model.content;
            this.createdBy = model.createdBy;
            this.gmtCreated = model.gmtCreated;
            this.version = model.version;
        } 

        /**
         * Constraints.
         */
        public Builder constraints(java.util.Map<String, String> constraints) {
            this.constraints = constraints;
            return this;
        }

        /**
         * <p>任务模板的配置内容，支持 CreateJob 接口的所有参数字段，以 JSON 对象存储</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>创建该版本的用户ID</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>该版本的创建时间</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>模板版本号</p>
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public JobTemplateVersionDetail build() {
            return new JobTemplateVersionDetail(this);
        } 

    } 

}
