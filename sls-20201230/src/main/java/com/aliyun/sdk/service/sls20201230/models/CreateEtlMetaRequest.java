// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateEtlMetaRequest} extends {@link RequestModel}
 *
 * <p>CreateEtlMetaRequest</p>
 */
public class CreateEtlMetaRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Body
    @NameInMap("enable")
    private Boolean enable;

    @Body
    @NameInMap("etlMetaKey")
    @Validation(required = true)
    private String etlMetaKey;

    @Body
    @NameInMap("etlMetaName")
    @Validation(required = true)
    private String etlMetaName;

    @Body
    @NameInMap("etlMetaTag")
    @Validation(required = true)
    private String etlMetaTag;

    @Body
    @NameInMap("etlMetaValue")
    private java.util.Map < String, ? > etlMetaValue;

    private CreateEtlMetaRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.enable = builder.enable;
        this.etlMetaKey = builder.etlMetaKey;
        this.etlMetaName = builder.etlMetaName;
        this.etlMetaTag = builder.etlMetaTag;
        this.etlMetaValue = builder.etlMetaValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEtlMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return etlMetaKey
     */
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    /**
     * @return etlMetaName
     */
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    /**
     * @return etlMetaTag
     */
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    /**
     * @return etlMetaValue
     */
    public java.util.Map < String, ? > getEtlMetaValue() {
        return this.etlMetaValue;
    }

    public static final class Builder extends Request.Builder<CreateEtlMetaRequest, Builder> {
        private String project; 
        private Boolean enable; 
        private String etlMetaKey; 
        private String etlMetaName; 
        private String etlMetaTag; 
        private java.util.Map < String, ? > etlMetaValue; 

        private Builder() {
            super();
        } 

        private Builder(CreateEtlMetaRequest request) {
            super(request);
            this.project = request.project;
            this.enable = request.enable;
            this.etlMetaKey = request.etlMetaKey;
            this.etlMetaName = request.etlMetaName;
            this.etlMetaTag = request.etlMetaTag;
            this.etlMetaValue = request.etlMetaValue;
        } 

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 是否启用
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,255]之间。
         */
        public Builder etlMetaKey(String etlMetaKey) {
            this.putBodyParameter("etlMetaKey", etlMetaKey);
            this.etlMetaKey = etlMetaKey;
            return this;
        }

        /**
         * 名字。由数字、大小写字母、下划线_、连字符-组成，长度需要在[2,64]之间。
         */
        public Builder etlMetaName(String etlMetaName) {
            this.putBodyParameter("etlMetaName", etlMetaName);
            this.etlMetaName = etlMetaName;
            return this;
        }

        /**
         * key。由 ascii 可打印字符组成，包括数字、英文大小写字母、下划线、连字符、英文标点符号等组成，长度在[1,128]之间。
         */
        public Builder etlMetaTag(String etlMetaTag) {
            this.putBodyParameter("etlMetaTag", etlMetaTag);
            this.etlMetaTag = etlMetaTag;
            return this;
        }

        /**
         * etlMetaValue.
         */
        public Builder etlMetaValue(java.util.Map < String, ? > etlMetaValue) {
            this.putBodyParameter("etlMetaValue", etlMetaValue);
            this.etlMetaValue = etlMetaValue;
            return this;
        }

        @Override
        public CreateEtlMetaRequest build() {
            return new CreateEtlMetaRequest(this);
        } 

    } 

}
