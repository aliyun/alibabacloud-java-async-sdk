// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link TemplateRecord} extends {@link TeaModel}
 *
 * <p>TemplateRecord</p>
 */
public class TemplateRecord extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("CopyStatus")
    private String copyStatus;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private TemplateRecord(Builder builder) {
        this.bizId = builder.bizId;
        this.copyStatus = builder.copyStatus;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.templateId = builder.templateId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateRecord create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return copyStatus
     */
    public String getCopyStatus() {
        return this.copyStatus;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String bizId; 
        private String copyStatus; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String templateId; 
        private String userId; 

        private Builder() {
        } 

        private Builder(TemplateRecord model) {
            this.bizId = model.bizId;
            this.copyStatus = model.copyStatus;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.templateId = model.templateId;
            this.userId = model.userId;
        } 

        /**
         * <p>The business ID of the application instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250915163734000001</p>
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>The copy status.</p>
         * 
         * <strong>example:</strong>
         * <p>copying</p>
         */
        public Builder copyStatus(String copyStatus) {
            this.copyStatus = copyStatus;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-21T08:27:03Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The update time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-28T02:25:41Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9953352</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>de10bf7d782392a70f293a3b1f7bb8fc</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12343131221311</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public TemplateRecord build() {
            return new TemplateRecord(this);
        } 

    } 

}
