// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PublishRoutineCodeVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishRoutineCodeVersionRequest</p>
 */
public class PublishRoutineCodeVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CanaryAreaList")
    private java.util.List < String > canaryAreaList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CanaryCodeVersion")
    private String canaryCodeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private PublishRoutineCodeVersionRequest(Builder builder) {
        super(builder);
        this.canaryAreaList = builder.canaryAreaList;
        this.canaryCodeVersion = builder.canaryCodeVersion;
        this.codeVersion = builder.codeVersion;
        this.env = builder.env;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishRoutineCodeVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canaryAreaList
     */
    public java.util.List < String > getCanaryAreaList() {
        return this.canaryAreaList;
    }

    /**
     * @return canaryCodeVersion
     */
    public String getCanaryCodeVersion() {
        return this.canaryCodeVersion;
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<PublishRoutineCodeVersionRequest, Builder> {
        private java.util.List < String > canaryAreaList; 
        private String canaryCodeVersion; 
        private String codeVersion; 
        private String env; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(PublishRoutineCodeVersionRequest request) {
            super(request);
            this.canaryAreaList = request.canaryAreaList;
            this.canaryCodeVersion = request.canaryCodeVersion;
            this.codeVersion = request.codeVersion;
            this.env = request.env;
            this.name = request.name;
        } 

        /**
         * CanaryAreaList.
         */
        public Builder canaryAreaList(java.util.List < String > canaryAreaList) {
            String canaryAreaListShrink = shrink(canaryAreaList, "CanaryAreaList", "json");
            this.putBodyParameter("CanaryAreaList", canaryAreaListShrink);
            this.canaryAreaList = canaryAreaList;
            return this;
        }

        /**
         * CanaryCodeVersion.
         */
        public Builder canaryCodeVersion(String canaryCodeVersion) {
            this.putBodyParameter("CanaryCodeVersion", canaryCodeVersion);
            this.canaryCodeVersion = canaryCodeVersion;
            return this;
        }

        /**
         * CodeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.putBodyParameter("CodeVersion", codeVersion);
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putBodyParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public PublishRoutineCodeVersionRequest build() {
            return new PublishRoutineCodeVersionRequest(this);
        } 

    } 

}
