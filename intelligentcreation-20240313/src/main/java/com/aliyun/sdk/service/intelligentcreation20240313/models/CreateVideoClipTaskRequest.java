// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateVideoClipTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoClipTaskRequest</p>
 */
public class CreateVideoClipTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aliyunMainId")
    private String aliyunMainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossKeys")
    private java.util.List<String> ossKeys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requirement")
    private String requirement;

    private CreateVideoClipTaskRequest(Builder builder) {
        super(builder);
        this.aliyunMainId = builder.aliyunMainId;
        this.description = builder.description;
        this.ossKeys = builder.ossKeys;
        this.requirement = builder.requirement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoClipTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunMainId
     */
    public String getAliyunMainId() {
        return this.aliyunMainId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ossKeys
     */
    public java.util.List<String> getOssKeys() {
        return this.ossKeys;
    }

    /**
     * @return requirement
     */
    public String getRequirement() {
        return this.requirement;
    }

    public static final class Builder extends Request.Builder<CreateVideoClipTaskRequest, Builder> {
        private String aliyunMainId; 
        private String description; 
        private java.util.List<String> ossKeys; 
        private String requirement; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoClipTaskRequest request) {
            super(request);
            this.aliyunMainId = request.aliyunMainId;
            this.description = request.description;
            this.ossKeys = request.ossKeys;
            this.requirement = request.requirement;
        } 

        /**
         * aliyunMainId.
         */
        public Builder aliyunMainId(String aliyunMainId) {
            this.putBodyParameter("aliyunMainId", aliyunMainId);
            this.aliyunMainId = aliyunMainId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * ossKeys.
         */
        public Builder ossKeys(java.util.List<String> ossKeys) {
            this.putBodyParameter("ossKeys", ossKeys);
            this.ossKeys = ossKeys;
            return this;
        }

        /**
         * requirement.
         */
        public Builder requirement(String requirement) {
            this.putBodyParameter("requirement", requirement);
            this.requirement = requirement;
            return this;
        }

        @Override
        public CreateVideoClipTaskRequest build() {
            return new CreateVideoClipTaskRequest(this);
        } 

    } 

}
