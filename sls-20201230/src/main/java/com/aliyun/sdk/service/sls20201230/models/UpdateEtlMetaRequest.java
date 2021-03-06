// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateEtlMetaRequest} extends {@link RequestModel}
 *
 * <p>UpdateEtlMetaRequest</p>
 */
public class UpdateEtlMetaRequest extends Request {
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
    private String etlMetaTag;

    @Body
    @NameInMap("etlMetaValue")
    private java.util.Map < String, ? > etlMetaValue;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    private UpdateEtlMetaRequest(Builder builder) {
        super(builder);
        this.enable = builder.enable;
        this.etlMetaKey = builder.etlMetaKey;
        this.etlMetaName = builder.etlMetaName;
        this.etlMetaTag = builder.etlMetaTag;
        this.etlMetaValue = builder.etlMetaValue;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEtlMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder extends Request.Builder<UpdateEtlMetaRequest, Builder> {
        private Boolean enable; 
        private String etlMetaKey; 
        private String etlMetaName; 
        private String etlMetaTag; 
        private java.util.Map < String, ? > etlMetaValue; 
        private String project; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEtlMetaRequest request) {
            super(request);
            this.enable = request.enable;
            this.etlMetaKey = request.etlMetaKey;
            this.etlMetaName = request.etlMetaName;
            this.etlMetaTag = request.etlMetaTag;
            this.etlMetaValue = request.etlMetaValue;
            this.project = request.project;
        } 

        /**
         * ???????????????etlMetaTag???etlMetaValue???enable ???????????????????????????
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * key?????? ascii ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????[1,255]?????????
         */
        public Builder etlMetaKey(String etlMetaKey) {
            this.putBodyParameter("etlMetaKey", etlMetaKey);
            this.etlMetaKey = etlMetaKey;
            return this;
        }

        /**
         * ????????????????????????????????????????????????_????????????-????????????????????????[2,64]?????????
         */
        public Builder etlMetaName(String etlMetaName) {
            this.putBodyParameter("etlMetaName", etlMetaName);
            this.etlMetaName = etlMetaName;
            return this;
        }

        /**
         * key?????? ascii ??????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????[1,128]?????????
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

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        @Override
        public UpdateEtlMetaRequest build() {
            return new UpdateEtlMetaRequest(this);
        } 

    } 

}
