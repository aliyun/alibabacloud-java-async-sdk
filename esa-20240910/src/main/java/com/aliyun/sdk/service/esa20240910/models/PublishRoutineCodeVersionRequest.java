// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link PublishRoutineCodeVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishRoutineCodeVersionRequest</p>
 */
public class PublishRoutineCodeVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private PublishRoutineCodeVersionRequest(Builder builder) {
        super(builder);
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
        private String codeVersion; 
        private String env; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(PublishRoutineCodeVersionRequest request) {
            super(request);
            this.codeVersion = request.codeVersion;
            this.env = request.env;
            this.name = request.name;
        } 

        /**
         * <p>The code version to be released.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067203242</p>
         */
        public Builder codeVersion(String codeVersion) {
            this.putBodyParameter("CodeVersion", codeVersion);
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * <p>The environment name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        public Builder env(String env) {
            this.putBodyParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>The routine name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PublishRoutineCodeVersion</p>
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
