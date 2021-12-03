// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateAliasRequest} extends {@link RequestModel}
 *
 * <p>CreateAliasRequest</p>
 */
public class CreateAliasRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Body
    @NameInMap("additionalVersionWeight")
    private java.util.Map < String, Float > additionalVersionWeight;

    @Body
    @NameInMap("aliasName")
    private String aliasName;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("versionId")
    private String versionId;


    private CreateAliasRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.additionalVersionWeight = builder.additionalVersionWeight;
        this.aliasName = builder.aliasName;
        this.description = builder.description;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliasRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return additionalVersionWeight
     */
    public java.util.Map < String, Float > getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
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
        private java.util.Map < String, Float > additionalVersionWeight; 
        private String aliasName; 
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
         * <p>额外版本权重</p>
         */
        public Builder additionalVersionWeight(java.util.Map < String, Float > additionalVersionWeight) {
            this.putBodyParameter("additionalVersionWeight", additionalVersionWeight);
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }

        /**
         * <p>别名名称</p>
         */
        public Builder aliasName(String aliasName) {
            this.putBodyParameter("aliasName", aliasName);
            this.aliasName = aliasName;
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

        public CreateAliasRequest build() {
            return new CreateAliasRequest(this);
        } 

    } 

}
