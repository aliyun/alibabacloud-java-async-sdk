// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateAliasRequest} extends {@link RequestModel}
 *
 * <p>UpdateAliasRequest</p>
 */
public class UpdateAliasRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("aliasName")
    private String aliasName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Body
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("versionId")
    private String versionId;


    private UpdateAliasRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.aliasName = builder.aliasName;
        this.ifMatch = builder.ifMatch;
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.description = builder.description;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAliasRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String aliasName; 
        private String ifMatch; 
        private java.util.Map < String, Float > additionalVersionWeight; 
        private String description; 
        private String versionId; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>别名</p>
         */
        public Builder aliasName(String aliasName) {
            this.putPathParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>If-Match.</p>
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * <p>额外版本权重</p>
         */
        public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
            this.putBodyParameter("additionalVersionWeight", additionalVersionWeight);
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * <p>别名描述</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>版本ID</p>
         */
        public Builder versionId(String versionId) {
            this.putBodyParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        public UpdateAliasRequest build() {
            return new UpdateAliasRequest(this);
        } 

    } 

}
